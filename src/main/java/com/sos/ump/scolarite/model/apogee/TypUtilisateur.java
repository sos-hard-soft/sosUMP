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
@Table(name = "TYP_UTILISATEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypUtilisateur.findAll", query = "SELECT t FROM TypUtilisateur t"),
    @NamedQuery(name = "TypUtilisateur.findByCodTut", query = "SELECT t FROM TypUtilisateur t WHERE t.codTut = :codTut"),
    @NamedQuery(name = "TypUtilisateur.findByLibTut", query = "SELECT t FROM TypUtilisateur t WHERE t.libTut = :libTut"),
    @NamedQuery(name = "TypUtilisateur.findByLibCmtTut", query = "SELECT t FROM TypUtilisateur t WHERE t.libCmtTut = :libCmtTut"),
    @NamedQuery(name = "TypUtilisateur.findByTemCofNot", query = "SELECT t FROM TypUtilisateur t WHERE t.temCofNot = :temCofNot")})
public class TypUtilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "COD_TUT")
    private String codTut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_TUT")
    private String libTut;
    @Size(max = 200)
    @Column(name = "LIB_CMT_TUT")
    private String libCmtTut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_COF_NOT")
    private String temCofNot;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codTut")
    private List<Utilisateur> utilisateurList;

    public TypUtilisateur() {
    }

    public TypUtilisateur(String codTut) {
        this.codTut = codTut;
    }

    public TypUtilisateur(String codTut, String libTut, String temCofNot) {
        this.codTut = codTut;
        this.libTut = libTut;
        this.temCofNot = temCofNot;
    }

    public String getCodTut() {
        return codTut;
    }

    public void setCodTut(String codTut) {
        this.codTut = codTut;
    }

    public String getLibTut() {
        return libTut;
    }

    public void setLibTut(String libTut) {
        this.libTut = libTut;
    }

    public String getLibCmtTut() {
        return libCmtTut;
    }

    public void setLibCmtTut(String libCmtTut) {
        this.libCmtTut = libCmtTut;
    }

    public String getTemCofNot() {
        return temCofNot;
    }

    public void setTemCofNot(String temCofNot) {
        this.temCofNot = temCofNot;
    }

    @XmlTransient
    public List<Utilisateur> getUtilisateurList() {
        return utilisateurList;
    }

    public void setUtilisateurList(List<Utilisateur> utilisateurList) {
        this.utilisateurList = utilisateurList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTut != null ? codTut.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypUtilisateur)) {
            return false;
        }
        TypUtilisateur other = (TypUtilisateur) object;
        if ((this.codTut == null && other.codTut != null) || (this.codTut != null && !this.codTut.equals(other.codTut))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TypUtilisateur[ codTut=" + codTut + " ]";
    }
    
}
