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
@Table(name = "SIGNATAIRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Signataire.findAll", query = "SELECT s FROM Signataire s"),
    @NamedQuery(name = "Signataire.findByCodSig", query = "SELECT s FROM Signataire s WHERE s.codSig = :codSig"),
    @NamedQuery(name = "Signataire.findByNomSig", query = "SELECT s FROM Signataire s WHERE s.nomSig = :nomSig"),
    @NamedQuery(name = "Signataire.findByQuaSig", query = "SELECT s FROM Signataire s WHERE s.quaSig = :quaSig"),
    @NamedQuery(name = "Signataire.findByTemEnSveSig", query = "SELECT s FROM Signataire s WHERE s.temEnSveSig = :temEnSveSig"),
    @NamedQuery(name = "Signataire.findByNomSigArb", query = "SELECT s FROM Signataire s WHERE s.nomSigArb = :nomSigArb"),
    @NamedQuery(name = "Signataire.findByQuaSigArb", query = "SELECT s FROM Signataire s WHERE s.quaSigArb = :quaSigArb"),
    @NamedQuery(name = "Signataire.findByCodGenSig", query = "SELECT s FROM Signataire s WHERE s.codGenSig = :codGenSig")})
public class Signataire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_SIG")
    private String codSig;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOM_SIG")
    private String nomSig;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "QUA_SIG")
    private String quaSig;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_SIG")
    private String temEnSveSig;
    @Size(max = 30)
    @Column(name = "NOM_SIG_ARB")
    private String nomSigArb;
    @Size(max = 100)
    @Column(name = "QUA_SIG_ARB")
    private String quaSigArb;
    @Size(max = 1)
    @Column(name = "COD_GEN_SIG")
    private String codGenSig;
    @OneToMany(mappedBy = "codSig")
    private List<Composante> composanteList;

    public Signataire() {
    }

    public Signataire(String codSig) {
        this.codSig = codSig;
    }

    public Signataire(String codSig, String nomSig, String quaSig, String temEnSveSig) {
        this.codSig = codSig;
        this.nomSig = nomSig;
        this.quaSig = quaSig;
        this.temEnSveSig = temEnSveSig;
    }

    public String getCodSig() {
        return codSig;
    }

    public void setCodSig(String codSig) {
        this.codSig = codSig;
    }

    public String getNomSig() {
        return nomSig;
    }

    public void setNomSig(String nomSig) {
        this.nomSig = nomSig;
    }

    public String getQuaSig() {
        return quaSig;
    }

    public void setQuaSig(String quaSig) {
        this.quaSig = quaSig;
    }

    public String getTemEnSveSig() {
        return temEnSveSig;
    }

    public void setTemEnSveSig(String temEnSveSig) {
        this.temEnSveSig = temEnSveSig;
    }

    public String getNomSigArb() {
        return nomSigArb;
    }

    public void setNomSigArb(String nomSigArb) {
        this.nomSigArb = nomSigArb;
    }

    public String getQuaSigArb() {
        return quaSigArb;
    }

    public void setQuaSigArb(String quaSigArb) {
        this.quaSigArb = quaSigArb;
    }

    public String getCodGenSig() {
        return codGenSig;
    }

    public void setCodGenSig(String codGenSig) {
        this.codGenSig = codGenSig;
    }

    @XmlTransient
    public List<Composante> getComposanteList() {
        return composanteList;
    }

    public void setComposanteList(List<Composante> composanteList) {
        this.composanteList = composanteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSig != null ? codSig.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Signataire)) {
            return false;
        }
        Signataire other = (Signataire) object;
        if ((this.codSig == null && other.codSig != null) || (this.codSig != null && !this.codSig.equals(other.codSig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Signataire[ codSig=" + codSig + " ]";
    }
    
}
