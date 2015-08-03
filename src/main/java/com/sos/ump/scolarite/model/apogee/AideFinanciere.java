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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "AIDE_FINANCIERE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AideFinanciere.findAll", query = "SELECT a FROM AideFinanciere a"),
    @NamedQuery(name = "AideFinanciere.findByCodAfi", query = "SELECT a FROM AideFinanciere a WHERE a.codAfi = :codAfi"),
    @NamedQuery(name = "AideFinanciere.findByCodSisAfiAfi", query = "SELECT a FROM AideFinanciere a WHERE a.codSisAfiAfi = :codSisAfiAfi"),
    @NamedQuery(name = "AideFinanciere.findByLibAfi", query = "SELECT a FROM AideFinanciere a WHERE a.libAfi = :libAfi"),
    @NamedQuery(name = "AideFinanciere.findByLicAfi", query = "SELECT a FROM AideFinanciere a WHERE a.licAfi = :licAfi"),
    @NamedQuery(name = "AideFinanciere.findByTemCouAutRegAfi", query = "SELECT a FROM AideFinanciere a WHERE a.temCouAutRegAfi = :temCouAutRegAfi"),
    @NamedQuery(name = "AideFinanciere.findByTemEnSveAfi", query = "SELECT a FROM AideFinanciere a WHERE a.temEnSveAfi = :temEnSveAfi"),
    @NamedQuery(name = "AideFinanciere.findByLim1Afi", query = "SELECT a FROM AideFinanciere a WHERE a.lim1Afi = :lim1Afi"),
    @NamedQuery(name = "AideFinanciere.findByLim2Afi", query = "SELECT a FROM AideFinanciere a WHERE a.lim2Afi = :lim2Afi"),
    @NamedQuery(name = "AideFinanciere.findByLim3Afi", query = "SELECT a FROM AideFinanciere a WHERE a.lim3Afi = :lim3Afi"),
    @NamedQuery(name = "AideFinanciere.findByTemMinAfi", query = "SELECT a FROM AideFinanciere a WHERE a.temMinAfi = :temMinAfi"),
    @NamedQuery(name = "AideFinanciere.findByNumOrdAfi", query = "SELECT a FROM AideFinanciere a WHERE a.numOrdAfi = :numOrdAfi"),
    @NamedQuery(name = "AideFinanciere.findByLibWebAfi", query = "SELECT a FROM AideFinanciere a WHERE a.libWebAfi = :libWebAfi"),
    @NamedQuery(name = "AideFinanciere.findByLibAfiArb", query = "SELECT a FROM AideFinanciere a WHERE a.libAfiArb = :libAfiArb"),
    @NamedQuery(name = "AideFinanciere.findByLicAfiArb", query = "SELECT a FROM AideFinanciere a WHERE a.licAfiArb = :licAfiArb")})
public class AideFinanciere implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_AFI")
    private String codAfi;
    @Size(max = 1)
    @Column(name = "COD_SIS_AFI_AFI")
    private String codSisAfiAfi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_AFI")
    private String libAfi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_AFI")
    private String licAfi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_COU_AUT_REG_AFI")
    private String temCouAutRegAfi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_AFI")
    private String temEnSveAfi;
    @Size(max = 35)
    @Column(name = "LIM1_AFI")
    private String lim1Afi;
    @Size(max = 35)
    @Column(name = "LIM2_AFI")
    private String lim2Afi;
    @Size(max = 35)
    @Column(name = "LIM3_AFI")
    private String lim3Afi;
    @Size(max = 1)
    @Column(name = "TEM_MIN_AFI")
    private String temMinAfi;
    @Column(name = "NUM_ORD_AFI")
    private Short numOrdAfi;
    @Size(max = 120)
    @Column(name = "LIB_WEB_AFI")
    private String libWebAfi;
    @Size(max = 40)
    @Column(name = "LIB_AFI_ARB")
    private String libAfiArb;
    @Size(max = 10)
    @Column(name = "LIC_AFI_ARB")
    private String licAfiArb;
    @JoinTable(name = "IAA_SECONDAIRE_AFI", joinColumns = {
        @JoinColumn(name = "COD_AFI", referencedColumnName = "COD_AFI")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU"),
        @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND")})
    @ManyToMany
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codAfi")
    private List<InsAdmAnu> insAdmAnuList1;

    public AideFinanciere() {
    }

    public AideFinanciere(String codAfi) {
        this.codAfi = codAfi;
    }

    public AideFinanciere(String codAfi, String libAfi, String licAfi, String temCouAutRegAfi, String temEnSveAfi) {
        this.codAfi = codAfi;
        this.libAfi = libAfi;
        this.licAfi = licAfi;
        this.temCouAutRegAfi = temCouAutRegAfi;
        this.temEnSveAfi = temEnSveAfi;
    }

    public String getCodAfi() {
        return codAfi;
    }

    public void setCodAfi(String codAfi) {
        this.codAfi = codAfi;
    }

    public String getCodSisAfiAfi() {
        return codSisAfiAfi;
    }

    public void setCodSisAfiAfi(String codSisAfiAfi) {
        this.codSisAfiAfi = codSisAfiAfi;
    }

    public String getLibAfi() {
        return libAfi;
    }

    public void setLibAfi(String libAfi) {
        this.libAfi = libAfi;
    }

    public String getLicAfi() {
        return licAfi;
    }

    public void setLicAfi(String licAfi) {
        this.licAfi = licAfi;
    }

    public String getTemCouAutRegAfi() {
        return temCouAutRegAfi;
    }

    public void setTemCouAutRegAfi(String temCouAutRegAfi) {
        this.temCouAutRegAfi = temCouAutRegAfi;
    }

    public String getTemEnSveAfi() {
        return temEnSveAfi;
    }

    public void setTemEnSveAfi(String temEnSveAfi) {
        this.temEnSveAfi = temEnSveAfi;
    }

    public String getLim1Afi() {
        return lim1Afi;
    }

    public void setLim1Afi(String lim1Afi) {
        this.lim1Afi = lim1Afi;
    }

    public String getLim2Afi() {
        return lim2Afi;
    }

    public void setLim2Afi(String lim2Afi) {
        this.lim2Afi = lim2Afi;
    }

    public String getLim3Afi() {
        return lim3Afi;
    }

    public void setLim3Afi(String lim3Afi) {
        this.lim3Afi = lim3Afi;
    }

    public String getTemMinAfi() {
        return temMinAfi;
    }

    public void setTemMinAfi(String temMinAfi) {
        this.temMinAfi = temMinAfi;
    }

    public Short getNumOrdAfi() {
        return numOrdAfi;
    }

    public void setNumOrdAfi(Short numOrdAfi) {
        this.numOrdAfi = numOrdAfi;
    }

    public String getLibWebAfi() {
        return libWebAfi;
    }

    public void setLibWebAfi(String libWebAfi) {
        this.libWebAfi = libWebAfi;
    }

    public String getLibAfiArb() {
        return libAfiArb;
    }

    public void setLibAfiArb(String libAfiArb) {
        this.libAfiArb = libAfiArb;
    }

    public String getLicAfiArb() {
        return licAfiArb;
    }

    public void setLicAfiArb(String licAfiArb) {
        this.licAfiArb = licAfiArb;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList1() {
        return insAdmAnuList1;
    }

    public void setInsAdmAnuList1(List<InsAdmAnu> insAdmAnuList1) {
        this.insAdmAnuList1 = insAdmAnuList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAfi != null ? codAfi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AideFinanciere)) {
            return false;
        }
        AideFinanciere other = (AideFinanciere) object;
        if ((this.codAfi == null && other.codAfi != null) || (this.codAfi != null && !this.codAfi.equals(other.codAfi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.AideFinanciere[ codAfi=" + codAfi + " ]";
    }
    
}
