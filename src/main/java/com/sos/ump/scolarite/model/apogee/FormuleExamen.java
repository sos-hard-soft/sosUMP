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
@Table(name = "FORMULE_EXAMEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormuleExamen.findAll", query = "SELECT f FROM FormuleExamen f"),
    @NamedQuery(name = "FormuleExamen.findByCodFex", query = "SELECT f FROM FormuleExamen f WHERE f.codFex = :codFex"),
    @NamedQuery(name = "FormuleExamen.findByLibFex", query = "SELECT f FROM FormuleExamen f WHERE f.libFex = :libFex"),
    @NamedQuery(name = "FormuleExamen.findByLicFex", query = "SELECT f FROM FormuleExamen f WHERE f.licFex = :licFex"),
    @NamedQuery(name = "FormuleExamen.findByTemEnSveFex", query = "SELECT f FROM FormuleExamen f WHERE f.temEnSveFex = :temEnSveFex"),
    @NamedQuery(name = "FormuleExamen.findByTemDel", query = "SELECT f FROM FormuleExamen f WHERE f.temDel = :temDel")})
public class FormuleExamen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_FEX")
    private String codFex;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_FEX")
    private String libFex;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_FEX")
    private String licFex;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_FEX")
    private String temEnSveFex;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formuleExamen")
    private List<ElpAutFex> elpAutFexList;
    @OneToMany(mappedBy = "codFex")
    private List<InsPedagogiEtp> insPedagogiEtpList;

    public FormuleExamen() {
    }

    public FormuleExamen(String codFex) {
        this.codFex = codFex;
    }

    public FormuleExamen(String codFex, String libFex, String licFex, String temEnSveFex, String temDel) {
        this.codFex = codFex;
        this.libFex = libFex;
        this.licFex = licFex;
        this.temEnSveFex = temEnSveFex;
        this.temDel = temDel;
    }

    public String getCodFex() {
        return codFex;
    }

    public void setCodFex(String codFex) {
        this.codFex = codFex;
    }

    public String getLibFex() {
        return libFex;
    }

    public void setLibFex(String libFex) {
        this.libFex = libFex;
    }

    public String getLicFex() {
        return licFex;
    }

    public void setLicFex(String licFex) {
        this.licFex = licFex;
    }

    public String getTemEnSveFex() {
        return temEnSveFex;
    }

    public void setTemEnSveFex(String temEnSveFex) {
        this.temEnSveFex = temEnSveFex;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    @XmlTransient
    public List<ElpAutFex> getElpAutFexList() {
        return elpAutFexList;
    }

    public void setElpAutFexList(List<ElpAutFex> elpAutFexList) {
        this.elpAutFexList = elpAutFexList;
    }

    @XmlTransient
    public List<InsPedagogiEtp> getInsPedagogiEtpList() {
        return insPedagogiEtpList;
    }

    public void setInsPedagogiEtpList(List<InsPedagogiEtp> insPedagogiEtpList) {
        this.insPedagogiEtpList = insPedagogiEtpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFex != null ? codFex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormuleExamen)) {
            return false;
        }
        FormuleExamen other = (FormuleExamen) object;
        if ((this.codFex == null && other.codFex != null) || (this.codFex != null && !this.codFex.equals(other.codFex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.FormuleExamen[ codFex=" + codFex + " ]";
    }
    
}
