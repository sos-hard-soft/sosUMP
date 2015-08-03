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
@Table(name = "ACADEMIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Academie.findAll", query = "SELECT a FROM Academie a"),
    @NamedQuery(name = "Academie.findByCodAcd", query = "SELECT a FROM Academie a WHERE a.codAcd = :codAcd"),
    @NamedQuery(name = "Academie.findByCodSisAcd", query = "SELECT a FROM Academie a WHERE a.codSisAcd = :codSisAcd"),
    @NamedQuery(name = "Academie.findByLibAcd", query = "SELECT a FROM Academie a WHERE a.libAcd = :libAcd"),
    @NamedQuery(name = "Academie.findByLicAcd", query = "SELECT a FROM Academie a WHERE a.licAcd = :licAcd"),
    @NamedQuery(name = "Academie.findByTemEnSveAcd", query = "SELECT a FROM Academie a WHERE a.temEnSveAcd = :temEnSveAcd")})
public class Academie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_ACD")
    private String codAcd;
    @Size(max = 2)
    @Column(name = "COD_SIS_ACD")
    private String codSisAcd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_ACD")
    private String libAcd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_ACD")
    private String licAcd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_ACD")
    private String temEnSveAcd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codAcd")
    private List<Departement> departementList;

    public Academie() {
    }

    public Academie(String codAcd) {
        this.codAcd = codAcd;
    }

    public Academie(String codAcd, String libAcd, String licAcd, String temEnSveAcd) {
        this.codAcd = codAcd;
        this.libAcd = libAcd;
        this.licAcd = licAcd;
        this.temEnSveAcd = temEnSveAcd;
    }

    public String getCodAcd() {
        return codAcd;
    }

    public void setCodAcd(String codAcd) {
        this.codAcd = codAcd;
    }

    public String getCodSisAcd() {
        return codSisAcd;
    }

    public void setCodSisAcd(String codSisAcd) {
        this.codSisAcd = codSisAcd;
    }

    public String getLibAcd() {
        return libAcd;
    }

    public void setLibAcd(String libAcd) {
        this.libAcd = libAcd;
    }

    public String getLicAcd() {
        return licAcd;
    }

    public void setLicAcd(String licAcd) {
        this.licAcd = licAcd;
    }

    public String getTemEnSveAcd() {
        return temEnSveAcd;
    }

    public void setTemEnSveAcd(String temEnSveAcd) {
        this.temEnSveAcd = temEnSveAcd;
    }

    @XmlTransient
    public List<Departement> getDepartementList() {
        return departementList;
    }

    public void setDepartementList(List<Departement> departementList) {
        this.departementList = departementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAcd != null ? codAcd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Academie)) {
            return false;
        }
        Academie other = (Academie) object;
        if ((this.codAcd == null && other.codAcd != null) || (this.codAcd != null && !this.codAcd.equals(other.codAcd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Academie[ codAcd=" + codAcd + " ]";
    }
    
}
