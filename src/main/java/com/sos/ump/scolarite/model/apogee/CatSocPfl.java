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
@Table(name = "CAT_SOC_PFL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatSocPfl.findAll", query = "SELECT c FROM CatSocPfl c"),
    @NamedQuery(name = "CatSocPfl.findByCodPcs", query = "SELECT c FROM CatSocPfl c WHERE c.codPcs = :codPcs"),
    @NamedQuery(name = "CatSocPfl.findByCodSisPcs", query = "SELECT c FROM CatSocPfl c WHERE c.codSisPcs = :codSisPcs"),
    @NamedQuery(name = "CatSocPfl.findByLibPcs", query = "SELECT c FROM CatSocPfl c WHERE c.libPcs = :libPcs"),
    @NamedQuery(name = "CatSocPfl.findByLicPcs", query = "SELECT c FROM CatSocPfl c WHERE c.licPcs = :licPcs"),
    @NamedQuery(name = "CatSocPfl.findByTemSaiQtr", query = "SELECT c FROM CatSocPfl c WHERE c.temSaiQtr = :temSaiQtr"),
    @NamedQuery(name = "CatSocPfl.findByTemEnSvePcs", query = "SELECT c FROM CatSocPfl c WHERE c.temEnSvePcs = :temEnSvePcs"),
    @NamedQuery(name = "CatSocPfl.findByTemDel", query = "SELECT c FROM CatSocPfl c WHERE c.temDel = :temDel"),
    @NamedQuery(name = "CatSocPfl.findByLim1Pcs", query = "SELECT c FROM CatSocPfl c WHERE c.lim1Pcs = :lim1Pcs"),
    @NamedQuery(name = "CatSocPfl.findByLim2Pcs", query = "SELECT c FROM CatSocPfl c WHERE c.lim2Pcs = :lim2Pcs"),
    @NamedQuery(name = "CatSocPfl.findByLim3Pcs", query = "SELECT c FROM CatSocPfl c WHERE c.lim3Pcs = :lim3Pcs"),
    @NamedQuery(name = "CatSocPfl.findByTemMinPcs", query = "SELECT c FROM CatSocPfl c WHERE c.temMinPcs = :temMinPcs"),
    @NamedQuery(name = "CatSocPfl.findByNumOrdPcs", query = "SELECT c FROM CatSocPfl c WHERE c.numOrdPcs = :numOrdPcs"),
    @NamedQuery(name = "CatSocPfl.findByLibWebPcs", query = "SELECT c FROM CatSocPfl c WHERE c.libWebPcs = :libWebPcs")})
public class CatSocPfl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_PCS")
    private String codPcs;
    @Size(max = 2)
    @Column(name = "COD_SIS_PCS")
    private String codSisPcs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_PCS")
    private String libPcs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_PCS")
    private String licPcs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SAI_QTR")
    private String temSaiQtr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_PCS")
    private String temEnSvePcs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 35)
    @Column(name = "LIM1_PCS")
    private String lim1Pcs;
    @Size(max = 35)
    @Column(name = "LIM2_PCS")
    private String lim2Pcs;
    @Size(max = 35)
    @Column(name = "LIM3_PCS")
    private String lim3Pcs;
    @Size(max = 1)
    @Column(name = "TEM_MIN_PCS")
    private String temMinPcs;
    @Column(name = "NUM_ORD_PCS")
    private Short numOrdPcs;
    @Size(max = 120)
    @Column(name = "LIB_WEB_PCS")
    private String libWebPcs;
    @OneToMany(mappedBy = "codPcsEtudiant")
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codPcsParent")
    private List<InsAdmAnu> insAdmAnuList1;
    @OneToMany(mappedBy = "codPcs")
    private List<IndOpi> indOpiList;

    public CatSocPfl() {
    }

    public CatSocPfl(String codPcs) {
        this.codPcs = codPcs;
    }

    public CatSocPfl(String codPcs, String libPcs, String licPcs, String temSaiQtr, String temEnSvePcs, String temDel) {
        this.codPcs = codPcs;
        this.libPcs = libPcs;
        this.licPcs = licPcs;
        this.temSaiQtr = temSaiQtr;
        this.temEnSvePcs = temEnSvePcs;
        this.temDel = temDel;
    }

    public String getCodPcs() {
        return codPcs;
    }

    public void setCodPcs(String codPcs) {
        this.codPcs = codPcs;
    }

    public String getCodSisPcs() {
        return codSisPcs;
    }

    public void setCodSisPcs(String codSisPcs) {
        this.codSisPcs = codSisPcs;
    }

    public String getLibPcs() {
        return libPcs;
    }

    public void setLibPcs(String libPcs) {
        this.libPcs = libPcs;
    }

    public String getLicPcs() {
        return licPcs;
    }

    public void setLicPcs(String licPcs) {
        this.licPcs = licPcs;
    }

    public String getTemSaiQtr() {
        return temSaiQtr;
    }

    public void setTemSaiQtr(String temSaiQtr) {
        this.temSaiQtr = temSaiQtr;
    }

    public String getTemEnSvePcs() {
        return temEnSvePcs;
    }

    public void setTemEnSvePcs(String temEnSvePcs) {
        this.temEnSvePcs = temEnSvePcs;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getLim1Pcs() {
        return lim1Pcs;
    }

    public void setLim1Pcs(String lim1Pcs) {
        this.lim1Pcs = lim1Pcs;
    }

    public String getLim2Pcs() {
        return lim2Pcs;
    }

    public void setLim2Pcs(String lim2Pcs) {
        this.lim2Pcs = lim2Pcs;
    }

    public String getLim3Pcs() {
        return lim3Pcs;
    }

    public void setLim3Pcs(String lim3Pcs) {
        this.lim3Pcs = lim3Pcs;
    }

    public String getTemMinPcs() {
        return temMinPcs;
    }

    public void setTemMinPcs(String temMinPcs) {
        this.temMinPcs = temMinPcs;
    }

    public Short getNumOrdPcs() {
        return numOrdPcs;
    }

    public void setNumOrdPcs(Short numOrdPcs) {
        this.numOrdPcs = numOrdPcs;
    }

    public String getLibWebPcs() {
        return libWebPcs;
    }

    public void setLibWebPcs(String libWebPcs) {
        this.libWebPcs = libWebPcs;
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

    @XmlTransient
    public List<IndOpi> getIndOpiList() {
        return indOpiList;
    }

    public void setIndOpiList(List<IndOpi> indOpiList) {
        this.indOpiList = indOpiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPcs != null ? codPcs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatSocPfl)) {
            return false;
        }
        CatSocPfl other = (CatSocPfl) object;
        if ((this.codPcs == null && other.codPcs != null) || (this.codPcs != null && !this.codPcs.equals(other.codPcs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.CatSocPfl[ codPcs=" + codPcs + " ]";
    }
    
}
