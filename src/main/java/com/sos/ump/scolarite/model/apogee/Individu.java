/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "INDIVIDU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Individu.findAll", query = "SELECT i FROM Individu i"),
    @NamedQuery(name = "Individu.findByCodInd", query = "SELECT i FROM Individu i WHERE i.codInd = :codInd"),
    @NamedQuery(name = "Individu.findByCodNneInd", query = "SELECT i FROM Individu i WHERE i.codNneInd = :codNneInd"),
    @NamedQuery(name = "Individu.findByCodCleNneInd", query = "SELECT i FROM Individu i WHERE i.codCleNneInd = :codCleNneInd"),
    @NamedQuery(name = "Individu.findByDatCreInd", query = "SELECT i FROM Individu i WHERE i.datCreInd = :datCreInd"),
    @NamedQuery(name = "Individu.findByDatModInd", query = "SELECT i FROM Individu i WHERE i.datModInd = :datModInd"),
    @NamedQuery(name = "Individu.findByDatBloInd", query = "SELECT i FROM Individu i WHERE i.datBloInd = :datBloInd"),
    @NamedQuery(name = "Individu.findByLibCmtBlo", query = "SELECT i FROM Individu i WHERE i.libCmtBlo = :libCmtBlo"),
    @NamedQuery(name = "Individu.findByDateNaiInd", query = "SELECT i FROM Individu i WHERE i.dateNaiInd = :dateNaiInd"),
    @NamedQuery(name = "Individu.findByTemDateNaiRel", query = "SELECT i FROM Individu i WHERE i.temDateNaiRel = :temDateNaiRel"),
    @NamedQuery(name = "Individu.findByDaaLbtInd", query = "SELECT i FROM Individu i WHERE i.daaLbtInd = :daaLbtInd"),
    @NamedQuery(name = "Individu.findByDmmLbtInd", query = "SELECT i FROM Individu i WHERE i.dmmLbtInd = :dmmLbtInd"),
    @NamedQuery(name = "Individu.findByDaaEntEtb", query = "SELECT i FROM Individu i WHERE i.daaEntEtb = :daaEntEtb"),
    @NamedQuery(name = "Individu.findByLibNomPatInd", query = "SELECT i FROM Individu i WHERE i.libNomPatInd = :libNomPatInd"),
    @NamedQuery(name = "Individu.findByLibNomUsuInd", query = "SELECT i FROM Individu i WHERE i.libNomUsuInd = :libNomUsuInd"),
    @NamedQuery(name = "Individu.findByLibPr1Ind", query = "SELECT i FROM Individu i WHERE i.libPr1Ind = :libPr1Ind"),
    @NamedQuery(name = "Individu.findByLibPr2Ind", query = "SELECT i FROM Individu i WHERE i.libPr2Ind = :libPr2Ind"),
    @NamedQuery(name = "Individu.findByLibPr3Ind", query = "SELECT i FROM Individu i WHERE i.libPr3Ind = :libPr3Ind"),
    @NamedQuery(name = "Individu.findByEtaPrsEtu", query = "SELECT i FROM Individu i WHERE i.etaPrsEtu = :etaPrsEtu"),
    @NamedQuery(name = "Individu.findByCodEtu", query = "SELECT i FROM Individu i WHERE i.codEtu = :codEtu"),
    @NamedQuery(name = "Individu.findByCodCiv", query = "SELECT i FROM Individu i WHERE i.codCiv = :codCiv"),
    @NamedQuery(name = "Individu.findByLibNomPatMer", query = "SELECT i FROM Individu i WHERE i.libNomPatMer = :libNomPatMer"),
    @NamedQuery(name = "Individu.findByLibNomPatPer", query = "SELECT i FROM Individu i WHERE i.libNomPatPer = :libNomPatPer"),
    @NamedQuery(name = "Individu.findByLibPreMer", query = "SELECT i FROM Individu i WHERE i.libPreMer = :libPreMer"),
    @NamedQuery(name = "Individu.findByLibPrePer", query = "SELECT i FROM Individu i WHERE i.libPrePer = :libPrePer"),
    @NamedQuery(name = "Individu.findByNumBrsEtu", query = "SELECT i FROM Individu i WHERE i.numBrsEtu = :numBrsEtu"),
    @NamedQuery(name = "Individu.findByTemCrtSsoEtu", query = "SELECT i FROM Individu i WHERE i.temCrtSsoEtu = :temCrtSsoEtu"),
    @NamedQuery(name = "Individu.findByCodSexEtu", query = "SELECT i FROM Individu i WHERE i.codSexEtu = :codSexEtu"),
    @NamedQuery(name = "Individu.findByCodNniEtu", query = "SELECT i FROM Individu i WHERE i.codNniEtu = :codNniEtu"),
    @NamedQuery(name = "Individu.findByLibVilNaiEtu", query = "SELECT i FROM Individu i WHERE i.libVilNaiEtu = :libVilNaiEtu"),
    @NamedQuery(name = "Individu.findByEtaCohDosInd", query = "SELECT i FROM Individu i WHERE i.etaCohDosInd = :etaCohDosInd"),
    @NamedQuery(name = "Individu.findByCodDepPayNai", query = "SELECT i FROM Individu i WHERE i.codDepPayNai = :codDepPayNai"),
    @NamedQuery(name = "Individu.findByCodTypDepPayNai", query = "SELECT i FROM Individu i WHERE i.codTypDepPayNai = :codTypDepPayNai"),
    @NamedQuery(name = "Individu.findByTemFauInd", query = "SELECT i FROM Individu i WHERE i.temFauInd = :temFauInd"),
    @NamedQuery(name = "Individu.findByTemAidInd", query = "SELECT i FROM Individu i WHERE i.temAidInd = :temAidInd"),
    @NamedQuery(name = "Individu.findByTemTierInd", query = "SELECT i FROM Individu i WHERE i.temTierInd = :temTierInd"),
    @NamedQuery(name = "Individu.findByDatDebFauInd", query = "SELECT i FROM Individu i WHERE i.datDebFauInd = :datDebFauInd"),
    @NamedQuery(name = "Individu.findByDatFinFauInd", query = "SELECT i FROM Individu i WHERE i.datFinFauInd = :datFinFauInd"),
    @NamedQuery(name = "Individu.findByDatDebAidInd", query = "SELECT i FROM Individu i WHERE i.datDebAidInd = :datDebAidInd"),
    @NamedQuery(name = "Individu.findByDatFinAidInd", query = "SELECT i FROM Individu i WHERE i.datFinAidInd = :datFinAidInd"),
    @NamedQuery(name = "Individu.findByDatDebTierInd", query = "SELECT i FROM Individu i WHERE i.datDebTierInd = :datDebTierInd"),
    @NamedQuery(name = "Individu.findByDatFinTierInd", query = "SELECT i FROM Individu i WHERE i.datFinTierInd = :datFinTierInd"),
    @NamedQuery(name = "Individu.findByCodCleNniEtu", query = "SELECT i FROM Individu i WHERE i.codCleNniEtu = :codCleNniEtu"),
    @NamedQuery(name = "Individu.findByTemSanObjMerInd", query = "SELECT i FROM Individu i WHERE i.temSanObjMerInd = :temSanObjMerInd"),
    @NamedQuery(name = "Individu.findByTemSanObjPerInd", query = "SELECT i FROM Individu i WHERE i.temSanObjPerInd = :temSanObjPerInd"),
    @NamedQuery(name = "Individu.findByTemNnePrvInd", query = "SELECT i FROM Individu i WHERE i.temNnePrvInd = :temNnePrvInd"),
    @NamedQuery(name = "Individu.findByDaaEnsSup", query = "SELECT i FROM Individu i WHERE i.daaEnsSup = :daaEnsSup"),
    @NamedQuery(name = "Individu.findByDaaEtb", query = "SELECT i FROM Individu i WHERE i.daaEtb = :daaEtb"),
    @NamedQuery(name = "Individu.findByTemRglSitMil", query = "SELECT i FROM Individu i WHERE i.temRglSitMil = :temRglSitMil"),
    @NamedQuery(name = "Individu.findByLibNomIndArb", query = "SELECT i FROM Individu i WHERE i.libNomIndArb = :libNomIndArb"),
    @NamedQuery(name = "Individu.findByLibPrnIndArb", query = "SELECT i FROM Individu i WHERE i.libPrnIndArb = :libPrnIndArb"),
    @NamedQuery(name = "Individu.findByCinInd", query = "SELECT i FROM Individu i WHERE i.cinInd = :cinInd"),
    @NamedQuery(name = "Individu.findByLibVilNaiEtuArb", query = "SELECT i FROM Individu i WHERE i.libVilNaiEtuArb = :libVilNaiEtuArb")})
public class Individu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_IND")
    private Integer codInd;
    @Size(max = 10)
    @Column(name = "COD_NNE_IND")
    private String codNneInd;
    @Size(max = 1)
    @Column(name = "COD_CLE_NNE_IND")
    private String codCleNneInd;
    @Column(name = "DAT_CRE_IND")
    @Temporal(TemporalType.DATE)
    private Date datCreInd;
    @Column(name = "DAT_MOD_IND")
    @Temporal(TemporalType.DATE)
    private Date datModInd;
    @Column(name = "DAT_BLO_IND")
    @Temporal(TemporalType.DATE)
    private Date datBloInd;
    @Size(max = 60)
    @Column(name = "LIB_CMT_BLO")
    private String libCmtBlo;
    @Column(name = "DATE_NAI_IND")
    @Temporal(TemporalType.DATE)
    private Date dateNaiInd;
    @Size(max = 1)
    @Column(name = "TEM_DATE_NAI_REL")
    private String temDateNaiRel;
    @Size(max = 4)
    @Column(name = "DAA_LBT_IND")
    private String daaLbtInd;
    @Size(max = 2)
    @Column(name = "DMM_LBT_IND")
    private String dmmLbtInd;
    @Size(max = 4)
    @Column(name = "DAA_ENT_ETB")
    private String daaEntEtb;
    @Size(max = 30)
    @Column(name = "LIB_NOM_PAT_IND")
    private String libNomPatInd;
    @Size(max = 30)
    @Column(name = "LIB_NOM_USU_IND")
    private String libNomUsuInd;
    @Size(max = 20)
    @Column(name = "LIB_PR1_IND")
    private String libPr1Ind;
    @Size(max = 20)
    @Column(name = "LIB_PR2_IND")
    private String libPr2Ind;
    @Size(max = 20)
    @Column(name = "LIB_PR3_IND")
    private String libPr3Ind;
    @Size(max = 1)
    @Column(name = "ETA_PRS_ETU")
    private String etaPrsEtu;
    @Column(name = "COD_ETU")
    private Integer codEtu;
    @Size(max = 1)
    @Column(name = "COD_CIV")
    private String codCiv;
    @Size(max = 30)
    @Column(name = "LIB_NOM_PAT_MER")
    private String libNomPatMer;
    @Size(max = 30)
    @Column(name = "LIB_NOM_PAT_PER")
    private String libNomPatPer;
    @Size(max = 20)
    @Column(name = "LIB_PRE_MER")
    private String libPreMer;
    @Size(max = 20)
    @Column(name = "LIB_PRE_PER")
    private String libPrePer;
    @Size(max = 13)
    @Column(name = "NUM_BRS_ETU")
    private String numBrsEtu;
    @Size(max = 1)
    @Column(name = "TEM_CRT_SSO_ETU")
    private String temCrtSsoEtu;
    @Size(max = 1)
    @Column(name = "COD_SEX_ETU")
    private String codSexEtu;
    @Size(max = 13)
    @Column(name = "COD_NNI_ETU")
    private String codNniEtu;
    @Size(max = 30)
    @Column(name = "LIB_VIL_NAI_ETU")
    private String libVilNaiEtu;
    @Size(max = 4)
    @Column(name = "ETA_COH_DOS_IND")
    private String etaCohDosInd;
    @Size(max = 3)
    @Column(name = "COD_DEP_PAY_NAI")
    private String codDepPayNai;
    @Size(max = 1)
    @Column(name = "COD_TYP_DEP_PAY_NAI")
    private String codTypDepPayNai;
    @Size(max = 1)
    @Column(name = "TEM_FAU_IND")
    private String temFauInd;
    @Size(max = 1)
    @Column(name = "TEM_AID_IND")
    private String temAidInd;
    @Size(max = 1)
    @Column(name = "TEM_TIER_IND")
    private String temTierInd;
    @Column(name = "DAT_DEB_FAU_IND")
    @Temporal(TemporalType.DATE)
    private Date datDebFauInd;
    @Column(name = "DAT_FIN_FAU_IND")
    @Temporal(TemporalType.DATE)
    private Date datFinFauInd;
    @Column(name = "DAT_DEB_AID_IND")
    @Temporal(TemporalType.DATE)
    private Date datDebAidInd;
    @Column(name = "DAT_FIN_AID_IND")
    @Temporal(TemporalType.DATE)
    private Date datFinAidInd;
    @Column(name = "DAT_DEB_TIER_IND")
    @Temporal(TemporalType.DATE)
    private Date datDebTierInd;
    @Column(name = "DAT_FIN_TIER_IND")
    @Temporal(TemporalType.DATE)
    private Date datFinTierInd;
    @Size(max = 2)
    @Column(name = "COD_CLE_NNI_ETU")
    private String codCleNniEtu;
    @Size(max = 1)
    @Column(name = "TEM_SAN_OBJ_MER_IND")
    private String temSanObjMerInd;
    @Size(max = 1)
    @Column(name = "TEM_SAN_OBJ_PER_IND")
    private String temSanObjPerInd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NNE_PRV_IND")
    private String temNnePrvInd;
    @Size(max = 4)
    @Column(name = "DAA_ENS_SUP")
    private String daaEnsSup;
    @Size(max = 4)
    @Column(name = "DAA_ETB")
    private String daaEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RGL_SIT_MIL")
    private String temRglSitMil;
    @Size(max = 30)
    @Column(name = "LIB_NOM_IND_ARB")
    private String libNomIndArb;
    @Size(max = 20)
    @Column(name = "LIB_PRN_IND_ARB")
    private String libPrnIndArb;
    @Size(max = 10)
    @Column(name = "CIN_IND")
    private String cinInd;
    @Size(max = 30)
    @Column(name = "LIB_VIL_NAI_ETU_ARB")
    private String libVilNaiEtuArb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "individu")
    private List<InsPedagogiAnu> insPedagogiAnuList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "individu")
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codInd")
    private List<IndOpi> indOpiList;
    @OneToOne(mappedBy = "codInd")
    private Adresse adresse;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "individu")
    private List<InsInfoAnu> insInfoAnuList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "individu")
    private List<ResultatElp> resultatElpList;
    @JoinColumn(name = "COD_ANU_SRT_IND", referencedColumnName = "COD_ANU")
    @ManyToOne
    private AnneeUni codAnuSrtInd;
    @JoinColumn(name = "COD_ETB", referencedColumnName = "COD_ETB")
    @ManyToOne
    private Etablissement codEtb;
    @JoinColumn(name = "COD_IND_OPI", referencedColumnName = "COD_IND_OPI")
    @ManyToOne
    private IndOpi codIndOpi;
    @JoinColumn(name = "COD_PAY_NAT", referencedColumnName = "COD_PAY")
    @ManyToOne
    private Pays codPayNat;
    @JoinColumn(name = "COD_FAM", referencedColumnName = "COD_FAM")
    @ManyToOne
    private SitFam codFam;
    @JoinColumn(name = "COD_SIM", referencedColumnName = "COD_SIM")
    @ManyToOne
    private SitMil codSim;
    @JoinColumn(name = "COD_THP", referencedColumnName = "COD_THP")
    @ManyToOne
    private TypHandicap codThp;
    @JoinColumn(name = "COD_UTI", referencedColumnName = "COD_UTI")
    @ManyToOne
    private Utilisateur codUti;
    @JoinColumn(name = "COD_UTI_MOD", referencedColumnName = "COD_UTI")
    @ManyToOne
    private Utilisateur codUtiMod;
    @JoinColumn(name = "COD_UTI_BLO", referencedColumnName = "COD_UTI")
    @ManyToOne
    private Utilisateur codUtiBlo;

    public Individu() {
    }

    public Individu(Integer codInd) {
        this.codInd = codInd;
    }

    public Individu(Integer codInd, String temNnePrvInd, String temRglSitMil) {
        this.codInd = codInd;
        this.temNnePrvInd = temNnePrvInd;
        this.temRglSitMil = temRglSitMil;
    }

    public Integer getCodInd() {
        return codInd;
    }

    public void setCodInd(Integer codInd) {
        this.codInd = codInd;
    }

    public String getCodNneInd() {
        return codNneInd;
    }

    public void setCodNneInd(String codNneInd) {
        this.codNneInd = codNneInd;
    }

    public String getCodCleNneInd() {
        return codCleNneInd;
    }

    public void setCodCleNneInd(String codCleNneInd) {
        this.codCleNneInd = codCleNneInd;
    }

    public Date getDatCreInd() {
        return datCreInd;
    }

    public void setDatCreInd(Date datCreInd) {
        this.datCreInd = datCreInd;
    }

    public Date getDatModInd() {
        return datModInd;
    }

    public void setDatModInd(Date datModInd) {
        this.datModInd = datModInd;
    }

    public Date getDatBloInd() {
        return datBloInd;
    }

    public void setDatBloInd(Date datBloInd) {
        this.datBloInd = datBloInd;
    }

    public String getLibCmtBlo() {
        return libCmtBlo;
    }

    public void setLibCmtBlo(String libCmtBlo) {
        this.libCmtBlo = libCmtBlo;
    }

    public Date getDateNaiInd() {
        return dateNaiInd;
    }

    public void setDateNaiInd(Date dateNaiInd) {
        this.dateNaiInd = dateNaiInd;
    }

    public String getTemDateNaiRel() {
        return temDateNaiRel;
    }

    public void setTemDateNaiRel(String temDateNaiRel) {
        this.temDateNaiRel = temDateNaiRel;
    }

    public String getDaaLbtInd() {
        return daaLbtInd;
    }

    public void setDaaLbtInd(String daaLbtInd) {
        this.daaLbtInd = daaLbtInd;
    }

    public String getDmmLbtInd() {
        return dmmLbtInd;
    }

    public void setDmmLbtInd(String dmmLbtInd) {
        this.dmmLbtInd = dmmLbtInd;
    }

    public String getDaaEntEtb() {
        return daaEntEtb;
    }

    public void setDaaEntEtb(String daaEntEtb) {
        this.daaEntEtb = daaEntEtb;
    }

    public String getLibNomPatInd() {
        return libNomPatInd;
    }

    public void setLibNomPatInd(String libNomPatInd) {
        this.libNomPatInd = libNomPatInd;
    }

    public String getLibNomUsuInd() {
        return libNomUsuInd;
    }

    public void setLibNomUsuInd(String libNomUsuInd) {
        this.libNomUsuInd = libNomUsuInd;
    }

    public String getLibPr1Ind() {
        return libPr1Ind;
    }

    public void setLibPr1Ind(String libPr1Ind) {
        this.libPr1Ind = libPr1Ind;
    }

    public String getLibPr2Ind() {
        return libPr2Ind;
    }

    public void setLibPr2Ind(String libPr2Ind) {
        this.libPr2Ind = libPr2Ind;
    }

    public String getLibPr3Ind() {
        return libPr3Ind;
    }

    public void setLibPr3Ind(String libPr3Ind) {
        this.libPr3Ind = libPr3Ind;
    }

    public String getEtaPrsEtu() {
        return etaPrsEtu;
    }

    public void setEtaPrsEtu(String etaPrsEtu) {
        this.etaPrsEtu = etaPrsEtu;
    }

    public Integer getCodEtu() {
        return codEtu;
    }

    public void setCodEtu(Integer codEtu) {
        this.codEtu = codEtu;
    }

    public String getCodCiv() {
        return codCiv;
    }

    public void setCodCiv(String codCiv) {
        this.codCiv = codCiv;
    }

    public String getLibNomPatMer() {
        return libNomPatMer;
    }

    public void setLibNomPatMer(String libNomPatMer) {
        this.libNomPatMer = libNomPatMer;
    }

    public String getLibNomPatPer() {
        return libNomPatPer;
    }

    public void setLibNomPatPer(String libNomPatPer) {
        this.libNomPatPer = libNomPatPer;
    }

    public String getLibPreMer() {
        return libPreMer;
    }

    public void setLibPreMer(String libPreMer) {
        this.libPreMer = libPreMer;
    }

    public String getLibPrePer() {
        return libPrePer;
    }

    public void setLibPrePer(String libPrePer) {
        this.libPrePer = libPrePer;
    }

    public String getNumBrsEtu() {
        return numBrsEtu;
    }

    public void setNumBrsEtu(String numBrsEtu) {
        this.numBrsEtu = numBrsEtu;
    }

    public String getTemCrtSsoEtu() {
        return temCrtSsoEtu;
    }

    public void setTemCrtSsoEtu(String temCrtSsoEtu) {
        this.temCrtSsoEtu = temCrtSsoEtu;
    }

    public String getCodSexEtu() {
        return codSexEtu;
    }

    public void setCodSexEtu(String codSexEtu) {
        this.codSexEtu = codSexEtu;
    }

    public String getCodNniEtu() {
        return codNniEtu;
    }

    public void setCodNniEtu(String codNniEtu) {
        this.codNniEtu = codNniEtu;
    }

    public String getLibVilNaiEtu() {
        return libVilNaiEtu;
    }

    public void setLibVilNaiEtu(String libVilNaiEtu) {
        this.libVilNaiEtu = libVilNaiEtu;
    }

    public String getEtaCohDosInd() {
        return etaCohDosInd;
    }

    public void setEtaCohDosInd(String etaCohDosInd) {
        this.etaCohDosInd = etaCohDosInd;
    }

    public String getCodDepPayNai() {
        return codDepPayNai;
    }

    public void setCodDepPayNai(String codDepPayNai) {
        this.codDepPayNai = codDepPayNai;
    }

    public String getCodTypDepPayNai() {
        return codTypDepPayNai;
    }

    public void setCodTypDepPayNai(String codTypDepPayNai) {
        this.codTypDepPayNai = codTypDepPayNai;
    }

    public String getTemFauInd() {
        return temFauInd;
    }

    public void setTemFauInd(String temFauInd) {
        this.temFauInd = temFauInd;
    }

    public String getTemAidInd() {
        return temAidInd;
    }

    public void setTemAidInd(String temAidInd) {
        this.temAidInd = temAidInd;
    }

    public String getTemTierInd() {
        return temTierInd;
    }

    public void setTemTierInd(String temTierInd) {
        this.temTierInd = temTierInd;
    }

    public Date getDatDebFauInd() {
        return datDebFauInd;
    }

    public void setDatDebFauInd(Date datDebFauInd) {
        this.datDebFauInd = datDebFauInd;
    }

    public Date getDatFinFauInd() {
        return datFinFauInd;
    }

    public void setDatFinFauInd(Date datFinFauInd) {
        this.datFinFauInd = datFinFauInd;
    }

    public Date getDatDebAidInd() {
        return datDebAidInd;
    }

    public void setDatDebAidInd(Date datDebAidInd) {
        this.datDebAidInd = datDebAidInd;
    }

    public Date getDatFinAidInd() {
        return datFinAidInd;
    }

    public void setDatFinAidInd(Date datFinAidInd) {
        this.datFinAidInd = datFinAidInd;
    }

    public Date getDatDebTierInd() {
        return datDebTierInd;
    }

    public void setDatDebTierInd(Date datDebTierInd) {
        this.datDebTierInd = datDebTierInd;
    }

    public Date getDatFinTierInd() {
        return datFinTierInd;
    }

    public void setDatFinTierInd(Date datFinTierInd) {
        this.datFinTierInd = datFinTierInd;
    }

    public String getCodCleNniEtu() {
        return codCleNniEtu;
    }

    public void setCodCleNniEtu(String codCleNniEtu) {
        this.codCleNniEtu = codCleNniEtu;
    }

    public String getTemSanObjMerInd() {
        return temSanObjMerInd;
    }

    public void setTemSanObjMerInd(String temSanObjMerInd) {
        this.temSanObjMerInd = temSanObjMerInd;
    }

    public String getTemSanObjPerInd() {
        return temSanObjPerInd;
    }

    public void setTemSanObjPerInd(String temSanObjPerInd) {
        this.temSanObjPerInd = temSanObjPerInd;
    }

    public String getTemNnePrvInd() {
        return temNnePrvInd;
    }

    public void setTemNnePrvInd(String temNnePrvInd) {
        this.temNnePrvInd = temNnePrvInd;
    }

    public String getDaaEnsSup() {
        return daaEnsSup;
    }

    public void setDaaEnsSup(String daaEnsSup) {
        this.daaEnsSup = daaEnsSup;
    }

    public String getDaaEtb() {
        return daaEtb;
    }

    public void setDaaEtb(String daaEtb) {
        this.daaEtb = daaEtb;
    }

    public String getTemRglSitMil() {
        return temRglSitMil;
    }

    public void setTemRglSitMil(String temRglSitMil) {
        this.temRglSitMil = temRglSitMil;
    }

    public String getLibNomIndArb() {
        return libNomIndArb;
    }

    public void setLibNomIndArb(String libNomIndArb) {
        this.libNomIndArb = libNomIndArb;
    }

    public String getLibPrnIndArb() {
        return libPrnIndArb;
    }

    public void setLibPrnIndArb(String libPrnIndArb) {
        this.libPrnIndArb = libPrnIndArb;
    }

    public String getCinInd() {
        return cinInd;
    }

    public void setCinInd(String cinInd) {
        this.cinInd = cinInd;
    }

    public String getLibVilNaiEtuArb() {
        return libVilNaiEtuArb;
    }

    public void setLibVilNaiEtuArb(String libVilNaiEtuArb) {
        this.libVilNaiEtuArb = libVilNaiEtuArb;
    }

    @XmlTransient
    public List<InsPedagogiAnu> getInsPedagogiAnuList() {
        return insPedagogiAnuList;
    }

    public void setInsPedagogiAnuList(List<InsPedagogiAnu> insPedagogiAnuList) {
        this.insPedagogiAnuList = insPedagogiAnuList;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @XmlTransient
    public List<IndOpi> getIndOpiList() {
        return indOpiList;
    }

    public void setIndOpiList(List<IndOpi> indOpiList) {
        this.indOpiList = indOpiList;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @XmlTransient
    public List<InsInfoAnu> getInsInfoAnuList() {
        return insInfoAnuList;
    }

    public void setInsInfoAnuList(List<InsInfoAnu> insInfoAnuList) {
        this.insInfoAnuList = insInfoAnuList;
    }

    @XmlTransient
    public List<ResultatElp> getResultatElpList() {
        return resultatElpList;
    }

    public void setResultatElpList(List<ResultatElp> resultatElpList) {
        this.resultatElpList = resultatElpList;
    }

    public AnneeUni getCodAnuSrtInd() {
        return codAnuSrtInd;
    }

    public void setCodAnuSrtInd(AnneeUni codAnuSrtInd) {
        this.codAnuSrtInd = codAnuSrtInd;
    }

    public Etablissement getCodEtb() {
        return codEtb;
    }

    public void setCodEtb(Etablissement codEtb) {
        this.codEtb = codEtb;
    }

    public IndOpi getCodIndOpi() {
        return codIndOpi;
    }

    public void setCodIndOpi(IndOpi codIndOpi) {
        this.codIndOpi = codIndOpi;
    }

    public Pays getCodPayNat() {
        return codPayNat;
    }

    public void setCodPayNat(Pays codPayNat) {
        this.codPayNat = codPayNat;
    }

    public SitFam getCodFam() {
        return codFam;
    }

    public void setCodFam(SitFam codFam) {
        this.codFam = codFam;
    }

    public SitMil getCodSim() {
        return codSim;
    }

    public void setCodSim(SitMil codSim) {
        this.codSim = codSim;
    }

    public TypHandicap getCodThp() {
        return codThp;
    }

    public void setCodThp(TypHandicap codThp) {
        this.codThp = codThp;
    }

    public Utilisateur getCodUti() {
        return codUti;
    }

    public void setCodUti(Utilisateur codUti) {
        this.codUti = codUti;
    }

    public Utilisateur getCodUtiMod() {
        return codUtiMod;
    }

    public void setCodUtiMod(Utilisateur codUtiMod) {
        this.codUtiMod = codUtiMod;
    }

    public Utilisateur getCodUtiBlo() {
        return codUtiBlo;
    }

    public void setCodUtiBlo(Utilisateur codUtiBlo) {
        this.codUtiBlo = codUtiBlo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codInd != null ? codInd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Individu)) {
            return false;
        }
        Individu other = (Individu) object;
        if ((this.codInd == null && other.codInd != null) || (this.codInd != null && !this.codInd.equals(other.codInd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Individu[ codInd=" + codInd + " ]";
    }
    
}
