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
@Table(name = "TYP_HEBERGEMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypHebergement.findAll", query = "SELECT t FROM TypHebergement t"),
    @NamedQuery(name = "TypHebergement.findByCodThb", query = "SELECT t FROM TypHebergement t WHERE t.codThb = :codThb"),
    @NamedQuery(name = "TypHebergement.findByCodSisThb", query = "SELECT t FROM TypHebergement t WHERE t.codSisThb = :codSisThb"),
    @NamedQuery(name = "TypHebergement.findByLibThb", query = "SELECT t FROM TypHebergement t WHERE t.libThb = :libThb"),
    @NamedQuery(name = "TypHebergement.findByLicThb", query = "SELECT t FROM TypHebergement t WHERE t.licThb = :licThb"),
    @NamedQuery(name = "TypHebergement.findByTemEnSveThb", query = "SELECT t FROM TypHebergement t WHERE t.temEnSveThb = :temEnSveThb"),
    @NamedQuery(name = "TypHebergement.findByTemDel", query = "SELECT t FROM TypHebergement t WHERE t.temDel = :temDel"),
    @NamedQuery(name = "TypHebergement.findByLim1Thb", query = "SELECT t FROM TypHebergement t WHERE t.lim1Thb = :lim1Thb"),
    @NamedQuery(name = "TypHebergement.findByLim2Thb", query = "SELECT t FROM TypHebergement t WHERE t.lim2Thb = :lim2Thb"),
    @NamedQuery(name = "TypHebergement.findByLim3Thb", query = "SELECT t FROM TypHebergement t WHERE t.lim3Thb = :lim3Thb"),
    @NamedQuery(name = "TypHebergement.findByTemMinThb", query = "SELECT t FROM TypHebergement t WHERE t.temMinThb = :temMinThb"),
    @NamedQuery(name = "TypHebergement.findByNumOrdThb", query = "SELECT t FROM TypHebergement t WHERE t.numOrdThb = :numOrdThb"),
    @NamedQuery(name = "TypHebergement.findByLibWebThb", query = "SELECT t FROM TypHebergement t WHERE t.libWebThb = :libWebThb")})
public class TypHebergement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_THB")
    private String codThb;
    @Size(max = 1)
    @Column(name = "COD_SIS_THB")
    private String codSisThb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_THB")
    private String libThb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_THB")
    private String licThb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_THB")
    private String temEnSveThb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 35)
    @Column(name = "LIM1_THB")
    private String lim1Thb;
    @Size(max = 35)
    @Column(name = "LIM2_THB")
    private String lim2Thb;
    @Size(max = 35)
    @Column(name = "LIM3_THB")
    private String lim3Thb;
    @Size(max = 1)
    @Column(name = "TEM_MIN_THB")
    private String temMinThb;
    @Column(name = "NUM_ORD_THB")
    private Short numOrdThb;
    @Size(max = 120)
    @Column(name = "LIB_WEB_THB")
    private String libWebThb;
    @OneToMany(mappedBy = "codThb")
    private List<InsInfoAnu> insInfoAnuList;

    public TypHebergement() {
    }

    public TypHebergement(String codThb) {
        this.codThb = codThb;
    }

    public TypHebergement(String codThb, String libThb, String licThb, String temEnSveThb, String temDel) {
        this.codThb = codThb;
        this.libThb = libThb;
        this.licThb = licThb;
        this.temEnSveThb = temEnSveThb;
        this.temDel = temDel;
    }

    public String getCodThb() {
        return codThb;
    }

    public void setCodThb(String codThb) {
        this.codThb = codThb;
    }

    public String getCodSisThb() {
        return codSisThb;
    }

    public void setCodSisThb(String codSisThb) {
        this.codSisThb = codSisThb;
    }

    public String getLibThb() {
        return libThb;
    }

    public void setLibThb(String libThb) {
        this.libThb = libThb;
    }

    public String getLicThb() {
        return licThb;
    }

    public void setLicThb(String licThb) {
        this.licThb = licThb;
    }

    public String getTemEnSveThb() {
        return temEnSveThb;
    }

    public void setTemEnSveThb(String temEnSveThb) {
        this.temEnSveThb = temEnSveThb;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getLim1Thb() {
        return lim1Thb;
    }

    public void setLim1Thb(String lim1Thb) {
        this.lim1Thb = lim1Thb;
    }

    public String getLim2Thb() {
        return lim2Thb;
    }

    public void setLim2Thb(String lim2Thb) {
        this.lim2Thb = lim2Thb;
    }

    public String getLim3Thb() {
        return lim3Thb;
    }

    public void setLim3Thb(String lim3Thb) {
        this.lim3Thb = lim3Thb;
    }

    public String getTemMinThb() {
        return temMinThb;
    }

    public void setTemMinThb(String temMinThb) {
        this.temMinThb = temMinThb;
    }

    public Short getNumOrdThb() {
        return numOrdThb;
    }

    public void setNumOrdThb(Short numOrdThb) {
        this.numOrdThb = numOrdThb;
    }

    public String getLibWebThb() {
        return libWebThb;
    }

    public void setLibWebThb(String libWebThb) {
        this.libWebThb = libWebThb;
    }

    @XmlTransient
    public List<InsInfoAnu> getInsInfoAnuList() {
        return insInfoAnuList;
    }

    public void setInsInfoAnuList(List<InsInfoAnu> insInfoAnuList) {
        this.insInfoAnuList = insInfoAnuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codThb != null ? codThb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypHebergement)) {
            return false;
        }
        TypHebergement other = (TypHebergement) object;
        if ((this.codThb == null && other.codThb != null) || (this.codThb != null && !this.codThb.equals(other.codThb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TypHebergement[ codThb=" + codThb + " ]";
    }
    
}
