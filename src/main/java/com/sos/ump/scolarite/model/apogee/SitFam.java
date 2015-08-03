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
@Table(name = "SIT_FAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SitFam.findAll", query = "SELECT s FROM SitFam s"),
    @NamedQuery(name = "SitFam.findByCodFam", query = "SELECT s FROM SitFam s WHERE s.codFam = :codFam"),
    @NamedQuery(name = "SitFam.findByCodSisFam", query = "SELECT s FROM SitFam s WHERE s.codSisFam = :codSisFam"),
    @NamedQuery(name = "SitFam.findByLibFam", query = "SELECT s FROM SitFam s WHERE s.libFam = :libFam"),
    @NamedQuery(name = "SitFam.findByLicFam", query = "SELECT s FROM SitFam s WHERE s.licFam = :licFam"),
    @NamedQuery(name = "SitFam.findByTemEnSveFam", query = "SELECT s FROM SitFam s WHERE s.temEnSveFam = :temEnSveFam"),
    @NamedQuery(name = "SitFam.findByLim1Fam", query = "SELECT s FROM SitFam s WHERE s.lim1Fam = :lim1Fam"),
    @NamedQuery(name = "SitFam.findByLim2Fam", query = "SELECT s FROM SitFam s WHERE s.lim2Fam = :lim2Fam"),
    @NamedQuery(name = "SitFam.findByLim3Fam", query = "SELECT s FROM SitFam s WHERE s.lim3Fam = :lim3Fam"),
    @NamedQuery(name = "SitFam.findByTemMinFam", query = "SELECT s FROM SitFam s WHERE s.temMinFam = :temMinFam"),
    @NamedQuery(name = "SitFam.findByNumOrdFam", query = "SELECT s FROM SitFam s WHERE s.numOrdFam = :numOrdFam"),
    @NamedQuery(name = "SitFam.findByLibWebFam", query = "SELECT s FROM SitFam s WHERE s.libWebFam = :libWebFam")})
public class SitFam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_FAM")
    private String codFam;
    @Size(max = 1)
    @Column(name = "COD_SIS_FAM")
    private String codSisFam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_FAM")
    private String libFam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_FAM")
    private String licFam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_FAM")
    private String temEnSveFam;
    @Size(max = 35)
    @Column(name = "LIM1_FAM")
    private String lim1Fam;
    @Size(max = 35)
    @Column(name = "LIM2_FAM")
    private String lim2Fam;
    @Size(max = 35)
    @Column(name = "LIM3_FAM")
    private String lim3Fam;
    @Size(max = 1)
    @Column(name = "TEM_MIN_FAM")
    private String temMinFam;
    @Column(name = "NUM_ORD_FAM")
    private Short numOrdFam;
    @Size(max = 120)
    @Column(name = "LIB_WEB_FAM")
    private String libWebFam;
    @OneToMany(mappedBy = "codFam")
    private List<IndOpi> indOpiList;
    @OneToMany(mappedBy = "codFam")
    private List<Individu> individuList;

    public SitFam() {
    }

    public SitFam(String codFam) {
        this.codFam = codFam;
    }

    public SitFam(String codFam, String libFam, String licFam, String temEnSveFam) {
        this.codFam = codFam;
        this.libFam = libFam;
        this.licFam = licFam;
        this.temEnSveFam = temEnSveFam;
    }

    public String getCodFam() {
        return codFam;
    }

    public void setCodFam(String codFam) {
        this.codFam = codFam;
    }

    public String getCodSisFam() {
        return codSisFam;
    }

    public void setCodSisFam(String codSisFam) {
        this.codSisFam = codSisFam;
    }

    public String getLibFam() {
        return libFam;
    }

    public void setLibFam(String libFam) {
        this.libFam = libFam;
    }

    public String getLicFam() {
        return licFam;
    }

    public void setLicFam(String licFam) {
        this.licFam = licFam;
    }

    public String getTemEnSveFam() {
        return temEnSveFam;
    }

    public void setTemEnSveFam(String temEnSveFam) {
        this.temEnSveFam = temEnSveFam;
    }

    public String getLim1Fam() {
        return lim1Fam;
    }

    public void setLim1Fam(String lim1Fam) {
        this.lim1Fam = lim1Fam;
    }

    public String getLim2Fam() {
        return lim2Fam;
    }

    public void setLim2Fam(String lim2Fam) {
        this.lim2Fam = lim2Fam;
    }

    public String getLim3Fam() {
        return lim3Fam;
    }

    public void setLim3Fam(String lim3Fam) {
        this.lim3Fam = lim3Fam;
    }

    public String getTemMinFam() {
        return temMinFam;
    }

    public void setTemMinFam(String temMinFam) {
        this.temMinFam = temMinFam;
    }

    public Short getNumOrdFam() {
        return numOrdFam;
    }

    public void setNumOrdFam(Short numOrdFam) {
        this.numOrdFam = numOrdFam;
    }

    public String getLibWebFam() {
        return libWebFam;
    }

    public void setLibWebFam(String libWebFam) {
        this.libWebFam = libWebFam;
    }

    @XmlTransient
    public List<IndOpi> getIndOpiList() {
        return indOpiList;
    }

    public void setIndOpiList(List<IndOpi> indOpiList) {
        this.indOpiList = indOpiList;
    }

    @XmlTransient
    public List<Individu> getIndividuList() {
        return individuList;
    }

    public void setIndividuList(List<Individu> individuList) {
        this.individuList = individuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFam != null ? codFam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SitFam)) {
            return false;
        }
        SitFam other = (SitFam) object;
        if ((this.codFam == null && other.codFam != null) || (this.codFam != null && !this.codFam.equals(other.codFam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.SitFam[ codFam=" + codFam + " ]";
    }
    
}
