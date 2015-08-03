/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@Table(name = "TYP_ETB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypEtb.findAll", query = "SELECT t FROM TypEtb t"),
    @NamedQuery(name = "TypEtb.findByCodTpe", query = "SELECT t FROM TypEtb t WHERE t.codTpe = :codTpe"),
    @NamedQuery(name = "TypEtb.findByCodSisTpe", query = "SELECT t FROM TypEtb t WHERE t.codSisTpe = :codSisTpe"),
    @NamedQuery(name = "TypEtb.findByLibTpe", query = "SELECT t FROM TypEtb t WHERE t.libTpe = :libTpe"),
    @NamedQuery(name = "TypEtb.findByLicTpe", query = "SELECT t FROM TypEtb t WHERE t.licTpe = :licTpe"),
    @NamedQuery(name = "TypEtb.findByTemDetTpe", query = "SELECT t FROM TypEtb t WHERE t.temDetTpe = :temDetTpe"),
    @NamedQuery(name = "TypEtb.findByTemGesTrfTpe", query = "SELECT t FROM TypEtb t WHERE t.temGesTrfTpe = :temGesTrfTpe"),
    @NamedQuery(name = "TypEtb.findByTemEnSveTpe", query = "SELECT t FROM TypEtb t WHERE t.temEnSveTpe = :temEnSveTpe"),
    @NamedQuery(name = "TypEtb.findByLim1Tpe", query = "SELECT t FROM TypEtb t WHERE t.lim1Tpe = :lim1Tpe"),
    @NamedQuery(name = "TypEtb.findByLim2Tpe", query = "SELECT t FROM TypEtb t WHERE t.lim2Tpe = :lim2Tpe"),
    @NamedQuery(name = "TypEtb.findByLim3Tpe", query = "SELECT t FROM TypEtb t WHERE t.lim3Tpe = :lim3Tpe"),
    @NamedQuery(name = "TypEtb.findByTemMinTpe", query = "SELECT t FROM TypEtb t WHERE t.temMinTpe = :temMinTpe"),
    @NamedQuery(name = "TypEtb.findByNumOrdTpe", query = "SELECT t FROM TypEtb t WHERE t.numOrdTpe = :numOrdTpe"),
    @NamedQuery(name = "TypEtb.findByLibWebTpe", query = "SELECT t FROM TypEtb t WHERE t.libWebTpe = :libWebTpe")})
public class TypEtb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_TPE")
    private String codTpe;
    @Size(max = 2)
    @Column(name = "COD_SIS_TPE")
    private String codSisTpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_TPE")
    private String libTpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_TPE")
    private String licTpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DET_TPE")
    private String temDetTpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_GES_TRF_TPE")
    private String temGesTrfTpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_TPE")
    private String temEnSveTpe;
    @Size(max = 35)
    @Column(name = "LIM1_TPE")
    private String lim1Tpe;
    @Size(max = 35)
    @Column(name = "LIM2_TPE")
    private String lim2Tpe;
    @Size(max = 35)
    @Column(name = "LIM3_TPE")
    private String lim3Tpe;
    @Size(max = 1)
    @Column(name = "TEM_MIN_TPE")
    private String temMinTpe;
    @Column(name = "NUM_ORD_TPE")
    private Short numOrdTpe;
    @Size(max = 120)
    @Column(name = "LIB_WEB_TPE")
    private String libWebTpe;
    @ManyToMany(mappedBy = "typEtbList")
    private List<SituationSise> situationSiseList;
    @OneToMany(mappedBy = "codTpePrlChg")
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codTpeAnt")
    private List<InsAdmAnu> insAdmAnuList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codTpe")
    private List<Etablissement> etablissementList;
    @JoinColumn(name = "COD_PRU_PRL", referencedColumnName = "COD_PRU")
    @ManyToOne
    private ProfilEtu codPruPrl;
    @JoinColumn(name = "COD_PRU_CHG", referencedColumnName = "COD_PRU")
    @ManyToOne
    private ProfilEtu codPruChg;

    public TypEtb() {
    }

    public TypEtb(String codTpe) {
        this.codTpe = codTpe;
    }

    public TypEtb(String codTpe, String libTpe, String licTpe, String temDetTpe, String temGesTrfTpe, String temEnSveTpe) {
        this.codTpe = codTpe;
        this.libTpe = libTpe;
        this.licTpe = licTpe;
        this.temDetTpe = temDetTpe;
        this.temGesTrfTpe = temGesTrfTpe;
        this.temEnSveTpe = temEnSveTpe;
    }

    public String getCodTpe() {
        return codTpe;
    }

    public void setCodTpe(String codTpe) {
        this.codTpe = codTpe;
    }

    public String getCodSisTpe() {
        return codSisTpe;
    }

    public void setCodSisTpe(String codSisTpe) {
        this.codSisTpe = codSisTpe;
    }

    public String getLibTpe() {
        return libTpe;
    }

    public void setLibTpe(String libTpe) {
        this.libTpe = libTpe;
    }

    public String getLicTpe() {
        return licTpe;
    }

    public void setLicTpe(String licTpe) {
        this.licTpe = licTpe;
    }

    public String getTemDetTpe() {
        return temDetTpe;
    }

    public void setTemDetTpe(String temDetTpe) {
        this.temDetTpe = temDetTpe;
    }

    public String getTemGesTrfTpe() {
        return temGesTrfTpe;
    }

    public void setTemGesTrfTpe(String temGesTrfTpe) {
        this.temGesTrfTpe = temGesTrfTpe;
    }

    public String getTemEnSveTpe() {
        return temEnSveTpe;
    }

    public void setTemEnSveTpe(String temEnSveTpe) {
        this.temEnSveTpe = temEnSveTpe;
    }

    public String getLim1Tpe() {
        return lim1Tpe;
    }

    public void setLim1Tpe(String lim1Tpe) {
        this.lim1Tpe = lim1Tpe;
    }

    public String getLim2Tpe() {
        return lim2Tpe;
    }

    public void setLim2Tpe(String lim2Tpe) {
        this.lim2Tpe = lim2Tpe;
    }

    public String getLim3Tpe() {
        return lim3Tpe;
    }

    public void setLim3Tpe(String lim3Tpe) {
        this.lim3Tpe = lim3Tpe;
    }

    public String getTemMinTpe() {
        return temMinTpe;
    }

    public void setTemMinTpe(String temMinTpe) {
        this.temMinTpe = temMinTpe;
    }

    public Short getNumOrdTpe() {
        return numOrdTpe;
    }

    public void setNumOrdTpe(Short numOrdTpe) {
        this.numOrdTpe = numOrdTpe;
    }

    public String getLibWebTpe() {
        return libWebTpe;
    }

    public void setLibWebTpe(String libWebTpe) {
        this.libWebTpe = libWebTpe;
    }

    @XmlTransient
    public List<SituationSise> getSituationSiseList() {
        return situationSiseList;
    }

    public void setSituationSiseList(List<SituationSise> situationSiseList) {
        this.situationSiseList = situationSiseList;
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
    public List<Etablissement> getEtablissementList() {
        return etablissementList;
    }

    public void setEtablissementList(List<Etablissement> etablissementList) {
        this.etablissementList = etablissementList;
    }

    public ProfilEtu getCodPruPrl() {
        return codPruPrl;
    }

    public void setCodPruPrl(ProfilEtu codPruPrl) {
        this.codPruPrl = codPruPrl;
    }

    public ProfilEtu getCodPruChg() {
        return codPruChg;
    }

    public void setCodPruChg(ProfilEtu codPruChg) {
        this.codPruChg = codPruChg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTpe != null ? codTpe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypEtb)) {
            return false;
        }
        TypEtb other = (TypEtb) object;
        if ((this.codTpe == null && other.codTpe != null) || (this.codTpe != null && !this.codTpe.equals(other.codTpe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TypEtb[ codTpe=" + codTpe + " ]";
    }
    
}
