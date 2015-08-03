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
@Table(name = "CENTRE_INCOMP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CentreIncomp.findAll", query = "SELECT c FROM CentreIncomp c"),
    @NamedQuery(name = "CentreIncomp.findByCodCin", query = "SELECT c FROM CentreIncomp c WHERE c.codCin = :codCin"),
    @NamedQuery(name = "CentreIncomp.findByLibCin", query = "SELECT c FROM CentreIncomp c WHERE c.libCin = :libCin"),
    @NamedQuery(name = "CentreIncomp.findByHhCin", query = "SELECT c FROM CentreIncomp c WHERE c.hhCin = :hhCin"),
    @NamedQuery(name = "CentreIncomp.findByMmCin", query = "SELECT c FROM CentreIncomp c WHERE c.mmCin = :mmCin"),
    @NamedQuery(name = "CentreIncomp.findByTemEnSveCin", query = "SELECT c FROM CentreIncomp c WHERE c.temEnSveCin = :temEnSveCin"),
    @NamedQuery(name = "CentreIncomp.findByCodTriEtuCin", query = "SELECT c FROM CentreIncomp c WHERE c.codTriEtuCin = :codTriEtuCin")})
public class CentreIncomp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_CIN")
    private String codCin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_CIN")
    private String libCin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HH_CIN")
    private short hhCin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MM_CIN")
    private short mmCin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CIN")
    private String temEnSveCin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_TRI_ETU_CIN")
    private String codTriEtuCin;
    @OneToMany(mappedBy = "codCin")
    private List<Utilisateur> utilisateurList;

    public CentreIncomp() {
    }

    public CentreIncomp(String codCin) {
        this.codCin = codCin;
    }

    public CentreIncomp(String codCin, String libCin, short hhCin, short mmCin, String temEnSveCin, String codTriEtuCin) {
        this.codCin = codCin;
        this.libCin = libCin;
        this.hhCin = hhCin;
        this.mmCin = mmCin;
        this.temEnSveCin = temEnSveCin;
        this.codTriEtuCin = codTriEtuCin;
    }

    public String getCodCin() {
        return codCin;
    }

    public void setCodCin(String codCin) {
        this.codCin = codCin;
    }

    public String getLibCin() {
        return libCin;
    }

    public void setLibCin(String libCin) {
        this.libCin = libCin;
    }

    public short getHhCin() {
        return hhCin;
    }

    public void setHhCin(short hhCin) {
        this.hhCin = hhCin;
    }

    public short getMmCin() {
        return mmCin;
    }

    public void setMmCin(short mmCin) {
        this.mmCin = mmCin;
    }

    public String getTemEnSveCin() {
        return temEnSveCin;
    }

    public void setTemEnSveCin(String temEnSveCin) {
        this.temEnSveCin = temEnSveCin;
    }

    public String getCodTriEtuCin() {
        return codTriEtuCin;
    }

    public void setCodTriEtuCin(String codTriEtuCin) {
        this.codTriEtuCin = codTriEtuCin;
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
        hash += (codCin != null ? codCin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentreIncomp)) {
            return false;
        }
        CentreIncomp other = (CentreIncomp) object;
        if ((this.codCin == null && other.codCin != null) || (this.codCin != null && !this.codCin.equals(other.codCin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.CentreIncomp[ codCin=" + codCin + " ]";
    }
    
}
