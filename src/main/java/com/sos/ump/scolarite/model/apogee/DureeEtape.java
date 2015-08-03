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
@Table(name = "DUREE_ETAPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DureeEtape.findAll", query = "SELECT d FROM DureeEtape d"),
    @NamedQuery(name = "DureeEtape.findByCodDue", query = "SELECT d FROM DureeEtape d WHERE d.codDue = :codDue"),
    @NamedQuery(name = "DureeEtape.findByLibDue", query = "SELECT d FROM DureeEtape d WHERE d.libDue = :libDue"),
    @NamedQuery(name = "DureeEtape.findByTemEnSveDue", query = "SELECT d FROM DureeEtape d WHERE d.temEnSveDue = :temEnSveDue")})
public class DureeEtape implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_DUE")
    private String codDue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_DUE")
    private String libDue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_DUE")
    private String temEnSveDue;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codDue")
    private List<VersionEtape> versionEtapeList;

    public DureeEtape() {
    }

    public DureeEtape(String codDue) {
        this.codDue = codDue;
    }

    public DureeEtape(String codDue, String libDue, String temEnSveDue) {
        this.codDue = codDue;
        this.libDue = libDue;
        this.temEnSveDue = temEnSveDue;
    }

    public String getCodDue() {
        return codDue;
    }

    public void setCodDue(String codDue) {
        this.codDue = codDue;
    }

    public String getLibDue() {
        return libDue;
    }

    public void setLibDue(String libDue) {
        this.libDue = libDue;
    }

    public String getTemEnSveDue() {
        return temEnSveDue;
    }

    public void setTemEnSveDue(String temEnSveDue) {
        this.temEnSveDue = temEnSveDue;
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
        hash += (codDue != null ? codDue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DureeEtape)) {
            return false;
        }
        DureeEtape other = (DureeEtape) object;
        if ((this.codDue == null && other.codDue != null) || (this.codDue != null && !this.codDue.equals(other.codDue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.DureeEtape[ codDue=" + codDue + " ]";
    }
    
}
