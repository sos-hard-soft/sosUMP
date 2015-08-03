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
@Table(name = "PERIODE_ANO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeriodeAno.findAll", query = "SELECT p FROM PeriodeAno p"),
    @NamedQuery(name = "PeriodeAno.findByCodPan", query = "SELECT p FROM PeriodeAno p WHERE p.codPan = :codPan"),
    @NamedQuery(name = "PeriodeAno.findByLibPan", query = "SELECT p FROM PeriodeAno p WHERE p.libPan = :libPan"),
    @NamedQuery(name = "PeriodeAno.findByTemEnSvePan", query = "SELECT p FROM PeriodeAno p WHERE p.temEnSvePan = :temEnSvePan")})
public class PeriodeAno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_PAN")
    private String codPan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_PAN")
    private String libPan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_PAN")
    private String temEnSvePan;
    @OneToMany(mappedBy = "codPan1")
    private List<VersionEtape> versionEtapeList;
    @OneToMany(mappedBy = "codPan2")
    private List<VersionEtape> versionEtapeList1;
    @OneToMany(mappedBy = "codPan3")
    private List<VersionEtape> versionEtapeList2;
    @OneToMany(mappedBy = "codPan4")
    private List<VersionEtape> versionEtapeList3;
    @OneToMany(mappedBy = "codPan1")
    private List<ElementPedagogi> elementPedagogiList;
    @OneToMany(mappedBy = "codPan2")
    private List<ElementPedagogi> elementPedagogiList1;
    @OneToMany(mappedBy = "codPan3")
    private List<ElementPedagogi> elementPedagogiList2;
    @OneToMany(mappedBy = "codPan4")
    private List<ElementPedagogi> elementPedagogiList3;
    @OneToMany(mappedBy = "codPan1")
    private List<VersionDiplome> versionDiplomeList;
    @OneToMany(mappedBy = "codPan2")
    private List<VersionDiplome> versionDiplomeList1;
    @OneToMany(mappedBy = "codPan3")
    private List<VersionDiplome> versionDiplomeList2;
    @OneToMany(mappedBy = "codPan4")
    private List<VersionDiplome> versionDiplomeList3;
    @JoinColumn(name = "COD_RNA", referencedColumnName = "COD_RNA")
    @ManyToOne
    private RegleNumAno codRna;

    public PeriodeAno() {
    }

    public PeriodeAno(String codPan) {
        this.codPan = codPan;
    }

    public PeriodeAno(String codPan, String libPan, String temEnSvePan) {
        this.codPan = codPan;
        this.libPan = libPan;
        this.temEnSvePan = temEnSvePan;
    }

    public String getCodPan() {
        return codPan;
    }

    public void setCodPan(String codPan) {
        this.codPan = codPan;
    }

    public String getLibPan() {
        return libPan;
    }

    public void setLibPan(String libPan) {
        this.libPan = libPan;
    }

    public String getTemEnSvePan() {
        return temEnSvePan;
    }

    public void setTemEnSvePan(String temEnSvePan) {
        this.temEnSvePan = temEnSvePan;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList() {
        return versionEtapeList;
    }

    public void setVersionEtapeList(List<VersionEtape> versionEtapeList) {
        this.versionEtapeList = versionEtapeList;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList1() {
        return versionEtapeList1;
    }

    public void setVersionEtapeList1(List<VersionEtape> versionEtapeList1) {
        this.versionEtapeList1 = versionEtapeList1;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList2() {
        return versionEtapeList2;
    }

    public void setVersionEtapeList2(List<VersionEtape> versionEtapeList2) {
        this.versionEtapeList2 = versionEtapeList2;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList3() {
        return versionEtapeList3;
    }

    public void setVersionEtapeList3(List<VersionEtape> versionEtapeList3) {
        this.versionEtapeList3 = versionEtapeList3;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList() {
        return elementPedagogiList;
    }

    public void setElementPedagogiList(List<ElementPedagogi> elementPedagogiList) {
        this.elementPedagogiList = elementPedagogiList;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList1() {
        return elementPedagogiList1;
    }

    public void setElementPedagogiList1(List<ElementPedagogi> elementPedagogiList1) {
        this.elementPedagogiList1 = elementPedagogiList1;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList2() {
        return elementPedagogiList2;
    }

    public void setElementPedagogiList2(List<ElementPedagogi> elementPedagogiList2) {
        this.elementPedagogiList2 = elementPedagogiList2;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList3() {
        return elementPedagogiList3;
    }

    public void setElementPedagogiList3(List<ElementPedagogi> elementPedagogiList3) {
        this.elementPedagogiList3 = elementPedagogiList3;
    }

    @XmlTransient
    public List<VersionDiplome> getVersionDiplomeList() {
        return versionDiplomeList;
    }

    public void setVersionDiplomeList(List<VersionDiplome> versionDiplomeList) {
        this.versionDiplomeList = versionDiplomeList;
    }

    @XmlTransient
    public List<VersionDiplome> getVersionDiplomeList1() {
        return versionDiplomeList1;
    }

    public void setVersionDiplomeList1(List<VersionDiplome> versionDiplomeList1) {
        this.versionDiplomeList1 = versionDiplomeList1;
    }

    @XmlTransient
    public List<VersionDiplome> getVersionDiplomeList2() {
        return versionDiplomeList2;
    }

    public void setVersionDiplomeList2(List<VersionDiplome> versionDiplomeList2) {
        this.versionDiplomeList2 = versionDiplomeList2;
    }

    @XmlTransient
    public List<VersionDiplome> getVersionDiplomeList3() {
        return versionDiplomeList3;
    }

    public void setVersionDiplomeList3(List<VersionDiplome> versionDiplomeList3) {
        this.versionDiplomeList3 = versionDiplomeList3;
    }

    public RegleNumAno getCodRna() {
        return codRna;
    }

    public void setCodRna(RegleNumAno codRna) {
        this.codRna = codRna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPan != null ? codPan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodeAno)) {
            return false;
        }
        PeriodeAno other = (PeriodeAno) object;
        if ((this.codPan == null && other.codPan != null) || (this.codPan != null && !this.codPan.equals(other.codPan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.PeriodeAno[ codPan=" + codPan + " ]";
    }
    
}
