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
@Table(name = "COMMUNE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commune.findAll", query = "SELECT c FROM Commune c"),
    @NamedQuery(name = "Commune.findByCodCom", query = "SELECT c FROM Commune c WHERE c.codCom = :codCom"),
    @NamedQuery(name = "Commune.findByLibCom", query = "SELECT c FROM Commune c WHERE c.libCom = :libCom"),
    @NamedQuery(name = "Commune.findByTemEnSveCom", query = "SELECT c FROM Commune c WHERE c.temEnSveCom = :temEnSveCom"),
    @NamedQuery(name = "Commune.findByLibComArb", query = "SELECT c FROM Commune c WHERE c.libComArb = :libComArb")})
public class Commune implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "COD_COM")
    private String codCom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "LIB_COM")
    private String libCom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_COM")
    private String temEnSveCom;
    @Size(max = 32)
    @Column(name = "LIB_COM_ARB")
    private String libComArb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commune")
    private List<ComBdi> comBdiList;
    @JoinColumn(name = "COD_DEP", referencedColumnName = "COD_DEP")
    @ManyToOne(optional = false)
    private Departement codDep;

    public Commune() {
    }

    public Commune(String codCom) {
        this.codCom = codCom;
    }

    public Commune(String codCom, String libCom, String temEnSveCom) {
        this.codCom = codCom;
        this.libCom = libCom;
        this.temEnSveCom = temEnSveCom;
    }

    public String getCodCom() {
        return codCom;
    }

    public void setCodCom(String codCom) {
        this.codCom = codCom;
    }

    public String getLibCom() {
        return libCom;
    }

    public void setLibCom(String libCom) {
        this.libCom = libCom;
    }

    public String getTemEnSveCom() {
        return temEnSveCom;
    }

    public void setTemEnSveCom(String temEnSveCom) {
        this.temEnSveCom = temEnSveCom;
    }

    public String getLibComArb() {
        return libComArb;
    }

    public void setLibComArb(String libComArb) {
        this.libComArb = libComArb;
    }

    @XmlTransient
    public List<ComBdi> getComBdiList() {
        return comBdiList;
    }

    public void setComBdiList(List<ComBdi> comBdiList) {
        this.comBdiList = comBdiList;
    }

    public Departement getCodDep() {
        return codDep;
    }

    public void setCodDep(Departement codDep) {
        this.codDep = codDep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCom != null ? codCom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commune)) {
            return false;
        }
        Commune other = (Commune) object;
        if ((this.codCom == null && other.codCom != null) || (this.codCom != null && !this.codCom.equals(other.codCom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Commune[ codCom=" + codCom + " ]";
    }
    
}
