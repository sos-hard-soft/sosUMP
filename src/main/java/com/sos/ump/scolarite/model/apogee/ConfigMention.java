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
@Table(name = "CONFIG_MENTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfigMention.findAll", query = "SELECT c FROM ConfigMention c"),
    @NamedQuery(name = "ConfigMention.findByCodCfm", query = "SELECT c FROM ConfigMention c WHERE c.codCfm = :codCfm"),
    @NamedQuery(name = "ConfigMention.findByLicCfm", query = "SELECT c FROM ConfigMention c WHERE c.licCfm = :licCfm"),
    @NamedQuery(name = "ConfigMention.findByLibCfm", query = "SELECT c FROM ConfigMention c WHERE c.libCfm = :libCfm"),
    @NamedQuery(name = "ConfigMention.findByTemEnSveCfm", query = "SELECT c FROM ConfigMention c WHERE c.temEnSveCfm = :temEnSveCfm"),
    @NamedQuery(name = "ConfigMention.findByTemDel", query = "SELECT c FROM ConfigMention c WHERE c.temDel = :temDel"),
    @NamedQuery(name = "ConfigMention.findByTemThsCfm", query = "SELECT c FROM ConfigMention c WHERE c.temThsCfm = :temThsCfm")})
public class ConfigMention implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_CFM")
    private String codCfm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_CFM")
    private String licCfm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_CFM")
    private String libCfm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CFM")
    private String temEnSveCfm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_THS_CFM")
    private String temThsCfm;
    @OneToMany(mappedBy = "codCfm")
    private List<VersionEtape> versionEtapeList;
    @OneToMany(mappedBy = "codCfm")
    private List<ElementPedagogi> elementPedagogiList;
    @OneToMany(mappedBy = "codCfm")
    private List<VersionDiplome> versionDiplomeList;

    public ConfigMention() {
    }

    public ConfigMention(String codCfm) {
        this.codCfm = codCfm;
    }

    public ConfigMention(String codCfm, String licCfm, String libCfm, String temEnSveCfm, String temDel, String temThsCfm) {
        this.codCfm = codCfm;
        this.licCfm = licCfm;
        this.libCfm = libCfm;
        this.temEnSveCfm = temEnSveCfm;
        this.temDel = temDel;
        this.temThsCfm = temThsCfm;
    }

    public String getCodCfm() {
        return codCfm;
    }

    public void setCodCfm(String codCfm) {
        this.codCfm = codCfm;
    }

    public String getLicCfm() {
        return licCfm;
    }

    public void setLicCfm(String licCfm) {
        this.licCfm = licCfm;
    }

    public String getLibCfm() {
        return libCfm;
    }

    public void setLibCfm(String libCfm) {
        this.libCfm = libCfm;
    }

    public String getTemEnSveCfm() {
        return temEnSveCfm;
    }

    public void setTemEnSveCfm(String temEnSveCfm) {
        this.temEnSveCfm = temEnSveCfm;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getTemThsCfm() {
        return temThsCfm;
    }

    public void setTemThsCfm(String temThsCfm) {
        this.temThsCfm = temThsCfm;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList() {
        return versionEtapeList;
    }

    public void setVersionEtapeList(List<VersionEtape> versionEtapeList) {
        this.versionEtapeList = versionEtapeList;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList() {
        return elementPedagogiList;
    }

    public void setElementPedagogiList(List<ElementPedagogi> elementPedagogiList) {
        this.elementPedagogiList = elementPedagogiList;
    }

    @XmlTransient
    public List<VersionDiplome> getVersionDiplomeList() {
        return versionDiplomeList;
    }

    public void setVersionDiplomeList(List<VersionDiplome> versionDiplomeList) {
        this.versionDiplomeList = versionDiplomeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCfm != null ? codCfm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfigMention)) {
            return false;
        }
        ConfigMention other = (ConfigMention) object;
        if ((this.codCfm == null && other.codCfm != null) || (this.codCfm != null && !this.codCfm.equals(other.codCfm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ConfigMention[ codCfm=" + codCfm + " ]";
    }
    
}
