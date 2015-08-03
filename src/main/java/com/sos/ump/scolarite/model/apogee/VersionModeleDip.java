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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "VERSION_MODELE_DIP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VersionModeleDip.findAll", query = "SELECT v FROM VersionModeleDip v"),
    @NamedQuery(name = "VersionModeleDip.findByCodModVmd", query = "SELECT v FROM VersionModeleDip v WHERE v.versionModeleDipPK.codModVmd = :codModVmd"),
    @NamedQuery(name = "VersionModeleDip.findByCodVrsVmd", query = "SELECT v FROM VersionModeleDip v WHERE v.versionModeleDipPK.codVrsVmd = :codVrsVmd"),
    @NamedQuery(name = "VersionModeleDip.findByLibVmd", query = "SELECT v FROM VersionModeleDip v WHERE v.libVmd = :libVmd"),
    @NamedQuery(name = "VersionModeleDip.findByTemEnSveVmd", query = "SELECT v FROM VersionModeleDip v WHERE v.temEnSveVmd = :temEnSveVmd")})
public class VersionModeleDip implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VersionModeleDipPK versionModeleDipPK;
    @Size(max = 60)
    @Column(name = "LIB_VMD")
    private String libVmd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_VMD")
    private String temEnSveVmd;
    @OneToMany(mappedBy = "versionModeleDip")
    private List<VersionDiplome> versionDiplomeList;

    public VersionModeleDip() {
    }

    public VersionModeleDip(VersionModeleDipPK versionModeleDipPK) {
        this.versionModeleDipPK = versionModeleDipPK;
    }

    public VersionModeleDip(VersionModeleDipPK versionModeleDipPK, String temEnSveVmd) {
        this.versionModeleDipPK = versionModeleDipPK;
        this.temEnSveVmd = temEnSveVmd;
    }

    public VersionModeleDip(String codModVmd, String codVrsVmd) {
        this.versionModeleDipPK = new VersionModeleDipPK(codModVmd, codVrsVmd);
    }

    public VersionModeleDipPK getVersionModeleDipPK() {
        return versionModeleDipPK;
    }

    public void setVersionModeleDipPK(VersionModeleDipPK versionModeleDipPK) {
        this.versionModeleDipPK = versionModeleDipPK;
    }

    public String getLibVmd() {
        return libVmd;
    }

    public void setLibVmd(String libVmd) {
        this.libVmd = libVmd;
    }

    public String getTemEnSveVmd() {
        return temEnSveVmd;
    }

    public void setTemEnSveVmd(String temEnSveVmd) {
        this.temEnSveVmd = temEnSveVmd;
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
        hash += (versionModeleDipPK != null ? versionModeleDipPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionModeleDip)) {
            return false;
        }
        VersionModeleDip other = (VersionModeleDip) object;
        if ((this.versionModeleDipPK == null && other.versionModeleDipPK != null) || (this.versionModeleDipPK != null && !this.versionModeleDipPK.equals(other.versionModeleDipPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.VersionModeleDip[ versionModeleDipPK=" + versionModeleDipPK + " ]";
    }
    
}
