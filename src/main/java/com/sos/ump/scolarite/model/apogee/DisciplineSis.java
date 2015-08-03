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
@Table(name = "DISCIPLINE_SIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisciplineSis.findAll", query = "SELECT d FROM DisciplineSis d"),
    @NamedQuery(name = "DisciplineSis.findByCodDsi", query = "SELECT d FROM DisciplineSis d WHERE d.codDsi = :codDsi"),
    @NamedQuery(name = "DisciplineSis.findByLibDsi", query = "SELECT d FROM DisciplineSis d WHERE d.libDsi = :libDsi"),
    @NamedQuery(name = "DisciplineSis.findByLicDsi", query = "SELECT d FROM DisciplineSis d WHERE d.licDsi = :licDsi"),
    @NamedQuery(name = "DisciplineSis.findByTemEnSveDsi", query = "SELECT d FROM DisciplineSis d WHERE d.temEnSveDsi = :temEnSveDsi")})
public class DisciplineSis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_DSI")
    private String codDsi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_DSI")
    private String libDsi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_DSI")
    private String licDsi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_DSI")
    private String temEnSveDsi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codDsi")
    private List<SecDisSis> secDisSisList;

    public DisciplineSis() {
    }

    public DisciplineSis(String codDsi) {
        this.codDsi = codDsi;
    }

    public DisciplineSis(String codDsi, String libDsi, String licDsi, String temEnSveDsi) {
        this.codDsi = codDsi;
        this.libDsi = libDsi;
        this.licDsi = licDsi;
        this.temEnSveDsi = temEnSveDsi;
    }

    public String getCodDsi() {
        return codDsi;
    }

    public void setCodDsi(String codDsi) {
        this.codDsi = codDsi;
    }

    public String getLibDsi() {
        return libDsi;
    }

    public void setLibDsi(String libDsi) {
        this.libDsi = libDsi;
    }

    public String getLicDsi() {
        return licDsi;
    }

    public void setLicDsi(String licDsi) {
        this.licDsi = licDsi;
    }

    public String getTemEnSveDsi() {
        return temEnSveDsi;
    }

    public void setTemEnSveDsi(String temEnSveDsi) {
        this.temEnSveDsi = temEnSveDsi;
    }

    @XmlTransient
    public List<SecDisSis> getSecDisSisList() {
        return secDisSisList;
    }

    public void setSecDisSisList(List<SecDisSis> secDisSisList) {
        this.secDisSisList = secDisSisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDsi != null ? codDsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DisciplineSis)) {
            return false;
        }
        DisciplineSis other = (DisciplineSis) object;
        if ((this.codDsi == null && other.codDsi != null) || (this.codDsi != null && !this.codDsi.equals(other.codDsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.DisciplineSis[ codDsi=" + codDsi + " ]";
    }
    
}
