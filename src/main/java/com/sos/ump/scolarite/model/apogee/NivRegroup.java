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
@Table(name = "NIV_REGROUP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivRegroup.findAll", query = "SELECT n FROM NivRegroup n"),
    @NamedQuery(name = "NivRegroup.findByCodNrg", query = "SELECT n FROM NivRegroup n WHERE n.codNrg = :codNrg"),
    @NamedQuery(name = "NivRegroup.findByLibNrg", query = "SELECT n FROM NivRegroup n WHERE n.libNrg = :libNrg"),
    @NamedQuery(name = "NivRegroup.findByLicNrg", query = "SELECT n FROM NivRegroup n WHERE n.licNrg = :licNrg"),
    @NamedQuery(name = "NivRegroup.findByTemEnSveNrg", query = "SELECT n FROM NivRegroup n WHERE n.temEnSveNrg = :temEnSveNrg"),
    @NamedQuery(name = "NivRegroup.findByLim1Nrg", query = "SELECT n FROM NivRegroup n WHERE n.lim1Nrg = :lim1Nrg"),
    @NamedQuery(name = "NivRegroup.findByLim2Nrg", query = "SELECT n FROM NivRegroup n WHERE n.lim2Nrg = :lim2Nrg"),
    @NamedQuery(name = "NivRegroup.findByLibWebNrg", query = "SELECT n FROM NivRegroup n WHERE n.libWebNrg = :libWebNrg")})
public class NivRegroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_NRG")
    private String codNrg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_NRG")
    private String libNrg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "LIC_NRG")
    private String licNrg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_NRG")
    private String temEnSveNrg;
    @Size(max = 30)
    @Column(name = "LIM1_NRG")
    private String lim1Nrg;
    @Size(max = 30)
    @Column(name = "LIM2_NRG")
    private String lim2Nrg;
    @Size(max = 120)
    @Column(name = "LIB_WEB_NRG")
    private String libWebNrg;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codNrg")
    private List<Droit> droitList;

    public NivRegroup() {
    }

    public NivRegroup(String codNrg) {
        this.codNrg = codNrg;
    }

    public NivRegroup(String codNrg, String libNrg, String licNrg, String temEnSveNrg) {
        this.codNrg = codNrg;
        this.libNrg = libNrg;
        this.licNrg = licNrg;
        this.temEnSveNrg = temEnSveNrg;
    }

    public String getCodNrg() {
        return codNrg;
    }

    public void setCodNrg(String codNrg) {
        this.codNrg = codNrg;
    }

    public String getLibNrg() {
        return libNrg;
    }

    public void setLibNrg(String libNrg) {
        this.libNrg = libNrg;
    }

    public String getLicNrg() {
        return licNrg;
    }

    public void setLicNrg(String licNrg) {
        this.licNrg = licNrg;
    }

    public String getTemEnSveNrg() {
        return temEnSveNrg;
    }

    public void setTemEnSveNrg(String temEnSveNrg) {
        this.temEnSveNrg = temEnSveNrg;
    }

    public String getLim1Nrg() {
        return lim1Nrg;
    }

    public void setLim1Nrg(String lim1Nrg) {
        this.lim1Nrg = lim1Nrg;
    }

    public String getLim2Nrg() {
        return lim2Nrg;
    }

    public void setLim2Nrg(String lim2Nrg) {
        this.lim2Nrg = lim2Nrg;
    }

    public String getLibWebNrg() {
        return libWebNrg;
    }

    public void setLibWebNrg(String libWebNrg) {
        this.libWebNrg = libWebNrg;
    }

    @XmlTransient
    public List<Droit> getDroitList() {
        return droitList;
    }

    public void setDroitList(List<Droit> droitList) {
        this.droitList = droitList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codNrg != null ? codNrg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivRegroup)) {
            return false;
        }
        NivRegroup other = (NivRegroup) object;
        if ((this.codNrg == null && other.codNrg != null) || (this.codNrg != null && !this.codNrg.equals(other.codNrg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.NivRegroup[ codNrg=" + codNrg + " ]";
    }
    
}
