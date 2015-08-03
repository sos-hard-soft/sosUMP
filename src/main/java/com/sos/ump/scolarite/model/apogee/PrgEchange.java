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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "PRG_ECHANGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrgEchange.findAll", query = "SELECT p FROM PrgEchange p"),
    @NamedQuery(name = "PrgEchange.findByCodPrg", query = "SELECT p FROM PrgEchange p WHERE p.prgEchangePK.codPrg = :codPrg"),
    @NamedQuery(name = "PrgEchange.findByTemSnsPrg", query = "SELECT p FROM PrgEchange p WHERE p.prgEchangePK.temSnsPrg = :temSnsPrg"),
    @NamedQuery(name = "PrgEchange.findByCodSisPrg", query = "SELECT p FROM PrgEchange p WHERE p.codSisPrg = :codSisPrg"),
    @NamedQuery(name = "PrgEchange.findByLibPrg", query = "SELECT p FROM PrgEchange p WHERE p.libPrg = :libPrg"),
    @NamedQuery(name = "PrgEchange.findByLicPrg", query = "SELECT p FROM PrgEchange p WHERE p.licPrg = :licPrg"),
    @NamedQuery(name = "PrgEchange.findByLix1Prg", query = "SELECT p FROM PrgEchange p WHERE p.lix1Prg = :lix1Prg"),
    @NamedQuery(name = "PrgEchange.findByLix2Prg", query = "SELECT p FROM PrgEchange p WHERE p.lix2Prg = :lix2Prg"),
    @NamedQuery(name = "PrgEchange.findByLix3Prg", query = "SELECT p FROM PrgEchange p WHERE p.lix3Prg = :lix3Prg"),
    @NamedQuery(name = "PrgEchange.findByLix4Prg", query = "SELECT p FROM PrgEchange p WHERE p.lix4Prg = :lix4Prg"),
    @NamedQuery(name = "PrgEchange.findByTemEnSvePrg", query = "SELECT p FROM PrgEchange p WHERE p.temEnSvePrg = :temEnSvePrg"),
    @NamedQuery(name = "PrgEchange.findByTemMinPrg", query = "SELECT p FROM PrgEchange p WHERE p.temMinPrg = :temMinPrg"),
    @NamedQuery(name = "PrgEchange.findByNumOrdPrg", query = "SELECT p FROM PrgEchange p WHERE p.numOrdPrg = :numOrdPrg"),
    @NamedQuery(name = "PrgEchange.findByLim1Prg", query = "SELECT p FROM PrgEchange p WHERE p.lim1Prg = :lim1Prg"),
    @NamedQuery(name = "PrgEchange.findByLim2Prg", query = "SELECT p FROM PrgEchange p WHERE p.lim2Prg = :lim2Prg"),
    @NamedQuery(name = "PrgEchange.findByLim3Prg", query = "SELECT p FROM PrgEchange p WHERE p.lim3Prg = :lim3Prg"),
    @NamedQuery(name = "PrgEchange.findByLibWebPrg", query = "SELECT p FROM PrgEchange p WHERE p.libWebPrg = :libWebPrg")})
public class PrgEchange implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrgEchangePK prgEchangePK;
    @Size(max = 1)
    @Column(name = "COD_SIS_PRG")
    private String codSisPrg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIB_PRG")
    private String libPrg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_PRG")
    private String licPrg;
    @Size(max = 40)
    @Column(name = "LIX_1_PRG")
    private String lix1Prg;
    @Size(max = 40)
    @Column(name = "LIX_2_PRG")
    private String lix2Prg;
    @Size(max = 40)
    @Column(name = "LIX_3_PRG")
    private String lix3Prg;
    @Size(max = 40)
    @Column(name = "LIX_4_PRG")
    private String lix4Prg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_PRG")
    private String temEnSvePrg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_MIN_PRG")
    private String temMinPrg;
    @Column(name = "NUM_ORD_PRG")
    private Short numOrdPrg;
    @Size(max = 35)
    @Column(name = "LIM1_PRG")
    private String lim1Prg;
    @Size(max = 35)
    @Column(name = "LIM2_PRG")
    private String lim2Prg;
    @Size(max = 35)
    @Column(name = "LIM3_PRG")
    private String lim3Prg;
    @Size(max = 120)
    @Column(name = "LIB_WEB_PRG")
    private String libWebPrg;
    @OneToMany(mappedBy = "prgEchange")
    private List<InsAdmAnu> insAdmAnuList;
    @JoinColumn(name = "COD_PRU", referencedColumnName = "COD_PRU")
    @ManyToOne
    private ProfilEtu codPru;

    public PrgEchange() {
    }

    public PrgEchange(PrgEchangePK prgEchangePK) {
        this.prgEchangePK = prgEchangePK;
    }

    public PrgEchange(PrgEchangePK prgEchangePK, String libPrg, String licPrg, String temEnSvePrg, String temMinPrg) {
        this.prgEchangePK = prgEchangePK;
        this.libPrg = libPrg;
        this.licPrg = licPrg;
        this.temEnSvePrg = temEnSvePrg;
        this.temMinPrg = temMinPrg;
    }

    public PrgEchange(String codPrg, String temSnsPrg) {
        this.prgEchangePK = new PrgEchangePK(codPrg, temSnsPrg);
    }

    public PrgEchangePK getPrgEchangePK() {
        return prgEchangePK;
    }

    public void setPrgEchangePK(PrgEchangePK prgEchangePK) {
        this.prgEchangePK = prgEchangePK;
    }

    public String getCodSisPrg() {
        return codSisPrg;
    }

    public void setCodSisPrg(String codSisPrg) {
        this.codSisPrg = codSisPrg;
    }

    public String getLibPrg() {
        return libPrg;
    }

    public void setLibPrg(String libPrg) {
        this.libPrg = libPrg;
    }

    public String getLicPrg() {
        return licPrg;
    }

    public void setLicPrg(String licPrg) {
        this.licPrg = licPrg;
    }

    public String getLix1Prg() {
        return lix1Prg;
    }

    public void setLix1Prg(String lix1Prg) {
        this.lix1Prg = lix1Prg;
    }

    public String getLix2Prg() {
        return lix2Prg;
    }

    public void setLix2Prg(String lix2Prg) {
        this.lix2Prg = lix2Prg;
    }

    public String getLix3Prg() {
        return lix3Prg;
    }

    public void setLix3Prg(String lix3Prg) {
        this.lix3Prg = lix3Prg;
    }

    public String getLix4Prg() {
        return lix4Prg;
    }

    public void setLix4Prg(String lix4Prg) {
        this.lix4Prg = lix4Prg;
    }

    public String getTemEnSvePrg() {
        return temEnSvePrg;
    }

    public void setTemEnSvePrg(String temEnSvePrg) {
        this.temEnSvePrg = temEnSvePrg;
    }

    public String getTemMinPrg() {
        return temMinPrg;
    }

    public void setTemMinPrg(String temMinPrg) {
        this.temMinPrg = temMinPrg;
    }

    public Short getNumOrdPrg() {
        return numOrdPrg;
    }

    public void setNumOrdPrg(Short numOrdPrg) {
        this.numOrdPrg = numOrdPrg;
    }

    public String getLim1Prg() {
        return lim1Prg;
    }

    public void setLim1Prg(String lim1Prg) {
        this.lim1Prg = lim1Prg;
    }

    public String getLim2Prg() {
        return lim2Prg;
    }

    public void setLim2Prg(String lim2Prg) {
        this.lim2Prg = lim2Prg;
    }

    public String getLim3Prg() {
        return lim3Prg;
    }

    public void setLim3Prg(String lim3Prg) {
        this.lim3Prg = lim3Prg;
    }

    public String getLibWebPrg() {
        return libWebPrg;
    }

    public void setLibWebPrg(String libWebPrg) {
        this.libWebPrg = libWebPrg;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    public ProfilEtu getCodPru() {
        return codPru;
    }

    public void setCodPru(ProfilEtu codPru) {
        this.codPru = codPru;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prgEchangePK != null ? prgEchangePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrgEchange)) {
            return false;
        }
        PrgEchange other = (PrgEchange) object;
        if ((this.prgEchangePK == null && other.prgEchangePK != null) || (this.prgEchangePK != null && !this.prgEchangePK.equals(other.prgEchangePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.PrgEchange[ prgEchangePK=" + prgEchangePK + " ]";
    }
    
}
