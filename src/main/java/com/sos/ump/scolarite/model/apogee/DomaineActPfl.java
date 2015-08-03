/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "DOMAINE_ACT_PFL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DomaineActPfl.findAll", query = "SELECT d FROM DomaineActPfl d"),
    @NamedQuery(name = "DomaineActPfl.findByCodDap", query = "SELECT d FROM DomaineActPfl d WHERE d.codDap = :codDap"),
    @NamedQuery(name = "DomaineActPfl.findByCodSisDap1", query = "SELECT d FROM DomaineActPfl d WHERE d.codSisDap1 = :codSisDap1"),
    @NamedQuery(name = "DomaineActPfl.findByLibDap", query = "SELECT d FROM DomaineActPfl d WHERE d.libDap = :libDap"),
    @NamedQuery(name = "DomaineActPfl.findByLicDap", query = "SELECT d FROM DomaineActPfl d WHERE d.licDap = :licDap"),
    @NamedQuery(name = "DomaineActPfl.findByTemEnSveDap", query = "SELECT d FROM DomaineActPfl d WHERE d.temEnSveDap = :temEnSveDap"),
    @NamedQuery(name = "DomaineActPfl.findByLim1Dap", query = "SELECT d FROM DomaineActPfl d WHERE d.lim1Dap = :lim1Dap"),
    @NamedQuery(name = "DomaineActPfl.findByLim2Dap", query = "SELECT d FROM DomaineActPfl d WHERE d.lim2Dap = :lim2Dap"),
    @NamedQuery(name = "DomaineActPfl.findByLim3Dap", query = "SELECT d FROM DomaineActPfl d WHERE d.lim3Dap = :lim3Dap"),
    @NamedQuery(name = "DomaineActPfl.findByTemMinDap", query = "SELECT d FROM DomaineActPfl d WHERE d.temMinDap = :temMinDap"),
    @NamedQuery(name = "DomaineActPfl.findByNumOrdDap", query = "SELECT d FROM DomaineActPfl d WHERE d.numOrdDap = :numOrdDap"),
    @NamedQuery(name = "DomaineActPfl.findByLibWebDap", query = "SELECT d FROM DomaineActPfl d WHERE d.libWebDap = :libWebDap")})
public class DomaineActPfl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_DAP")
    private String codDap;
    @Size(max = 1)
    @Column(name = "COD_SIS_DAP_1")
    private String codSisDap1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_DAP")
    private String libDap;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_DAP")
    private String licDap;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_DAP")
    private String temEnSveDap;
    @Size(max = 35)
    @Column(name = "LIM1_DAP")
    private String lim1Dap;
    @Size(max = 35)
    @Column(name = "LIM2_DAP")
    private String lim2Dap;
    @Size(max = 35)
    @Column(name = "LIM3_DAP")
    private String lim3Dap;
    @Size(max = 1)
    @Column(name = "TEM_MIN_DAP")
    private String temMinDap;
    @Column(name = "NUM_ORD_DAP")
    private Short numOrdDap;
    @Size(max = 120)
    @Column(name = "LIB_WEB_DAP")
    private String libWebDap;
    @OneToMany(mappedBy = "codDap")
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codDap")
    private List<IndOpi> indOpiList;

    public DomaineActPfl() {
    }

    public DomaineActPfl(String codDap) {
        this.codDap = codDap;
    }

    public DomaineActPfl(String codDap, String libDap, String licDap, String temEnSveDap) {
        this.codDap = codDap;
        this.libDap = libDap;
        this.licDap = licDap;
        this.temEnSveDap = temEnSveDap;
    }

    public String getCodDap() {
        return codDap;
    }

    public void setCodDap(String codDap) {
        this.codDap = codDap;
    }

    public String getCodSisDap1() {
        return codSisDap1;
    }

    public void setCodSisDap1(String codSisDap1) {
        this.codSisDap1 = codSisDap1;
    }

    public String getLibDap() {
        return libDap;
    }

    public void setLibDap(String libDap) {
        this.libDap = libDap;
    }

    public String getLicDap() {
        return licDap;
    }

    public void setLicDap(String licDap) {
        this.licDap = licDap;
    }

    public String getTemEnSveDap() {
        return temEnSveDap;
    }

    public void setTemEnSveDap(String temEnSveDap) {
        this.temEnSveDap = temEnSveDap;
    }

    public String getLim1Dap() {
        return lim1Dap;
    }

    public void setLim1Dap(String lim1Dap) {
        this.lim1Dap = lim1Dap;
    }

    public String getLim2Dap() {
        return lim2Dap;
    }

    public void setLim2Dap(String lim2Dap) {
        this.lim2Dap = lim2Dap;
    }

    public String getLim3Dap() {
        return lim3Dap;
    }

    public void setLim3Dap(String lim3Dap) {
        this.lim3Dap = lim3Dap;
    }

    public String getTemMinDap() {
        return temMinDap;
    }

    public void setTemMinDap(String temMinDap) {
        this.temMinDap = temMinDap;
    }

    public Short getNumOrdDap() {
        return numOrdDap;
    }

    public void setNumOrdDap(Short numOrdDap) {
        this.numOrdDap = numOrdDap;
    }

    public String getLibWebDap() {
        return libWebDap;
    }

    public void setLibWebDap(String libWebDap) {
        this.libWebDap = libWebDap;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @XmlTransient
    public List<IndOpi> getIndOpiList() {
        return indOpiList;
    }

    public void setIndOpiList(List<IndOpi> indOpiList) {
        this.indOpiList = indOpiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDap != null ? codDap.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DomaineActPfl)) {
            return false;
        }
        DomaineActPfl other = (DomaineActPfl) object;
        if ((this.codDap == null && other.codDap != null) || (this.codDap != null && !this.codDap.equals(other.codDap))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.DomaineActPfl[ codDap=" + codDap + " ]";
    }
    
}
