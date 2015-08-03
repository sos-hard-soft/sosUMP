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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "MUTUELLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mutuelle.findAll", query = "SELECT m FROM Mutuelle m"),
    @NamedQuery(name = "Mutuelle.findByCodMut", query = "SELECT m FROM Mutuelle m WHERE m.codMut = :codMut"),
    @NamedQuery(name = "Mutuelle.findByLibNomMut", query = "SELECT m FROM Mutuelle m WHERE m.libNomMut = :libNomMut"),
    @NamedQuery(name = "Mutuelle.findByLibAd1Mut", query = "SELECT m FROM Mutuelle m WHERE m.libAd1Mut = :libAd1Mut"),
    @NamedQuery(name = "Mutuelle.findByLibAd2Mut", query = "SELECT m FROM Mutuelle m WHERE m.libAd2Mut = :libAd2Mut"),
    @NamedQuery(name = "Mutuelle.findByLibAd3Mut", query = "SELECT m FROM Mutuelle m WHERE m.libAd3Mut = :libAd3Mut"),
    @NamedQuery(name = "Mutuelle.findByTemEnSveMut", query = "SELECT m FROM Mutuelle m WHERE m.temEnSveMut = :temEnSveMut"),
    @NamedQuery(name = "Mutuelle.findByLim1Mut", query = "SELECT m FROM Mutuelle m WHERE m.lim1Mut = :lim1Mut"),
    @NamedQuery(name = "Mutuelle.findByLim2Mut", query = "SELECT m FROM Mutuelle m WHERE m.lim2Mut = :lim2Mut"),
    @NamedQuery(name = "Mutuelle.findByLim3Mut", query = "SELECT m FROM Mutuelle m WHERE m.lim3Mut = :lim3Mut"),
    @NamedQuery(name = "Mutuelle.findByTemMinMut", query = "SELECT m FROM Mutuelle m WHERE m.temMinMut = :temMinMut"),
    @NamedQuery(name = "Mutuelle.findByNumOrdMut", query = "SELECT m FROM Mutuelle m WHERE m.numOrdMut = :numOrdMut"),
    @NamedQuery(name = "Mutuelle.findByLibWebMut", query = "SELECT m FROM Mutuelle m WHERE m.libWebMut = :libWebMut")})
public class Mutuelle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_MUT")
    private String codMut;
    @Size(max = 40)
    @Column(name = "LIB_NOM_MUT")
    private String libNomMut;
    @Size(max = 32)
    @Column(name = "LIB_AD1_MUT")
    private String libAd1Mut;
    @Size(max = 32)
    @Column(name = "LIB_AD2_MUT")
    private String libAd2Mut;
    @Size(max = 32)
    @Column(name = "LIB_AD3_MUT")
    private String libAd3Mut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_MUT")
    private String temEnSveMut;
    @Size(max = 35)
    @Column(name = "LIM1_MUT")
    private String lim1Mut;
    @Size(max = 35)
    @Column(name = "LIM2_MUT")
    private String lim2Mut;
    @Size(max = 35)
    @Column(name = "LIM3_MUT")
    private String lim3Mut;
    @Size(max = 1)
    @Column(name = "TEM_MIN_MUT")
    private String temMinMut;
    @Column(name = "NUM_ORD_MUT")
    private Short numOrdMut;
    @Size(max = 120)
    @Column(name = "LIB_WEB_MUT")
    private String libWebMut;
    @OneToMany(mappedBy = "codMut")
    private List<Droit> droitList;
    @OneToMany(mappedBy = "codMut")
    private List<CentrePayeur> centrePayeurList;
    @JoinColumns({
        @JoinColumn(name = "COD_POS_ADR_MUT", referencedColumnName = "COD_BDI"),
        @JoinColumn(name = "COD_COM_ADR_MUT", referencedColumnName = "COD_COM")})
    @ManyToOne
    private ComBdi comBdi;

    public Mutuelle() {
    }

    public Mutuelle(String codMut) {
        this.codMut = codMut;
    }

    public Mutuelle(String codMut, String temEnSveMut) {
        this.codMut = codMut;
        this.temEnSveMut = temEnSveMut;
    }

    public String getCodMut() {
        return codMut;
    }

    public void setCodMut(String codMut) {
        this.codMut = codMut;
    }

    public String getLibNomMut() {
        return libNomMut;
    }

    public void setLibNomMut(String libNomMut) {
        this.libNomMut = libNomMut;
    }

    public String getLibAd1Mut() {
        return libAd1Mut;
    }

    public void setLibAd1Mut(String libAd1Mut) {
        this.libAd1Mut = libAd1Mut;
    }

    public String getLibAd2Mut() {
        return libAd2Mut;
    }

    public void setLibAd2Mut(String libAd2Mut) {
        this.libAd2Mut = libAd2Mut;
    }

    public String getLibAd3Mut() {
        return libAd3Mut;
    }

    public void setLibAd3Mut(String libAd3Mut) {
        this.libAd3Mut = libAd3Mut;
    }

    public String getTemEnSveMut() {
        return temEnSveMut;
    }

    public void setTemEnSveMut(String temEnSveMut) {
        this.temEnSveMut = temEnSveMut;
    }

    public String getLim1Mut() {
        return lim1Mut;
    }

    public void setLim1Mut(String lim1Mut) {
        this.lim1Mut = lim1Mut;
    }

    public String getLim2Mut() {
        return lim2Mut;
    }

    public void setLim2Mut(String lim2Mut) {
        this.lim2Mut = lim2Mut;
    }

    public String getLim3Mut() {
        return lim3Mut;
    }

    public void setLim3Mut(String lim3Mut) {
        this.lim3Mut = lim3Mut;
    }

    public String getTemMinMut() {
        return temMinMut;
    }

    public void setTemMinMut(String temMinMut) {
        this.temMinMut = temMinMut;
    }

    public Short getNumOrdMut() {
        return numOrdMut;
    }

    public void setNumOrdMut(Short numOrdMut) {
        this.numOrdMut = numOrdMut;
    }

    public String getLibWebMut() {
        return libWebMut;
    }

    public void setLibWebMut(String libWebMut) {
        this.libWebMut = libWebMut;
    }

    @XmlTransient
    public List<Droit> getDroitList() {
        return droitList;
    }

    public void setDroitList(List<Droit> droitList) {
        this.droitList = droitList;
    }

    @XmlTransient
    public List<CentrePayeur> getCentrePayeurList() {
        return centrePayeurList;
    }

    public void setCentrePayeurList(List<CentrePayeur> centrePayeurList) {
        this.centrePayeurList = centrePayeurList;
    }

    public ComBdi getComBdi() {
        return comBdi;
    }

    public void setComBdi(ComBdi comBdi) {
        this.comBdi = comBdi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMut != null ? codMut.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mutuelle)) {
            return false;
        }
        Mutuelle other = (Mutuelle) object;
        if ((this.codMut == null && other.codMut != null) || (this.codMut != null && !this.codMut.equals(other.codMut))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Mutuelle[ codMut=" + codMut + " ]";
    }
    
}
