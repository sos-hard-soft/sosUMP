/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "DROIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Droit.findAll", query = "SELECT d FROM Droit d"),
    @NamedQuery(name = "Droit.findByCodDrt", query = "SELECT d FROM Droit d WHERE d.codDrt = :codDrt"),
    @NamedQuery(name = "Droit.findByMntDrt", query = "SELECT d FROM Droit d WHERE d.mntDrt = :mntDrt"),
    @NamedQuery(name = "Droit.findByLibDrt", query = "SELECT d FROM Droit d WHERE d.libDrt = :libDrt"),
    @NamedQuery(name = "Droit.findByLicDrt", query = "SELECT d FROM Droit d WHERE d.licDrt = :licDrt"),
    @NamedQuery(name = "Droit.findByTemEnSveDrt", query = "SELECT d FROM Droit d WHERE d.temEnSveDrt = :temEnSveDrt"),
    @NamedQuery(name = "Droit.findByTemRmbEtb", query = "SELECT d FROM Droit d WHERE d.temRmbEtb = :temRmbEtb"),
    @NamedQuery(name = "Droit.findByLim1Drt", query = "SELECT d FROM Droit d WHERE d.lim1Drt = :lim1Drt"),
    @NamedQuery(name = "Droit.findByLim2Drt", query = "SELECT d FROM Droit d WHERE d.lim2Drt = :lim2Drt"),
    @NamedQuery(name = "Droit.findByNumOrdDrt", query = "SELECT d FROM Droit d WHERE d.numOrdDrt = :numOrdDrt"),
    @NamedQuery(name = "Droit.findByLibWebDrt", query = "SELECT d FROM Droit d WHERE d.libWebDrt = :libWebDrt")})
public class Droit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_DRT")
    private String codDrt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MNT_DRT")
    private BigDecimal mntDrt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_DRT")
    private String libDrt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_DRT")
    private String licDrt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_DRT")
    private String temEnSveDrt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RMB_ETB")
    private String temRmbEtb;
    @Size(max = 30)
    @Column(name = "LIM1_DRT")
    private String lim1Drt;
    @Size(max = 30)
    @Column(name = "LIM2_DRT")
    private String lim2Drt;
    @Column(name = "NUM_ORD_DRT")
    private Short numOrdDrt;
    @Size(max = 120)
    @Column(name = "LIB_WEB_DRT")
    private String libWebDrt;
    @JoinTable(name = "IAA_OPTION_DRT", joinColumns = {
        @JoinColumn(name = "COD_DRT", referencedColumnName = "COD_DRT")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU"),
        @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND")})
    @ManyToMany
    private List<InsAdmAnu> insAdmAnuList;
    @JoinColumn(name = "COD_MUT", referencedColumnName = "COD_MUT")
    @ManyToOne
    private Mutuelle codMut;
    @JoinColumn(name = "COD_NRG", referencedColumnName = "COD_NRG")
    @ManyToOne(optional = false)
    private NivRegroup codNrg;
    @JoinColumn(name = "COD_TDR", referencedColumnName = "COD_TDR")
    @ManyToOne(optional = false)
    private TypDroit codTdr;
    @OneToMany(mappedBy = "codDrtMut")
    private List<InsAdmAnu> insAdmAnuList1;

    public Droit() {
    }

    public Droit(String codDrt) {
        this.codDrt = codDrt;
    }

    public Droit(String codDrt, BigDecimal mntDrt, String libDrt, String licDrt, String temEnSveDrt, String temRmbEtb) {
        this.codDrt = codDrt;
        this.mntDrt = mntDrt;
        this.libDrt = libDrt;
        this.licDrt = licDrt;
        this.temEnSveDrt = temEnSveDrt;
        this.temRmbEtb = temRmbEtb;
    }

    public String getCodDrt() {
        return codDrt;
    }

    public void setCodDrt(String codDrt) {
        this.codDrt = codDrt;
    }

    public BigDecimal getMntDrt() {
        return mntDrt;
    }

    public void setMntDrt(BigDecimal mntDrt) {
        this.mntDrt = mntDrt;
    }

    public String getLibDrt() {
        return libDrt;
    }

    public void setLibDrt(String libDrt) {
        this.libDrt = libDrt;
    }

    public String getLicDrt() {
        return licDrt;
    }

    public void setLicDrt(String licDrt) {
        this.licDrt = licDrt;
    }

    public String getTemEnSveDrt() {
        return temEnSveDrt;
    }

    public void setTemEnSveDrt(String temEnSveDrt) {
        this.temEnSveDrt = temEnSveDrt;
    }

    public String getTemRmbEtb() {
        return temRmbEtb;
    }

    public void setTemRmbEtb(String temRmbEtb) {
        this.temRmbEtb = temRmbEtb;
    }

    public String getLim1Drt() {
        return lim1Drt;
    }

    public void setLim1Drt(String lim1Drt) {
        this.lim1Drt = lim1Drt;
    }

    public String getLim2Drt() {
        return lim2Drt;
    }

    public void setLim2Drt(String lim2Drt) {
        this.lim2Drt = lim2Drt;
    }

    public Short getNumOrdDrt() {
        return numOrdDrt;
    }

    public void setNumOrdDrt(Short numOrdDrt) {
        this.numOrdDrt = numOrdDrt;
    }

    public String getLibWebDrt() {
        return libWebDrt;
    }

    public void setLibWebDrt(String libWebDrt) {
        this.libWebDrt = libWebDrt;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    public Mutuelle getCodMut() {
        return codMut;
    }

    public void setCodMut(Mutuelle codMut) {
        this.codMut = codMut;
    }

    public NivRegroup getCodNrg() {
        return codNrg;
    }

    public void setCodNrg(NivRegroup codNrg) {
        this.codNrg = codNrg;
    }

    public TypDroit getCodTdr() {
        return codTdr;
    }

    public void setCodTdr(TypDroit codTdr) {
        this.codTdr = codTdr;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList1() {
        return insAdmAnuList1;
    }

    public void setInsAdmAnuList1(List<InsAdmAnu> insAdmAnuList1) {
        this.insAdmAnuList1 = insAdmAnuList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDrt != null ? codDrt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Droit)) {
            return false;
        }
        Droit other = (Droit) object;
        if ((this.codDrt == null && other.codDrt != null) || (this.codDrt != null && !this.codDrt.equals(other.codDrt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Droit[ codDrt=" + codDrt + " ]";
    }
    
}
