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
@Table(name = "TYP_RESULTAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypResultat.findAll", query = "SELECT t FROM TypResultat t"),
    @NamedQuery(name = "TypResultat.findByCodTre", query = "SELECT t FROM TypResultat t WHERE t.codTre = :codTre"),
    @NamedQuery(name = "TypResultat.findByLibTre", query = "SELECT t FROM TypResultat t WHERE t.libTre = :libTre"),
    @NamedQuery(name = "TypResultat.findByLicTre", query = "SELECT t FROM TypResultat t WHERE t.licTre = :licTre"),
    @NamedQuery(name = "TypResultat.findByTemAdiTre", query = "SELECT t FROM TypResultat t WHERE t.temAdiTre = :temAdiTre"),
    @NamedQuery(name = "TypResultat.findByTemAdoTre", query = "SELECT t FROM TypResultat t WHERE t.temAdoTre = :temAdoTre"),
    @NamedQuery(name = "TypResultat.findByTemVdiTre", query = "SELECT t FROM TypResultat t WHERE t.temVdiTre = :temVdiTre"),
    @NamedQuery(name = "TypResultat.findByTemVetTre", query = "SELECT t FROM TypResultat t WHERE t.temVetTre = :temVetTre"),
    @NamedQuery(name = "TypResultat.findByTemElpTre", query = "SELECT t FROM TypResultat t WHERE t.temElpTre = :temElpTre"),
    @NamedQuery(name = "TypResultat.findByTemEprTre", query = "SELECT t FROM TypResultat t WHERE t.temEprTre = :temEprTre"),
    @NamedQuery(name = "TypResultat.findByCodSisDipTre", query = "SELECT t FROM TypResultat t WHERE t.codSisDipTre = :codSisDipTre"),
    @NamedQuery(name = "TypResultat.findByCodNegTre", query = "SELECT t FROM TypResultat t WHERE t.codNegTre = :codNegTre"),
    @NamedQuery(name = "TypResultat.findByTemEnSveTre", query = "SELECT t FROM TypResultat t WHERE t.temEnSveTre = :temEnSveTre"),
    @NamedQuery(name = "TypResultat.findByTemDel", query = "SELECT t FROM TypResultat t WHERE t.temDel = :temDel"),
    @NamedQuery(name = "TypResultat.findByCodTreArb", query = "SELECT t FROM TypResultat t WHERE t.codTreArb = :codTreArb"),
    @NamedQuery(name = "TypResultat.findByLibTreArb", query = "SELECT t FROM TypResultat t WHERE t.libTreArb = :libTreArb"),
    @NamedQuery(name = "TypResultat.findByLicTreArb", query = "SELECT t FROM TypResultat t WHERE t.licTreArb = :licTreArb")})
public class TypResultat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_TRE")
    private String codTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_TRE")
    private String libTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "LIC_TRE")
    private String licTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ADI_TRE")
    private String temAdiTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ADO_TRE")
    private String temAdoTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_VDI_TRE")
    private String temVdiTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_VET_TRE")
    private String temVetTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ELP_TRE")
    private String temElpTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EPR_TRE")
    private String temEprTre;
    @Size(max = 1)
    @Column(name = "COD_SIS_DIP_TRE")
    private String codSisDipTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_NEG_TRE")
    private String codNegTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_TRE")
    private String temEnSveTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 4)
    @Column(name = "COD_TRE_ARB")
    private String codTreArb;
    @Size(max = 40)
    @Column(name = "LIB_TRE_ARB")
    private String libTreArb;
    @Size(max = 15)
    @Column(name = "LIC_TRE_ARB")
    private String licTreArb;
    @OneToMany(mappedBy = "codTrePos")
    private List<VersionEtape> versionEtapeList;
    @OneToMany(mappedBy = "codTreNeg")
    private List<VersionEtape> versionEtapeList1;
    @OneToMany(mappedBy = "codTrePos")
    private List<VersionDiplome> versionDiplomeList;
    @OneToMany(mappedBy = "codTreNeg")
    private List<VersionDiplome> versionDiplomeList1;
    @OneToMany(mappedBy = "codTre")
    private List<ResultatElp> resultatElpList;

    public TypResultat() {
    }

    public TypResultat(String codTre) {
        this.codTre = codTre;
    }

    public TypResultat(String codTre, String libTre, String licTre, String temAdiTre, String temAdoTre, String temVdiTre, String temVetTre, String temElpTre, String temEprTre, String codNegTre, String temEnSveTre, String temDel) {
        this.codTre = codTre;
        this.libTre = libTre;
        this.licTre = licTre;
        this.temAdiTre = temAdiTre;
        this.temAdoTre = temAdoTre;
        this.temVdiTre = temVdiTre;
        this.temVetTre = temVetTre;
        this.temElpTre = temElpTre;
        this.temEprTre = temEprTre;
        this.codNegTre = codNegTre;
        this.temEnSveTre = temEnSveTre;
        this.temDel = temDel;
    }

    public String getCodTre() {
        return codTre;
    }

    public void setCodTre(String codTre) {
        this.codTre = codTre;
    }

    public String getLibTre() {
        return libTre;
    }

    public void setLibTre(String libTre) {
        this.libTre = libTre;
    }

    public String getLicTre() {
        return licTre;
    }

    public void setLicTre(String licTre) {
        this.licTre = licTre;
    }

    public String getTemAdiTre() {
        return temAdiTre;
    }

    public void setTemAdiTre(String temAdiTre) {
        this.temAdiTre = temAdiTre;
    }

    public String getTemAdoTre() {
        return temAdoTre;
    }

    public void setTemAdoTre(String temAdoTre) {
        this.temAdoTre = temAdoTre;
    }

    public String getTemVdiTre() {
        return temVdiTre;
    }

    public void setTemVdiTre(String temVdiTre) {
        this.temVdiTre = temVdiTre;
    }

    public String getTemVetTre() {
        return temVetTre;
    }

    public void setTemVetTre(String temVetTre) {
        this.temVetTre = temVetTre;
    }

    public String getTemElpTre() {
        return temElpTre;
    }

    public void setTemElpTre(String temElpTre) {
        this.temElpTre = temElpTre;
    }

    public String getTemEprTre() {
        return temEprTre;
    }

    public void setTemEprTre(String temEprTre) {
        this.temEprTre = temEprTre;
    }

    public String getCodSisDipTre() {
        return codSisDipTre;
    }

    public void setCodSisDipTre(String codSisDipTre) {
        this.codSisDipTre = codSisDipTre;
    }

    public String getCodNegTre() {
        return codNegTre;
    }

    public void setCodNegTre(String codNegTre) {
        this.codNegTre = codNegTre;
    }

    public String getTemEnSveTre() {
        return temEnSveTre;
    }

    public void setTemEnSveTre(String temEnSveTre) {
        this.temEnSveTre = temEnSveTre;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getCodTreArb() {
        return codTreArb;
    }

    public void setCodTreArb(String codTreArb) {
        this.codTreArb = codTreArb;
    }

    public String getLibTreArb() {
        return libTreArb;
    }

    public void setLibTreArb(String libTreArb) {
        this.libTreArb = libTreArb;
    }

    public String getLicTreArb() {
        return licTreArb;
    }

    public void setLicTreArb(String licTreArb) {
        this.licTreArb = licTreArb;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList() {
        return versionEtapeList;
    }

    public void setVersionEtapeList(List<VersionEtape> versionEtapeList) {
        this.versionEtapeList = versionEtapeList;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList1() {
        return versionEtapeList1;
    }

    public void setVersionEtapeList1(List<VersionEtape> versionEtapeList1) {
        this.versionEtapeList1 = versionEtapeList1;
    }

    @XmlTransient
    public List<VersionDiplome> getVersionDiplomeList() {
        return versionDiplomeList;
    }

    public void setVersionDiplomeList(List<VersionDiplome> versionDiplomeList) {
        this.versionDiplomeList = versionDiplomeList;
    }

    @XmlTransient
    public List<VersionDiplome> getVersionDiplomeList1() {
        return versionDiplomeList1;
    }

    public void setVersionDiplomeList1(List<VersionDiplome> versionDiplomeList1) {
        this.versionDiplomeList1 = versionDiplomeList1;
    }

    @XmlTransient
    public List<ResultatElp> getResultatElpList() {
        return resultatElpList;
    }

    public void setResultatElpList(List<ResultatElp> resultatElpList) {
        this.resultatElpList = resultatElpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTre != null ? codTre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypResultat)) {
            return false;
        }
        TypResultat other = (TypResultat) object;
        if ((this.codTre == null && other.codTre != null) || (this.codTre != null && !this.codTre.equals(other.codTre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TypResultat[ codTre=" + codTre + " ]";
    }
    
}
