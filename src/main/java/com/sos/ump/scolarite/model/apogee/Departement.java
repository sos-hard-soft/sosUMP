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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DEPARTEMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departement.findAll", query = "SELECT d FROM Departement d"),
    @NamedQuery(name = "Departement.findByCodDep", query = "SELECT d FROM Departement d WHERE d.codDep = :codDep"),
    @NamedQuery(name = "Departement.findByLibDep", query = "SELECT d FROM Departement d WHERE d.libDep = :libDep"),
    @NamedQuery(name = "Departement.findByLicDep", query = "SELECT d FROM Departement d WHERE d.licDep = :licDep"),
    @NamedQuery(name = "Departement.findByTemEnSveDep", query = "SELECT d FROM Departement d WHERE d.temEnSveDep = :temEnSveDep"),
    @NamedQuery(name = "Departement.findByLibDepArb", query = "SELECT d FROM Departement d WHERE d.libDepArb = :libDepArb"),
    @NamedQuery(name = "Departement.findByLicDepArb", query = "SELECT d FROM Departement d WHERE d.licDepArb = :licDepArb")})
public class Departement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_DEP")
    private String codDep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_DEP")
    private String libDep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_DEP")
    private String licDep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_DEP")
    private String temEnSveDep;
    @Size(max = 40)
    @Column(name = "LIB_DEP_ARB")
    private String libDepArb;
    @Size(max = 10)
    @Column(name = "LIC_DEP_ARB")
    private String licDepArb;
    @JoinColumn(name = "COD_ACD", referencedColumnName = "COD_ACD")
    @ManyToOne(optional = false)
    private Academie codAcd;
    @OneToMany(mappedBy = "codDepAnt")
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codDepAnnPre")
    private List<InsAdmAnu> insAdmAnuList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codDep")
    private List<Commune> communeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codDep")
    private List<Etablissement> etablissementList;

    public Departement() {
    }

    public Departement(String codDep) {
        this.codDep = codDep;
    }

    public Departement(String codDep, String libDep, String licDep, String temEnSveDep) {
        this.codDep = codDep;
        this.libDep = libDep;
        this.licDep = licDep;
        this.temEnSveDep = temEnSveDep;
    }

    public String getCodDep() {
        return codDep;
    }

    public void setCodDep(String codDep) {
        this.codDep = codDep;
    }

    public String getLibDep() {
        return libDep;
    }

    public void setLibDep(String libDep) {
        this.libDep = libDep;
    }

    public String getLicDep() {
        return licDep;
    }

    public void setLicDep(String licDep) {
        this.licDep = licDep;
    }

    public String getTemEnSveDep() {
        return temEnSveDep;
    }

    public void setTemEnSveDep(String temEnSveDep) {
        this.temEnSveDep = temEnSveDep;
    }

    public String getLibDepArb() {
        return libDepArb;
    }

    public void setLibDepArb(String libDepArb) {
        this.libDepArb = libDepArb;
    }

    public String getLicDepArb() {
        return licDepArb;
    }

    public void setLicDepArb(String licDepArb) {
        this.licDepArb = licDepArb;
    }

    public Academie getCodAcd() {
        return codAcd;
    }

    public void setCodAcd(Academie codAcd) {
        this.codAcd = codAcd;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList1() {
        return insAdmAnuList1;
    }

    public void setInsAdmAnuList1(List<InsAdmAnu> insAdmAnuList1) {
        this.insAdmAnuList1 = insAdmAnuList1;
    }

    @XmlTransient
    public List<Commune> getCommuneList() {
        return communeList;
    }

    public void setCommuneList(List<Commune> communeList) {
        this.communeList = communeList;
    }

    @XmlTransient
    public List<Etablissement> getEtablissementList() {
        return etablissementList;
    }

    public void setEtablissementList(List<Etablissement> etablissementList) {
        this.etablissementList = etablissementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDep != null ? codDep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departement)) {
            return false;
        }
        Departement other = (Departement) object;
        if ((this.codDep == null && other.codDep != null) || (this.codDep != null && !this.codDep.equals(other.codDep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Departement[ codDep=" + codDep + " ]";
    }
    
}
