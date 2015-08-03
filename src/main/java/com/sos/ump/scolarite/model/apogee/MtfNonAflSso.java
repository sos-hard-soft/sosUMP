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
@Table(name = "MTF_NON_AFL_SSO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MtfNonAflSso.findAll", query = "SELECT m FROM MtfNonAflSso m"),
    @NamedQuery(name = "MtfNonAflSso.findByCodMns", query = "SELECT m FROM MtfNonAflSso m WHERE m.codMns = :codMns"),
    @NamedQuery(name = "MtfNonAflSso.findByLibMns", query = "SELECT m FROM MtfNonAflSso m WHERE m.libMns = :libMns"),
    @NamedQuery(name = "MtfNonAflSso.findByLicMns", query = "SELECT m FROM MtfNonAflSso m WHERE m.licMns = :licMns"),
    @NamedQuery(name = "MtfNonAflSso.findByTemEnSveMns", query = "SELECT m FROM MtfNonAflSso m WHERE m.temEnSveMns = :temEnSveMns"),
    @NamedQuery(name = "MtfNonAflSso.findByTemDel", query = "SELECT m FROM MtfNonAflSso m WHERE m.temDel = :temDel"),
    @NamedQuery(name = "MtfNonAflSso.findByLim1Mns", query = "SELECT m FROM MtfNonAflSso m WHERE m.lim1Mns = :lim1Mns"),
    @NamedQuery(name = "MtfNonAflSso.findByLim2Mns", query = "SELECT m FROM MtfNonAflSso m WHERE m.lim2Mns = :lim2Mns"),
    @NamedQuery(name = "MtfNonAflSso.findByLim3Mns", query = "SELECT m FROM MtfNonAflSso m WHERE m.lim3Mns = :lim3Mns"),
    @NamedQuery(name = "MtfNonAflSso.findByTemMinMns", query = "SELECT m FROM MtfNonAflSso m WHERE m.temMinMns = :temMinMns"),
    @NamedQuery(name = "MtfNonAflSso.findByNumOrdMns", query = "SELECT m FROM MtfNonAflSso m WHERE m.numOrdMns = :numOrdMns"),
    @NamedQuery(name = "MtfNonAflSso.findByLibWebMns", query = "SELECT m FROM MtfNonAflSso m WHERE m.libWebMns = :libWebMns")})
public class MtfNonAflSso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_MNS")
    private String codMns;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_MNS")
    private String libMns;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_MNS")
    private String licMns;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_MNS")
    private String temEnSveMns;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 35)
    @Column(name = "LIM1_MNS")
    private String lim1Mns;
    @Size(max = 35)
    @Column(name = "LIM2_MNS")
    private String lim2Mns;
    @Size(max = 35)
    @Column(name = "LIM3_MNS")
    private String lim3Mns;
    @Size(max = 1)
    @Column(name = "TEM_MIN_MNS")
    private String temMinMns;
    @Column(name = "NUM_ORD_MNS")
    private Short numOrdMns;
    @Size(max = 120)
    @Column(name = "LIB_WEB_MNS")
    private String libWebMns;
    @OneToMany(mappedBy = "codMns")
    private List<InsAdmAnu> insAdmAnuList;

    public MtfNonAflSso() {
    }

    public MtfNonAflSso(String codMns) {
        this.codMns = codMns;
    }

    public MtfNonAflSso(String codMns, String libMns, String licMns, String temEnSveMns, String temDel) {
        this.codMns = codMns;
        this.libMns = libMns;
        this.licMns = licMns;
        this.temEnSveMns = temEnSveMns;
        this.temDel = temDel;
    }

    public String getCodMns() {
        return codMns;
    }

    public void setCodMns(String codMns) {
        this.codMns = codMns;
    }

    public String getLibMns() {
        return libMns;
    }

    public void setLibMns(String libMns) {
        this.libMns = libMns;
    }

    public String getLicMns() {
        return licMns;
    }

    public void setLicMns(String licMns) {
        this.licMns = licMns;
    }

    public String getTemEnSveMns() {
        return temEnSveMns;
    }

    public void setTemEnSveMns(String temEnSveMns) {
        this.temEnSveMns = temEnSveMns;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getLim1Mns() {
        return lim1Mns;
    }

    public void setLim1Mns(String lim1Mns) {
        this.lim1Mns = lim1Mns;
    }

    public String getLim2Mns() {
        return lim2Mns;
    }

    public void setLim2Mns(String lim2Mns) {
        this.lim2Mns = lim2Mns;
    }

    public String getLim3Mns() {
        return lim3Mns;
    }

    public void setLim3Mns(String lim3Mns) {
        this.lim3Mns = lim3Mns;
    }

    public String getTemMinMns() {
        return temMinMns;
    }

    public void setTemMinMns(String temMinMns) {
        this.temMinMns = temMinMns;
    }

    public Short getNumOrdMns() {
        return numOrdMns;
    }

    public void setNumOrdMns(Short numOrdMns) {
        this.numOrdMns = numOrdMns;
    }

    public String getLibWebMns() {
        return libWebMns;
    }

    public void setLibWebMns(String libWebMns) {
        this.libWebMns = libWebMns;
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
        hash += (codMns != null ? codMns.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtfNonAflSso)) {
            return false;
        }
        MtfNonAflSso other = (MtfNonAflSso) object;
        if ((this.codMns == null && other.codMns != null) || (this.codMns != null && !this.codMns.equals(other.codMns))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.MtfNonAflSso[ codMns=" + codMns + " ]";
    }
    
}
