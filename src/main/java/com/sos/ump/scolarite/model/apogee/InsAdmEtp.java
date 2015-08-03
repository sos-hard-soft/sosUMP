/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "INS_ADM_ETP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InsAdmEtp.findAll", query = "SELECT i FROM InsAdmEtp i"),
    @NamedQuery(name = "InsAdmEtp.findByCodAnu", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.codAnu = :codAnu"),
    @NamedQuery(name = "InsAdmEtp.findByCodInd", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.codInd = :codInd"),
    @NamedQuery(name = "InsAdmEtp.findByCodEtp", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.codEtp = :codEtp"),
    @NamedQuery(name = "InsAdmEtp.findByCodVrsVet", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.codVrsVet = :codVrsVet"),
    @NamedQuery(name = "InsAdmEtp.findByNumOccIae", query = "SELECT i FROM InsAdmEtp i WHERE i.insAdmEtpPK.numOccIae = :numOccIae"),
    @NamedQuery(name = "InsAdmEtp.findByDatCreIae", query = "SELECT i FROM InsAdmEtp i WHERE i.datCreIae = :datCreIae"),
    @NamedQuery(name = "InsAdmEtp.findByDatModIae", query = "SELECT i FROM InsAdmEtp i WHERE i.datModIae = :datModIae"),
    @NamedQuery(name = "InsAdmEtp.findByDatAccIae", query = "SELECT i FROM InsAdmEtp i WHERE i.datAccIae = :datAccIae"),
    @NamedQuery(name = "InsAdmEtp.findByEtaIae", query = "SELECT i FROM InsAdmEtp i WHERE i.etaIae = :etaIae"),
    @NamedQuery(name = "InsAdmEtp.findByEtaPmtIae", query = "SELECT i FROM InsAdmEtp i WHERE i.etaPmtIae = :etaPmtIae"),
    @NamedQuery(name = "InsAdmEtp.findByNbrInsCyc", query = "SELECT i FROM InsAdmEtp i WHERE i.nbrInsCyc = :nbrInsCyc"),
    @NamedQuery(name = "InsAdmEtp.findByNbrInsEtp", query = "SELECT i FROM InsAdmEtp i WHERE i.nbrInsEtp = :nbrInsEtp"),
    @NamedQuery(name = "InsAdmEtp.findByTemTlsIae", query = "SELECT i FROM InsAdmEtp i WHERE i.temTlsIae = :temTlsIae"),
    @NamedQuery(name = "InsAdmEtp.findByTemIaePrm", query = "SELECT i FROM InsAdmEtp i WHERE i.temIaePrm = :temIaePrm"),
    @NamedQuery(name = "InsAdmEtp.findByTemChgSurEtp", query = "SELECT i FROM InsAdmEtp i WHERE i.temChgSurEtp = :temChgSurEtp"),
    @NamedQuery(name = "InsAdmEtp.findByZblEtb1", query = "SELECT i FROM InsAdmEtp i WHERE i.zblEtb1 = :zblEtb1"),
    @NamedQuery(name = "InsAdmEtp.findByZblEtb2", query = "SELECT i FROM InsAdmEtp i WHERE i.zblEtb2 = :zblEtb2"),
    @NamedQuery(name = "InsAdmEtp.findByNumBrsEtu", query = "SELECT i FROM InsAdmEtp i WHERE i.numBrsEtu = :numBrsEtu"),
    @NamedQuery(name = "InsAdmEtp.findByLibRefAcc", query = "SELECT i FROM InsAdmEtp i WHERE i.libRefAcc = :libRefAcc"),
    @NamedQuery(name = "InsAdmEtp.findByTemInsElpAtmqIae", query = "SELECT i FROM InsAdmEtp i WHERE i.temInsElpAtmqIae = :temInsElpAtmqIae"),
    @NamedQuery(name = "InsAdmEtp.findByCodNatTitAccIae", query = "SELECT i FROM InsAdmEtp i WHERE i.codNatTitAccIae = :codNatTitAccIae"),
    @NamedQuery(name = "InsAdmEtp.findByNbrInsDip", query = "SELECT i FROM InsAdmEtp i WHERE i.nbrInsDip = :nbrInsDip"),
    @NamedQuery(name = "InsAdmEtp.findByTemDipIae", query = "SELECT i FROM InsAdmEtp i WHERE i.temDipIae = :temDipIae"),
    @NamedQuery(name = "InsAdmEtp.findByCodSesIae", query = "SELECT i FROM InsAdmEtp i WHERE i.codSesIae = :codSesIae"),
    @NamedQuery(name = "InsAdmEtp.findByDatObsSisIae", query = "SELECT i FROM InsAdmEtp i WHERE i.datObsSisIae = :datObsSisIae")})
public class InsAdmEtp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsAdmEtpPK insAdmEtpPK;
    @Column(name = "DAT_CRE_IAE")
    @Temporal(TemporalType.DATE)
    private Date datCreIae;
    @Column(name = "DAT_MOD_IAE")
    @Temporal(TemporalType.DATE)
    private Date datModIae;
    @Column(name = "DAT_ACC_IAE")
    @Temporal(TemporalType.DATE)
    private Date datAccIae;
    @Size(max = 1)
    @Column(name = "ETA_IAE")
    private String etaIae;
    @Size(max = 1)
    @Column(name = "ETA_PMT_IAE")
    private String etaPmtIae;
    @Column(name = "NBR_INS_CYC")
    private Short nbrInsCyc;
    @Column(name = "NBR_INS_ETP")
    private Short nbrInsEtp;
    @Size(max = 1)
    @Column(name = "TEM_TLS_IAE")
    private String temTlsIae;
    @Size(max = 1)
    @Column(name = "TEM_IAE_PRM")
    private String temIaePrm;
    @Size(max = 1)
    @Column(name = "TEM_CHG_SUR_ETP")
    private String temChgSurEtp;
    @Size(max = 100)
    @Column(name = "ZBL_ETB_1")
    private String zblEtb1;
    @Size(max = 100)
    @Column(name = "ZBL_ETB_2")
    private String zblEtb2;
    @Size(max = 13)
    @Column(name = "NUM_BRS_ETU")
    private String numBrsEtu;
    @Size(max = 100)
    @Column(name = "LIB_REF_ACC")
    private String libRefAcc;
    @Size(max = 1)
    @Column(name = "TEM_INS_ELP_ATMQ_IAE")
    private String temInsElpAtmqIae;
    @Size(max = 1)
    @Column(name = "COD_NAT_TIT_ACC_IAE")
    private String codNatTitAccIae;
    @Column(name = "NBR_INS_DIP")
    private Short nbrInsDip;
    @Size(max = 1)
    @Column(name = "TEM_DIP_IAE")
    private String temDipIae;
    @Size(max = 1)
    @Column(name = "COD_SES_IAE")
    private String codSesIae;
    @Column(name = "DAT_OBS_SIS_IAE")
    @Temporal(TemporalType.DATE)
    private Date datObsSisIae;
    @JoinColumn(name = "COD_BRS", referencedColumnName = "COD_BRS")
    @ManyToOne
    private Bourse codBrs;
    @JoinColumn(name = "COD_CGE", referencedColumnName = "COD_CGE")
    @ManyToOne
    private CentreGestion codCge;
    @JoinColumn(name = "COD_CMP", referencedColumnName = "COD_CMP")
    @ManyToOne
    private Composante codCmp;
    @JoinColumn(name = "COD_DAC_ACC", referencedColumnName = "COD_DAC")
    @ManyToOne
    private DipAutCur codDacAcc;
    @JoinColumns({
        @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false),
        @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private InsAdmAnu insAdmAnu;
    @JoinColumn(name = "COD_PRU", referencedColumnName = "COD_PRU")
    @ManyToOne(optional = false)
    private ProfilEtu codPru;
    @JoinColumns({
        @JoinColumn(name = "COD_DIP_ACC", referencedColumnName = "COD_DIP"),
        @JoinColumn(name = "COD_VRS_VDI_ACC", referencedColumnName = "COD_VRS_VDI")})
    @ManyToOne
    private VersionDiplome versionDiplome;
    @JoinColumns({
        @JoinColumn(name = "COD_SPE_1", referencedColumnName = "COD_SPE"),
        @JoinColumn(name = "COD_DIP", referencedColumnName = "COD_DIP"),
        @JoinColumn(name = "COD_VRS_VDI", referencedColumnName = "COD_VRS_VDI")})
    @ManyToOne
    private SpeCaracteriseVdi speCaracteriseVdi;
    @JoinColumns({
        @JoinColumn(name = "COD_SPE_3", referencedColumnName = "COD_SPE"),
        @JoinColumn(name = "COD_DIP", referencedColumnName = "COD_DIP"),
        @JoinColumn(name = "COD_VRS_VDI", referencedColumnName = "COD_VRS_VDI")})
    @ManyToOne
    private SpeCaracteriseVdi speCaracteriseVdi1;
    @JoinColumn(name = "COD_UTI_MOD", referencedColumnName = "COD_UTI")
    @ManyToOne
    private Utilisateur codUtiMod;
    @JoinColumns({
        @JoinColumn(name = "COD_SPE_2", referencedColumnName = "COD_SPE"),
        @JoinColumn(name = "COD_DIP", referencedColumnName = "COD_DIP"),
        @JoinColumn(name = "COD_VRS_VDI", referencedColumnName = "COD_VRS_VDI")})
    @ManyToOne
    private SpeCaracteriseVdi speCaracteriseVdi2;
    @JoinColumns({
        @JoinColumn(name = "COD_DIP", referencedColumnName = "COD_DIP"),
        @JoinColumn(name = "COD_VRS_VDI", referencedColumnName = "COD_VRS_VDI")})
    @ManyToOne
    private VersionDiplome versionDiplome1;
    @JoinColumn(name = "COD_TLS", referencedColumnName = "COD_TLS")
    @ManyToOne
    private TeleEnseignementMode codTls;
    @JoinColumn(name = "COD_UTI_ACC", referencedColumnName = "COD_UTI")
    @ManyToOne
    private Utilisateur codUtiAcc;
    @JoinColumns({
        @JoinColumn(name = "COD_ETP", referencedColumnName = "COD_ETP", insertable = false, updatable = false),
        @JoinColumn(name = "COD_VRS_VET", referencedColumnName = "COD_VRS_VET", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private VersionEtape versionEtape;
    @JoinColumn(name = "COD_UTI", referencedColumnName = "COD_UTI")
    @ManyToOne
    private Utilisateur codUti;

    public InsAdmEtp() {
    }

    public InsAdmEtp(InsAdmEtpPK insAdmEtpPK) {
        this.insAdmEtpPK = insAdmEtpPK;
    }

    public InsAdmEtp(String codAnu, int codInd, String codEtp, short codVrsVet, short numOccIae) {
        this.insAdmEtpPK = new InsAdmEtpPK(codAnu, codInd, codEtp, codVrsVet, numOccIae);
    }

    public InsAdmEtpPK getInsAdmEtpPK() {
        return insAdmEtpPK;
    }

    public void setInsAdmEtpPK(InsAdmEtpPK insAdmEtpPK) {
        this.insAdmEtpPK = insAdmEtpPK;
    }

    public Date getDatCreIae() {
        return datCreIae;
    }

    public void setDatCreIae(Date datCreIae) {
        this.datCreIae = datCreIae;
    }

    public Date getDatModIae() {
        return datModIae;
    }

    public void setDatModIae(Date datModIae) {
        this.datModIae = datModIae;
    }

    public Date getDatAccIae() {
        return datAccIae;
    }

    public void setDatAccIae(Date datAccIae) {
        this.datAccIae = datAccIae;
    }

    public String getEtaIae() {
        return etaIae;
    }

    public void setEtaIae(String etaIae) {
        this.etaIae = etaIae;
    }

    public String getEtaPmtIae() {
        return etaPmtIae;
    }

    public void setEtaPmtIae(String etaPmtIae) {
        this.etaPmtIae = etaPmtIae;
    }

    public Short getNbrInsCyc() {
        return nbrInsCyc;
    }

    public void setNbrInsCyc(Short nbrInsCyc) {
        this.nbrInsCyc = nbrInsCyc;
    }

    public Short getNbrInsEtp() {
        return nbrInsEtp;
    }

    public void setNbrInsEtp(Short nbrInsEtp) {
        this.nbrInsEtp = nbrInsEtp;
    }

    public String getTemTlsIae() {
        return temTlsIae;
    }

    public void setTemTlsIae(String temTlsIae) {
        this.temTlsIae = temTlsIae;
    }

    public String getTemIaePrm() {
        return temIaePrm;
    }

    public void setTemIaePrm(String temIaePrm) {
        this.temIaePrm = temIaePrm;
    }

    public String getTemChgSurEtp() {
        return temChgSurEtp;
    }

    public void setTemChgSurEtp(String temChgSurEtp) {
        this.temChgSurEtp = temChgSurEtp;
    }

    public String getZblEtb1() {
        return zblEtb1;
    }

    public void setZblEtb1(String zblEtb1) {
        this.zblEtb1 = zblEtb1;
    }

    public String getZblEtb2() {
        return zblEtb2;
    }

    public void setZblEtb2(String zblEtb2) {
        this.zblEtb2 = zblEtb2;
    }

    public String getNumBrsEtu() {
        return numBrsEtu;
    }

    public void setNumBrsEtu(String numBrsEtu) {
        this.numBrsEtu = numBrsEtu;
    }

    public String getLibRefAcc() {
        return libRefAcc;
    }

    public void setLibRefAcc(String libRefAcc) {
        this.libRefAcc = libRefAcc;
    }

    public String getTemInsElpAtmqIae() {
        return temInsElpAtmqIae;
    }

    public void setTemInsElpAtmqIae(String temInsElpAtmqIae) {
        this.temInsElpAtmqIae = temInsElpAtmqIae;
    }

    public String getCodNatTitAccIae() {
        return codNatTitAccIae;
    }

    public void setCodNatTitAccIae(String codNatTitAccIae) {
        this.codNatTitAccIae = codNatTitAccIae;
    }

    public Short getNbrInsDip() {
        return nbrInsDip;
    }

    public void setNbrInsDip(Short nbrInsDip) {
        this.nbrInsDip = nbrInsDip;
    }

    public String getTemDipIae() {
        return temDipIae;
    }

    public void setTemDipIae(String temDipIae) {
        this.temDipIae = temDipIae;
    }

    public String getCodSesIae() {
        return codSesIae;
    }

    public void setCodSesIae(String codSesIae) {
        this.codSesIae = codSesIae;
    }

    public Date getDatObsSisIae() {
        return datObsSisIae;
    }

    public void setDatObsSisIae(Date datObsSisIae) {
        this.datObsSisIae = datObsSisIae;
    }

    public Bourse getCodBrs() {
        return codBrs;
    }

    public void setCodBrs(Bourse codBrs) {
        this.codBrs = codBrs;
    }

    public CentreGestion getCodCge() {
        return codCge;
    }

    public void setCodCge(CentreGestion codCge) {
        this.codCge = codCge;
    }

    public Composante getCodCmp() {
        return codCmp;
    }

    public void setCodCmp(Composante codCmp) {
        this.codCmp = codCmp;
    }

    public DipAutCur getCodDacAcc() {
        return codDacAcc;
    }

    public void setCodDacAcc(DipAutCur codDacAcc) {
        this.codDacAcc = codDacAcc;
    }

    public InsAdmAnu getInsAdmAnu() {
        return insAdmAnu;
    }

    public void setInsAdmAnu(InsAdmAnu insAdmAnu) {
        this.insAdmAnu = insAdmAnu;
    }

    public ProfilEtu getCodPru() {
        return codPru;
    }

    public void setCodPru(ProfilEtu codPru) {
        this.codPru = codPru;
    }

    public VersionDiplome getVersionDiplome() {
        return versionDiplome;
    }

    public void setVersionDiplome(VersionDiplome versionDiplome) {
        this.versionDiplome = versionDiplome;
    }

    public SpeCaracteriseVdi getSpeCaracteriseVdi() {
        return speCaracteriseVdi;
    }

    public void setSpeCaracteriseVdi(SpeCaracteriseVdi speCaracteriseVdi) {
        this.speCaracteriseVdi = speCaracteriseVdi;
    }

    public SpeCaracteriseVdi getSpeCaracteriseVdi1() {
        return speCaracteriseVdi1;
    }

    public void setSpeCaracteriseVdi1(SpeCaracteriseVdi speCaracteriseVdi1) {
        this.speCaracteriseVdi1 = speCaracteriseVdi1;
    }

    public Utilisateur getCodUtiMod() {
        return codUtiMod;
    }

    public void setCodUtiMod(Utilisateur codUtiMod) {
        this.codUtiMod = codUtiMod;
    }

    public SpeCaracteriseVdi getSpeCaracteriseVdi2() {
        return speCaracteriseVdi2;
    }

    public void setSpeCaracteriseVdi2(SpeCaracteriseVdi speCaracteriseVdi2) {
        this.speCaracteriseVdi2 = speCaracteriseVdi2;
    }

    public VersionDiplome getVersionDiplome1() {
        return versionDiplome1;
    }

    public void setVersionDiplome1(VersionDiplome versionDiplome1) {
        this.versionDiplome1 = versionDiplome1;
    }

    public TeleEnseignementMode getCodTls() {
        return codTls;
    }

    public void setCodTls(TeleEnseignementMode codTls) {
        this.codTls = codTls;
    }

    public Utilisateur getCodUtiAcc() {
        return codUtiAcc;
    }

    public void setCodUtiAcc(Utilisateur codUtiAcc) {
        this.codUtiAcc = codUtiAcc;
    }

    public VersionEtape getVersionEtape() {
        return versionEtape;
    }

    public void setVersionEtape(VersionEtape versionEtape) {
        this.versionEtape = versionEtape;
    }

    public Utilisateur getCodUti() {
        return codUti;
    }

    public void setCodUti(Utilisateur codUti) {
        this.codUti = codUti;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insAdmEtpPK != null ? insAdmEtpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsAdmEtp)) {
            return false;
        }
        InsAdmEtp other = (InsAdmEtp) object;
        if ((this.insAdmEtpPK == null && other.insAdmEtpPK != null) || (this.insAdmEtpPK != null && !this.insAdmEtpPK.equals(other.insAdmEtpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.InsAdmEtp[ insAdmEtpPK=" + insAdmEtpPK + " ]";
    }
    
}
