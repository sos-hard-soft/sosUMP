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
import javax.persistence.JoinColumn;
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
@Table(name = "BOURSE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bourse.findAll", query = "SELECT b FROM Bourse b"),
    @NamedQuery(name = "Bourse.findByCodBrs", query = "SELECT b FROM Bourse b WHERE b.codBrs = :codBrs"),
    @NamedQuery(name = "Bourse.findByCodSisAfiBrs", query = "SELECT b FROM Bourse b WHERE b.codSisAfiBrs = :codSisAfiBrs"),
    @NamedQuery(name = "Bourse.findByLibBrs", query = "SELECT b FROM Bourse b WHERE b.libBrs = :libBrs"),
    @NamedQuery(name = "Bourse.findByLicBrs", query = "SELECT b FROM Bourse b WHERE b.licBrs = :licBrs"),
    @NamedQuery(name = "Bourse.findByTemSaiNumBrs", query = "SELECT b FROM Bourse b WHERE b.temSaiNumBrs = :temSaiNumBrs"),
    @NamedQuery(name = "Bourse.findByTemEnSveBrs", query = "SELECT b FROM Bourse b WHERE b.temEnSveBrs = :temEnSveBrs"),
    @NamedQuery(name = "Bourse.findByLim1Brs", query = "SELECT b FROM Bourse b WHERE b.lim1Brs = :lim1Brs"),
    @NamedQuery(name = "Bourse.findByLim2Brs", query = "SELECT b FROM Bourse b WHERE b.lim2Brs = :lim2Brs"),
    @NamedQuery(name = "Bourse.findByLim3Brs", query = "SELECT b FROM Bourse b WHERE b.lim3Brs = :lim3Brs"),
    @NamedQuery(name = "Bourse.findByTemMinBrs", query = "SELECT b FROM Bourse b WHERE b.temMinBrs = :temMinBrs"),
    @NamedQuery(name = "Bourse.findByNumOrdBrs", query = "SELECT b FROM Bourse b WHERE b.numOrdBrs = :numOrdBrs"),
    @NamedQuery(name = "Bourse.findByLibWebBrs", query = "SELECT b FROM Bourse b WHERE b.libWebBrs = :libWebBrs")})
public class Bourse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_BRS")
    private String codBrs;
    @Size(max = 1)
    @Column(name = "COD_SIS_AFI_BRS")
    private String codSisAfiBrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_BRS")
    private String libBrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_BRS")
    private String licBrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SAI_NUM_BRS")
    private String temSaiNumBrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_BRS")
    private String temEnSveBrs;
    @Size(max = 35)
    @Column(name = "LIM1_BRS")
    private String lim1Brs;
    @Size(max = 35)
    @Column(name = "LIM2_BRS")
    private String lim2Brs;
    @Size(max = 35)
    @Column(name = "LIM3_BRS")
    private String lim3Brs;
    @Size(max = 1)
    @Column(name = "TEM_MIN_BRS")
    private String temMinBrs;
    @Column(name = "NUM_ORD_BRS")
    private Short numOrdBrs;
    @Size(max = 120)
    @Column(name = "LIB_WEB_BRS")
    private String libWebBrs;
    @JoinColumn(name = "COD_SOC", referencedColumnName = "COD_SOC")
    @ManyToOne
    private SitSociale codSoc;
    @OneToMany(mappedBy = "codBrs")
    private List<InsAdmEtp> insAdmEtpList;

    public Bourse() {
    }

    public Bourse(String codBrs) {
        this.codBrs = codBrs;
    }

    public Bourse(String codBrs, String libBrs, String licBrs, String temSaiNumBrs, String temEnSveBrs) {
        this.codBrs = codBrs;
        this.libBrs = libBrs;
        this.licBrs = licBrs;
        this.temSaiNumBrs = temSaiNumBrs;
        this.temEnSveBrs = temEnSveBrs;
    }

    public String getCodBrs() {
        return codBrs;
    }

    public void setCodBrs(String codBrs) {
        this.codBrs = codBrs;
    }

    public String getCodSisAfiBrs() {
        return codSisAfiBrs;
    }

    public void setCodSisAfiBrs(String codSisAfiBrs) {
        this.codSisAfiBrs = codSisAfiBrs;
    }

    public String getLibBrs() {
        return libBrs;
    }

    public void setLibBrs(String libBrs) {
        this.libBrs = libBrs;
    }

    public String getLicBrs() {
        return licBrs;
    }

    public void setLicBrs(String licBrs) {
        this.licBrs = licBrs;
    }

    public String getTemSaiNumBrs() {
        return temSaiNumBrs;
    }

    public void setTemSaiNumBrs(String temSaiNumBrs) {
        this.temSaiNumBrs = temSaiNumBrs;
    }

    public String getTemEnSveBrs() {
        return temEnSveBrs;
    }

    public void setTemEnSveBrs(String temEnSveBrs) {
        this.temEnSveBrs = temEnSveBrs;
    }

    public String getLim1Brs() {
        return lim1Brs;
    }

    public void setLim1Brs(String lim1Brs) {
        this.lim1Brs = lim1Brs;
    }

    public String getLim2Brs() {
        return lim2Brs;
    }

    public void setLim2Brs(String lim2Brs) {
        this.lim2Brs = lim2Brs;
    }

    public String getLim3Brs() {
        return lim3Brs;
    }

    public void setLim3Brs(String lim3Brs) {
        this.lim3Brs = lim3Brs;
    }

    public String getTemMinBrs() {
        return temMinBrs;
    }

    public void setTemMinBrs(String temMinBrs) {
        this.temMinBrs = temMinBrs;
    }

    public Short getNumOrdBrs() {
        return numOrdBrs;
    }

    public void setNumOrdBrs(Short numOrdBrs) {
        this.numOrdBrs = numOrdBrs;
    }

    public String getLibWebBrs() {
        return libWebBrs;
    }

    public void setLibWebBrs(String libWebBrs) {
        this.libWebBrs = libWebBrs;
    }

    public SitSociale getCodSoc() {
        return codSoc;
    }

    public void setCodSoc(SitSociale codSoc) {
        this.codSoc = codSoc;
    }

    @XmlTransient
    public List<InsAdmEtp> getInsAdmEtpList() {
        return insAdmEtpList;
    }

    public void setInsAdmEtpList(List<InsAdmEtp> insAdmEtpList) {
        this.insAdmEtpList = insAdmEtpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codBrs != null ? codBrs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bourse)) {
            return false;
        }
        Bourse other = (Bourse) object;
        if ((this.codBrs == null && other.codBrs != null) || (this.codBrs != null && !this.codBrs.equals(other.codBrs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Bourse[ codBrs=" + codBrs + " ]";
    }
    
}
