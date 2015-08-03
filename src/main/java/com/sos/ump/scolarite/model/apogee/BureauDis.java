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
@Table(name = "BUREAU_DIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BureauDis.findAll", query = "SELECT b FROM BureauDis b"),
    @NamedQuery(name = "BureauDis.findByCodBdi", query = "SELECT b FROM BureauDis b WHERE b.codBdi = :codBdi"),
    @NamedQuery(name = "BureauDis.findByLibBdi", query = "SELECT b FROM BureauDis b WHERE b.libBdi = :libBdi"),
    @NamedQuery(name = "BureauDis.findByTemEnSveBdi", query = "SELECT b FROM BureauDis b WHERE b.temEnSveBdi = :temEnSveBdi")})
public class BureauDis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "COD_BDI")
    private String codBdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "LIB_BDI")
    private String libBdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_BDI")
    private String temEnSveBdi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bureauDis")
    private List<ComBdi> comBdiList;

    public BureauDis() {
    }

    public BureauDis(String codBdi) {
        this.codBdi = codBdi;
    }

    public BureauDis(String codBdi, String libBdi, String temEnSveBdi) {
        this.codBdi = codBdi;
        this.libBdi = libBdi;
        this.temEnSveBdi = temEnSveBdi;
    }

    public String getCodBdi() {
        return codBdi;
    }

    public void setCodBdi(String codBdi) {
        this.codBdi = codBdi;
    }

    public String getLibBdi() {
        return libBdi;
    }

    public void setLibBdi(String libBdi) {
        this.libBdi = libBdi;
    }

    public String getTemEnSveBdi() {
        return temEnSveBdi;
    }

    public void setTemEnSveBdi(String temEnSveBdi) {
        this.temEnSveBdi = temEnSveBdi;
    }

    @XmlTransient
    public List<ComBdi> getComBdiList() {
        return comBdiList;
    }

    public void setComBdiList(List<ComBdi> comBdiList) {
        this.comBdiList = comBdiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codBdi != null ? codBdi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BureauDis)) {
            return false;
        }
        BureauDis other = (BureauDis) object;
        if ((this.codBdi == null && other.codBdi != null) || (this.codBdi != null && !this.codBdi.equals(other.codBdi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.BureauDis[ codBdi=" + codBdi + " ]";
    }
    
}
