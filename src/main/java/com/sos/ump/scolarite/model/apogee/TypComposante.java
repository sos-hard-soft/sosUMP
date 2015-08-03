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
@Table(name = "TYP_COMPOSANTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypComposante.findAll", query = "SELECT t FROM TypComposante t"),
    @NamedQuery(name = "TypComposante.findByCodTpc", query = "SELECT t FROM TypComposante t WHERE t.codTpc = :codTpc"),
    @NamedQuery(name = "TypComposante.findByLibTpc", query = "SELECT t FROM TypComposante t WHERE t.libTpc = :libTpc"),
    @NamedQuery(name = "TypComposante.findByTemEnSveTpc", query = "SELECT t FROM TypComposante t WHERE t.temEnSveTpc = :temEnSveTpc")})
public class TypComposante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_TPC")
    private String codTpc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_TPC")
    private String libTpc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_TPC")
    private String temEnSveTpc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codTpc")
    private List<Composante> composanteList;
    @JoinColumn(name = "COD_SIS", referencedColumnName = "COD_SIS")
    @ManyToOne
    private SituationSise codSis;

    public TypComposante() {
    }

    public TypComposante(String codTpc) {
        this.codTpc = codTpc;
    }

    public TypComposante(String codTpc, String libTpc, String temEnSveTpc) {
        this.codTpc = codTpc;
        this.libTpc = libTpc;
        this.temEnSveTpc = temEnSveTpc;
    }

    public String getCodTpc() {
        return codTpc;
    }

    public void setCodTpc(String codTpc) {
        this.codTpc = codTpc;
    }

    public String getLibTpc() {
        return libTpc;
    }

    public void setLibTpc(String libTpc) {
        this.libTpc = libTpc;
    }

    public String getTemEnSveTpc() {
        return temEnSveTpc;
    }

    public void setTemEnSveTpc(String temEnSveTpc) {
        this.temEnSveTpc = temEnSveTpc;
    }

    @XmlTransient
    public List<Composante> getComposanteList() {
        return composanteList;
    }

    public void setComposanteList(List<Composante> composanteList) {
        this.composanteList = composanteList;
    }

    public SituationSise getCodSis() {
        return codSis;
    }

    public void setCodSis(SituationSise codSis) {
        this.codSis = codSis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTpc != null ? codTpc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypComposante)) {
            return false;
        }
        TypComposante other = (TypComposante) object;
        if ((this.codTpc == null && other.codTpc != null) || (this.codTpc != null && !this.codTpc.equals(other.codTpc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TypComposante[ codTpc=" + codTpc + " ]";
    }
    
}
