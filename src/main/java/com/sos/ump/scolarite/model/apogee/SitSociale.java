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
@Table(name = "SIT_SOCIALE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SitSociale.findAll", query = "SELECT s FROM SitSociale s"),
    @NamedQuery(name = "SitSociale.findByCodSoc", query = "SELECT s FROM SitSociale s WHERE s.codSoc = :codSoc"),
    @NamedQuery(name = "SitSociale.findByLibSoc", query = "SELECT s FROM SitSociale s WHERE s.libSoc = :libSoc"),
    @NamedQuery(name = "SitSociale.findByLicSoc", query = "SELECT s FROM SitSociale s WHERE s.licSoc = :licSoc"),
    @NamedQuery(name = "SitSociale.findByLix1Soc", query = "SELECT s FROM SitSociale s WHERE s.lix1Soc = :lix1Soc"),
    @NamedQuery(name = "SitSociale.findByLix2Soc", query = "SELECT s FROM SitSociale s WHERE s.lix2Soc = :lix2Soc"),
    @NamedQuery(name = "SitSociale.findByLix3Soc", query = "SELECT s FROM SitSociale s WHERE s.lix3Soc = :lix3Soc"),
    @NamedQuery(name = "SitSociale.findByLix4Soc", query = "SELECT s FROM SitSociale s WHERE s.lix4Soc = :lix4Soc"),
    @NamedQuery(name = "SitSociale.findByTemEnSveSoc", query = "SELECT s FROM SitSociale s WHERE s.temEnSveSoc = :temEnSveSoc"),
    @NamedQuery(name = "SitSociale.findByTemDel", query = "SELECT s FROM SitSociale s WHERE s.temDel = :temDel"),
    @NamedQuery(name = "SitSociale.findByLim1Soc", query = "SELECT s FROM SitSociale s WHERE s.lim1Soc = :lim1Soc"),
    @NamedQuery(name = "SitSociale.findByLim2Soc", query = "SELECT s FROM SitSociale s WHERE s.lim2Soc = :lim2Soc"),
    @NamedQuery(name = "SitSociale.findByLim3Soc", query = "SELECT s FROM SitSociale s WHERE s.lim3Soc = :lim3Soc"),
    @NamedQuery(name = "SitSociale.findByTemMinSoc", query = "SELECT s FROM SitSociale s WHERE s.temMinSoc = :temMinSoc"),
    @NamedQuery(name = "SitSociale.findByNumOrdSoc", query = "SELECT s FROM SitSociale s WHERE s.numOrdSoc = :numOrdSoc"),
    @NamedQuery(name = "SitSociale.findByTemPecMinSoc", query = "SELECT s FROM SitSociale s WHERE s.temPecMinSoc = :temPecMinSoc"),
    @NamedQuery(name = "SitSociale.findByLibWebSoc", query = "SELECT s FROM SitSociale s WHERE s.libWebSoc = :libWebSoc")})
public class SitSociale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_SOC")
    private String codSoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIB_SOC")
    private String libSoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_SOC")
    private String licSoc;
    @Size(max = 40)
    @Column(name = "LIX_1_SOC")
    private String lix1Soc;
    @Size(max = 40)
    @Column(name = "LIX_2_SOC")
    private String lix2Soc;
    @Size(max = 40)
    @Column(name = "LIX_3_SOC")
    private String lix3Soc;
    @Size(max = 40)
    @Column(name = "LIX_4_SOC")
    private String lix4Soc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_SOC")
    private String temEnSveSoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 35)
    @Column(name = "LIM1_SOC")
    private String lim1Soc;
    @Size(max = 35)
    @Column(name = "LIM2_SOC")
    private String lim2Soc;
    @Size(max = 35)
    @Column(name = "LIM3_SOC")
    private String lim3Soc;
    @Size(max = 1)
    @Column(name = "TEM_MIN_SOC")
    private String temMinSoc;
    @Column(name = "NUM_ORD_SOC")
    private Short numOrdSoc;
    @Size(max = 1)
    @Column(name = "TEM_PEC_MIN_SOC")
    private String temPecMinSoc;
    @Size(max = 120)
    @Column(name = "LIB_WEB_SOC")
    private String libWebSoc;
    @OneToMany(mappedBy = "codSoc")
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codSoc")
    private List<Bourse> bourseList;

    public SitSociale() {
    }

    public SitSociale(String codSoc) {
        this.codSoc = codSoc;
    }

    public SitSociale(String codSoc, String libSoc, String licSoc, String temEnSveSoc, String temDel) {
        this.codSoc = codSoc;
        this.libSoc = libSoc;
        this.licSoc = licSoc;
        this.temEnSveSoc = temEnSveSoc;
        this.temDel = temDel;
    }

    public String getCodSoc() {
        return codSoc;
    }

    public void setCodSoc(String codSoc) {
        this.codSoc = codSoc;
    }

    public String getLibSoc() {
        return libSoc;
    }

    public void setLibSoc(String libSoc) {
        this.libSoc = libSoc;
    }

    public String getLicSoc() {
        return licSoc;
    }

    public void setLicSoc(String licSoc) {
        this.licSoc = licSoc;
    }

    public String getLix1Soc() {
        return lix1Soc;
    }

    public void setLix1Soc(String lix1Soc) {
        this.lix1Soc = lix1Soc;
    }

    public String getLix2Soc() {
        return lix2Soc;
    }

    public void setLix2Soc(String lix2Soc) {
        this.lix2Soc = lix2Soc;
    }

    public String getLix3Soc() {
        return lix3Soc;
    }

    public void setLix3Soc(String lix3Soc) {
        this.lix3Soc = lix3Soc;
    }

    public String getLix4Soc() {
        return lix4Soc;
    }

    public void setLix4Soc(String lix4Soc) {
        this.lix4Soc = lix4Soc;
    }

    public String getTemEnSveSoc() {
        return temEnSveSoc;
    }

    public void setTemEnSveSoc(String temEnSveSoc) {
        this.temEnSveSoc = temEnSveSoc;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getLim1Soc() {
        return lim1Soc;
    }

    public void setLim1Soc(String lim1Soc) {
        this.lim1Soc = lim1Soc;
    }

    public String getLim2Soc() {
        return lim2Soc;
    }

    public void setLim2Soc(String lim2Soc) {
        this.lim2Soc = lim2Soc;
    }

    public String getLim3Soc() {
        return lim3Soc;
    }

    public void setLim3Soc(String lim3Soc) {
        this.lim3Soc = lim3Soc;
    }

    public String getTemMinSoc() {
        return temMinSoc;
    }

    public void setTemMinSoc(String temMinSoc) {
        this.temMinSoc = temMinSoc;
    }

    public Short getNumOrdSoc() {
        return numOrdSoc;
    }

    public void setNumOrdSoc(Short numOrdSoc) {
        this.numOrdSoc = numOrdSoc;
    }

    public String getTemPecMinSoc() {
        return temPecMinSoc;
    }

    public void setTemPecMinSoc(String temPecMinSoc) {
        this.temPecMinSoc = temPecMinSoc;
    }

    public String getLibWebSoc() {
        return libWebSoc;
    }

    public void setLibWebSoc(String libWebSoc) {
        this.libWebSoc = libWebSoc;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @XmlTransient
    public List<Bourse> getBourseList() {
        return bourseList;
    }

    public void setBourseList(List<Bourse> bourseList) {
        this.bourseList = bourseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSoc != null ? codSoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SitSociale)) {
            return false;
        }
        SitSociale other = (SitSociale) object;
        if ((this.codSoc == null && other.codSoc != null) || (this.codSoc != null && !this.codSoc.equals(other.codSoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.SitSociale[ codSoc=" + codSoc + " ]";
    }
    
}
