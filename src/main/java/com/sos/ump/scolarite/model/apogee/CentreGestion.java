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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "CENTRE_GESTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CentreGestion.findAll", query = "SELECT c FROM CentreGestion c"),
    @NamedQuery(name = "CentreGestion.findByCodCge", query = "SELECT c FROM CentreGestion c WHERE c.codCge = :codCge"),
    @NamedQuery(name = "CentreGestion.findByEtaTypEdtCrtCge", query = "SELECT c FROM CentreGestion c WHERE c.etaTypEdtCrtCge = :etaTypEdtCrtCge"),
    @NamedQuery(name = "CentreGestion.findByModEdtCrt", query = "SELECT c FROM CentreGestion c WHERE c.modEdtCrt = :modEdtCrt"),
    @NamedQuery(name = "CentreGestion.findByLibCge", query = "SELECT c FROM CentreGestion c WHERE c.libCge = :libCge"),
    @NamedQuery(name = "CentreGestion.findByLicCge", query = "SELECT c FROM CentreGestion c WHERE c.licCge = :licCge"),
    @NamedQuery(name = "CentreGestion.findByLibNomRespCge", query = "SELECT c FROM CentreGestion c WHERE c.libNomRespCge = :libNomRespCge"),
    @NamedQuery(name = "CentreGestion.findByLibCmtCge", query = "SELECT c FROM CentreGestion c WHERE c.libCmtCge = :libCmtCge"),
    @NamedQuery(name = "CentreGestion.findByNumChrQutCge", query = "SELECT c FROM CentreGestion c WHERE c.numChrQutCge = :numChrQutCge"),
    @NamedQuery(name = "CentreGestion.findByNumOccQutEdt", query = "SELECT c FROM CentreGestion c WHERE c.numOccQutEdt = :numOccQutEdt"),
    @NamedQuery(name = "CentreGestion.findByNumOccQutEdtVdr", query = "SELECT c FROM CentreGestion c WHERE c.numOccQutEdtVdr = :numOccQutEdtVdr"),
    @NamedQuery(name = "CentreGestion.findByNumOccQutEdtLch", query = "SELECT c FROM CentreGestion c WHERE c.numOccQutEdtLch = :numOccQutEdtLch"),
    @NamedQuery(name = "CentreGestion.findByNumOccQutVal", query = "SELECT c FROM CentreGestion c WHERE c.numOccQutVal = :numOccQutVal"),
    @NamedQuery(name = "CentreGestion.findByNumOccPrmQutVal", query = "SELECT c FROM CentreGestion c WHERE c.numOccPrmQutVal = :numOccPrmQutVal"),
    @NamedQuery(name = "CentreGestion.findByDatDebInsCge", query = "SELECT c FROM CentreGestion c WHERE c.datDebInsCge = :datDebInsCge"),
    @NamedQuery(name = "CentreGestion.findByDatFinInsCge", query = "SELECT c FROM CentreGestion c WHERE c.datFinInsCge = :datFinInsCge"),
    @NamedQuery(name = "CentreGestion.findByNbrEtuCpt", query = "SELECT c FROM CentreGestion c WHERE c.nbrEtuCpt = :nbrEtuCpt"),
    @NamedQuery(name = "CentreGestion.findByLibAd1Cge", query = "SELECT c FROM CentreGestion c WHERE c.libAd1Cge = :libAd1Cge"),
    @NamedQuery(name = "CentreGestion.findByLibAd2Cge", query = "SELECT c FROM CentreGestion c WHERE c.libAd2Cge = :libAd2Cge"),
    @NamedQuery(name = "CentreGestion.findByLibAd3Cge", query = "SELECT c FROM CentreGestion c WHERE c.libAd3Cge = :libAd3Cge"),
    @NamedQuery(name = "CentreGestion.findByTemEnSveCge", query = "SELECT c FROM CentreGestion c WHERE c.temEnSveCge = :temEnSveCge"),
    @NamedQuery(name = "CentreGestion.findByTemPaiMemePos", query = "SELECT c FROM CentreGestion c WHERE c.temPaiMemePos = :temPaiMemePos"),
    @NamedQuery(name = "CentreGestion.findByTemCtrlPai", query = "SELECT c FROM CentreGestion c WHERE c.temCtrlPai = :temCtrlPai"),
    @NamedQuery(name = "CentreGestion.findByTemMinCge", query = "SELECT c FROM CentreGestion c WHERE c.temMinCge = :temMinCge"),
    @NamedQuery(name = "CentreGestion.findByCodModPaiMinCge", query = "SELECT c FROM CentreGestion c WHERE c.codModPaiMinCge = :codModPaiMinCge"),
    @NamedQuery(name = "CentreGestion.findByLibCmtPcjMinCge", query = "SELECT c FROM CentreGestion c WHERE c.libCmtPcjMinCge = :libCmtPcjMinCge"),
    @NamedQuery(name = "CentreGestion.findByTemCtrlRmb", query = "SELECT c FROM CentreGestion c WHERE c.temCtrlRmb = :temCtrlRmb"),
    @NamedQuery(name = "CentreGestion.findByNbrMaxInsAut", query = "SELECT c FROM CentreGestion c WHERE c.nbrMaxInsAut = :nbrMaxInsAut")})
public class CentreGestion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_CGE")
    private String codCge;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_TYP_EDT_CRT_CGE")
    private String etaTypEdtCrtCge;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "MOD_EDT_CRT")
    private String modEdtCrt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_CGE")
    private String libCge;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_CGE")
    private String licCge;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "LIB_NOM_RESP_CGE")
    private String libNomRespCge;
    @Size(max = 200)
    @Column(name = "LIB_CMT_CGE")
    private String libCmtCge;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_CHR_QUT_CGE")
    private int numChrQutCge;
    @Column(name = "NUM_OCC_QUT_EDT")
    private Integer numOccQutEdt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_OCC_QUT_EDT_VDR")
    private int numOccQutEdtVdr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_OCC_QUT_EDT_LCH")
    private int numOccQutEdtLch;
    @Column(name = "NUM_OCC_QUT_VAL")
    private Integer numOccQutVal;
    @Column(name = "NUM_OCC_PRM_QUT_VAL")
    private Integer numOccPrmQutVal;
    @Column(name = "DAT_DEB_INS_CGE")
    @Temporal(TemporalType.DATE)
    private Date datDebInsCge;
    @Column(name = "DAT_FIN_INS_CGE")
    @Temporal(TemporalType.DATE)
    private Date datFinInsCge;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NBR_ETU_CPT")
    private short nbrEtuCpt;
    @Size(max = 32)
    @Column(name = "LIB_AD1_CGE")
    private String libAd1Cge;
    @Size(max = 32)
    @Column(name = "LIB_AD2_CGE")
    private String libAd2Cge;
    @Size(max = 32)
    @Column(name = "LIB_AD3_CGE")
    private String libAd3Cge;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CGE")
    private String temEnSveCge;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PAI_MEME_POS")
    private String temPaiMemePos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CTRL_PAI")
    private String temCtrlPai;
    @Size(max = 1)
    @Column(name = "TEM_MIN_CGE")
    private String temMinCge;
    @Size(max = 1)
    @Column(name = "COD_MOD_PAI_MIN_CGE")
    private String codModPaiMinCge;
    @Size(max = 450)
    @Column(name = "LIB_CMT_PCJ_MIN_CGE")
    private String libCmtPcjMinCge;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CTRL_RMB")
    private String temCtrlRmb;
    @Column(name = "NBR_MAX_INS_AUT")
    private Short nbrMaxInsAut;
    @JoinTable(name = "ETB_PERMET_ACC_CGE", joinColumns = {
        @JoinColumn(name = "COD_CGE", referencedColumnName = "COD_CGE")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_ETB", referencedColumnName = "COD_ETB")})
    @ManyToMany
    private List<Etablissement> etablissementList;
    @JoinColumns({
        @JoinColumn(name = "COD_POS_ADR_CGE", referencedColumnName = "COD_BDI"),
        @JoinColumn(name = "COD_COM_ADR_CGE", referencedColumnName = "COD_COM")})
    @ManyToOne
    private ComBdi comBdi;
    @JoinColumn(name = "COD_CPA", referencedColumnName = "COD_CPA")
    @ManyToOne(optional = false)
    private Cpam codCpa;
    @OneToMany(mappedBy = "codCge")
    private List<Utilisateur> utilisateurList;
    @OneToMany(mappedBy = "codCgeMinVet")
    private List<VersionEtape> versionEtapeList;
    @OneToMany(mappedBy = "codCge")
    private List<InsAdmEtp> insAdmEtpList;

    public CentreGestion() {
    }

    public CentreGestion(String codCge) {
        this.codCge = codCge;
    }

    public CentreGestion(String codCge, String etaTypEdtCrtCge, String modEdtCrt, String libCge, String licCge, String libNomRespCge, int numChrQutCge, int numOccQutEdtVdr, int numOccQutEdtLch, short nbrEtuCpt, String temEnSveCge, String temPaiMemePos, String temCtrlPai, String temCtrlRmb) {
        this.codCge = codCge;
        this.etaTypEdtCrtCge = etaTypEdtCrtCge;
        this.modEdtCrt = modEdtCrt;
        this.libCge = libCge;
        this.licCge = licCge;
        this.libNomRespCge = libNomRespCge;
        this.numChrQutCge = numChrQutCge;
        this.numOccQutEdtVdr = numOccQutEdtVdr;
        this.numOccQutEdtLch = numOccQutEdtLch;
        this.nbrEtuCpt = nbrEtuCpt;
        this.temEnSveCge = temEnSveCge;
        this.temPaiMemePos = temPaiMemePos;
        this.temCtrlPai = temCtrlPai;
        this.temCtrlRmb = temCtrlRmb;
    }

    public String getCodCge() {
        return codCge;
    }

    public void setCodCge(String codCge) {
        this.codCge = codCge;
    }

    public String getEtaTypEdtCrtCge() {
        return etaTypEdtCrtCge;
    }

    public void setEtaTypEdtCrtCge(String etaTypEdtCrtCge) {
        this.etaTypEdtCrtCge = etaTypEdtCrtCge;
    }

    public String getModEdtCrt() {
        return modEdtCrt;
    }

    public void setModEdtCrt(String modEdtCrt) {
        this.modEdtCrt = modEdtCrt;
    }

    public String getLibCge() {
        return libCge;
    }

    public void setLibCge(String libCge) {
        this.libCge = libCge;
    }

    public String getLicCge() {
        return licCge;
    }

    public void setLicCge(String licCge) {
        this.licCge = licCge;
    }

    public String getLibNomRespCge() {
        return libNomRespCge;
    }

    public void setLibNomRespCge(String libNomRespCge) {
        this.libNomRespCge = libNomRespCge;
    }

    public String getLibCmtCge() {
        return libCmtCge;
    }

    public void setLibCmtCge(String libCmtCge) {
        this.libCmtCge = libCmtCge;
    }

    public int getNumChrQutCge() {
        return numChrQutCge;
    }

    public void setNumChrQutCge(int numChrQutCge) {
        this.numChrQutCge = numChrQutCge;
    }

    public Integer getNumOccQutEdt() {
        return numOccQutEdt;
    }

    public void setNumOccQutEdt(Integer numOccQutEdt) {
        this.numOccQutEdt = numOccQutEdt;
    }

    public int getNumOccQutEdtVdr() {
        return numOccQutEdtVdr;
    }

    public void setNumOccQutEdtVdr(int numOccQutEdtVdr) {
        this.numOccQutEdtVdr = numOccQutEdtVdr;
    }

    public int getNumOccQutEdtLch() {
        return numOccQutEdtLch;
    }

    public void setNumOccQutEdtLch(int numOccQutEdtLch) {
        this.numOccQutEdtLch = numOccQutEdtLch;
    }

    public Integer getNumOccQutVal() {
        return numOccQutVal;
    }

    public void setNumOccQutVal(Integer numOccQutVal) {
        this.numOccQutVal = numOccQutVal;
    }

    public Integer getNumOccPrmQutVal() {
        return numOccPrmQutVal;
    }

    public void setNumOccPrmQutVal(Integer numOccPrmQutVal) {
        this.numOccPrmQutVal = numOccPrmQutVal;
    }

    public Date getDatDebInsCge() {
        return datDebInsCge;
    }

    public void setDatDebInsCge(Date datDebInsCge) {
        this.datDebInsCge = datDebInsCge;
    }

    public Date getDatFinInsCge() {
        return datFinInsCge;
    }

    public void setDatFinInsCge(Date datFinInsCge) {
        this.datFinInsCge = datFinInsCge;
    }

    public short getNbrEtuCpt() {
        return nbrEtuCpt;
    }

    public void setNbrEtuCpt(short nbrEtuCpt) {
        this.nbrEtuCpt = nbrEtuCpt;
    }

    public String getLibAd1Cge() {
        return libAd1Cge;
    }

    public void setLibAd1Cge(String libAd1Cge) {
        this.libAd1Cge = libAd1Cge;
    }

    public String getLibAd2Cge() {
        return libAd2Cge;
    }

    public void setLibAd2Cge(String libAd2Cge) {
        this.libAd2Cge = libAd2Cge;
    }

    public String getLibAd3Cge() {
        return libAd3Cge;
    }

    public void setLibAd3Cge(String libAd3Cge) {
        this.libAd3Cge = libAd3Cge;
    }

    public String getTemEnSveCge() {
        return temEnSveCge;
    }

    public void setTemEnSveCge(String temEnSveCge) {
        this.temEnSveCge = temEnSveCge;
    }

    public String getTemPaiMemePos() {
        return temPaiMemePos;
    }

    public void setTemPaiMemePos(String temPaiMemePos) {
        this.temPaiMemePos = temPaiMemePos;
    }

    public String getTemCtrlPai() {
        return temCtrlPai;
    }

    public void setTemCtrlPai(String temCtrlPai) {
        this.temCtrlPai = temCtrlPai;
    }

    public String getTemMinCge() {
        return temMinCge;
    }

    public void setTemMinCge(String temMinCge) {
        this.temMinCge = temMinCge;
    }

    public String getCodModPaiMinCge() {
        return codModPaiMinCge;
    }

    public void setCodModPaiMinCge(String codModPaiMinCge) {
        this.codModPaiMinCge = codModPaiMinCge;
    }

    public String getLibCmtPcjMinCge() {
        return libCmtPcjMinCge;
    }

    public void setLibCmtPcjMinCge(String libCmtPcjMinCge) {
        this.libCmtPcjMinCge = libCmtPcjMinCge;
    }

    public String getTemCtrlRmb() {
        return temCtrlRmb;
    }

    public void setTemCtrlRmb(String temCtrlRmb) {
        this.temCtrlRmb = temCtrlRmb;
    }

    public Short getNbrMaxInsAut() {
        return nbrMaxInsAut;
    }

    public void setNbrMaxInsAut(Short nbrMaxInsAut) {
        this.nbrMaxInsAut = nbrMaxInsAut;
    }

    @XmlTransient
    public List<Etablissement> getEtablissementList() {
        return etablissementList;
    }

    public void setEtablissementList(List<Etablissement> etablissementList) {
        this.etablissementList = etablissementList;
    }

    public ComBdi getComBdi() {
        return comBdi;
    }

    public void setComBdi(ComBdi comBdi) {
        this.comBdi = comBdi;
    }

    public Cpam getCodCpa() {
        return codCpa;
    }

    public void setCodCpa(Cpam codCpa) {
        this.codCpa = codCpa;
    }

    @XmlTransient
    public List<Utilisateur> getUtilisateurList() {
        return utilisateurList;
    }

    public void setUtilisateurList(List<Utilisateur> utilisateurList) {
        this.utilisateurList = utilisateurList;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList() {
        return versionEtapeList;
    }

    public void setVersionEtapeList(List<VersionEtape> versionEtapeList) {
        this.versionEtapeList = versionEtapeList;
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
        hash += (codCge != null ? codCge.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentreGestion)) {
            return false;
        }
        CentreGestion other = (CentreGestion) object;
        if ((this.codCge == null && other.codCge != null) || (this.codCge != null && !this.codCge.equals(other.codCge))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.CentreGestion[ codCge=" + codCge + " ]";
    }
    
}
