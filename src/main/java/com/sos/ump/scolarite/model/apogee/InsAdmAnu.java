/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "INS_ADM_ANU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InsAdmAnu.findAll", query = "SELECT i FROM InsAdmAnu i"),
    @NamedQuery(name = "InsAdmAnu.findByCodAnu", query = "SELECT i FROM InsAdmAnu i WHERE i.insAdmAnuPK.codAnu = :codAnu"),
    @NamedQuery(name = "InsAdmAnu.findByCodInd", query = "SELECT i FROM InsAdmAnu i WHERE i.insAdmAnuPK.codInd = :codInd"),
    @NamedQuery(name = "InsAdmAnu.findByCodPrlChg", query = "SELECT i FROM InsAdmAnu i WHERE i.codPrlChg = :codPrlChg"),
    @NamedQuery(name = "InsAdmAnu.findByCodTpt", query = "SELECT i FROM InsAdmAnu i WHERE i.codTpt = :codTpt"),
    @NamedQuery(name = "InsAdmAnu.findByTemAflSso", query = "SELECT i FROM InsAdmAnu i WHERE i.temAflSso = :temAflSso"),
    @NamedQuery(name = "InsAdmAnu.findByTemTrmSsoIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.temTrmSsoIaa = :temTrmSsoIaa"),
    @NamedQuery(name = "InsAdmAnu.findByNumBrdTrmSsoIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.numBrdTrmSsoIaa = :numBrdTrmSsoIaa"),
    @NamedQuery(name = "InsAdmAnu.findByDatPmtCotSso", query = "SELECT i FROM InsAdmAnu i WHERE i.datPmtCotSso = :datPmtCotSso"),
    @NamedQuery(name = "InsAdmAnu.findByDatTrmSso", query = "SELECT i FROM InsAdmAnu i WHERE i.datTrmSso = :datTrmSso"),
    @NamedQuery(name = "InsAdmAnu.findByDatAflSso", query = "SELECT i FROM InsAdmAnu i WHERE i.datAflSso = :datAflSso"),
    @NamedQuery(name = "InsAdmAnu.findByDaaEtbAntIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.daaEtbAntIaa = :daaEtbAntIaa"),
    @NamedQuery(name = "InsAdmAnu.findByEtaEdtCrt", query = "SELECT i FROM InsAdmAnu i WHERE i.etaEdtCrt = :etaEdtCrt"),
    @NamedQuery(name = "InsAdmAnu.findByDatEdtCrt", query = "SELECT i FROM InsAdmAnu i WHERE i.datEdtCrt = :datEdtCrt"),
    @NamedQuery(name = "InsAdmAnu.findByTemDosIaaInc", query = "SELECT i FROM InsAdmAnu i WHERE i.temDosIaaInc = :temDosIaaInc"),
    @NamedQuery(name = "InsAdmAnu.findByLibMtfDosIaaInc", query = "SELECT i FROM InsAdmAnu i WHERE i.libMtfDosIaaInc = :libMtfDosIaaInc"),
    @NamedQuery(name = "InsAdmAnu.findByDatCreIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.datCreIaa = :datCreIaa"),
    @NamedQuery(name = "InsAdmAnu.findByDatModIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.datModIaa = :datModIaa"),
    @NamedQuery(name = "InsAdmAnu.findByEtaIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.etaIaa = :etaIaa"),
    @NamedQuery(name = "InsAdmAnu.findByTemEtbIaa1", query = "SELECT i FROM InsAdmAnu i WHERE i.temEtbIaa1 = :temEtbIaa1"),
    @NamedQuery(name = "InsAdmAnu.findByTemEtbIaa2", query = "SELECT i FROM InsAdmAnu i WHERE i.temEtbIaa2 = :temEtbIaa2"),
    @NamedQuery(name = "InsAdmAnu.findByTemBrsIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.temBrsIaa = :temBrsIaa"),
    @NamedQuery(name = "InsAdmAnu.findByTemRgmAmgEtuIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.temRgmAmgEtuIaa = :temRgmAmgEtuIaa"),
    @NamedQuery(name = "InsAdmAnu.findByCodPcsMere", query = "SELECT i FROM InsAdmAnu i WHERE i.codPcsMere = :codPcsMere")})
public class InsAdmAnu implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsAdmAnuPK insAdmAnuPK;
    @Size(max = 1)
    @Column(name = "COD_PRL_CHG")
    private String codPrlChg;
    @Size(max = 1)
    @Column(name = "COD_TPT")
    private String codTpt;
    @Size(max = 1)
    @Column(name = "TEM_AFL_SSO")
    private String temAflSso;
    @Size(max = 1)
    @Column(name = "TEM_TRM_SSO_IAA")
    private String temTrmSsoIaa;
    @Column(name = "NUM_BRD_TRM_SSO_IAA")
    private Short numBrdTrmSsoIaa;
    @Column(name = "DAT_PMT_COT_SSO")
    @Temporal(TemporalType.DATE)
    private Date datPmtCotSso;
    @Column(name = "DAT_TRM_SSO")
    @Temporal(TemporalType.DATE)
    private Date datTrmSso;
    @Column(name = "DAT_AFL_SSO")
    @Temporal(TemporalType.DATE)
    private Date datAflSso;
    @Size(max = 4)
    @Column(name = "DAA_ETB_ANT_IAA")
    private String daaEtbAntIaa;
    @Size(max = 1)
    @Column(name = "ETA_EDT_CRT")
    private String etaEdtCrt;
    @Column(name = "DAT_EDT_CRT")
    @Temporal(TemporalType.DATE)
    private Date datEdtCrt;
    @Size(max = 1)
    @Column(name = "TEM_DOS_IAA_INC")
    private String temDosIaaInc;
    @Size(max = 40)
    @Column(name = "LIB_MTF_DOS_IAA_INC")
    private String libMtfDosIaaInc;
    @Column(name = "DAT_CRE_IAA")
    @Temporal(TemporalType.DATE)
    private Date datCreIaa;
    @Column(name = "DAT_MOD_IAA")
    @Temporal(TemporalType.DATE)
    private Date datModIaa;
    @Size(max = 1)
    @Column(name = "ETA_IAA")
    private String etaIaa;
    @Size(max = 1)
    @Column(name = "TEM_ETB_IAA_1")
    private String temEtbIaa1;
    @Size(max = 1)
    @Column(name = "TEM_ETB_IAA_2")
    private String temEtbIaa2;
    @Size(max = 1)
    @Column(name = "TEM_BRS_IAA")
    private String temBrsIaa;
    @Size(max = 1)
    @Column(name = "TEM_RGM_AMG_ETU_IAA")
    private String temRgmAmgEtuIaa;
    @Size(max = 2)
    @Column(name = "COD_PCS_MERE")
    private String codPcsMere;
    @ManyToMany(mappedBy = "insAdmAnuList")
    private List<Droit> droitList;
    @ManyToMany(mappedBy = "insAdmAnuList")
    private List<AideFinanciere> aideFinanciereList;
    @JoinColumn(name = "COD_CTP", referencedColumnName = "COD_CTP")
    @ManyToOne
    private CentrePayeur codCtp;
    @JoinColumn(name = "COD_AFI", referencedColumnName = "COD_AFI")
    @ManyToOne
    private AideFinanciere codAfi;
    @JoinColumn(name = "COD_PRU", referencedColumnName = "COD_PRU")
    @ManyToOne
    private ProfilEtu codPru;
    @JoinColumn(name = "COD_QTR", referencedColumnName = "COD_QTR")
    @ManyToOne
    private QuotiteTra codQtr;
    @JoinColumn(name = "COD_STU", referencedColumnName = "COD_STU")
    @ManyToOne
    private StatutEtu codStu;
    @JoinColumns({
        @JoinColumn(name = "COD_PRG", referencedColumnName = "COD_PRG"),
        @JoinColumn(name = "TEM_SNS_PRG", referencedColumnName = "TEM_SNS_PRG")})
    @ManyToOne
    private PrgEchange prgEchange;
    @JoinColumn(name = "COD_UTI_MOD", referencedColumnName = "COD_UTI")
    @ManyToOne
    private Utilisateur codUtiMod;
    @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AnneeUni anneeUni;
    @JoinColumn(name = "COD_RSS", referencedColumnName = "COD_RSS")
    @ManyToOne
    private RegimeSso codRss;
    @JoinColumn(name = "COD_ASR", referencedColumnName = "COD_ASR")
    @ManyToOne
    private AssRspCiv codAsr;
    @JoinColumn(name = "COD_PCS_ETUDIANT", referencedColumnName = "COD_PCS")
    @ManyToOne
    private CatSocPfl codPcsEtudiant;
    @JoinColumn(name = "COD_PCS_PARENT", referencedColumnName = "COD_PCS")
    @ManyToOne
    private CatSocPfl codPcsParent;
    @JoinColumn(name = "COD_ETR", referencedColumnName = "COD_ETB")
    @ManyToOne
    private Etablissement codEtr;
    @JoinColumn(name = "COD_RGI", referencedColumnName = "COD_RGI")
    @ManyToOne
    private RegimeIns codRgi;
    @JoinColumn(name = "COD_TDS_ANN_PRE", referencedColumnName = "COD_TDS")
    @ManyToOne
    private TypDiplomeSise codTdsAnnPre;
    @JoinColumn(name = "COD_MNS", referencedColumnName = "COD_MNS")
    @ManyToOne
    private MtfNonAflSso codMns;
    @JoinColumn(name = "COD_ETB_TPT", referencedColumnName = "COD_ETB")
    @ManyToOne
    private Etablissement codEtbTpt;
    @JoinColumn(name = "COD_TPE_PRL_CHG", referencedColumnName = "COD_TPE")
    @ManyToOne
    private TypEtb codTpePrlChg;
    @JoinColumn(name = "COD_MFS", referencedColumnName = "COD_MFS")
    @ManyToOne
    private MtfAflSso codMfs;
    @JoinColumn(name = "COD_CPA", referencedColumnName = "COD_CPA")
    @ManyToOne
    private Cpam codCpa;
    @JoinColumn(name = "COD_DEP_ANT", referencedColumnName = "COD_DEP")
    @ManyToOne
    private Departement codDepAnt;
    @JoinColumn(name = "COD_TPE_ANT", referencedColumnName = "COD_TPE")
    @ManyToOne
    private TypEtb codTpeAnt;
    @JoinColumn(name = "COD_ETB_ANN_PRE", referencedColumnName = "COD_ETB")
    @ManyToOne
    private Etablissement codEtbAnnPre;
    @JoinColumn(name = "COD_SIS_ANN_PRE", referencedColumnName = "COD_SIS")
    @ManyToOne
    private SituationSise codSisAnnPre;
    @JoinColumn(name = "COD_DEP_ANN_PRE", referencedColumnName = "COD_DEP")
    @ManyToOne
    private Departement codDepAnnPre;
    @JoinColumn(name = "COD_ETB_PRL_CHG", referencedColumnName = "COD_ETB")
    @ManyToOne
    private Etablissement codEtbPrlChg;
    @JoinColumn(name = "COD_SOC", referencedColumnName = "COD_SOC")
    @ManyToOne
    private SitSociale codSoc;
    @JoinColumn(name = "COD_DAP", referencedColumnName = "COD_DAP")
    @ManyToOne
    private DomaineActPfl codDap;
    @JoinColumn(name = "COD_ETB_ANT", referencedColumnName = "COD_ETB")
    @ManyToOne
    private Etablissement codEtbAnt;
    @JoinColumn(name = "COD_DRT_MUT", referencedColumnName = "COD_DRT")
    @ManyToOne
    private Droit codDrtMut;
    @JoinColumn(name = "COD_SPO", referencedColumnName = "COD_SPO")
    @ManyToOne
    private SpoHauNiv codSpo;
    @JoinColumn(name = "COD_UTI", referencedColumnName = "COD_UTI")
    @ManyToOne
    private Utilisateur codUti;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "insAdmAnu")
    private List<InsAdmEtp> insAdmEtpList;

    public InsAdmAnu() {
    }

    public InsAdmAnu(InsAdmAnuPK insAdmAnuPK) {
        this.insAdmAnuPK = insAdmAnuPK;
    }

    public InsAdmAnu(String codAnu, int codInd) {
        this.insAdmAnuPK = new InsAdmAnuPK(codAnu, codInd);
    }

    public InsAdmAnuPK getInsAdmAnuPK() {
        return insAdmAnuPK;
    }

    public void setInsAdmAnuPK(InsAdmAnuPK insAdmAnuPK) {
        this.insAdmAnuPK = insAdmAnuPK;
    }

    public String getCodPrlChg() {
        return codPrlChg;
    }

    public void setCodPrlChg(String codPrlChg) {
        this.codPrlChg = codPrlChg;
    }

    public String getCodTpt() {
        return codTpt;
    }

    public void setCodTpt(String codTpt) {
        this.codTpt = codTpt;
    }

    public String getTemAflSso() {
        return temAflSso;
    }

    public void setTemAflSso(String temAflSso) {
        this.temAflSso = temAflSso;
    }

    public String getTemTrmSsoIaa() {
        return temTrmSsoIaa;
    }

    public void setTemTrmSsoIaa(String temTrmSsoIaa) {
        this.temTrmSsoIaa = temTrmSsoIaa;
    }

    public Short getNumBrdTrmSsoIaa() {
        return numBrdTrmSsoIaa;
    }

    public void setNumBrdTrmSsoIaa(Short numBrdTrmSsoIaa) {
        this.numBrdTrmSsoIaa = numBrdTrmSsoIaa;
    }

    public Date getDatPmtCotSso() {
        return datPmtCotSso;
    }

    public void setDatPmtCotSso(Date datPmtCotSso) {
        this.datPmtCotSso = datPmtCotSso;
    }

    public Date getDatTrmSso() {
        return datTrmSso;
    }

    public void setDatTrmSso(Date datTrmSso) {
        this.datTrmSso = datTrmSso;
    }

    public Date getDatAflSso() {
        return datAflSso;
    }

    public void setDatAflSso(Date datAflSso) {
        this.datAflSso = datAflSso;
    }

    public String getDaaEtbAntIaa() {
        return daaEtbAntIaa;
    }

    public void setDaaEtbAntIaa(String daaEtbAntIaa) {
        this.daaEtbAntIaa = daaEtbAntIaa;
    }

    public String getEtaEdtCrt() {
        return etaEdtCrt;
    }

    public void setEtaEdtCrt(String etaEdtCrt) {
        this.etaEdtCrt = etaEdtCrt;
    }

    public Date getDatEdtCrt() {
        return datEdtCrt;
    }

    public void setDatEdtCrt(Date datEdtCrt) {
        this.datEdtCrt = datEdtCrt;
    }

    public String getTemDosIaaInc() {
        return temDosIaaInc;
    }

    public void setTemDosIaaInc(String temDosIaaInc) {
        this.temDosIaaInc = temDosIaaInc;
    }

    public String getLibMtfDosIaaInc() {
        return libMtfDosIaaInc;
    }

    public void setLibMtfDosIaaInc(String libMtfDosIaaInc) {
        this.libMtfDosIaaInc = libMtfDosIaaInc;
    }

    public Date getDatCreIaa() {
        return datCreIaa;
    }

    public void setDatCreIaa(Date datCreIaa) {
        this.datCreIaa = datCreIaa;
    }

    public Date getDatModIaa() {
        return datModIaa;
    }

    public void setDatModIaa(Date datModIaa) {
        this.datModIaa = datModIaa;
    }

    public String getEtaIaa() {
        return etaIaa;
    }

    public void setEtaIaa(String etaIaa) {
        this.etaIaa = etaIaa;
    }

    public String getTemEtbIaa1() {
        return temEtbIaa1;
    }

    public void setTemEtbIaa1(String temEtbIaa1) {
        this.temEtbIaa1 = temEtbIaa1;
    }

    public String getTemEtbIaa2() {
        return temEtbIaa2;
    }

    public void setTemEtbIaa2(String temEtbIaa2) {
        this.temEtbIaa2 = temEtbIaa2;
    }

    public String getTemBrsIaa() {
        return temBrsIaa;
    }

    public void setTemBrsIaa(String temBrsIaa) {
        this.temBrsIaa = temBrsIaa;
    }

    public String getTemRgmAmgEtuIaa() {
        return temRgmAmgEtuIaa;
    }

    public void setTemRgmAmgEtuIaa(String temRgmAmgEtuIaa) {
        this.temRgmAmgEtuIaa = temRgmAmgEtuIaa;
    }

    public String getCodPcsMere() {
        return codPcsMere;
    }

    public void setCodPcsMere(String codPcsMere) {
        this.codPcsMere = codPcsMere;
    }

    @XmlTransient
    public List<Droit> getDroitList() {
        return droitList;
    }

    public void setDroitList(List<Droit> droitList) {
        this.droitList = droitList;
    }

    @XmlTransient
    public List<AideFinanciere> getAideFinanciereList() {
        return aideFinanciereList;
    }

    public void setAideFinanciereList(List<AideFinanciere> aideFinanciereList) {
        this.aideFinanciereList = aideFinanciereList;
    }

    public CentrePayeur getCodCtp() {
        return codCtp;
    }

    public void setCodCtp(CentrePayeur codCtp) {
        this.codCtp = codCtp;
    }

    public AideFinanciere getCodAfi() {
        return codAfi;
    }

    public void setCodAfi(AideFinanciere codAfi) {
        this.codAfi = codAfi;
    }

    public ProfilEtu getCodPru() {
        return codPru;
    }

    public void setCodPru(ProfilEtu codPru) {
        this.codPru = codPru;
    }

    public QuotiteTra getCodQtr() {
        return codQtr;
    }

    public void setCodQtr(QuotiteTra codQtr) {
        this.codQtr = codQtr;
    }

    public StatutEtu getCodStu() {
        return codStu;
    }

    public void setCodStu(StatutEtu codStu) {
        this.codStu = codStu;
    }

    public PrgEchange getPrgEchange() {
        return prgEchange;
    }

    public void setPrgEchange(PrgEchange prgEchange) {
        this.prgEchange = prgEchange;
    }

    public Utilisateur getCodUtiMod() {
        return codUtiMod;
    }

    public void setCodUtiMod(Utilisateur codUtiMod) {
        this.codUtiMod = codUtiMod;
    }

    public AnneeUni getAnneeUni() {
        return anneeUni;
    }

    public void setAnneeUni(AnneeUni anneeUni) {
        this.anneeUni = anneeUni;
    }

    public RegimeSso getCodRss() {
        return codRss;
    }

    public void setCodRss(RegimeSso codRss) {
        this.codRss = codRss;
    }

    public AssRspCiv getCodAsr() {
        return codAsr;
    }

    public void setCodAsr(AssRspCiv codAsr) {
        this.codAsr = codAsr;
    }

    public CatSocPfl getCodPcsEtudiant() {
        return codPcsEtudiant;
    }

    public void setCodPcsEtudiant(CatSocPfl codPcsEtudiant) {
        this.codPcsEtudiant = codPcsEtudiant;
    }

    public CatSocPfl getCodPcsParent() {
        return codPcsParent;
    }

    public void setCodPcsParent(CatSocPfl codPcsParent) {
        this.codPcsParent = codPcsParent;
    }

    public Etablissement getCodEtr() {
        return codEtr;
    }

    public void setCodEtr(Etablissement codEtr) {
        this.codEtr = codEtr;
    }

    public RegimeIns getCodRgi() {
        return codRgi;
    }

    public void setCodRgi(RegimeIns codRgi) {
        this.codRgi = codRgi;
    }

    public TypDiplomeSise getCodTdsAnnPre() {
        return codTdsAnnPre;
    }

    public void setCodTdsAnnPre(TypDiplomeSise codTdsAnnPre) {
        this.codTdsAnnPre = codTdsAnnPre;
    }

    public MtfNonAflSso getCodMns() {
        return codMns;
    }

    public void setCodMns(MtfNonAflSso codMns) {
        this.codMns = codMns;
    }

    public Etablissement getCodEtbTpt() {
        return codEtbTpt;
    }

    public void setCodEtbTpt(Etablissement codEtbTpt) {
        this.codEtbTpt = codEtbTpt;
    }

    public TypEtb getCodTpePrlChg() {
        return codTpePrlChg;
    }

    public void setCodTpePrlChg(TypEtb codTpePrlChg) {
        this.codTpePrlChg = codTpePrlChg;
    }

    public MtfAflSso getCodMfs() {
        return codMfs;
    }

    public void setCodMfs(MtfAflSso codMfs) {
        this.codMfs = codMfs;
    }

    public Cpam getCodCpa() {
        return codCpa;
    }

    public void setCodCpa(Cpam codCpa) {
        this.codCpa = codCpa;
    }

    public Departement getCodDepAnt() {
        return codDepAnt;
    }

    public void setCodDepAnt(Departement codDepAnt) {
        this.codDepAnt = codDepAnt;
    }

    public TypEtb getCodTpeAnt() {
        return codTpeAnt;
    }

    public void setCodTpeAnt(TypEtb codTpeAnt) {
        this.codTpeAnt = codTpeAnt;
    }

    public Etablissement getCodEtbAnnPre() {
        return codEtbAnnPre;
    }

    public void setCodEtbAnnPre(Etablissement codEtbAnnPre) {
        this.codEtbAnnPre = codEtbAnnPre;
    }

    public SituationSise getCodSisAnnPre() {
        return codSisAnnPre;
    }

    public void setCodSisAnnPre(SituationSise codSisAnnPre) {
        this.codSisAnnPre = codSisAnnPre;
    }

    public Departement getCodDepAnnPre() {
        return codDepAnnPre;
    }

    public void setCodDepAnnPre(Departement codDepAnnPre) {
        this.codDepAnnPre = codDepAnnPre;
    }

    public Etablissement getCodEtbPrlChg() {
        return codEtbPrlChg;
    }

    public void setCodEtbPrlChg(Etablissement codEtbPrlChg) {
        this.codEtbPrlChg = codEtbPrlChg;
    }

    public SitSociale getCodSoc() {
        return codSoc;
    }

    public void setCodSoc(SitSociale codSoc) {
        this.codSoc = codSoc;
    }

    public DomaineActPfl getCodDap() {
        return codDap;
    }

    public void setCodDap(DomaineActPfl codDap) {
        this.codDap = codDap;
    }

    public Etablissement getCodEtbAnt() {
        return codEtbAnt;
    }

    public void setCodEtbAnt(Etablissement codEtbAnt) {
        this.codEtbAnt = codEtbAnt;
    }

    public Droit getCodDrtMut() {
        return codDrtMut;
    }

    public void setCodDrtMut(Droit codDrtMut) {
        this.codDrtMut = codDrtMut;
    }

    public SpoHauNiv getCodSpo() {
        return codSpo;
    }

    public void setCodSpo(SpoHauNiv codSpo) {
        this.codSpo = codSpo;
    }

    public Utilisateur getCodUti() {
        return codUti;
    }

    public void setCodUti(Utilisateur codUti) {
        this.codUti = codUti;
    }

    public Individu getIndividu() {
        return individu;
    }

    public void setIndividu(Individu individu) {
        this.individu = individu;
    }

    @XmlTransient
    public List<InsAdmEtp> getInsAdmEtpList() {
        return insAdmEtpList;
    }

    public void setInsAdmEtpList(List<InsAdmEtp> insAdmEtpList) {
        this.insAdmEtpList = insAdmEtpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insAdmAnuPK != null ? insAdmAnuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsAdmAnu)) {
            return false;
        }
        InsAdmAnu other = (InsAdmAnu) object;
        if ((this.insAdmAnuPK == null && other.insAdmAnuPK != null) || (this.insAdmAnuPK != null && !this.insAdmAnuPK.equals(other.insAdmAnuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.InsAdmAnu[ insAdmAnuPK=" + insAdmAnuPK + " ]";
    }
    
}
