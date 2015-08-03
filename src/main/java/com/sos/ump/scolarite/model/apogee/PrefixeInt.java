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
@Table(name = "PREFIXE_INT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrefixeInt.findAll", query = "SELECT p FROM PrefixeInt p"),
    @NamedQuery(name = "PrefixeInt.findByCodPrf", query = "SELECT p FROM PrefixeInt p WHERE p.codPrf = :codPrf"),
    @NamedQuery(name = "PrefixeInt.findByLibPrf", query = "SELECT p FROM PrefixeInt p WHERE p.libPrf = :libPrf"),
    @NamedQuery(name = "PrefixeInt.findByLibArt1Prf", query = "SELECT p FROM PrefixeInt p WHERE p.libArt1Prf = :libArt1Prf"),
    @NamedQuery(name = "PrefixeInt.findByLibArt2Prf", query = "SELECT p FROM PrefixeInt p WHERE p.libArt2Prf = :libArt2Prf"),
    @NamedQuery(name = "PrefixeInt.findByTemEnSvePrf", query = "SELECT p FROM PrefixeInt p WHERE p.temEnSvePrf = :temEnSvePrf"),
    @NamedQuery(name = "PrefixeInt.findByTemDel", query = "SELECT p FROM PrefixeInt p WHERE p.temDel = :temDel"),
    @NamedQuery(name = "PrefixeInt.findByGenDipPrf", query = "SELECT p FROM PrefixeInt p WHERE p.genDipPrf = :genDipPrf"),
    @NamedQuery(name = "PrefixeInt.findByLibPrfArb", query = "SELECT p FROM PrefixeInt p WHERE p.libPrfArb = :libPrfArb"),
    @NamedQuery(name = "PrefixeInt.findByLibArt1PrfArb", query = "SELECT p FROM PrefixeInt p WHERE p.libArt1PrfArb = :libArt1PrfArb"),
    @NamedQuery(name = "PrefixeInt.findByLibArt2PrfArb", query = "SELECT p FROM PrefixeInt p WHERE p.libArt2PrfArb = :libArt2PrfArb"),
    @NamedQuery(name = "PrefixeInt.findByGenDipPrfArb", query = "SELECT p FROM PrefixeInt p WHERE p.genDipPrfArb = :genDipPrfArb")})
public class PrefixeInt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "COD_PRF")
    private String codPrf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "LIB_PRF")
    private String libPrf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "LIB_ART_1_PRF")
    private String libArt1Prf;
    @Size(max = 5)
    @Column(name = "LIB_ART_2_PRF")
    private String libArt2Prf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_PRF")
    private String temEnSvePrf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "GEN_DIP_PRF")
    private String genDipPrf;
    @Size(max = 90)
    @Column(name = "LIB_PRF_ARB")
    private String libPrfArb;
    @Size(max = 5)
    @Column(name = "LIB_ART_1_PRF_ARB")
    private String libArt1PrfArb;
    @Size(max = 5)
    @Column(name = "LIB_ART_2_PRF_ARB")
    private String libArt2PrfArb;
    @Size(max = 1)
    @Column(name = "GEN_DIP_PRF_ARB")
    private String genDipPrfArb;
    @OneToMany(mappedBy = "codPrf1")
    private List<VersionDiplome> versionDiplomeList;
    @OneToMany(mappedBy = "codPrf2")
    private List<VersionDiplome> versionDiplomeList1;
    @OneToMany(mappedBy = "codPrf3")
    private List<VersionDiplome> versionDiplomeList2;

    public PrefixeInt() {
    }

    public PrefixeInt(String codPrf) {
        this.codPrf = codPrf;
    }

    public PrefixeInt(String codPrf, String libPrf, String libArt1Prf, String temEnSvePrf, String temDel, String genDipPrf) {
        this.codPrf = codPrf;
        this.libPrf = libPrf;
        this.libArt1Prf = libArt1Prf;
        this.temEnSvePrf = temEnSvePrf;
        this.temDel = temDel;
        this.genDipPrf = genDipPrf;
    }

    public String getCodPrf() {
        return codPrf;
    }

    public void setCodPrf(String codPrf) {
        this.codPrf = codPrf;
    }

    public String getLibPrf() {
        return libPrf;
    }

    public void setLibPrf(String libPrf) {
        this.libPrf = libPrf;
    }

    public String getLibArt1Prf() {
        return libArt1Prf;
    }

    public void setLibArt1Prf(String libArt1Prf) {
        this.libArt1Prf = libArt1Prf;
    }

    public String getLibArt2Prf() {
        return libArt2Prf;
    }

    public void setLibArt2Prf(String libArt2Prf) {
        this.libArt2Prf = libArt2Prf;
    }

    public String getTemEnSvePrf() {
        return temEnSvePrf;
    }

    public void setTemEnSvePrf(String temEnSvePrf) {
        this.temEnSvePrf = temEnSvePrf;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getGenDipPrf() {
        return genDipPrf;
    }

    public void setGenDipPrf(String genDipPrf) {
        this.genDipPrf = genDipPrf;
    }

    public String getLibPrfArb() {
        return libPrfArb;
    }

    public void setLibPrfArb(String libPrfArb) {
        this.libPrfArb = libPrfArb;
    }

    public String getLibArt1PrfArb() {
        return libArt1PrfArb;
    }

    public void setLibArt1PrfArb(String libArt1PrfArb) {
        this.libArt1PrfArb = libArt1PrfArb;
    }

    public String getLibArt2PrfArb() {
        return libArt2PrfArb;
    }

    public void setLibArt2PrfArb(String libArt2PrfArb) {
        this.libArt2PrfArb = libArt2PrfArb;
    }

    public String getGenDipPrfArb() {
        return genDipPrfArb;
    }

    public void setGenDipPrfArb(String genDipPrfArb) {
        this.genDipPrfArb = genDipPrfArb;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPrf != null ? codPrf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrefixeInt)) {
            return false;
        }
        PrefixeInt other = (PrefixeInt) object;
        if ((this.codPrf == null && other.codPrf != null) || (this.codPrf != null && !this.codPrf.equals(other.codPrf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.PrefixeInt[ codPrf=" + codPrf + " ]";
    }
    
}
