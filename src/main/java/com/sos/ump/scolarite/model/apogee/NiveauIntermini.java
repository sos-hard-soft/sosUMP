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
@Table(name = "NIVEAU_INTERMINI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NiveauIntermini.findAll", query = "SELECT n FROM NiveauIntermini n"),
    @NamedQuery(name = "NiveauIntermini.findByCodNim", query = "SELECT n FROM NiveauIntermini n WHERE n.codNim = :codNim"),
    @NamedQuery(name = "NiveauIntermini.findByLibNim", query = "SELECT n FROM NiveauIntermini n WHERE n.libNim = :libNim"),
    @NamedQuery(name = "NiveauIntermini.findByTemEnSveNim", query = "SELECT n FROM NiveauIntermini n WHERE n.temEnSveNim = :temEnSveNim")})
public class NiveauIntermini implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_NIM")
    private String codNim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_NIM")
    private String libNim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_NIM")
    private String temEnSveNim;
    @OneToMany(mappedBy = "codNim")
    private List<Diplome> diplomeList;

    public NiveauIntermini() {
    }

    public NiveauIntermini(String codNim) {
        this.codNim = codNim;
    }

    public NiveauIntermini(String codNim, String libNim, String temEnSveNim) {
        this.codNim = codNim;
        this.libNim = libNim;
        this.temEnSveNim = temEnSveNim;
    }

    public String getCodNim() {
        return codNim;
    }

    public void setCodNim(String codNim) {
        this.codNim = codNim;
    }

    public String getLibNim() {
        return libNim;
    }

    public void setLibNim(String libNim) {
        this.libNim = libNim;
    }

    public String getTemEnSveNim() {
        return temEnSveNim;
    }

    public void setTemEnSveNim(String temEnSveNim) {
        this.temEnSveNim = temEnSveNim;
    }

    @XmlTransient
    public List<Diplome> getDiplomeList() {
        return diplomeList;
    }

    public void setDiplomeList(List<Diplome> diplomeList) {
        this.diplomeList = diplomeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codNim != null ? codNim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NiveauIntermini)) {
            return false;
        }
        NiveauIntermini other = (NiveauIntermini) object;
        if ((this.codNim == null && other.codNim != null) || (this.codNim != null && !this.codNim.equals(other.codNim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.NiveauIntermini[ codNim=" + codNim + " ]";
    }
    
}
