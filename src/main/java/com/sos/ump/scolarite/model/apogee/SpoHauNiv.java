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
@Table(name = "SPO_HAU_NIV")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SpoHauNiv.findAll", query = "SELECT s FROM SpoHauNiv s"),
    @NamedQuery(name = "SpoHauNiv.findByCodSpo", query = "SELECT s FROM SpoHauNiv s WHERE s.codSpo = :codSpo"),
    @NamedQuery(name = "SpoHauNiv.findByLibSpo", query = "SELECT s FROM SpoHauNiv s WHERE s.libSpo = :libSpo"),
    @NamedQuery(name = "SpoHauNiv.findByLicSpo", query = "SELECT s FROM SpoHauNiv s WHERE s.licSpo = :licSpo"),
    @NamedQuery(name = "SpoHauNiv.findByTemEnSveSpo", query = "SELECT s FROM SpoHauNiv s WHERE s.temEnSveSpo = :temEnSveSpo"),
    @NamedQuery(name = "SpoHauNiv.findByLim1Spo", query = "SELECT s FROM SpoHauNiv s WHERE s.lim1Spo = :lim1Spo"),
    @NamedQuery(name = "SpoHauNiv.findByLim2Spo", query = "SELECT s FROM SpoHauNiv s WHERE s.lim2Spo = :lim2Spo"),
    @NamedQuery(name = "SpoHauNiv.findByLim3Spo", query = "SELECT s FROM SpoHauNiv s WHERE s.lim3Spo = :lim3Spo"),
    @NamedQuery(name = "SpoHauNiv.findByTemMinSpo", query = "SELECT s FROM SpoHauNiv s WHERE s.temMinSpo = :temMinSpo"),
    @NamedQuery(name = "SpoHauNiv.findByNumOrdSpo", query = "SELECT s FROM SpoHauNiv s WHERE s.numOrdSpo = :numOrdSpo"),
    @NamedQuery(name = "SpoHauNiv.findByLibWebSpo", query = "SELECT s FROM SpoHauNiv s WHERE s.libWebSpo = :libWebSpo")})
public class SpoHauNiv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_SPO")
    private String codSpo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_SPO")
    private String libSpo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_SPO")
    private String licSpo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_SPO")
    private String temEnSveSpo;
    @Size(max = 35)
    @Column(name = "LIM1_SPO")
    private String lim1Spo;
    @Size(max = 35)
    @Column(name = "LIM2_SPO")
    private String lim2Spo;
    @Size(max = 35)
    @Column(name = "LIM3_SPO")
    private String lim3Spo;
    @Size(max = 1)
    @Column(name = "TEM_MIN_SPO")
    private String temMinSpo;
    @Column(name = "NUM_ORD_SPO")
    private Short numOrdSpo;
    @Size(max = 120)
    @Column(name = "LIB_WEB_SPO")
    private String libWebSpo;
    @OneToMany(mappedBy = "codSpo")
    private List<InsAdmAnu> insAdmAnuList;

    public SpoHauNiv() {
    }

    public SpoHauNiv(String codSpo) {
        this.codSpo = codSpo;
    }

    public SpoHauNiv(String codSpo, String libSpo, String licSpo, String temEnSveSpo) {
        this.codSpo = codSpo;
        this.libSpo = libSpo;
        this.licSpo = licSpo;
        this.temEnSveSpo = temEnSveSpo;
    }

    public String getCodSpo() {
        return codSpo;
    }

    public void setCodSpo(String codSpo) {
        this.codSpo = codSpo;
    }

    public String getLibSpo() {
        return libSpo;
    }

    public void setLibSpo(String libSpo) {
        this.libSpo = libSpo;
    }

    public String getLicSpo() {
        return licSpo;
    }

    public void setLicSpo(String licSpo) {
        this.licSpo = licSpo;
    }

    public String getTemEnSveSpo() {
        return temEnSveSpo;
    }

    public void setTemEnSveSpo(String temEnSveSpo) {
        this.temEnSveSpo = temEnSveSpo;
    }

    public String getLim1Spo() {
        return lim1Spo;
    }

    public void setLim1Spo(String lim1Spo) {
        this.lim1Spo = lim1Spo;
    }

    public String getLim2Spo() {
        return lim2Spo;
    }

    public void setLim2Spo(String lim2Spo) {
        this.lim2Spo = lim2Spo;
    }

    public String getLim3Spo() {
        return lim3Spo;
    }

    public void setLim3Spo(String lim3Spo) {
        this.lim3Spo = lim3Spo;
    }

    public String getTemMinSpo() {
        return temMinSpo;
    }

    public void setTemMinSpo(String temMinSpo) {
        this.temMinSpo = temMinSpo;
    }

    public Short getNumOrdSpo() {
        return numOrdSpo;
    }

    public void setNumOrdSpo(Short numOrdSpo) {
        this.numOrdSpo = numOrdSpo;
    }

    public String getLibWebSpo() {
        return libWebSpo;
    }

    public void setLibWebSpo(String libWebSpo) {
        this.libWebSpo = libWebSpo;
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
        hash += (codSpo != null ? codSpo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpoHauNiv)) {
            return false;
        }
        SpoHauNiv other = (SpoHauNiv) object;
        if ((this.codSpo == null && other.codSpo != null) || (this.codSpo != null && !this.codSpo.equals(other.codSpo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.SpoHauNiv[ codSpo=" + codSpo + " ]";
    }
    
}
