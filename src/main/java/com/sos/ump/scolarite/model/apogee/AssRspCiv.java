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
@Table(name = "ASS_RSP_CIV")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssRspCiv.findAll", query = "SELECT a FROM AssRspCiv a"),
    @NamedQuery(name = "AssRspCiv.findByCodAsr", query = "SELECT a FROM AssRspCiv a WHERE a.codAsr = :codAsr"),
    @NamedQuery(name = "AssRspCiv.findByLibAsr", query = "SELECT a FROM AssRspCiv a WHERE a.libAsr = :libAsr"),
    @NamedQuery(name = "AssRspCiv.findByLicAsr", query = "SELECT a FROM AssRspCiv a WHERE a.licAsr = :licAsr"),
    @NamedQuery(name = "AssRspCiv.findByTemEnSveAsr", query = "SELECT a FROM AssRspCiv a WHERE a.temEnSveAsr = :temEnSveAsr"),
    @NamedQuery(name = "AssRspCiv.findByLim1Asr", query = "SELECT a FROM AssRspCiv a WHERE a.lim1Asr = :lim1Asr"),
    @NamedQuery(name = "AssRspCiv.findByLim2Asr", query = "SELECT a FROM AssRspCiv a WHERE a.lim2Asr = :lim2Asr"),
    @NamedQuery(name = "AssRspCiv.findByLim3Asr", query = "SELECT a FROM AssRspCiv a WHERE a.lim3Asr = :lim3Asr"),
    @NamedQuery(name = "AssRspCiv.findByTemMinAsr", query = "SELECT a FROM AssRspCiv a WHERE a.temMinAsr = :temMinAsr"),
    @NamedQuery(name = "AssRspCiv.findByNumOrdAsr", query = "SELECT a FROM AssRspCiv a WHERE a.numOrdAsr = :numOrdAsr"),
    @NamedQuery(name = "AssRspCiv.findByLibWebAsr", query = "SELECT a FROM AssRspCiv a WHERE a.libWebAsr = :libWebAsr")})
public class AssRspCiv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_ASR")
    private String codAsr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_ASR")
    private String libAsr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_ASR")
    private String licAsr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_ASR")
    private String temEnSveAsr;
    @Size(max = 35)
    @Column(name = "LIM1_ASR")
    private String lim1Asr;
    @Size(max = 35)
    @Column(name = "LIM2_ASR")
    private String lim2Asr;
    @Size(max = 35)
    @Column(name = "LIM3_ASR")
    private String lim3Asr;
    @Size(max = 1)
    @Column(name = "TEM_MIN_ASR")
    private String temMinAsr;
    @Column(name = "NUM_ORD_ASR")
    private Short numOrdAsr;
    @Size(max = 120)
    @Column(name = "LIB_WEB_ASR")
    private String libWebAsr;
    @OneToMany(mappedBy = "codAsr")
    private List<InsAdmAnu> insAdmAnuList;

    public AssRspCiv() {
    }

    public AssRspCiv(String codAsr) {
        this.codAsr = codAsr;
    }

    public AssRspCiv(String codAsr, String libAsr, String licAsr, String temEnSveAsr) {
        this.codAsr = codAsr;
        this.libAsr = libAsr;
        this.licAsr = licAsr;
        this.temEnSveAsr = temEnSveAsr;
    }

    public String getCodAsr() {
        return codAsr;
    }

    public void setCodAsr(String codAsr) {
        this.codAsr = codAsr;
    }

    public String getLibAsr() {
        return libAsr;
    }

    public void setLibAsr(String libAsr) {
        this.libAsr = libAsr;
    }

    public String getLicAsr() {
        return licAsr;
    }

    public void setLicAsr(String licAsr) {
        this.licAsr = licAsr;
    }

    public String getTemEnSveAsr() {
        return temEnSveAsr;
    }

    public void setTemEnSveAsr(String temEnSveAsr) {
        this.temEnSveAsr = temEnSveAsr;
    }

    public String getLim1Asr() {
        return lim1Asr;
    }

    public void setLim1Asr(String lim1Asr) {
        this.lim1Asr = lim1Asr;
    }

    public String getLim2Asr() {
        return lim2Asr;
    }

    public void setLim2Asr(String lim2Asr) {
        this.lim2Asr = lim2Asr;
    }

    public String getLim3Asr() {
        return lim3Asr;
    }

    public void setLim3Asr(String lim3Asr) {
        this.lim3Asr = lim3Asr;
    }

    public String getTemMinAsr() {
        return temMinAsr;
    }

    public void setTemMinAsr(String temMinAsr) {
        this.temMinAsr = temMinAsr;
    }

    public Short getNumOrdAsr() {
        return numOrdAsr;
    }

    public void setNumOrdAsr(Short numOrdAsr) {
        this.numOrdAsr = numOrdAsr;
    }

    public String getLibWebAsr() {
        return libWebAsr;
    }

    public void setLibWebAsr(String libWebAsr) {
        this.libWebAsr = libWebAsr;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAsr != null ? codAsr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssRspCiv)) {
            return false;
        }
        AssRspCiv other = (AssRspCiv) object;
        if ((this.codAsr == null && other.codAsr != null) || (this.codAsr != null && !this.codAsr.equals(other.codAsr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.AssRspCiv[ codAsr=" + codAsr + " ]";
    }
    
}
