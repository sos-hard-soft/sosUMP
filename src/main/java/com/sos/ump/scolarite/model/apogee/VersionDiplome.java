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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "VERSION_DIPLOME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VersionDiplome.findAll", query = "SELECT v FROM VersionDiplome v"),
    @NamedQuery(name = "VersionDiplome.findByCodDip", query = "SELECT v FROM VersionDiplome v WHERE v.versionDiplomePK.codDip = :codDip"),
    @NamedQuery(name = "VersionDiplome.findByCodVrsVdi", query = "SELECT v FROM VersionDiplome v WHERE v.versionDiplomePK.codVrsVdi = :codVrsVdi"),
    @NamedQuery(name = "VersionDiplome.findByLicVdi", query = "SELECT v FROM VersionDiplome v WHERE v.licVdi = :licVdi"),
    @NamedQuery(name = "VersionDiplome.findByLibCmtVdi", query = "SELECT v FROM VersionDiplome v WHERE v.libCmtVdi = :libCmtVdi"),
    @NamedQuery(name = "VersionDiplome.findByDaaDebHabVdi", query = "SELECT v FROM VersionDiplome v WHERE v.daaDebHabVdi = :daaDebHabVdi"),
    @NamedQuery(name = "VersionDiplome.findByDaaDebRctVdi", query = "SELECT v FROM VersionDiplome v WHERE v.daaDebRctVdi = :daaDebRctVdi"),
    @NamedQuery(name = "VersionDiplome.findByDaaDebValVdi", query = "SELECT v FROM VersionDiplome v WHERE v.daaDebValVdi = :daaDebValVdi"),
    @NamedQuery(name = "VersionDiplome.findByDaaFinHabVdi", query = "SELECT v FROM VersionDiplome v WHERE v.daaFinHabVdi = :daaFinHabVdi"),
    @NamedQuery(name = "VersionDiplome.findByDaaFinRctVdi", query = "SELECT v FROM VersionDiplome v WHERE v.daaFinRctVdi = :daaFinRctVdi"),
    @NamedQuery(name = "VersionDiplome.findByDaaFinValVdi", query = "SELECT v FROM VersionDiplome v WHERE v.daaFinValVdi = :daaFinValVdi"),
    @NamedQuery(name = "VersionDiplome.findByCodDosHabVdi", query = "SELECT v FROM VersionDiplome v WHERE v.codDosHabVdi = :codDosHabVdi"),
    @NamedQuery(name = "VersionDiplome.findByDatArtHabVdi", query = "SELECT v FROM VersionDiplome v WHERE v.datArtHabVdi = :datArtHabVdi"),
    @NamedQuery(name = "VersionDiplome.findByPrf1Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.prf1Vdi = :prf1Vdi"),
    @NamedQuery(name = "VersionDiplome.findByPrf2Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.prf2Vdi = :prf2Vdi"),
    @NamedQuery(name = "VersionDiplome.findByPrf3Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.prf3Vdi = :prf3Vdi"),
    @NamedQuery(name = "VersionDiplome.findByIt1Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.it1Vdi = :it1Vdi"),
    @NamedQuery(name = "VersionDiplome.findByIt2Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.it2Vdi = :it2Vdi"),
    @NamedQuery(name = "VersionDiplome.findByIt3Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.it3Vdi = :it3Vdi"),
    @NamedQuery(name = "VersionDiplome.findByTemNotVdi", query = "SELECT v FROM VersionDiplome v WHERE v.temNotVdi = :temNotVdi"),
    @NamedQuery(name = "VersionDiplome.findByBarSaiVdi", query = "SELECT v FROM VersionDiplome v WHERE v.barSaiVdi = :barSaiVdi"),
    @NamedQuery(name = "VersionDiplome.findByTemPntJurVdi", query = "SELECT v FROM VersionDiplome v WHERE v.temPntJurVdi = :temPntJurVdi"),
    @NamedQuery(name = "VersionDiplome.findByTemMndVdi", query = "SELECT v FROM VersionDiplome v WHERE v.temMndVdi = :temMndVdi"),
    @NamedQuery(name = "VersionDiplome.findByTemResVdi", query = "SELECT v FROM VersionDiplome v WHERE v.temResVdi = :temResVdi"),
    @NamedQuery(name = "VersionDiplome.findByTemJurVdi", query = "SELECT v FROM VersionDiplome v WHERE v.temJurVdi = :temJurVdi"),
    @NamedQuery(name = "VersionDiplome.findByNbrAdmVdi", query = "SELECT v FROM VersionDiplome v WHERE v.nbrAdmVdi = :nbrAdmVdi"),
    @NamedQuery(name = "VersionDiplome.findByTemSesUni", query = "SELECT v FROM VersionDiplome v WHERE v.temSesUni = :temSesUni"),
    @NamedQuery(name = "VersionDiplome.findByTemAdi", query = "SELECT v FROM VersionDiplome v WHERE v.temAdi = :temAdi"),
    @NamedQuery(name = "VersionDiplome.findByTemAdo", query = "SELECT v FROM VersionDiplome v WHERE v.temAdo = :temAdo"),
    @NamedQuery(name = "VersionDiplome.findByLim1Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.lim1Vdi = :lim1Vdi"),
    @NamedQuery(name = "VersionDiplome.findByLim2Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.lim2Vdi = :lim2Vdi"),
    @NamedQuery(name = "VersionDiplome.findByLim3Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.lim3Vdi = :lim3Vdi"),
    @NamedQuery(name = "VersionDiplome.findByTemStgEdtDipVdi", query = "SELECT v FROM VersionDiplome v WHERE v.temStgEdtDipVdi = :temStgEdtDipVdi"),
    @NamedQuery(name = "VersionDiplome.findByNbrMinSpeVdi", query = "SELECT v FROM VersionDiplome v WHERE v.nbrMinSpeVdi = :nbrMinSpeVdi"),
    @NamedQuery(name = "VersionDiplome.findByNbrMaxSpeVdi", query = "SELECT v FROM VersionDiplome v WHERE v.nbrMaxSpeVdi = :nbrMaxSpeVdi"),
    @NamedQuery(name = "VersionDiplome.findByTemResThsVdi", query = "SELECT v FROM VersionDiplome v WHERE v.temResThsVdi = :temResThsVdi"),
    @NamedQuery(name = "VersionDiplome.findByTit1Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.tit1Vdi = :tit1Vdi"),
    @NamedQuery(name = "VersionDiplome.findByTit2Vdi", query = "SELECT v FROM VersionDiplome v WHERE v.tit2Vdi = :tit2Vdi"),
    @NamedQuery(name = "VersionDiplome.findByTemEdiMenVdi", query = "SELECT v FROM VersionDiplome v WHERE v.temEdiMenVdi = :temEdiMenVdi"),
    @NamedQuery(name = "VersionDiplome.findByDurAnnVdi", query = "SELECT v FROM VersionDiplome v WHERE v.durAnnVdi = :durAnnVdi"),
    @NamedQuery(name = "VersionDiplome.findByDatParEtb", query = "SELECT v FROM VersionDiplome v WHERE v.datParEtb = :datParEtb"),
    @NamedQuery(name = "VersionDiplome.findByTemEdSpecSise", query = "SELECT v FROM VersionDiplome v WHERE v.temEdSpecSise = :temEdSpecSise"),
    @NamedQuery(name = "VersionDiplome.findByLibWebVdi", query = "SELECT v FROM VersionDiplome v WHERE v.libWebVdi = :libWebVdi"),
    @NamedQuery(name = "VersionDiplome.findByLicVdiArb", query = "SELECT v FROM VersionDiplome v WHERE v.licVdiArb = :licVdiArb"),
    @NamedQuery(name = "VersionDiplome.findByIt1VdiArb", query = "SELECT v FROM VersionDiplome v WHERE v.it1VdiArb = :it1VdiArb"),
    @NamedQuery(name = "VersionDiplome.findByIt2VdiArb", query = "SELECT v FROM VersionDiplome v WHERE v.it2VdiArb = :it2VdiArb"),
    @NamedQuery(name = "VersionDiplome.findByIt3VdiArb", query = "SELECT v FROM VersionDiplome v WHERE v.it3VdiArb = :it3VdiArb"),
    @NamedQuery(name = "VersionDiplome.findByTit1VdiArb", query = "SELECT v FROM VersionDiplome v WHERE v.tit1VdiArb = :tit1VdiArb"),
    @NamedQuery(name = "VersionDiplome.findByTit2VdiArb", query = "SELECT v FROM VersionDiplome v WHERE v.tit2VdiArb = :tit2VdiArb")})
public class VersionDiplome implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VersionDiplomePK versionDiplomePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIC_VDI")
    private String licVdi;
    @Size(max = 2000)
    @Column(name = "LIB_CMT_VDI")
    private String libCmtVdi;
    @Size(max = 4)
    @Column(name = "DAA_DEB_HAB_VDI")
    private String daaDebHabVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "DAA_DEB_RCT_VDI")
    private String daaDebRctVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "DAA_DEB_VAL_VDI")
    private String daaDebValVdi;
    @Size(max = 4)
    @Column(name = "DAA_FIN_HAB_VDI")
    private String daaFinHabVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "DAA_FIN_RCT_VDI")
    private String daaFinRctVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "DAA_FIN_VAL_VDI")
    private String daaFinValVdi;
    @Size(max = 8)
    @Column(name = "COD_DOS_HAB_VDI")
    private String codDosHabVdi;
    @Column(name = "DAT_ART_HAB_VDI")
    @Temporal(TemporalType.DATE)
    private Date datArtHabVdi;
    @Size(max = 20)
    @Column(name = "PRF_1_VDI")
    private String prf1Vdi;
    @Size(max = 20)
    @Column(name = "PRF_2_VDI")
    private String prf2Vdi;
    @Size(max = 20)
    @Column(name = "PRF_3_VDI")
    private String prf3Vdi;
    @Size(max = 200)
    @Column(name = "IT1_VDI")
    private String it1Vdi;
    @Size(max = 200)
    @Column(name = "IT2_VDI")
    private String it2Vdi;
    @Size(max = 200)
    @Column(name = "IT3_VDI")
    private String it3Vdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NOT_VDI")
    private String temNotVdi;
    @Column(name = "BAR_SAI_VDI")
    private Integer barSaiVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PNT_JUR_VDI")
    private String temPntJurVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_MND_VDI")
    private String temMndVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RES_VDI")
    private String temResVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_JUR_VDI")
    private String temJurVdi;
    @Column(name = "NBR_ADM_VDI")
    private Short nbrAdmVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SES_UNI")
    private String temSesUni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ADI")
    private String temAdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ADO")
    private String temAdo;
    @Size(max = 35)
    @Column(name = "LIM1_VDI")
    private String lim1Vdi;
    @Size(max = 35)
    @Column(name = "LIM2_VDI")
    private String lim2Vdi;
    @Size(max = 35)
    @Column(name = "LIM3_VDI")
    private String lim3Vdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_STG_EDT_DIP_VDI")
    private String temStgEdtDipVdi;
    @Column(name = "NBR_MIN_SPE_VDI")
    private Short nbrMinSpeVdi;
    @Column(name = "NBR_MAX_SPE_VDI")
    private Short nbrMaxSpeVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RES_THS_VDI")
    private String temResThsVdi;
    @Size(max = 90)
    @Column(name = "TIT_1_VDI")
    private String tit1Vdi;
    @Size(max = 90)
    @Column(name = "TIT_2_VDI")
    private String tit2Vdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EDI_MEN_VDI")
    private String temEdiMenVdi;
    @Column(name = "DUR_ANN_VDI")
    private Short durAnnVdi;
    @Column(name = "DAT_PAR_ETB")
    @Temporal(TemporalType.DATE)
    private Date datParEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ED_SPEC_SISE")
    private String temEdSpecSise;
    @Size(max = 120)
    @Column(name = "LIB_WEB_VDI")
    private String libWebVdi;
    @Size(max = 25)
    @Column(name = "LIC_VDI_ARB")
    private String licVdiArb;
    @Size(max = 200)
    @Column(name = "IT1_VDI_ARB")
    private String it1VdiArb;
    @Size(max = 200)
    @Column(name = "IT2_VDI_ARB")
    private String it2VdiArb;
    @Size(max = 200)
    @Column(name = "IT3_VDI_ARB")
    private String it3VdiArb;
    @Size(max = 90)
    @Column(name = "TIT_1_VDI_ARB")
    private String tit1VdiArb;
    @Size(max = 90)
    @Column(name = "TIT_2_VDI_ARB")
    private String tit2VdiArb;
    @JoinTable(name = "VDI_NEC_OBT_VDI", joinColumns = {
        @JoinColumn(name = "COD_DIP_SUP", referencedColumnName = "COD_DIP"),
        @JoinColumn(name = "COD_VRS_VDI_SUP", referencedColumnName = "COD_VRS_VDI")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_DIP_INF", referencedColumnName = "COD_DIP"),
        @JoinColumn(name = "COD_VRS_VDI_INF", referencedColumnName = "COD_VRS_VDI")})
    @ManyToMany
    private List<VersionDiplome> versionDiplomeList;
    @ManyToMany(mappedBy = "versionDiplomeList")
    private List<VersionDiplome> versionDiplomeList1;
    @JoinColumn(name = "COD_DIP", referencedColumnName = "COD_DIP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Diplome diplome;
    @JoinColumn(name = "COD_CMP", referencedColumnName = "COD_CMP")
    @ManyToOne
    private Composante codCmp;
    @JoinColumn(name = "COD_TRE_POS", referencedColumnName = "COD_TRE")
    @ManyToOne
    private TypResultat codTrePos;
    @JoinColumn(name = "COD_CFM", referencedColumnName = "COD_CFM")
    @ManyToOne
    private ConfigMention codCfm;
    @JoinColumn(name = "COD_SIS_VDI", referencedColumnName = "COD_DIS")
    @ManyToOne
    private DiplomeSise codSisVdi;
    @JoinColumn(name = "COD_PAN_1", referencedColumnName = "COD_PAN")
    @ManyToOne
    private PeriodeAno codPan1;
    @JoinColumn(name = "COD_PAN_2", referencedColumnName = "COD_PAN")
    @ManyToOne
    private PeriodeAno codPan2;
    @JoinColumn(name = "COD_TRE_NEG", referencedColumnName = "COD_TRE")
    @ManyToOne
    private TypResultat codTreNeg;
    @JoinColumn(name = "COD_PAN_3", referencedColumnName = "COD_PAN")
    @ManyToOne
    private PeriodeAno codPan3;
    @JoinColumn(name = "COD_PAN_4", referencedColumnName = "COD_PAN")
    @ManyToOne
    private PeriodeAno codPan4;
    @JoinColumn(name = "COD_PRF_1", referencedColumnName = "COD_PRF")
    @ManyToOne
    private PrefixeInt codPrf1;
    @JoinColumn(name = "COD_PRF_2", referencedColumnName = "COD_PRF")
    @ManyToOne
    private PrefixeInt codPrf2;
    @JoinColumn(name = "COD_PRF_3", referencedColumnName = "COD_PRF")
    @ManyToOne
    private PrefixeInt codPrf3;
    @JoinColumns({
        @JoinColumn(name = "COD_MOD_VMD", referencedColumnName = "COD_MOD_VMD"),
        @JoinColumn(name = "COD_VRS_VMD", referencedColumnName = "COD_VRS_VMD")})
    @ManyToOne
    private VersionModeleDip versionModeleDip;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "versionDiplome")
    private List<SpeCaracteriseVdi> speCaracteriseVdiList;
    @OneToMany(mappedBy = "versionDiplome")
    private List<InsAdmEtp> insAdmEtpList;
    @OneToMany(mappedBy = "versionDiplome1")
    private List<InsAdmEtp> insAdmEtpList1;

    public VersionDiplome() {
    }

    public VersionDiplome(VersionDiplomePK versionDiplomePK) {
        this.versionDiplomePK = versionDiplomePK;
    }

    public VersionDiplome(VersionDiplomePK versionDiplomePK, String licVdi, String daaDebRctVdi, String daaDebValVdi, String daaFinRctVdi, String daaFinValVdi, String temNotVdi, String temPntJurVdi, String temMndVdi, String temResVdi, String temJurVdi, String temSesUni, String temAdi, String temAdo, String temStgEdtDipVdi, String temResThsVdi, String temEdiMenVdi, String temEdSpecSise) {
        this.versionDiplomePK = versionDiplomePK;
        this.licVdi = licVdi;
        this.daaDebRctVdi = daaDebRctVdi;
        this.daaDebValVdi = daaDebValVdi;
        this.daaFinRctVdi = daaFinRctVdi;
        this.daaFinValVdi = daaFinValVdi;
        this.temNotVdi = temNotVdi;
        this.temPntJurVdi = temPntJurVdi;
        this.temMndVdi = temMndVdi;
        this.temResVdi = temResVdi;
        this.temJurVdi = temJurVdi;
        this.temSesUni = temSesUni;
        this.temAdi = temAdi;
        this.temAdo = temAdo;
        this.temStgEdtDipVdi = temStgEdtDipVdi;
        this.temResThsVdi = temResThsVdi;
        this.temEdiMenVdi = temEdiMenVdi;
        this.temEdSpecSise = temEdSpecSise;
    }

    public VersionDiplome(String codDip, short codVrsVdi) {
        this.versionDiplomePK = new VersionDiplomePK(codDip, codVrsVdi);
    }

    public VersionDiplomePK getVersionDiplomePK() {
        return versionDiplomePK;
    }

    public void setVersionDiplomePK(VersionDiplomePK versionDiplomePK) {
        this.versionDiplomePK = versionDiplomePK;
    }

    public String getLicVdi() {
        return licVdi;
    }

    public void setLicVdi(String licVdi) {
        this.licVdi = licVdi;
    }

    public String getLibCmtVdi() {
        return libCmtVdi;
    }

    public void setLibCmtVdi(String libCmtVdi) {
        this.libCmtVdi = libCmtVdi;
    }

    public String getDaaDebHabVdi() {
        return daaDebHabVdi;
    }

    public void setDaaDebHabVdi(String daaDebHabVdi) {
        this.daaDebHabVdi = daaDebHabVdi;
    }

    public String getDaaDebRctVdi() {
        return daaDebRctVdi;
    }

    public void setDaaDebRctVdi(String daaDebRctVdi) {
        this.daaDebRctVdi = daaDebRctVdi;
    }

    public String getDaaDebValVdi() {
        return daaDebValVdi;
    }

    public void setDaaDebValVdi(String daaDebValVdi) {
        this.daaDebValVdi = daaDebValVdi;
    }

    public String getDaaFinHabVdi() {
        return daaFinHabVdi;
    }

    public void setDaaFinHabVdi(String daaFinHabVdi) {
        this.daaFinHabVdi = daaFinHabVdi;
    }

    public String getDaaFinRctVdi() {
        return daaFinRctVdi;
    }

    public void setDaaFinRctVdi(String daaFinRctVdi) {
        this.daaFinRctVdi = daaFinRctVdi;
    }

    public String getDaaFinValVdi() {
        return daaFinValVdi;
    }

    public void setDaaFinValVdi(String daaFinValVdi) {
        this.daaFinValVdi = daaFinValVdi;
    }

    public String getCodDosHabVdi() {
        return codDosHabVdi;
    }

    public void setCodDosHabVdi(String codDosHabVdi) {
        this.codDosHabVdi = codDosHabVdi;
    }

    public Date getDatArtHabVdi() {
        return datArtHabVdi;
    }

    public void setDatArtHabVdi(Date datArtHabVdi) {
        this.datArtHabVdi = datArtHabVdi;
    }

    public String getPrf1Vdi() {
        return prf1Vdi;
    }

    public void setPrf1Vdi(String prf1Vdi) {
        this.prf1Vdi = prf1Vdi;
    }

    public String getPrf2Vdi() {
        return prf2Vdi;
    }

    public void setPrf2Vdi(String prf2Vdi) {
        this.prf2Vdi = prf2Vdi;
    }

    public String getPrf3Vdi() {
        return prf3Vdi;
    }

    public void setPrf3Vdi(String prf3Vdi) {
        this.prf3Vdi = prf3Vdi;
    }

    public String getIt1Vdi() {
        return it1Vdi;
    }

    public void setIt1Vdi(String it1Vdi) {
        this.it1Vdi = it1Vdi;
    }

    public String getIt2Vdi() {
        return it2Vdi;
    }

    public void setIt2Vdi(String it2Vdi) {
        this.it2Vdi = it2Vdi;
    }

    public String getIt3Vdi() {
        return it3Vdi;
    }

    public void setIt3Vdi(String it3Vdi) {
        this.it3Vdi = it3Vdi;
    }

    public String getTemNotVdi() {
        return temNotVdi;
    }

    public void setTemNotVdi(String temNotVdi) {
        this.temNotVdi = temNotVdi;
    }

    public Integer getBarSaiVdi() {
        return barSaiVdi;
    }

    public void setBarSaiVdi(Integer barSaiVdi) {
        this.barSaiVdi = barSaiVdi;
    }

    public String getTemPntJurVdi() {
        return temPntJurVdi;
    }

    public void setTemPntJurVdi(String temPntJurVdi) {
        this.temPntJurVdi = temPntJurVdi;
    }

    public String getTemMndVdi() {
        return temMndVdi;
    }

    public void setTemMndVdi(String temMndVdi) {
        this.temMndVdi = temMndVdi;
    }

    public String getTemResVdi() {
        return temResVdi;
    }

    public void setTemResVdi(String temResVdi) {
        this.temResVdi = temResVdi;
    }

    public String getTemJurVdi() {
        return temJurVdi;
    }

    public void setTemJurVdi(String temJurVdi) {
        this.temJurVdi = temJurVdi;
    }

    public Short getNbrAdmVdi() {
        return nbrAdmVdi;
    }

    public void setNbrAdmVdi(Short nbrAdmVdi) {
        this.nbrAdmVdi = nbrAdmVdi;
    }

    public String getTemSesUni() {
        return temSesUni;
    }

    public void setTemSesUni(String temSesUni) {
        this.temSesUni = temSesUni;
    }

    public String getTemAdi() {
        return temAdi;
    }

    public void setTemAdi(String temAdi) {
        this.temAdi = temAdi;
    }

    public String getTemAdo() {
        return temAdo;
    }

    public void setTemAdo(String temAdo) {
        this.temAdo = temAdo;
    }

    public String getLim1Vdi() {
        return lim1Vdi;
    }

    public void setLim1Vdi(String lim1Vdi) {
        this.lim1Vdi = lim1Vdi;
    }

    public String getLim2Vdi() {
        return lim2Vdi;
    }

    public void setLim2Vdi(String lim2Vdi) {
        this.lim2Vdi = lim2Vdi;
    }

    public String getLim3Vdi() {
        return lim3Vdi;
    }

    public void setLim3Vdi(String lim3Vdi) {
        this.lim3Vdi = lim3Vdi;
    }

    public String getTemStgEdtDipVdi() {
        return temStgEdtDipVdi;
    }

    public void setTemStgEdtDipVdi(String temStgEdtDipVdi) {
        this.temStgEdtDipVdi = temStgEdtDipVdi;
    }

    public Short getNbrMinSpeVdi() {
        return nbrMinSpeVdi;
    }

    public void setNbrMinSpeVdi(Short nbrMinSpeVdi) {
        this.nbrMinSpeVdi = nbrMinSpeVdi;
    }

    public Short getNbrMaxSpeVdi() {
        return nbrMaxSpeVdi;
    }

    public void setNbrMaxSpeVdi(Short nbrMaxSpeVdi) {
        this.nbrMaxSpeVdi = nbrMaxSpeVdi;
    }

    public String getTemResThsVdi() {
        return temResThsVdi;
    }

    public void setTemResThsVdi(String temResThsVdi) {
        this.temResThsVdi = temResThsVdi;
    }

    public String getTit1Vdi() {
        return tit1Vdi;
    }

    public void setTit1Vdi(String tit1Vdi) {
        this.tit1Vdi = tit1Vdi;
    }

    public String getTit2Vdi() {
        return tit2Vdi;
    }

    public void setTit2Vdi(String tit2Vdi) {
        this.tit2Vdi = tit2Vdi;
    }

    public String getTemEdiMenVdi() {
        return temEdiMenVdi;
    }

    public void setTemEdiMenVdi(String temEdiMenVdi) {
        this.temEdiMenVdi = temEdiMenVdi;
    }

    public Short getDurAnnVdi() {
        return durAnnVdi;
    }

    public void setDurAnnVdi(Short durAnnVdi) {
        this.durAnnVdi = durAnnVdi;
    }

    public Date getDatParEtb() {
        return datParEtb;
    }

    public void setDatParEtb(Date datParEtb) {
        this.datParEtb = datParEtb;
    }

    public String getTemEdSpecSise() {
        return temEdSpecSise;
    }

    public void setTemEdSpecSise(String temEdSpecSise) {
        this.temEdSpecSise = temEdSpecSise;
    }

    public String getLibWebVdi() {
        return libWebVdi;
    }

    public void setLibWebVdi(String libWebVdi) {
        this.libWebVdi = libWebVdi;
    }

    public String getLicVdiArb() {
        return licVdiArb;
    }

    public void setLicVdiArb(String licVdiArb) {
        this.licVdiArb = licVdiArb;
    }

    public String getIt1VdiArb() {
        return it1VdiArb;
    }

    public void setIt1VdiArb(String it1VdiArb) {
        this.it1VdiArb = it1VdiArb;
    }

    public String getIt2VdiArb() {
        return it2VdiArb;
    }

    public void setIt2VdiArb(String it2VdiArb) {
        this.it2VdiArb = it2VdiArb;
    }

    public String getIt3VdiArb() {
        return it3VdiArb;
    }

    public void setIt3VdiArb(String it3VdiArb) {
        this.it3VdiArb = it3VdiArb;
    }

    public String getTit1VdiArb() {
        return tit1VdiArb;
    }

    public void setTit1VdiArb(String tit1VdiArb) {
        this.tit1VdiArb = tit1VdiArb;
    }

    public String getTit2VdiArb() {
        return tit2VdiArb;
    }

    public void setTit2VdiArb(String tit2VdiArb) {
        this.tit2VdiArb = tit2VdiArb;
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

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public Composante getCodCmp() {
        return codCmp;
    }

    public void setCodCmp(Composante codCmp) {
        this.codCmp = codCmp;
    }

    public TypResultat getCodTrePos() {
        return codTrePos;
    }

    public void setCodTrePos(TypResultat codTrePos) {
        this.codTrePos = codTrePos;
    }

    public ConfigMention getCodCfm() {
        return codCfm;
    }

    public void setCodCfm(ConfigMention codCfm) {
        this.codCfm = codCfm;
    }

    public DiplomeSise getCodSisVdi() {
        return codSisVdi;
    }

    public void setCodSisVdi(DiplomeSise codSisVdi) {
        this.codSisVdi = codSisVdi;
    }

    public PeriodeAno getCodPan1() {
        return codPan1;
    }

    public void setCodPan1(PeriodeAno codPan1) {
        this.codPan1 = codPan1;
    }

    public PeriodeAno getCodPan2() {
        return codPan2;
    }

    public void setCodPan2(PeriodeAno codPan2) {
        this.codPan2 = codPan2;
    }

    public TypResultat getCodTreNeg() {
        return codTreNeg;
    }

    public void setCodTreNeg(TypResultat codTreNeg) {
        this.codTreNeg = codTreNeg;
    }

    public PeriodeAno getCodPan3() {
        return codPan3;
    }

    public void setCodPan3(PeriodeAno codPan3) {
        this.codPan3 = codPan3;
    }

    public PeriodeAno getCodPan4() {
        return codPan4;
    }

    public void setCodPan4(PeriodeAno codPan4) {
        this.codPan4 = codPan4;
    }

    public PrefixeInt getCodPrf1() {
        return codPrf1;
    }

    public void setCodPrf1(PrefixeInt codPrf1) {
        this.codPrf1 = codPrf1;
    }

    public PrefixeInt getCodPrf2() {
        return codPrf2;
    }

    public void setCodPrf2(PrefixeInt codPrf2) {
        this.codPrf2 = codPrf2;
    }

    public PrefixeInt getCodPrf3() {
        return codPrf3;
    }

    public void setCodPrf3(PrefixeInt codPrf3) {
        this.codPrf3 = codPrf3;
    }

    public VersionModeleDip getVersionModeleDip() {
        return versionModeleDip;
    }

    public void setVersionModeleDip(VersionModeleDip versionModeleDip) {
        this.versionModeleDip = versionModeleDip;
    }

    @XmlTransient
    public List<SpeCaracteriseVdi> getSpeCaracteriseVdiList() {
        return speCaracteriseVdiList;
    }

    public void setSpeCaracteriseVdiList(List<SpeCaracteriseVdi> speCaracteriseVdiList) {
        this.speCaracteriseVdiList = speCaracteriseVdiList;
    }

    @XmlTransient
    public List<InsAdmEtp> getInsAdmEtpList() {
        return insAdmEtpList;
    }

    public void setInsAdmEtpList(List<InsAdmEtp> insAdmEtpList) {
        this.insAdmEtpList = insAdmEtpList;
    }

    @XmlTransient
    public List<InsAdmEtp> getInsAdmEtpList1() {
        return insAdmEtpList1;
    }

    public void setInsAdmEtpList1(List<InsAdmEtp> insAdmEtpList1) {
        this.insAdmEtpList1 = insAdmEtpList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (versionDiplomePK != null ? versionDiplomePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionDiplome)) {
            return false;
        }
        VersionDiplome other = (VersionDiplome) object;
        if ((this.versionDiplomePK == null && other.versionDiplomePK != null) || (this.versionDiplomePK != null && !this.versionDiplomePK.equals(other.versionDiplomePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.VersionDiplome[ versionDiplomePK=" + versionDiplomePK + " ]";
    }
    
}
