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
@Table(name = "NATURE_ELP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NatureElp.findAll", query = "SELECT n FROM NatureElp n"),
    @NamedQuery(name = "NatureElp.findByCodNel", query = "SELECT n FROM NatureElp n WHERE n.codNel = :codNel"),
    @NamedQuery(name = "NatureElp.findByLibNel", query = "SELECT n FROM NatureElp n WHERE n.libNel = :libNel"),
    @NamedQuery(name = "NatureElp.findByLicNel", query = "SELECT n FROM NatureElp n WHERE n.licNel = :licNel"),
    @NamedQuery(name = "NatureElp.findByTemEnSveNel", query = "SELECT n FROM NatureElp n WHERE n.temEnSveNel = :temEnSveNel")})
public class NatureElp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_NEL")
    private String codNel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_NEL")
    private String libNel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_NEL")
    private String licNel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_NEL")
    private String temEnSveNel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codNel")
    private List<ElementPedagogi> elementPedagogiList;

    public NatureElp() {
    }

    public NatureElp(String codNel) {
        this.codNel = codNel;
    }

    public NatureElp(String codNel, String libNel, String licNel, String temEnSveNel) {
        this.codNel = codNel;
        this.libNel = libNel;
        this.licNel = licNel;
        this.temEnSveNel = temEnSveNel;
    }

    public String getCodNel() {
        return codNel;
    }

    public void setCodNel(String codNel) {
        this.codNel = codNel;
    }

    public String getLibNel() {
        return libNel;
    }

    public void setLibNel(String libNel) {
        this.libNel = libNel;
    }

    public String getLicNel() {
        return licNel;
    }

    public void setLicNel(String licNel) {
        this.licNel = licNel;
    }

    public String getTemEnSveNel() {
        return temEnSveNel;
    }

    public void setTemEnSveNel(String temEnSveNel) {
        this.temEnSveNel = temEnSveNel;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList() {
        return elementPedagogiList;
    }

    public void setElementPedagogiList(List<ElementPedagogi> elementPedagogiList) {
        this.elementPedagogiList = elementPedagogiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codNel != null ? codNel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NatureElp)) {
            return false;
        }
        NatureElp other = (NatureElp) object;
        if ((this.codNel == null && other.codNel != null) || (this.codNel != null && !this.codNel.equals(other.codNel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.NatureElp[ codNel=" + codNel + " ]";
    }
    
}
