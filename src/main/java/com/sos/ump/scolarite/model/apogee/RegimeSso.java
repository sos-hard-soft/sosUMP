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
@Table(name = "REGIME_SSO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegimeSso.findAll", query = "SELECT r FROM RegimeSso r"),
    @NamedQuery(name = "RegimeSso.findByCodRss", query = "SELECT r FROM RegimeSso r WHERE r.codRss = :codRss"),
    @NamedQuery(name = "RegimeSso.findByLibRss", query = "SELECT r FROM RegimeSso r WHERE r.libRss = :libRss"),
    @NamedQuery(name = "RegimeSso.findByLicRss", query = "SELECT r FROM RegimeSso r WHERE r.licRss = :licRss"),
    @NamedQuery(name = "RegimeSso.findByTemEnSveRss", query = "SELECT r FROM RegimeSso r WHERE r.temEnSveRss = :temEnSveRss")})
public class RegimeSso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_RSS")
    private String codRss;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_RSS")
    private String libRss;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_RSS")
    private String licRss;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_RSS")
    private String temEnSveRss;
    @OneToMany(mappedBy = "codRss")
    private List<InsAdmAnu> insAdmAnuList;

    public RegimeSso() {
    }

    public RegimeSso(String codRss) {
        this.codRss = codRss;
    }

    public RegimeSso(String codRss, String libRss, String licRss, String temEnSveRss) {
        this.codRss = codRss;
        this.libRss = libRss;
        this.licRss = licRss;
        this.temEnSveRss = temEnSveRss;
    }

    public String getCodRss() {
        return codRss;
    }

    public void setCodRss(String codRss) {
        this.codRss = codRss;
    }

    public String getLibRss() {
        return libRss;
    }

    public void setLibRss(String libRss) {
        this.libRss = libRss;
    }

    public String getLicRss() {
        return licRss;
    }

    public void setLicRss(String licRss) {
        this.licRss = licRss;
    }

    public String getTemEnSveRss() {
        return temEnSveRss;
    }

    public void setTemEnSveRss(String temEnSveRss) {
        this.temEnSveRss = temEnSveRss;
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
        hash += (codRss != null ? codRss.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegimeSso)) {
            return false;
        }
        RegimeSso other = (RegimeSso) object;
        if ((this.codRss == null && other.codRss != null) || (this.codRss != null && !this.codRss.equals(other.codRss))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.RegimeSso[ codRss=" + codRss + " ]";
    }
    
}
