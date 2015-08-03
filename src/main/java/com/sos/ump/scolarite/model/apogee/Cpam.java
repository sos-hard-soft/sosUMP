/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "CPAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cpam.findAll", query = "SELECT c FROM Cpam c"),
    @NamedQuery(name = "Cpam.findByCodCpa", query = "SELECT c FROM Cpam c WHERE c.codCpa = :codCpa"),
    @NamedQuery(name = "Cpam.findByCodCpaTrmCpa", query = "SELECT c FROM Cpam c WHERE c.codCpaTrmCpa = :codCpaTrmCpa"),
    @NamedQuery(name = "Cpam.findByLibCpa", query = "SELECT c FROM Cpam c WHERE c.libCpa = :libCpa"),
    @NamedQuery(name = "Cpam.findByLicCpa", query = "SELECT c FROM Cpam c WHERE c.licCpa = :licCpa"),
    @NamedQuery(name = "Cpam.findByNumBrdTrmSsoCpa", query = "SELECT c FROM Cpam c WHERE c.numBrdTrmSsoCpa = :numBrdTrmSsoCpa"),
    @NamedQuery(name = "Cpam.findByLibAd1Cpa", query = "SELECT c FROM Cpam c WHERE c.libAd1Cpa = :libAd1Cpa"),
    @NamedQuery(name = "Cpam.findByLibAd2Cpa", query = "SELECT c FROM Cpam c WHERE c.libAd2Cpa = :libAd2Cpa"),
    @NamedQuery(name = "Cpam.findByLibAd3Cpa", query = "SELECT c FROM Cpam c WHERE c.libAd3Cpa = :libAd3Cpa"),
    @NamedQuery(name = "Cpam.findByTemEnSveCpa", query = "SELECT c FROM Cpam c WHERE c.temEnSveCpa = :temEnSveCpa")})
public class Cpam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_CPA")
    private String codCpa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_CPA_TRM_CPA")
    private String codCpaTrmCpa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_CPA")
    private String libCpa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_CPA")
    private String licCpa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_BRD_TRM_SSO_CPA")
    private short numBrdTrmSsoCpa;
    @Size(max = 32)
    @Column(name = "LIB_AD1_CPA")
    private String libAd1Cpa;
    @Size(max = 32)
    @Column(name = "LIB_AD2_CPA")
    private String libAd2Cpa;
    @Size(max = 32)
    @Column(name = "LIB_AD3_CPA")
    private String libAd3Cpa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CPA")
    private String temEnSveCpa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCpa")
    private List<CentreGestion> centreGestionList;
    @OneToMany(mappedBy = "codCpa")
    private List<InsAdmAnu> insAdmAnuList;
    @JoinColumns({
        @JoinColumn(name = "COD_POS_ADR_CPA", referencedColumnName = "COD_BDI"),
        @JoinColumn(name = "COD_COM_ADR_CPA", referencedColumnName = "COD_COM")})
    @ManyToOne
    private ComBdi comBdi;

    public Cpam() {
    }

    public Cpam(String codCpa) {
        this.codCpa = codCpa;
    }

    public Cpam(String codCpa, String codCpaTrmCpa, String libCpa, String licCpa, short numBrdTrmSsoCpa, String temEnSveCpa) {
        this.codCpa = codCpa;
        this.codCpaTrmCpa = codCpaTrmCpa;
        this.libCpa = libCpa;
        this.licCpa = licCpa;
        this.numBrdTrmSsoCpa = numBrdTrmSsoCpa;
        this.temEnSveCpa = temEnSveCpa;
    }

    public String getCodCpa() {
        return codCpa;
    }

    public void setCodCpa(String codCpa) {
        this.codCpa = codCpa;
    }

    public String getCodCpaTrmCpa() {
        return codCpaTrmCpa;
    }

    public void setCodCpaTrmCpa(String codCpaTrmCpa) {
        this.codCpaTrmCpa = codCpaTrmCpa;
    }

    public String getLibCpa() {
        return libCpa;
    }

    public void setLibCpa(String libCpa) {
        this.libCpa = libCpa;
    }

    public String getLicCpa() {
        return licCpa;
    }

    public void setLicCpa(String licCpa) {
        this.licCpa = licCpa;
    }

    public short getNumBrdTrmSsoCpa() {
        return numBrdTrmSsoCpa;
    }

    public void setNumBrdTrmSsoCpa(short numBrdTrmSsoCpa) {
        this.numBrdTrmSsoCpa = numBrdTrmSsoCpa;
    }

    public String getLibAd1Cpa() {
        return libAd1Cpa;
    }

    public void setLibAd1Cpa(String libAd1Cpa) {
        this.libAd1Cpa = libAd1Cpa;
    }

    public String getLibAd2Cpa() {
        return libAd2Cpa;
    }

    public void setLibAd2Cpa(String libAd2Cpa) {
        this.libAd2Cpa = libAd2Cpa;
    }

    public String getLibAd3Cpa() {
        return libAd3Cpa;
    }

    public void setLibAd3Cpa(String libAd3Cpa) {
        this.libAd3Cpa = libAd3Cpa;
    }

    public String getTemEnSveCpa() {
        return temEnSveCpa;
    }

    public void setTemEnSveCpa(String temEnSveCpa) {
        this.temEnSveCpa = temEnSveCpa;
    }

    @XmlTransient
    public List<CentreGestion> getCentreGestionList() {
        return centreGestionList;
    }

    public void setCentreGestionList(List<CentreGestion> centreGestionList) {
        this.centreGestionList = centreGestionList;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    public ComBdi getComBdi() {
        return comBdi;
    }

    public void setComBdi(ComBdi comBdi) {
        this.comBdi = comBdi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCpa != null ? codCpa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cpam)) {
            return false;
        }
        Cpam other = (Cpam) object;
        if ((this.codCpa == null && other.codCpa != null) || (this.codCpa != null && !this.codCpa.equals(other.codCpa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Cpam[ codCpa=" + codCpa + " ]";
    }
    
}
