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
import javax.persistence.JoinColumns;
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
@Table(name = "CENTRE_PAYEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CentrePayeur.findAll", query = "SELECT c FROM CentrePayeur c"),
    @NamedQuery(name = "CentrePayeur.findByCodCtp", query = "SELECT c FROM CentrePayeur c WHERE c.codCtp = :codCtp"),
    @NamedQuery(name = "CentrePayeur.findByCodTrmSsoCtp", query = "SELECT c FROM CentrePayeur c WHERE c.codTrmSsoCtp = :codTrmSsoCtp"),
    @NamedQuery(name = "CentrePayeur.findByLibCtp", query = "SELECT c FROM CentrePayeur c WHERE c.libCtp = :libCtp"),
    @NamedQuery(name = "CentrePayeur.findByLicCtp", query = "SELECT c FROM CentrePayeur c WHERE c.licCtp = :licCtp"),
    @NamedQuery(name = "CentrePayeur.findByLibAd1Ctp", query = "SELECT c FROM CentrePayeur c WHERE c.libAd1Ctp = :libAd1Ctp"),
    @NamedQuery(name = "CentrePayeur.findByLibAd2Ctp", query = "SELECT c FROM CentrePayeur c WHERE c.libAd2Ctp = :libAd2Ctp"),
    @NamedQuery(name = "CentrePayeur.findByLibAd3Ctp", query = "SELECT c FROM CentrePayeur c WHERE c.libAd3Ctp = :libAd3Ctp"),
    @NamedQuery(name = "CentrePayeur.findByTemEnSveCtp", query = "SELECT c FROM CentrePayeur c WHERE c.temEnSveCtp = :temEnSveCtp"),
    @NamedQuery(name = "CentrePayeur.findByLim1Ctp", query = "SELECT c FROM CentrePayeur c WHERE c.lim1Ctp = :lim1Ctp"),
    @NamedQuery(name = "CentrePayeur.findByLim2Ctp", query = "SELECT c FROM CentrePayeur c WHERE c.lim2Ctp = :lim2Ctp"),
    @NamedQuery(name = "CentrePayeur.findByLim3Ctp", query = "SELECT c FROM CentrePayeur c WHERE c.lim3Ctp = :lim3Ctp"),
    @NamedQuery(name = "CentrePayeur.findByTemMinCtp", query = "SELECT c FROM CentrePayeur c WHERE c.temMinCtp = :temMinCtp"),
    @NamedQuery(name = "CentrePayeur.findByNumOrdCtp", query = "SELECT c FROM CentrePayeur c WHERE c.numOrdCtp = :numOrdCtp"),
    @NamedQuery(name = "CentrePayeur.findByLibWebCtp", query = "SELECT c FROM CentrePayeur c WHERE c.libWebCtp = :libWebCtp")})
public class CentrePayeur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_CTP")
    private String codCtp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_TRM_SSO_CTP")
    private String codTrmSsoCtp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_CTP")
    private String libCtp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_CTP")
    private String licCtp;
    @Size(max = 32)
    @Column(name = "LIB_AD1_CTP")
    private String libAd1Ctp;
    @Size(max = 32)
    @Column(name = "LIB_AD2_CTP")
    private String libAd2Ctp;
    @Size(max = 32)
    @Column(name = "LIB_AD3_CTP")
    private String libAd3Ctp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CTP")
    private String temEnSveCtp;
    @Size(max = 35)
    @Column(name = "LIM1_CTP")
    private String lim1Ctp;
    @Size(max = 35)
    @Column(name = "LIM2_CTP")
    private String lim2Ctp;
    @Size(max = 35)
    @Column(name = "LIM3_CTP")
    private String lim3Ctp;
    @Size(max = 1)
    @Column(name = "TEM_MIN_CTP")
    private String temMinCtp;
    @Column(name = "NUM_ORD_CTP")
    private Short numOrdCtp;
    @Size(max = 120)
    @Column(name = "LIB_WEB_CTP")
    private String libWebCtp;
    @OneToMany(mappedBy = "codCtp")
    private List<InsAdmAnu> insAdmAnuList;
    @JoinColumns({
        @JoinColumn(name = "COD_POS_ADR_CTP", referencedColumnName = "COD_BDI"),
        @JoinColumn(name = "COD_COM_ADR_CTP", referencedColumnName = "COD_COM")})
    @ManyToOne
    private ComBdi comBdi;
    @JoinColumn(name = "COD_MUT", referencedColumnName = "COD_MUT")
    @ManyToOne
    private Mutuelle codMut;

    public CentrePayeur() {
    }

    public CentrePayeur(String codCtp) {
        this.codCtp = codCtp;
    }

    public CentrePayeur(String codCtp, String codTrmSsoCtp, String libCtp, String licCtp, String temEnSveCtp) {
        this.codCtp = codCtp;
        this.codTrmSsoCtp = codTrmSsoCtp;
        this.libCtp = libCtp;
        this.licCtp = licCtp;
        this.temEnSveCtp = temEnSveCtp;
    }

    public String getCodCtp() {
        return codCtp;
    }

    public void setCodCtp(String codCtp) {
        this.codCtp = codCtp;
    }

    public String getCodTrmSsoCtp() {
        return codTrmSsoCtp;
    }

    public void setCodTrmSsoCtp(String codTrmSsoCtp) {
        this.codTrmSsoCtp = codTrmSsoCtp;
    }

    public String getLibCtp() {
        return libCtp;
    }

    public void setLibCtp(String libCtp) {
        this.libCtp = libCtp;
    }

    public String getLicCtp() {
        return licCtp;
    }

    public void setLicCtp(String licCtp) {
        this.licCtp = licCtp;
    }

    public String getLibAd1Ctp() {
        return libAd1Ctp;
    }

    public void setLibAd1Ctp(String libAd1Ctp) {
        this.libAd1Ctp = libAd1Ctp;
    }

    public String getLibAd2Ctp() {
        return libAd2Ctp;
    }

    public void setLibAd2Ctp(String libAd2Ctp) {
        this.libAd2Ctp = libAd2Ctp;
    }

    public String getLibAd3Ctp() {
        return libAd3Ctp;
    }

    public void setLibAd3Ctp(String libAd3Ctp) {
        this.libAd3Ctp = libAd3Ctp;
    }

    public String getTemEnSveCtp() {
        return temEnSveCtp;
    }

    public void setTemEnSveCtp(String temEnSveCtp) {
        this.temEnSveCtp = temEnSveCtp;
    }

    public String getLim1Ctp() {
        return lim1Ctp;
    }

    public void setLim1Ctp(String lim1Ctp) {
        this.lim1Ctp = lim1Ctp;
    }

    public String getLim2Ctp() {
        return lim2Ctp;
    }

    public void setLim2Ctp(String lim2Ctp) {
        this.lim2Ctp = lim2Ctp;
    }

    public String getLim3Ctp() {
        return lim3Ctp;
    }

    public void setLim3Ctp(String lim3Ctp) {
        this.lim3Ctp = lim3Ctp;
    }

    public String getTemMinCtp() {
        return temMinCtp;
    }

    public void setTemMinCtp(String temMinCtp) {
        this.temMinCtp = temMinCtp;
    }

    public Short getNumOrdCtp() {
        return numOrdCtp;
    }

    public void setNumOrdCtp(Short numOrdCtp) {
        this.numOrdCtp = numOrdCtp;
    }

    public String getLibWebCtp() {
        return libWebCtp;
    }

    public void setLibWebCtp(String libWebCtp) {
        this.libWebCtp = libWebCtp;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    public ComBdi getComBdi() {
        return comBdi;
    }

    public void setComBdi(ComBdi comBdi) {
        this.comBdi = comBdi;
    }

    public Mutuelle getCodMut() {
        return codMut;
    }

    public void setCodMut(Mutuelle codMut) {
        this.codMut = codMut;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCtp != null ? codCtp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentrePayeur)) {
            return false;
        }
        CentrePayeur other = (CentrePayeur) object;
        if ((this.codCtp == null && other.codCtp != null) || (this.codCtp != null && !this.codCtp.equals(other.codCtp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.CentrePayeur[ codCtp=" + codCtp + " ]";
    }

}
