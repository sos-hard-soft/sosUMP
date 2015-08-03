/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "ELEMENT_PEDAGOGI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ElementPedagogi.findAll", query = "SELECT e FROM ElementPedagogi e"),
    @NamedQuery(name = "ElementPedagogi.findByCodElp", query = "SELECT e FROM ElementPedagogi e WHERE e.codElp = :codElp"),
    @NamedQuery(name = "ElementPedagogi.findByLibElp", query = "SELECT e FROM ElementPedagogi e WHERE e.libElp = :libElp"),
    @NamedQuery(name = "ElementPedagogi.findByLicElp", query = "SELECT e FROM ElementPedagogi e WHERE e.licElp = :licElp"),
    @NamedQuery(name = "ElementPedagogi.findByLibCmtElp", query = "SELECT e FROM ElementPedagogi e WHERE e.libCmtElp = :libCmtElp"),
    @NamedQuery(name = "ElementPedagogi.findByDatCreElp", query = "SELECT e FROM ElementPedagogi e WHERE e.datCreElp = :datCreElp"),
    @NamedQuery(name = "ElementPedagogi.findByDatModElp", query = "SELECT e FROM ElementPedagogi e WHERE e.datModElp = :datModElp"),
    @NamedQuery(name = "ElementPedagogi.findByNbrVolElp", query = "SELECT e FROM ElementPedagogi e WHERE e.nbrVolElp = :nbrVolElp"),
    @NamedQuery(name = "ElementPedagogi.findByCodVolElp", query = "SELECT e FROM ElementPedagogi e WHERE e.codVolElp = :codVolElp"),
    @NamedQuery(name = "ElementPedagogi.findByEtaElp", query = "SELECT e FROM ElementPedagogi e WHERE e.etaElp = :etaElp"),
    @NamedQuery(name = "ElementPedagogi.findByLibLieElp", query = "SELECT e FROM ElementPedagogi e WHERE e.libLieElp = :libLieElp"),
    @NamedQuery(name = "ElementPedagogi.findByLibNomRspElp", query = "SELECT e FROM ElementPedagogi e WHERE e.libNomRspElp = :libNomRspElp"),
    @NamedQuery(name = "ElementPedagogi.findByDatDebOpeIpe", query = "SELECT e FROM ElementPedagogi e WHERE e.datDebOpeIpe = :datDebOpeIpe"),
    @NamedQuery(name = "ElementPedagogi.findByDatFinOpeIpe", query = "SELECT e FROM ElementPedagogi e WHERE e.datFinOpeIpe = :datFinOpeIpe"),
    @NamedQuery(name = "ElementPedagogi.findByNbrAdmElp", query = "SELECT e FROM ElementPedagogi e WHERE e.nbrAdmElp = :nbrAdmElp"),
    @NamedQuery(name = "ElementPedagogi.findByNbrAdmFra", query = "SELECT e FROM ElementPedagogi e WHERE e.nbrAdmFra = :nbrAdmFra"),
    @NamedQuery(name = "ElementPedagogi.findByNbrAdmEtr", query = "SELECT e FROM ElementPedagogi e WHERE e.nbrAdmEtr = :nbrAdmEtr"),
    @NamedQuery(name = "ElementPedagogi.findByNbrPntEctElp", query = "SELECT e FROM ElementPedagogi e WHERE e.nbrPntEctElp = :nbrPntEctElp"),
    @NamedQuery(name = "ElementPedagogi.findByNotObtElpNum", query = "SELECT e FROM ElementPedagogi e WHERE e.notObtElpNum = :notObtElpNum"),
    @NamedQuery(name = "ElementPedagogi.findByNotObtElpDen", query = "SELECT e FROM ElementPedagogi e WHERE e.notObtElpDen = :notObtElpDen"),
    @NamedQuery(name = "ElementPedagogi.findByNotMinRptElpNum", query = "SELECT e FROM ElementPedagogi e WHERE e.notMinRptElpNum = :notMinRptElpNum"),
    @NamedQuery(name = "ElementPedagogi.findByNotMinRptElpDen", query = "SELECT e FROM ElementPedagogi e WHERE e.notMinRptElpDen = :notMinRptElpDen"),
    @NamedQuery(name = "ElementPedagogi.findByNotMinAdmNum", query = "SELECT e FROM ElementPedagogi e WHERE e.notMinAdmNum = :notMinAdmNum"),
    @NamedQuery(name = "ElementPedagogi.findByNotMinAdmDen", query = "SELECT e FROM ElementPedagogi e WHERE e.notMinAdmDen = :notMinAdmDen"),
    @NamedQuery(name = "ElementPedagogi.findByNotMaxAdmNum", query = "SELECT e FROM ElementPedagogi e WHERE e.notMaxAdmNum = :notMaxAdmNum"),
    @NamedQuery(name = "ElementPedagogi.findByNotMaxAdmDen", query = "SELECT e FROM ElementPedagogi e WHERE e.notMaxAdmDen = :notMaxAdmDen"),
    @NamedQuery(name = "ElementPedagogi.findByTemElpCap", query = "SELECT e FROM ElementPedagogi e WHERE e.temElpCap = :temElpCap"),
    @NamedQuery(name = "ElementPedagogi.findByTemReiIpeAcq", query = "SELECT e FROM ElementPedagogi e WHERE e.temReiIpeAcq = :temReiIpeAcq"),
    @NamedQuery(name = "ElementPedagogi.findByTemSusElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temSusElp = :temSusElp"),
    @NamedQuery(name = "ElementPedagogi.findByLibSusElp", query = "SELECT e FROM ElementPedagogi e WHERE e.libSusElp = :libSusElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemRelPosSyt", query = "SELECT e FROM ElementPedagogi e WHERE e.temRelPosSyt = :temRelPosSyt"),
    @NamedQuery(name = "ElementPedagogi.findByTemScaElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temScaElp = :temScaElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemElpPrmNiv", query = "SELECT e FROM ElementPedagogi e WHERE e.temElpPrmNiv = :temElpPrmNiv"),
    @NamedQuery(name = "ElementPedagogi.findByTemNotElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temNotElp = :temNotElp"),
    @NamedQuery(name = "ElementPedagogi.findByBarSaiElp", query = "SELECT e FROM ElementPedagogi e WHERE e.barSaiElp = :barSaiElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemPntJurElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temPntJurElp = :temPntJurElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemMndElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temMndElp = :temMndElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemResElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temResElp = :temResElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemJurElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temJurElp = :temJurElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemCtlValCadElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temCtlValCadElp = :temCtlValCadElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemAnlRptElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temAnlRptElp = :temAnlRptElp"),
    @NamedQuery(name = "ElementPedagogi.findByNotMinRptElp", query = "SELECT e FROM ElementPedagogi e WHERE e.notMinRptElp = :notMinRptElp"),
    @NamedQuery(name = "ElementPedagogi.findByBarMinRptElp", query = "SELECT e FROM ElementPedagogi e WHERE e.barMinRptElp = :barMinRptElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemConElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temConElp = :temConElp"),
    @NamedQuery(name = "ElementPedagogi.findByDurConElp", query = "SELECT e FROM ElementPedagogi e WHERE e.durConElp = :durConElp"),
    @NamedQuery(name = "ElementPedagogi.findByNotMinConElp", query = "SELECT e FROM ElementPedagogi e WHERE e.notMinConElp = :notMinConElp"),
    @NamedQuery(name = "ElementPedagogi.findByBarMinConElp", query = "SELECT e FROM ElementPedagogi e WHERE e.barMinConElp = :barMinConElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemCapElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temCapElp = :temCapElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemSesUni", query = "SELECT e FROM ElementPedagogi e WHERE e.temSesUni = :temSesUni"),
    @NamedQuery(name = "ElementPedagogi.findByTemAdi", query = "SELECT e FROM ElementPedagogi e WHERE e.temAdi = :temAdi"),
    @NamedQuery(name = "ElementPedagogi.findByTemAdo", query = "SELECT e FROM ElementPedagogi e WHERE e.temAdo = :temAdo"),
    @NamedQuery(name = "ElementPedagogi.findByTemHeuEnsElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temHeuEnsElp = :temHeuEnsElp"),
    @NamedQuery(name = "ElementPedagogi.findByNbrEffPrvElp", query = "SELECT e FROM ElementPedagogi e WHERE e.nbrEffPrvElp = :nbrEffPrvElp"),
    @NamedQuery(name = "ElementPedagogi.findByNbrHeuCmElp", query = "SELECT e FROM ElementPedagogi e WHERE e.nbrHeuCmElp = :nbrHeuCmElp"),
    @NamedQuery(name = "ElementPedagogi.findByNbrHeuTdElp", query = "SELECT e FROM ElementPedagogi e WHERE e.nbrHeuTdElp = :nbrHeuTdElp"),
    @NamedQuery(name = "ElementPedagogi.findByNbrHeuTpElp", query = "SELECT e FROM ElementPedagogi e WHERE e.nbrHeuTpElp = :nbrHeuTpElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemMccElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temMccElp = :temMccElp"),
    @NamedQuery(name = "ElementPedagogi.findByTemRptDscElp", query = "SELECT e FROM ElementPedagogi e WHERE e.temRptDscElp = :temRptDscElp"),
    @NamedQuery(name = "ElementPedagogi.findByLibElpArb", query = "SELECT e FROM ElementPedagogi e WHERE e.libElpArb = :libElpArb"),
    @NamedQuery(name = "ElementPedagogi.findByLicElpArb", query = "SELECT e FROM ElementPedagogi e WHERE e.licElpArb = :licElpArb")})
public class ElementPedagogi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_ELP")
    private String codElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_ELP")
    private String libElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIC_ELP")
    private String licElp;
    @Size(max = 2000)
    @Column(name = "LIB_CMT_ELP")
    private String libCmtElp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAT_CRE_ELP")
    @Temporal(TemporalType.DATE)
    private Date datCreElp;
    @Column(name = "DAT_MOD_ELP")
    @Temporal(TemporalType.DATE)
    private Date datModElp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NBR_VOL_ELP")
    private BigDecimal nbrVolElp;
    @Size(max = 2)
    @Column(name = "COD_VOL_ELP")
    private String codVolElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_ELP")
    private String etaElp;
    @Size(max = 40)
    @Column(name = "LIB_LIE_ELP")
    private String libLieElp;
    @Size(max = 40)
    @Column(name = "LIB_NOM_RSP_ELP")
    private String libNomRspElp;
    @Column(name = "DAT_DEB_OPE_IPE")
    @Temporal(TemporalType.DATE)
    private Date datDebOpeIpe;
    @Column(name = "DAT_FIN_OPE_IPE")
    @Temporal(TemporalType.DATE)
    private Date datFinOpeIpe;
    @Column(name = "NBR_ADM_ELP")
    private Short nbrAdmElp;
    @Column(name = "NBR_ADM_FRA")
    private Short nbrAdmFra;
    @Column(name = "NBR_ADM_ETR")
    private Short nbrAdmEtr;
    @Column(name = "NBR_PNT_ECT_ELP")
    private BigDecimal nbrPntEctElp;
    @Column(name = "NOT_OBT_ELP_NUM")
    private BigDecimal notObtElpNum;
    @Column(name = "NOT_OBT_ELP_DEN")
    private BigDecimal notObtElpDen;
    @Column(name = "NOT_MIN_RPT_ELP_NUM")
    private BigDecimal notMinRptElpNum;
    @Column(name = "NOT_MIN_RPT_ELP_DEN")
    private BigDecimal notMinRptElpDen;
    @Column(name = "NOT_MIN_ADM_NUM")
    private BigDecimal notMinAdmNum;
    @Column(name = "NOT_MIN_ADM_DEN")
    private BigDecimal notMinAdmDen;
    @Column(name = "NOT_MAX_ADM_NUM")
    private BigDecimal notMaxAdmNum;
    @Column(name = "NOT_MAX_ADM_DEN")
    private BigDecimal notMaxAdmDen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ELP_CAP")
    private String temElpCap;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_REI_IPE_ACQ")
    private String temReiIpeAcq;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SUS_ELP")
    private String temSusElp;
    @Size(max = 40)
    @Column(name = "LIB_SUS_ELP")
    private String libSusElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_REL_POS_SYT")
    private String temRelPosSyt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SCA_ELP")
    private String temScaElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ELP_PRM_NIV")
    private String temElpPrmNiv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NOT_ELP")
    private String temNotElp;
    @Column(name = "BAR_SAI_ELP")
    private Integer barSaiElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PNT_JUR_ELP")
    private String temPntJurElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_MND_ELP")
    private String temMndElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RES_ELP")
    private String temResElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_JUR_ELP")
    private String temJurElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CTL_VAL_CAD_ELP")
    private String temCtlValCadElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ANL_RPT_ELP")
    private String temAnlRptElp;
    @Column(name = "NOT_MIN_RPT_ELP")
    private BigDecimal notMinRptElp;
    @Column(name = "BAR_MIN_RPT_ELP")
    private Integer barMinRptElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CON_ELP")
    private String temConElp;
    @Column(name = "DUR_CON_ELP")
    private Short durConElp;
    @Column(name = "NOT_MIN_CON_ELP")
    private BigDecimal notMinConElp;
    @Column(name = "BAR_MIN_CON_ELP")
    private Integer barMinConElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CAP_ELP")
    private String temCapElp;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_HEU_ENS_ELP")
    private String temHeuEnsElp;
    @Column(name = "NBR_EFF_PRV_ELP")
    private Integer nbrEffPrvElp;
    @Column(name = "NBR_HEU_CM_ELP")
    private Short nbrHeuCmElp;
    @Column(name = "NBR_HEU_TD_ELP")
    private Short nbrHeuTdElp;
    @Column(name = "NBR_HEU_TP_ELP")
    private Short nbrHeuTpElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_MCC_ELP")
    private String temMccElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RPT_DSC_ELP")
    private String temRptDscElp;
    @Size(max = 60)
    @Column(name = "LIB_ELP_ARB")
    private String libElpArb;
    @Size(max = 25)
    @Column(name = "LIC_ELP_ARB")
    private String licElpArb;
    @JoinTable(name = "ELP_PERMET_ACC_ELP", joinColumns = {
        @JoinColumn(name = "COD_ELP_SUP", referencedColumnName = "COD_ELP")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_ELP_INF", referencedColumnName = "COD_ELP")})
    @ManyToMany
    private List<ElementPedagogi> elementPedagogiList;
    @ManyToMany(mappedBy = "elementPedagogiList")
    private List<ElementPedagogi> elementPedagogiList1;
    @ManyToMany(mappedBy = "elementPedagogiList")
    private List<Composante> composanteList;
    @ManyToMany(mappedBy = "elementPedagogiList")
    private List<CentreInsPed> centreInsPedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "elementPedagogi")
    private List<LseRegroupeElp> lseRegroupeElpList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "elementPedagogi")
    private List<ElpAutFex> elpAutFexList;
    @JoinColumn(name = "COD_CMP", referencedColumnName = "COD_CMP")
    @ManyToOne(optional = false)
    private Composante codCmp;
    @JoinColumn(name = "COD_CFM", referencedColumnName = "COD_CFM")
    @ManyToOne
    private ConfigMention codCfm;
    @JoinColumn(name = "COD_NEL", referencedColumnName = "COD_NEL")
    @ManyToOne(optional = false)
    private NatureElp codNel;
    @JoinColumn(name = "COD_PAN_1", referencedColumnName = "COD_PAN")
    @ManyToOne
    private PeriodeAno codPan1;
    @JoinColumn(name = "COD_PAN_2", referencedColumnName = "COD_PAN")
    @ManyToOne
    private PeriodeAno codPan2;
    @JoinColumn(name = "COD_PAN_3", referencedColumnName = "COD_PAN")
    @ManyToOne
    private PeriodeAno codPan3;
    @JoinColumn(name = "COD_PAN_4", referencedColumnName = "COD_PAN")
    @ManyToOne
    private PeriodeAno codPan4;
    @JoinColumn(name = "COD_PEL", referencedColumnName = "COD_PEL")
    @ManyToOne
    private PeriodeElp codPel;
    @JoinColumn(name = "COD_SCC", referencedColumnName = "COD_SCC")
    @ManyToOne
    private SectionCnu codScc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "elementPedagogi")
    private List<ElpRegroupeLse> elpRegroupeLseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codElpCibleLcc")
    private List<ElpCorrespondElp> elpCorrespondElpList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codElpS1Lcc")
    private List<ElpCorrespondElp> elpCorrespondElpList1;
    @OneToMany(mappedBy = "codElpS2Lcc")
    private List<ElpCorrespondElp> elpCorrespondElpList2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "elementPedagogi")
    private List<GrpResultatElp> grpResultatElpList;

    public ElementPedagogi() {
    }

    public ElementPedagogi(String codElp) {
        this.codElp = codElp;
    }

    public ElementPedagogi(String codElp, String libElp, String licElp, Date datCreElp, String etaElp, String temElpCap, String temReiIpeAcq, String temSusElp, String temRelPosSyt, String temScaElp, String temElpPrmNiv, String temNotElp, String temPntJurElp, String temMndElp, String temResElp, String temJurElp, String temCtlValCadElp, String temAnlRptElp, String temConElp, String temCapElp, String temSesUni, String temAdi, String temAdo, String temHeuEnsElp, String temMccElp, String temRptDscElp) {
        this.codElp = codElp;
        this.libElp = libElp;
        this.licElp = licElp;
        this.datCreElp = datCreElp;
        this.etaElp = etaElp;
        this.temElpCap = temElpCap;
        this.temReiIpeAcq = temReiIpeAcq;
        this.temSusElp = temSusElp;
        this.temRelPosSyt = temRelPosSyt;
        this.temScaElp = temScaElp;
        this.temElpPrmNiv = temElpPrmNiv;
        this.temNotElp = temNotElp;
        this.temPntJurElp = temPntJurElp;
        this.temMndElp = temMndElp;
        this.temResElp = temResElp;
        this.temJurElp = temJurElp;
        this.temCtlValCadElp = temCtlValCadElp;
        this.temAnlRptElp = temAnlRptElp;
        this.temConElp = temConElp;
        this.temCapElp = temCapElp;
        this.temSesUni = temSesUni;
        this.temAdi = temAdi;
        this.temAdo = temAdo;
        this.temHeuEnsElp = temHeuEnsElp;
        this.temMccElp = temMccElp;
        this.temRptDscElp = temRptDscElp;
    }

    public String getCodElp() {
        return codElp;
    }

    public void setCodElp(String codElp) {
        this.codElp = codElp;
    }

    public String getLibElp() {
        return libElp;
    }

    public void setLibElp(String libElp) {
        this.libElp = libElp;
    }

    public String getLicElp() {
        return licElp;
    }

    public void setLicElp(String licElp) {
        this.licElp = licElp;
    }

    public String getLibCmtElp() {
        return libCmtElp;
    }

    public void setLibCmtElp(String libCmtElp) {
        this.libCmtElp = libCmtElp;
    }

    public Date getDatCreElp() {
        return datCreElp;
    }

    public void setDatCreElp(Date datCreElp) {
        this.datCreElp = datCreElp;
    }

    public Date getDatModElp() {
        return datModElp;
    }

    public void setDatModElp(Date datModElp) {
        this.datModElp = datModElp;
    }

    public BigDecimal getNbrVolElp() {
        return nbrVolElp;
    }

    public void setNbrVolElp(BigDecimal nbrVolElp) {
        this.nbrVolElp = nbrVolElp;
    }

    public String getCodVolElp() {
        return codVolElp;
    }

    public void setCodVolElp(String codVolElp) {
        this.codVolElp = codVolElp;
    }

    public String getEtaElp() {
        return etaElp;
    }

    public void setEtaElp(String etaElp) {
        this.etaElp = etaElp;
    }

    public String getLibLieElp() {
        return libLieElp;
    }

    public void setLibLieElp(String libLieElp) {
        this.libLieElp = libLieElp;
    }

    public String getLibNomRspElp() {
        return libNomRspElp;
    }

    public void setLibNomRspElp(String libNomRspElp) {
        this.libNomRspElp = libNomRspElp;
    }

    public Date getDatDebOpeIpe() {
        return datDebOpeIpe;
    }

    public void setDatDebOpeIpe(Date datDebOpeIpe) {
        this.datDebOpeIpe = datDebOpeIpe;
    }

    public Date getDatFinOpeIpe() {
        return datFinOpeIpe;
    }

    public void setDatFinOpeIpe(Date datFinOpeIpe) {
        this.datFinOpeIpe = datFinOpeIpe;
    }

    public Short getNbrAdmElp() {
        return nbrAdmElp;
    }

    public void setNbrAdmElp(Short nbrAdmElp) {
        this.nbrAdmElp = nbrAdmElp;
    }

    public Short getNbrAdmFra() {
        return nbrAdmFra;
    }

    public void setNbrAdmFra(Short nbrAdmFra) {
        this.nbrAdmFra = nbrAdmFra;
    }

    public Short getNbrAdmEtr() {
        return nbrAdmEtr;
    }

    public void setNbrAdmEtr(Short nbrAdmEtr) {
        this.nbrAdmEtr = nbrAdmEtr;
    }

    public BigDecimal getNbrPntEctElp() {
        return nbrPntEctElp;
    }

    public void setNbrPntEctElp(BigDecimal nbrPntEctElp) {
        this.nbrPntEctElp = nbrPntEctElp;
    }

    public BigDecimal getNotObtElpNum() {
        return notObtElpNum;
    }

    public void setNotObtElpNum(BigDecimal notObtElpNum) {
        this.notObtElpNum = notObtElpNum;
    }

    public BigDecimal getNotObtElpDen() {
        return notObtElpDen;
    }

    public void setNotObtElpDen(BigDecimal notObtElpDen) {
        this.notObtElpDen = notObtElpDen;
    }

    public BigDecimal getNotMinRptElpNum() {
        return notMinRptElpNum;
    }

    public void setNotMinRptElpNum(BigDecimal notMinRptElpNum) {
        this.notMinRptElpNum = notMinRptElpNum;
    }

    public BigDecimal getNotMinRptElpDen() {
        return notMinRptElpDen;
    }

    public void setNotMinRptElpDen(BigDecimal notMinRptElpDen) {
        this.notMinRptElpDen = notMinRptElpDen;
    }

    public BigDecimal getNotMinAdmNum() {
        return notMinAdmNum;
    }

    public void setNotMinAdmNum(BigDecimal notMinAdmNum) {
        this.notMinAdmNum = notMinAdmNum;
    }

    public BigDecimal getNotMinAdmDen() {
        return notMinAdmDen;
    }

    public void setNotMinAdmDen(BigDecimal notMinAdmDen) {
        this.notMinAdmDen = notMinAdmDen;
    }

    public BigDecimal getNotMaxAdmNum() {
        return notMaxAdmNum;
    }

    public void setNotMaxAdmNum(BigDecimal notMaxAdmNum) {
        this.notMaxAdmNum = notMaxAdmNum;
    }

    public BigDecimal getNotMaxAdmDen() {
        return notMaxAdmDen;
    }

    public void setNotMaxAdmDen(BigDecimal notMaxAdmDen) {
        this.notMaxAdmDen = notMaxAdmDen;
    }

    public String getTemElpCap() {
        return temElpCap;
    }

    public void setTemElpCap(String temElpCap) {
        this.temElpCap = temElpCap;
    }

    public String getTemReiIpeAcq() {
        return temReiIpeAcq;
    }

    public void setTemReiIpeAcq(String temReiIpeAcq) {
        this.temReiIpeAcq = temReiIpeAcq;
    }

    public String getTemSusElp() {
        return temSusElp;
    }

    public void setTemSusElp(String temSusElp) {
        this.temSusElp = temSusElp;
    }

    public String getLibSusElp() {
        return libSusElp;
    }

    public void setLibSusElp(String libSusElp) {
        this.libSusElp = libSusElp;
    }

    public String getTemRelPosSyt() {
        return temRelPosSyt;
    }

    public void setTemRelPosSyt(String temRelPosSyt) {
        this.temRelPosSyt = temRelPosSyt;
    }

    public String getTemScaElp() {
        return temScaElp;
    }

    public void setTemScaElp(String temScaElp) {
        this.temScaElp = temScaElp;
    }

    public String getTemElpPrmNiv() {
        return temElpPrmNiv;
    }

    public void setTemElpPrmNiv(String temElpPrmNiv) {
        this.temElpPrmNiv = temElpPrmNiv;
    }

    public String getTemNotElp() {
        return temNotElp;
    }

    public void setTemNotElp(String temNotElp) {
        this.temNotElp = temNotElp;
    }

    public Integer getBarSaiElp() {
        return barSaiElp;
    }

    public void setBarSaiElp(Integer barSaiElp) {
        this.barSaiElp = barSaiElp;
    }

    public String getTemPntJurElp() {
        return temPntJurElp;
    }

    public void setTemPntJurElp(String temPntJurElp) {
        this.temPntJurElp = temPntJurElp;
    }

    public String getTemMndElp() {
        return temMndElp;
    }

    public void setTemMndElp(String temMndElp) {
        this.temMndElp = temMndElp;
    }

    public String getTemResElp() {
        return temResElp;
    }

    public void setTemResElp(String temResElp) {
        this.temResElp = temResElp;
    }

    public String getTemJurElp() {
        return temJurElp;
    }

    public void setTemJurElp(String temJurElp) {
        this.temJurElp = temJurElp;
    }

    public String getTemCtlValCadElp() {
        return temCtlValCadElp;
    }

    public void setTemCtlValCadElp(String temCtlValCadElp) {
        this.temCtlValCadElp = temCtlValCadElp;
    }

    public String getTemAnlRptElp() {
        return temAnlRptElp;
    }

    public void setTemAnlRptElp(String temAnlRptElp) {
        this.temAnlRptElp = temAnlRptElp;
    }

    public BigDecimal getNotMinRptElp() {
        return notMinRptElp;
    }

    public void setNotMinRptElp(BigDecimal notMinRptElp) {
        this.notMinRptElp = notMinRptElp;
    }

    public Integer getBarMinRptElp() {
        return barMinRptElp;
    }

    public void setBarMinRptElp(Integer barMinRptElp) {
        this.barMinRptElp = barMinRptElp;
    }

    public String getTemConElp() {
        return temConElp;
    }

    public void setTemConElp(String temConElp) {
        this.temConElp = temConElp;
    }

    public Short getDurConElp() {
        return durConElp;
    }

    public void setDurConElp(Short durConElp) {
        this.durConElp = durConElp;
    }

    public BigDecimal getNotMinConElp() {
        return notMinConElp;
    }

    public void setNotMinConElp(BigDecimal notMinConElp) {
        this.notMinConElp = notMinConElp;
    }

    public Integer getBarMinConElp() {
        return barMinConElp;
    }

    public void setBarMinConElp(Integer barMinConElp) {
        this.barMinConElp = barMinConElp;
    }

    public String getTemCapElp() {
        return temCapElp;
    }

    public void setTemCapElp(String temCapElp) {
        this.temCapElp = temCapElp;
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

    public String getTemHeuEnsElp() {
        return temHeuEnsElp;
    }

    public void setTemHeuEnsElp(String temHeuEnsElp) {
        this.temHeuEnsElp = temHeuEnsElp;
    }

    public Integer getNbrEffPrvElp() {
        return nbrEffPrvElp;
    }

    public void setNbrEffPrvElp(Integer nbrEffPrvElp) {
        this.nbrEffPrvElp = nbrEffPrvElp;
    }

    public Short getNbrHeuCmElp() {
        return nbrHeuCmElp;
    }

    public void setNbrHeuCmElp(Short nbrHeuCmElp) {
        this.nbrHeuCmElp = nbrHeuCmElp;
    }

    public Short getNbrHeuTdElp() {
        return nbrHeuTdElp;
    }

    public void setNbrHeuTdElp(Short nbrHeuTdElp) {
        this.nbrHeuTdElp = nbrHeuTdElp;
    }

    public Short getNbrHeuTpElp() {
        return nbrHeuTpElp;
    }

    public void setNbrHeuTpElp(Short nbrHeuTpElp) {
        this.nbrHeuTpElp = nbrHeuTpElp;
    }

    public String getTemMccElp() {
        return temMccElp;
    }

    public void setTemMccElp(String temMccElp) {
        this.temMccElp = temMccElp;
    }

    public String getTemRptDscElp() {
        return temRptDscElp;
    }

    public void setTemRptDscElp(String temRptDscElp) {
        this.temRptDscElp = temRptDscElp;
    }

    public String getLibElpArb() {
        return libElpArb;
    }

    public void setLibElpArb(String libElpArb) {
        this.libElpArb = libElpArb;
    }

    public String getLicElpArb() {
        return licElpArb;
    }

    public void setLicElpArb(String licElpArb) {
        this.licElpArb = licElpArb;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList() {
        return elementPedagogiList;
    }

    public void setElementPedagogiList(List<ElementPedagogi> elementPedagogiList) {
        this.elementPedagogiList = elementPedagogiList;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList1() {
        return elementPedagogiList1;
    }

    public void setElementPedagogiList1(List<ElementPedagogi> elementPedagogiList1) {
        this.elementPedagogiList1 = elementPedagogiList1;
    }

    @XmlTransient
    public List<Composante> getComposanteList() {
        return composanteList;
    }

    public void setComposanteList(List<Composante> composanteList) {
        this.composanteList = composanteList;
    }

    @XmlTransient
    public List<CentreInsPed> getCentreInsPedList() {
        return centreInsPedList;
    }

    public void setCentreInsPedList(List<CentreInsPed> centreInsPedList) {
        this.centreInsPedList = centreInsPedList;
    }

    @XmlTransient
    public List<LseRegroupeElp> getLseRegroupeElpList() {
        return lseRegroupeElpList;
    }

    public void setLseRegroupeElpList(List<LseRegroupeElp> lseRegroupeElpList) {
        this.lseRegroupeElpList = lseRegroupeElpList;
    }

    @XmlTransient
    public List<ElpAutFex> getElpAutFexList() {
        return elpAutFexList;
    }

    public void setElpAutFexList(List<ElpAutFex> elpAutFexList) {
        this.elpAutFexList = elpAutFexList;
    }

    public Composante getCodCmp() {
        return codCmp;
    }

    public void setCodCmp(Composante codCmp) {
        this.codCmp = codCmp;
    }

    public ConfigMention getCodCfm() {
        return codCfm;
    }

    public void setCodCfm(ConfigMention codCfm) {
        this.codCfm = codCfm;
    }

    public NatureElp getCodNel() {
        return codNel;
    }

    public void setCodNel(NatureElp codNel) {
        this.codNel = codNel;
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

    public PeriodeElp getCodPel() {
        return codPel;
    }

    public void setCodPel(PeriodeElp codPel) {
        this.codPel = codPel;
    }

    public SectionCnu getCodScc() {
        return codScc;
    }

    public void setCodScc(SectionCnu codScc) {
        this.codScc = codScc;
    }

    @XmlTransient
    public List<ElpRegroupeLse> getElpRegroupeLseList() {
        return elpRegroupeLseList;
    }

    public void setElpRegroupeLseList(List<ElpRegroupeLse> elpRegroupeLseList) {
        this.elpRegroupeLseList = elpRegroupeLseList;
    }

    @XmlTransient
    public List<ElpCorrespondElp> getElpCorrespondElpList() {
        return elpCorrespondElpList;
    }

    public void setElpCorrespondElpList(List<ElpCorrespondElp> elpCorrespondElpList) {
        this.elpCorrespondElpList = elpCorrespondElpList;
    }

    @XmlTransient
    public List<ElpCorrespondElp> getElpCorrespondElpList1() {
        return elpCorrespondElpList1;
    }

    public void setElpCorrespondElpList1(List<ElpCorrespondElp> elpCorrespondElpList1) {
        this.elpCorrespondElpList1 = elpCorrespondElpList1;
    }

    @XmlTransient
    public List<ElpCorrespondElp> getElpCorrespondElpList2() {
        return elpCorrespondElpList2;
    }

    public void setElpCorrespondElpList2(List<ElpCorrespondElp> elpCorrespondElpList2) {
        this.elpCorrespondElpList2 = elpCorrespondElpList2;
    }

    @XmlTransient
    public List<GrpResultatElp> getGrpResultatElpList() {
        return grpResultatElpList;
    }

    public void setGrpResultatElpList(List<GrpResultatElp> grpResultatElpList) {
        this.grpResultatElpList = grpResultatElpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codElp != null ? codElp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElementPedagogi)) {
            return false;
        }
        ElementPedagogi other = (ElementPedagogi) object;
        if ((this.codElp == null && other.codElp != null) || (this.codElp != null && !this.codElp.equals(other.codElp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ElementPedagogi[ codElp=" + codElp + " ]";
    }
    
}
