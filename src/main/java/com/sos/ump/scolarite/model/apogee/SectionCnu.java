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
@Table(name = "SECTION_CNU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SectionCnu.findAll", query = "SELECT s FROM SectionCnu s"),
    @NamedQuery(name = "SectionCnu.findByCodScc", query = "SELECT s FROM SectionCnu s WHERE s.codScc = :codScc"),
    @NamedQuery(name = "SectionCnu.findByLicScc", query = "SELECT s FROM SectionCnu s WHERE s.licScc = :licScc"),
    @NamedQuery(name = "SectionCnu.findByLibScc", query = "SELECT s FROM SectionCnu s WHERE s.libScc = :libScc"),
    @NamedQuery(name = "SectionCnu.findByTemEnSveScc", query = "SELECT s FROM SectionCnu s WHERE s.temEnSveScc = :temEnSveScc")})
public class SectionCnu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_SCC")
    private String codScc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_SCC")
    private String licScc;
    @Size(max = 40)
    @Column(name = "LIB_SCC")
    private String libScc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_SCC")
    private String temEnSveScc;
    @OneToMany(mappedBy = "codScc")
    private List<ElementPedagogi> elementPedagogiList;

    public SectionCnu() {
    }

    public SectionCnu(String codScc) {
        this.codScc = codScc;
    }

    public SectionCnu(String codScc, String licScc, String temEnSveScc) {
        this.codScc = codScc;
        this.licScc = licScc;
        this.temEnSveScc = temEnSveScc;
    }

    public String getCodScc() {
        return codScc;
    }

    public void setCodScc(String codScc) {
        this.codScc = codScc;
    }

    public String getLicScc() {
        return licScc;
    }

    public void setLicScc(String licScc) {
        this.licScc = licScc;
    }

    public String getLibScc() {
        return libScc;
    }

    public void setLibScc(String libScc) {
        this.libScc = libScc;
    }

    public String getTemEnSveScc() {
        return temEnSveScc;
    }

    public void setTemEnSveScc(String temEnSveScc) {
        this.temEnSveScc = temEnSveScc;
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
        hash += (codScc != null ? codScc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SectionCnu)) {
            return false;
        }
        SectionCnu other = (SectionCnu) object;
        if ((this.codScc == null && other.codScc != null) || (this.codScc != null && !this.codScc.equals(other.codScc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.SectionCnu[ codScc=" + codScc + " ]";
    }
    
}
