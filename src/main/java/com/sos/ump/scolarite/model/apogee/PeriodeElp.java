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
@Table(name = "PERIODE_ELP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeriodeElp.findAll", query = "SELECT p FROM PeriodeElp p"),
    @NamedQuery(name = "PeriodeElp.findByCodPel", query = "SELECT p FROM PeriodeElp p WHERE p.codPel = :codPel"),
    @NamedQuery(name = "PeriodeElp.findByLibPel", query = "SELECT p FROM PeriodeElp p WHERE p.libPel = :libPel"),
    @NamedQuery(name = "PeriodeElp.findByLicPel", query = "SELECT p FROM PeriodeElp p WHERE p.licPel = :licPel"),
    @NamedQuery(name = "PeriodeElp.findByTemEnSvePel", query = "SELECT p FROM PeriodeElp p WHERE p.temEnSvePel = :temEnSvePel")})
public class PeriodeElp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_PEL")
    private String codPel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_PEL")
    private String libPel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_PEL")
    private String licPel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_PEL")
    private String temEnSvePel;
    @OneToMany(mappedBy = "codPel")
    private List<ElementPedagogi> elementPedagogiList;
    @OneToMany(mappedBy = "codPel")
    private List<IndContratElp> indContratElpList;

    public PeriodeElp() {
    }

    public PeriodeElp(String codPel) {
        this.codPel = codPel;
    }

    public PeriodeElp(String codPel, String libPel, String licPel, String temEnSvePel) {
        this.codPel = codPel;
        this.libPel = libPel;
        this.licPel = licPel;
        this.temEnSvePel = temEnSvePel;
    }

    public String getCodPel() {
        return codPel;
    }

    public void setCodPel(String codPel) {
        this.codPel = codPel;
    }

    public String getLibPel() {
        return libPel;
    }

    public void setLibPel(String libPel) {
        this.libPel = libPel;
    }

    public String getLicPel() {
        return licPel;
    }

    public void setLicPel(String licPel) {
        this.licPel = licPel;
    }

    public String getTemEnSvePel() {
        return temEnSvePel;
    }

    public void setTemEnSvePel(String temEnSvePel) {
        this.temEnSvePel = temEnSvePel;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList() {
        return elementPedagogiList;
    }

    public void setElementPedagogiList(List<ElementPedagogi> elementPedagogiList) {
        this.elementPedagogiList = elementPedagogiList;
    }

    @XmlTransient
    public List<IndContratElp> getIndContratElpList() {
        return indContratElpList;
    }

    public void setIndContratElpList(List<IndContratElp> indContratElpList) {
        this.indContratElpList = indContratElpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPel != null ? codPel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodeElp)) {
            return false;
        }
        PeriodeElp other = (PeriodeElp) object;
        if ((this.codPel == null && other.codPel != null) || (this.codPel != null && !this.codPel.equals(other.codPel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.PeriodeElp[ codPel=" + codPel + " ]";
    }
    
}
