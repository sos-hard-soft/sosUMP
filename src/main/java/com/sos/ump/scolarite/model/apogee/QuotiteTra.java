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
@Table(name = "QUOTITE_TRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuotiteTra.findAll", query = "SELECT q FROM QuotiteTra q"),
    @NamedQuery(name = "QuotiteTra.findByCodQtr", query = "SELECT q FROM QuotiteTra q WHERE q.codQtr = :codQtr"),
    @NamedQuery(name = "QuotiteTra.findByCodSisQtr", query = "SELECT q FROM QuotiteTra q WHERE q.codSisQtr = :codSisQtr"),
    @NamedQuery(name = "QuotiteTra.findByLibQtr", query = "SELECT q FROM QuotiteTra q WHERE q.libQtr = :libQtr"),
    @NamedQuery(name = "QuotiteTra.findByLicQtr", query = "SELECT q FROM QuotiteTra q WHERE q.licQtr = :licQtr"),
    @NamedQuery(name = "QuotiteTra.findByTemCouAutRegQtr", query = "SELECT q FROM QuotiteTra q WHERE q.temCouAutRegQtr = :temCouAutRegQtr"),
    @NamedQuery(name = "QuotiteTra.findByTemEnSveQtr", query = "SELECT q FROM QuotiteTra q WHERE q.temEnSveQtr = :temEnSveQtr"),
    @NamedQuery(name = "QuotiteTra.findByLim1Qtr", query = "SELECT q FROM QuotiteTra q WHERE q.lim1Qtr = :lim1Qtr"),
    @NamedQuery(name = "QuotiteTra.findByLim2Qtr", query = "SELECT q FROM QuotiteTra q WHERE q.lim2Qtr = :lim2Qtr"),
    @NamedQuery(name = "QuotiteTra.findByLim3Qtr", query = "SELECT q FROM QuotiteTra q WHERE q.lim3Qtr = :lim3Qtr"),
    @NamedQuery(name = "QuotiteTra.findByTemMinQtr", query = "SELECT q FROM QuotiteTra q WHERE q.temMinQtr = :temMinQtr"),
    @NamedQuery(name = "QuotiteTra.findByNumOrdQtr", query = "SELECT q FROM QuotiteTra q WHERE q.numOrdQtr = :numOrdQtr"),
    @NamedQuery(name = "QuotiteTra.findByLibWebQtr", query = "SELECT q FROM QuotiteTra q WHERE q.libWebQtr = :libWebQtr")})
public class QuotiteTra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_QTR")
    private String codQtr;
    @Size(max = 1)
    @Column(name = "COD_SIS_QTR")
    private String codSisQtr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_QTR")
    private String libQtr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_QTR")
    private String licQtr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_COU_AUT_REG_QTR")
    private String temCouAutRegQtr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_QTR")
    private String temEnSveQtr;
    @Size(max = 35)
    @Column(name = "LIM1_QTR")
    private String lim1Qtr;
    @Size(max = 35)
    @Column(name = "LIM2_QTR")
    private String lim2Qtr;
    @Size(max = 35)
    @Column(name = "LIM3_QTR")
    private String lim3Qtr;
    @Size(max = 1)
    @Column(name = "TEM_MIN_QTR")
    private String temMinQtr;
    @Column(name = "NUM_ORD_QTR")
    private Short numOrdQtr;
    @Size(max = 120)
    @Column(name = "LIB_WEB_QTR")
    private String libWebQtr;
    @OneToMany(mappedBy = "codQtr")
    private List<InsAdmAnu> insAdmAnuList;

    public QuotiteTra() {
    }

    public QuotiteTra(String codQtr) {
        this.codQtr = codQtr;
    }

    public QuotiteTra(String codQtr, String libQtr, String licQtr, String temCouAutRegQtr, String temEnSveQtr) {
        this.codQtr = codQtr;
        this.libQtr = libQtr;
        this.licQtr = licQtr;
        this.temCouAutRegQtr = temCouAutRegQtr;
        this.temEnSveQtr = temEnSveQtr;
    }

    public String getCodQtr() {
        return codQtr;
    }

    public void setCodQtr(String codQtr) {
        this.codQtr = codQtr;
    }

    public String getCodSisQtr() {
        return codSisQtr;
    }

    public void setCodSisQtr(String codSisQtr) {
        this.codSisQtr = codSisQtr;
    }

    public String getLibQtr() {
        return libQtr;
    }

    public void setLibQtr(String libQtr) {
        this.libQtr = libQtr;
    }

    public String getLicQtr() {
        return licQtr;
    }

    public void setLicQtr(String licQtr) {
        this.licQtr = licQtr;
    }

    public String getTemCouAutRegQtr() {
        return temCouAutRegQtr;
    }

    public void setTemCouAutRegQtr(String temCouAutRegQtr) {
        this.temCouAutRegQtr = temCouAutRegQtr;
    }

    public String getTemEnSveQtr() {
        return temEnSveQtr;
    }

    public void setTemEnSveQtr(String temEnSveQtr) {
        this.temEnSveQtr = temEnSveQtr;
    }

    public String getLim1Qtr() {
        return lim1Qtr;
    }

    public void setLim1Qtr(String lim1Qtr) {
        this.lim1Qtr = lim1Qtr;
    }

    public String getLim2Qtr() {
        return lim2Qtr;
    }

    public void setLim2Qtr(String lim2Qtr) {
        this.lim2Qtr = lim2Qtr;
    }

    public String getLim3Qtr() {
        return lim3Qtr;
    }

    public void setLim3Qtr(String lim3Qtr) {
        this.lim3Qtr = lim3Qtr;
    }

    public String getTemMinQtr() {
        return temMinQtr;
    }

    public void setTemMinQtr(String temMinQtr) {
        this.temMinQtr = temMinQtr;
    }

    public Short getNumOrdQtr() {
        return numOrdQtr;
    }

    public void setNumOrdQtr(Short numOrdQtr) {
        this.numOrdQtr = numOrdQtr;
    }

    public String getLibWebQtr() {
        return libWebQtr;
    }

    public void setLibWebQtr(String libWebQtr) {
        this.libWebQtr = libWebQtr;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codQtr != null ? codQtr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuotiteTra)) {
            return false;
        }
        QuotiteTra other = (QuotiteTra) object;
        if ((this.codQtr == null && other.codQtr != null) || (this.codQtr != null && !this.codQtr.equals(other.codQtr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.QuotiteTra[ codQtr=" + codQtr + " ]";
    }
    
}
