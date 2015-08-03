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
@Table(name = "TYP_DROIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypDroit.findAll", query = "SELECT t FROM TypDroit t"),
    @NamedQuery(name = "TypDroit.findByCodTdr", query = "SELECT t FROM TypDroit t WHERE t.codTdr = :codTdr"),
    @NamedQuery(name = "TypDroit.findByLibTdr", query = "SELECT t FROM TypDroit t WHERE t.libTdr = :libTdr"),
    @NamedQuery(name = "TypDroit.findByLicTdr", query = "SELECT t FROM TypDroit t WHERE t.licTdr = :licTdr"),
    @NamedQuery(name = "TypDroit.findByTemEnSveTdr", query = "SELECT t FROM TypDroit t WHERE t.temEnSveTdr = :temEnSveTdr"),
    @NamedQuery(name = "TypDroit.findByTemDel", query = "SELECT t FROM TypDroit t WHERE t.temDel = :temDel")})
public class TypDroit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_TDR")
    private String codTdr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_TDR")
    private String libTdr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_TDR")
    private String licTdr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_TDR")
    private String temEnSveTdr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codTdr")
    private List<Droit> droitList;

    public TypDroit() {
    }

    public TypDroit(String codTdr) {
        this.codTdr = codTdr;
    }

    public TypDroit(String codTdr, String libTdr, String licTdr, String temEnSveTdr, String temDel) {
        this.codTdr = codTdr;
        this.libTdr = libTdr;
        this.licTdr = licTdr;
        this.temEnSveTdr = temEnSveTdr;
        this.temDel = temDel;
    }

    public String getCodTdr() {
        return codTdr;
    }

    public void setCodTdr(String codTdr) {
        this.codTdr = codTdr;
    }

    public String getLibTdr() {
        return libTdr;
    }

    public void setLibTdr(String libTdr) {
        this.libTdr = libTdr;
    }

    public String getLicTdr() {
        return licTdr;
    }

    public void setLicTdr(String licTdr) {
        this.licTdr = licTdr;
    }

    public String getTemEnSveTdr() {
        return temEnSveTdr;
    }

    public void setTemEnSveTdr(String temEnSveTdr) {
        this.temEnSveTdr = temEnSveTdr;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    @XmlTransient
    public List<Droit> getDroitList() {
        return droitList;
    }

    public void setDroitList(List<Droit> droitList) {
        this.droitList = droitList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTdr != null ? codTdr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypDroit)) {
            return false;
        }
        TypDroit other = (TypDroit) object;
        if ((this.codTdr == null && other.codTdr != null) || (this.codTdr != null && !this.codTdr.equals(other.codTdr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TypDroit[ codTdr=" + codTdr + " ]";
    }
    
}
