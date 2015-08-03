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
@Table(name = "DIP_AUT_CUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DipAutCur.findAll", query = "SELECT d FROM DipAutCur d"),
    @NamedQuery(name = "DipAutCur.findByCodDac", query = "SELECT d FROM DipAutCur d WHERE d.codDac = :codDac"),
    @NamedQuery(name = "DipAutCur.findByCodSisDac", query = "SELECT d FROM DipAutCur d WHERE d.codSisDac = :codSisDac"),
    @NamedQuery(name = "DipAutCur.findByLibDac", query = "SELECT d FROM DipAutCur d WHERE d.libDac = :libDac"),
    @NamedQuery(name = "DipAutCur.findByLicDac", query = "SELECT d FROM DipAutCur d WHERE d.licDac = :licDac"),
    @NamedQuery(name = "DipAutCur.findByTemEnSveDac", query = "SELECT d FROM DipAutCur d WHERE d.temEnSveDac = :temEnSveDac")})
public class DipAutCur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "COD_DAC")
    private String codDac;
    @Size(max = 2)
    @Column(name = "COD_SIS_DAC")
    private String codSisDac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_DAC")
    private String libDac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_DAC")
    private String licDac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_DAC")
    private String temEnSveDac;
    @OneToMany(mappedBy = "codDacAcc")
    private List<InsAdmEtp> insAdmEtpList;

    public DipAutCur() {
    }

    public DipAutCur(String codDac) {
        this.codDac = codDac;
    }

    public DipAutCur(String codDac, String libDac, String licDac, String temEnSveDac) {
        this.codDac = codDac;
        this.libDac = libDac;
        this.licDac = licDac;
        this.temEnSveDac = temEnSveDac;
    }

    public String getCodDac() {
        return codDac;
    }

    public void setCodDac(String codDac) {
        this.codDac = codDac;
    }

    public String getCodSisDac() {
        return codSisDac;
    }

    public void setCodSisDac(String codSisDac) {
        this.codSisDac = codSisDac;
    }

    public String getLibDac() {
        return libDac;
    }

    public void setLibDac(String libDac) {
        this.libDac = libDac;
    }

    public String getLicDac() {
        return licDac;
    }

    public void setLicDac(String licDac) {
        this.licDac = licDac;
    }

    public String getTemEnSveDac() {
        return temEnSveDac;
    }

    public void setTemEnSveDac(String temEnSveDac) {
        this.temEnSveDac = temEnSveDac;
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
        hash += (codDac != null ? codDac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DipAutCur)) {
            return false;
        }
        DipAutCur other = (DipAutCur) object;
        if ((this.codDac == null && other.codDac != null) || (this.codDac != null && !this.codDac.equals(other.codDac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.DipAutCur[ codDac=" + codDac + " ]";
    }
    
}
