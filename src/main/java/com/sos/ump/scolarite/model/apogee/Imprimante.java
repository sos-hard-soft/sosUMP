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
@Table(name = "IMPRIMANTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imprimante.findAll", query = "SELECT i FROM Imprimante i"),
    @NamedQuery(name = "Imprimante.findByCodImp", query = "SELECT i FROM Imprimante i WHERE i.codImp = :codImp"),
    @NamedQuery(name = "Imprimante.findByLibImp", query = "SELECT i FROM Imprimante i WHERE i.libImp = :libImp"),
    @NamedQuery(name = "Imprimante.findByNomRptImp", query = "SELECT i FROM Imprimante i WHERE i.nomRptImp = :nomRptImp"),
    @NamedQuery(name = "Imprimante.findByFmtRptImp", query = "SELECT i FROM Imprimante i WHERE i.fmtRptImp = :fmtRptImp")})
public class Imprimante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "COD_IMP")
    private String codImp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_IMP")
    private String libImp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NOM_RPT_IMP")
    private String nomRptImp;
    @Size(max = 40)
    @Column(name = "FMT_RPT_IMP")
    private String fmtRptImp;
    @OneToMany(mappedBy = "codImp")
    private List<Utilisateur> utilisateurList;

    public Imprimante() {
    }

    public Imprimante(String codImp) {
        this.codImp = codImp;
    }

    public Imprimante(String codImp, String libImp, String nomRptImp) {
        this.codImp = codImp;
        this.libImp = libImp;
        this.nomRptImp = nomRptImp;
    }

    public String getCodImp() {
        return codImp;
    }

    public void setCodImp(String codImp) {
        this.codImp = codImp;
    }

    public String getLibImp() {
        return libImp;
    }

    public void setLibImp(String libImp) {
        this.libImp = libImp;
    }

    public String getNomRptImp() {
        return nomRptImp;
    }

    public void setNomRptImp(String nomRptImp) {
        this.nomRptImp = nomRptImp;
    }

    public String getFmtRptImp() {
        return fmtRptImp;
    }

    public void setFmtRptImp(String fmtRptImp) {
        this.fmtRptImp = fmtRptImp;
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
        hash += (codImp != null ? codImp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imprimante)) {
            return false;
        }
        Imprimante other = (Imprimante) object;
        if ((this.codImp == null && other.codImp != null) || (this.codImp != null && !this.codImp.equals(other.codImp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Imprimante[ codImp=" + codImp + " ]";
    }
    
}
