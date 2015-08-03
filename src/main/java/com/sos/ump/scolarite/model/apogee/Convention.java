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
@Table(name = "CONVENTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Convention.findAll", query = "SELECT c FROM Convention c"),
    @NamedQuery(name = "Convention.findByCodCnv", query = "SELECT c FROM Convention c WHERE c.codCnv = :codCnv"),
    @NamedQuery(name = "Convention.findByLibCnv", query = "SELECT c FROM Convention c WHERE c.libCnv = :libCnv"),
    @NamedQuery(name = "Convention.findByCodSisCnv", query = "SELECT c FROM Convention c WHERE c.codSisCnv = :codSisCnv"),
    @NamedQuery(name = "Convention.findByTemEnSveCnv", query = "SELECT c FROM Convention c WHERE c.temEnSveCnv = :temEnSveCnv")})
public class Convention implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_CNV")
    private String codCnv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_CNV")
    private String libCnv;
    @Size(max = 1)
    @Column(name = "COD_SIS_CNV")
    private String codSisCnv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CNV")
    private String temEnSveCnv;
    @OneToMany(mappedBy = "codCnv")
    private List<VersionEtape> versionEtapeList;

    public Convention() {
    }

    public Convention(String codCnv) {
        this.codCnv = codCnv;
    }

    public Convention(String codCnv, String libCnv, String temEnSveCnv) {
        this.codCnv = codCnv;
        this.libCnv = libCnv;
        this.temEnSveCnv = temEnSveCnv;
    }

    public String getCodCnv() {
        return codCnv;
    }

    public void setCodCnv(String codCnv) {
        this.codCnv = codCnv;
    }

    public String getLibCnv() {
        return libCnv;
    }

    public void setLibCnv(String libCnv) {
        this.libCnv = libCnv;
    }

    public String getCodSisCnv() {
        return codSisCnv;
    }

    public void setCodSisCnv(String codSisCnv) {
        this.codSisCnv = codSisCnv;
    }

    public String getTemEnSveCnv() {
        return temEnSveCnv;
    }

    public void setTemEnSveCnv(String temEnSveCnv) {
        this.temEnSveCnv = temEnSveCnv;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList() {
        return versionEtapeList;
    }

    public void setVersionEtapeList(List<VersionEtape> versionEtapeList) {
        this.versionEtapeList = versionEtapeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCnv != null ? codCnv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Convention)) {
            return false;
        }
        Convention other = (Convention) object;
        if ((this.codCnv == null && other.codCnv != null) || (this.codCnv != null && !this.codCnv.equals(other.codCnv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Convention[ codCnv=" + codCnv + " ]";
    }
    
}
