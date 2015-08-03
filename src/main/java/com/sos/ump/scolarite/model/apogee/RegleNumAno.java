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
@Table(name = "REGLE_NUM_ANO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegleNumAno.findAll", query = "SELECT r FROM RegleNumAno r"),
    @NamedQuery(name = "RegleNumAno.findByCodRna", query = "SELECT r FROM RegleNumAno r WHERE r.codRna = :codRna"),
    @NamedQuery(name = "RegleNumAno.findByCodRnaExt", query = "SELECT r FROM RegleNumAno r WHERE r.codRnaExt = :codRnaExt"),
    @NamedQuery(name = "RegleNumAno.findByLibRna", query = "SELECT r FROM RegleNumAno r WHERE r.libRna = :libRna"),
    @NamedQuery(name = "RegleNumAno.findByModRna", query = "SELECT r FROM RegleNumAno r WHERE r.modRna = :modRna"),
    @NamedQuery(name = "RegleNumAno.findByTemNumDeb", query = "SELECT r FROM RegleNumAno r WHERE r.temNumDeb = :temNumDeb"),
    @NamedQuery(name = "RegleNumAno.findByNumDeb", query = "SELECT r FROM RegleNumAno r WHERE r.numDeb = :numDeb"),
    @NamedQuery(name = "RegleNumAno.findByTemPrefRe", query = "SELECT r FROM RegleNumAno r WHERE r.temPrefRe = :temPrefRe"),
    @NamedQuery(name = "RegleNumAno.findByTemEnSveRna", query = "SELECT r FROM RegleNumAno r WHERE r.temEnSveRna = :temEnSveRna")})
public class RegleNumAno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_RNA")
    private Integer codRna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_RNA_EXT")
    private String codRnaExt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_RNA")
    private String libRna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "MOD_RNA")
    private String modRna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NUM_DEB")
    private String temNumDeb;
    @Column(name = "NUM_DEB")
    private Integer numDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PREF_RE")
    private String temPrefRe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_RNA")
    private String temEnSveRna;
    @OneToMany(mappedBy = "codRna")
    private List<PeriodeAno> periodeAnoList;

    public RegleNumAno() {
    }

    public RegleNumAno(Integer codRna) {
        this.codRna = codRna;
    }

    public RegleNumAno(Integer codRna, String codRnaExt, String libRna, String modRna, String temNumDeb, String temPrefRe, String temEnSveRna) {
        this.codRna = codRna;
        this.codRnaExt = codRnaExt;
        this.libRna = libRna;
        this.modRna = modRna;
        this.temNumDeb = temNumDeb;
        this.temPrefRe = temPrefRe;
        this.temEnSveRna = temEnSveRna;
    }

    public Integer getCodRna() {
        return codRna;
    }

    public void setCodRna(Integer codRna) {
        this.codRna = codRna;
    }

    public String getCodRnaExt() {
        return codRnaExt;
    }

    public void setCodRnaExt(String codRnaExt) {
        this.codRnaExt = codRnaExt;
    }

    public String getLibRna() {
        return libRna;
    }

    public void setLibRna(String libRna) {
        this.libRna = libRna;
    }

    public String getModRna() {
        return modRna;
    }

    public void setModRna(String modRna) {
        this.modRna = modRna;
    }

    public String getTemNumDeb() {
        return temNumDeb;
    }

    public void setTemNumDeb(String temNumDeb) {
        this.temNumDeb = temNumDeb;
    }

    public Integer getNumDeb() {
        return numDeb;
    }

    public void setNumDeb(Integer numDeb) {
        this.numDeb = numDeb;
    }

    public String getTemPrefRe() {
        return temPrefRe;
    }

    public void setTemPrefRe(String temPrefRe) {
        this.temPrefRe = temPrefRe;
    }

    public String getTemEnSveRna() {
        return temEnSveRna;
    }

    public void setTemEnSveRna(String temEnSveRna) {
        this.temEnSveRna = temEnSveRna;
    }

    @XmlTransient
    public List<PeriodeAno> getPeriodeAnoList() {
        return periodeAnoList;
    }

    public void setPeriodeAnoList(List<PeriodeAno> periodeAnoList) {
        this.periodeAnoList = periodeAnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRna != null ? codRna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegleNumAno)) {
            return false;
        }
        RegleNumAno other = (RegleNumAno) object;
        if ((this.codRna == null && other.codRna != null) || (this.codRna != null && !this.codRna.equals(other.codRna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.RegleNumAno[ codRna=" + codRna + " ]";
    }
    
}
