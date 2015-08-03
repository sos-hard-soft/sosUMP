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
@Table(name = "NIVEAU_FORMATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NiveauFormation.findAll", query = "SELECT n FROM NiveauFormation n"),
    @NamedQuery(name = "NiveauFormation.findByCodNif", query = "SELECT n FROM NiveauFormation n WHERE n.codNif = :codNif"),
    @NamedQuery(name = "NiveauFormation.findByLibNif", query = "SELECT n FROM NiveauFormation n WHERE n.libNif = :libNif"),
    @NamedQuery(name = "NiveauFormation.findByTemEnSveNif", query = "SELECT n FROM NiveauFormation n WHERE n.temEnSveNif = :temEnSveNif")})
public class NiveauFormation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_NIF")
    private Short codNif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_NIF")
    private String libNif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_NIF")
    private String temEnSveNif;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codNif")
    private List<TypDiplome> typDiplomeList;

    public NiveauFormation() {
    }

    public NiveauFormation(Short codNif) {
        this.codNif = codNif;
    }

    public NiveauFormation(Short codNif, String libNif, String temEnSveNif) {
        this.codNif = codNif;
        this.libNif = libNif;
        this.temEnSveNif = temEnSveNif;
    }

    public Short getCodNif() {
        return codNif;
    }

    public void setCodNif(Short codNif) {
        this.codNif = codNif;
    }

    public String getLibNif() {
        return libNif;
    }

    public void setLibNif(String libNif) {
        this.libNif = libNif;
    }

    public String getTemEnSveNif() {
        return temEnSveNif;
    }

    public void setTemEnSveNif(String temEnSveNif) {
        this.temEnSveNif = temEnSveNif;
    }

    @XmlTransient
    public List<TypDiplome> getTypDiplomeList() {
        return typDiplomeList;
    }

    public void setTypDiplomeList(List<TypDiplome> typDiplomeList) {
        this.typDiplomeList = typDiplomeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codNif != null ? codNif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NiveauFormation)) {
            return false;
        }
        NiveauFormation other = (NiveauFormation) object;
        if ((this.codNif == null && other.codNif != null) || (this.codNif != null && !this.codNif.equals(other.codNif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.NiveauFormation[ codNif=" + codNif + " ]";
    }
    
}
