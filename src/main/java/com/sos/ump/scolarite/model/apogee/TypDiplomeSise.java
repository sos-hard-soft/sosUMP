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
@Table(name = "TYP_DIPLOME_SISE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypDiplomeSise.findAll", query = "SELECT t FROM TypDiplomeSise t"),
    @NamedQuery(name = "TypDiplomeSise.findByCodTds", query = "SELECT t FROM TypDiplomeSise t WHERE t.codTds = :codTds"),
    @NamedQuery(name = "TypDiplomeSise.findByLibTds", query = "SELECT t FROM TypDiplomeSise t WHERE t.libTds = :libTds"),
    @NamedQuery(name = "TypDiplomeSise.findByLicTds", query = "SELECT t FROM TypDiplomeSise t WHERE t.licTds = :licTds"),
    @NamedQuery(name = "TypDiplomeSise.findByTemEnSveTds", query = "SELECT t FROM TypDiplomeSise t WHERE t.temEnSveTds = :temEnSveTds"),
    @NamedQuery(name = "TypDiplomeSise.findByTemMinTds", query = "SELECT t FROM TypDiplomeSise t WHERE t.temMinTds = :temMinTds"),
    @NamedQuery(name = "TypDiplomeSise.findByTemAnnPrmInsDis", query = "SELECT t FROM TypDiplomeSise t WHERE t.temAnnPrmInsDis = :temAnnPrmInsDis"),
    @NamedQuery(name = "TypDiplomeSise.findByLim1Tds", query = "SELECT t FROM TypDiplomeSise t WHERE t.lim1Tds = :lim1Tds"),
    @NamedQuery(name = "TypDiplomeSise.findByLim2Tds", query = "SELECT t FROM TypDiplomeSise t WHERE t.lim2Tds = :lim2Tds"),
    @NamedQuery(name = "TypDiplomeSise.findByLim3Tds", query = "SELECT t FROM TypDiplomeSise t WHERE t.lim3Tds = :lim3Tds"),
    @NamedQuery(name = "TypDiplomeSise.findByNumOrdTds", query = "SELECT t FROM TypDiplomeSise t WHERE t.numOrdTds = :numOrdTds"),
    @NamedQuery(name = "TypDiplomeSise.findByLibWebTds", query = "SELECT t FROM TypDiplomeSise t WHERE t.libWebTds = :libWebTds")})
public class TypDiplomeSise implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_TDS")
    private String codTds;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_TDS")
    private String libTds;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIC_TDS")
    private String licTds;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_TDS")
    private String temEnSveTds;
    @Size(max = 1)
    @Column(name = "TEM_MIN_TDS")
    private String temMinTds;
    @Size(max = 1)
    @Column(name = "TEM_ANN_PRM_INS_DIS")
    private String temAnnPrmInsDis;
    @Size(max = 35)
    @Column(name = "LIM1_TDS")
    private String lim1Tds;
    @Size(max = 35)
    @Column(name = "LIM2_TDS")
    private String lim2Tds;
    @Size(max = 35)
    @Column(name = "LIM3_TDS")
    private String lim3Tds;
    @Column(name = "NUM_ORD_TDS")
    private Short numOrdTds;
    @Size(max = 120)
    @Column(name = "LIB_WEB_TDS")
    private String libWebTds;
    @OneToMany(mappedBy = "codTdsAnnPre")
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codTds")
    private List<TypDiplome> typDiplomeList;

    public TypDiplomeSise() {
    }

    public TypDiplomeSise(String codTds) {
        this.codTds = codTds;
    }

    public TypDiplomeSise(String codTds, String libTds, String licTds, String temEnSveTds) {
        this.codTds = codTds;
        this.libTds = libTds;
        this.licTds = licTds;
        this.temEnSveTds = temEnSveTds;
    }

    public String getCodTds() {
        return codTds;
    }

    public void setCodTds(String codTds) {
        this.codTds = codTds;
    }

    public String getLibTds() {
        return libTds;
    }

    public void setLibTds(String libTds) {
        this.libTds = libTds;
    }

    public String getLicTds() {
        return licTds;
    }

    public void setLicTds(String licTds) {
        this.licTds = licTds;
    }

    public String getTemEnSveTds() {
        return temEnSveTds;
    }

    public void setTemEnSveTds(String temEnSveTds) {
        this.temEnSveTds = temEnSveTds;
    }

    public String getTemMinTds() {
        return temMinTds;
    }

    public void setTemMinTds(String temMinTds) {
        this.temMinTds = temMinTds;
    }

    public String getTemAnnPrmInsDis() {
        return temAnnPrmInsDis;
    }

    public void setTemAnnPrmInsDis(String temAnnPrmInsDis) {
        this.temAnnPrmInsDis = temAnnPrmInsDis;
    }

    public String getLim1Tds() {
        return lim1Tds;
    }

    public void setLim1Tds(String lim1Tds) {
        this.lim1Tds = lim1Tds;
    }

    public String getLim2Tds() {
        return lim2Tds;
    }

    public void setLim2Tds(String lim2Tds) {
        this.lim2Tds = lim2Tds;
    }

    public String getLim3Tds() {
        return lim3Tds;
    }

    public void setLim3Tds(String lim3Tds) {
        this.lim3Tds = lim3Tds;
    }

    public Short getNumOrdTds() {
        return numOrdTds;
    }

    public void setNumOrdTds(Short numOrdTds) {
        this.numOrdTds = numOrdTds;
    }

    public String getLibWebTds() {
        return libWebTds;
    }

    public void setLibWebTds(String libWebTds) {
        this.libWebTds = libWebTds;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @XmlTransient
    public List<TypDiplome> getTypDiplomeList() {
        return typDiplomeList;
    }

    public void setTypDiplomeList(List<TypDiplome> typDiplomeList) {
        this.typDiplomeList = typDiplomeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTds != null ? codTds.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypDiplomeSise)) {
            return false;
        }
        TypDiplomeSise other = (TypDiplomeSise) object;
        if ((this.codTds == null && other.codTds != null) || (this.codTds != null && !this.codTds.equals(other.codTds))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TypDiplomeSise[ codTds=" + codTds + " ]";
    }
    
}
