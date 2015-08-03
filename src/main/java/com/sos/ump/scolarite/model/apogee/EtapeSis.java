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
@Table(name = "ETAPE_SIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtapeSis.findAll", query = "SELECT e FROM EtapeSis e"),
    @NamedQuery(name = "EtapeSis.findByCodEsi", query = "SELECT e FROM EtapeSis e WHERE e.codEsi = :codEsi"),
    @NamedQuery(name = "EtapeSis.findByLibEsi", query = "SELECT e FROM EtapeSis e WHERE e.libEsi = :libEsi"),
    @NamedQuery(name = "EtapeSis.findByTemEnSveEsi", query = "SELECT e FROM EtapeSis e WHERE e.temEnSveEsi = :temEnSveEsi")})
public class EtapeSis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "COD_ESI")
    private String codEsi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIB_ESI")
    private String libEsi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_ESI")
    private String temEnSveEsi;
    @OneToMany(mappedBy = "codEsi")
    private List<VersionEtape> versionEtapeList;

    public EtapeSis() {
    }

    public EtapeSis(String codEsi) {
        this.codEsi = codEsi;
    }

    public EtapeSis(String codEsi, String libEsi, String temEnSveEsi) {
        this.codEsi = codEsi;
        this.libEsi = libEsi;
        this.temEnSveEsi = temEnSveEsi;
    }

    public String getCodEsi() {
        return codEsi;
    }

    public void setCodEsi(String codEsi) {
        this.codEsi = codEsi;
    }

    public String getLibEsi() {
        return libEsi;
    }

    public void setLibEsi(String libEsi) {
        this.libEsi = libEsi;
    }

    public String getTemEnSveEsi() {
        return temEnSveEsi;
    }

    public void setTemEnSveEsi(String temEnSveEsi) {
        this.temEnSveEsi = temEnSveEsi;
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
        hash += (codEsi != null ? codEsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtapeSis)) {
            return false;
        }
        EtapeSis other = (EtapeSis) object;
        if ((this.codEsi == null && other.codEsi != null) || (this.codEsi != null && !this.codEsi.equals(other.codEsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.EtapeSis[ codEsi=" + codEsi + " ]";
    }
    
}
