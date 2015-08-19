/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "IND_CONTRAT_ELP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IndContratElp.findAll", query = "SELECT i FROM IndContratElp i"),
    @NamedQuery(name = "IndContratElp.findByCodAnu", query = "SELECT i FROM IndContratElp i WHERE i.indContratElpPK.codAnu = :codAnu"),
    @NamedQuery(name = "IndContratElp.findByCodInd", query = "SELECT i FROM IndContratElp i WHERE i.indContratElpPK.codInd = :codInd"),
    @NamedQuery(name = "IndContratElp.findByCodEtp", query = "SELECT i FROM IndContratElp i WHERE i.indContratElpPK.codEtp = :codEtp"),
    @NamedQuery(name = "IndContratElp.findByCodVrsVet", query = "SELECT i FROM IndContratElp i WHERE i.indContratElpPK.codVrsVet = :codVrsVet"),
    @NamedQuery(name = "IndContratElp.findByCodElp", query = "SELECT i FROM IndContratElp i WHERE i.indContratElpPK.codElp = :codElp"),
    @NamedQuery(name = "IndContratElp.findByRngElp", query = "SELECT i FROM IndContratElp i WHERE i.rngElp = :rngElp"),
    @NamedQuery(name = "IndContratElp.findByDaaUniCon", query = "SELECT i FROM IndContratElp i WHERE i.daaUniCon = :daaUniCon"),
    @NamedQuery(name = "IndContratElp.findByDatCreElpCon", query = "SELECT i FROM IndContratElp i WHERE i.datCreElpCon = :datCreElpCon"),
    @NamedQuery(name = "IndContratElp.findByDatModIce", query = "SELECT i FROM IndContratElp i WHERE i.datModIce = :datModIce"),
    @NamedQuery(name = "IndContratElp.findByEtaInsDisElp", query = "SELECT i FROM IndContratElp i WHERE i.etaInsDisElp = :etaInsDisElp"),
    @NamedQuery(name = "IndContratElp.findByLibCmtDivElp", query = "SELECT i FROM IndContratElp i WHERE i.libCmtDivElp = :libCmtDivElp"),
    @NamedQuery(name = "IndContratElp.findByLicCmtDivElp", query = "SELECT i FROM IndContratElp i WHERE i.licCmtDivElp = :licCmtDivElp"),
    @NamedQuery(name = "IndContratElp.findByTemInsElpInf", query = "SELECT i FROM IndContratElp i WHERE i.temInsElpInf = :temInsElpInf"),
    @NamedQuery(name = "IndContratElp.findByTemInsElpAtmq", query = "SELECT i FROM IndContratElp i WHERE i.temInsElpAtmq = :temInsElpAtmq"),
    @NamedQuery(name = "IndContratElp.findByLibCmtIce", query = "SELECT i FROM IndContratElp i WHERE i.libCmtIce = :libCmtIce"),
    @NamedQuery(name = "IndContratElp.findByTemPrcIce", query = "SELECT i FROM IndContratElp i WHERE i.temPrcIce = :temPrcIce")})
public class IndContratElp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IndContratElpPK indContratElpPK;
    @Column(name = "RNG_ELP")
    private Short rngElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "DAA_UNI_CON")
    private String daaUniCon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAT_CRE_ELP_CON")
    @Temporal(TemporalType.DATE)
    private Date datCreElpCon;
    @Column(name = "DAT_MOD_ICE")
    @Temporal(TemporalType.DATE)
    private Date datModIce;
    @Size(max = 1)
    @Column(name = "ETA_INS_DIS_ELP")
    private String etaInsDisElp;
    @Size(max = 200)
    @Column(name = "LIB_CMT_DIV_ELP")
    private String libCmtDivElp;
    @Size(max = 10)
    @Column(name = "LIC_CMT_DIV_ELP")
    private String licCmtDivElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INS_ELP_INF")
    private String temInsElpInf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INS_ELP_ATMQ")
    private String temInsElpAtmq;
    @Size(max = 480)
    @Column(name = "LIB_CMT_ICE")
    private String libCmtIce;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PRC_ICE")
    private String temPrcIce;
    @JoinColumn(name = "COD_CIP", referencedColumnName = "COD_CIP")
    @ManyToOne(optional = false)
    private CentreInsPed codCip;
    @JoinColumns({
        @JoinColumn(name = "COD_ELP", referencedColumnName = "COD_ELP", insertable = false, updatable = false),
        @JoinColumn(name = "COD_FEX", referencedColumnName = "COD_FEX")})
    @ManyToOne(optional = false)
    private ElpAutFex elpAutFex;
    @JoinColumn(name = "COD_LCC_ICE", referencedColumnName = "COD_LCC")
    @ManyToOne
    private ElpCorrespondElp codLccIce;
    @JoinColumns({
        @JoinColumn(name = "COD_ELP_SUP", referencedColumnName = "COD_ELP"),
        @JoinColumn(name = "COD_LSE", referencedColumnName = "COD_LSE")})
    @ManyToOne(optional = false)
    private ElpRegroupeLse elpRegroupeLse;
    @JoinColumns({
        @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false),
        @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false),
        @JoinColumn(name = "COD_ETP", referencedColumnName = "COD_ETP", insertable = false, updatable = false),
        @JoinColumn(name = "COD_VRS_VET", referencedColumnName = "COD_VRS_VET", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private InsPedagogiEtp insPedagogiEtp;
    @JoinColumns({
        @JoinColumn(name = "COD_LSE", referencedColumnName = "COD_LSE", insertable=false, updatable=false),
        @JoinColumn(name = "COD_ELP", referencedColumnName = "COD_ELP", insertable=false, updatable=false)})
    @ManyToOne(optional = false)
    private LseRegroupeElp lseRegroupeElp;
    @JoinColumn(name = "COD_PEL", referencedColumnName = "COD_PEL")
    @ManyToOne
    private PeriodeElp codPel;
    @JoinColumn(name = "COD_UTI", referencedColumnName = "COD_UTI")
    @ManyToOne(optional = false)
    private Utilisateur codUti;
    @JoinColumn(name = "COD_UTI_MOD", referencedColumnName = "COD_UTI")
    @ManyToOne
    private Utilisateur codUtiMod;

    public IndContratElp() {
    }

    public IndContratElp(IndContratElpPK indContratElpPK) {
        this.indContratElpPK = indContratElpPK;
    }

    public IndContratElp(IndContratElpPK indContratElpPK, String daaUniCon, Date datCreElpCon, String temInsElpInf, String temInsElpAtmq, String temPrcIce) {
        this.indContratElpPK = indContratElpPK;
        this.daaUniCon = daaUniCon;
        this.datCreElpCon = datCreElpCon;
        this.temInsElpInf = temInsElpInf;
        this.temInsElpAtmq = temInsElpAtmq;
        this.temPrcIce = temPrcIce;
    }

    public IndContratElp(String codAnu, int codInd, String codEtp, short codVrsVet, String codElp) {
        this.indContratElpPK = new IndContratElpPK(codAnu, codInd, codEtp, codVrsVet, codElp);
    }

    public IndContratElpPK getIndContratElpPK() {
        return indContratElpPK;
    }

    public void setIndContratElpPK(IndContratElpPK indContratElpPK) {
        this.indContratElpPK = indContratElpPK;
    }

    public Short getRngElp() {
        return rngElp;
    }

    public void setRngElp(Short rngElp) {
        this.rngElp = rngElp;
    }

    public String getDaaUniCon() {
        return daaUniCon;
    }

    public void setDaaUniCon(String daaUniCon) {
        this.daaUniCon = daaUniCon;
    }

    public Date getDatCreElpCon() {
        return datCreElpCon;
    }

    public void setDatCreElpCon(Date datCreElpCon) {
        this.datCreElpCon = datCreElpCon;
    }

    public Date getDatModIce() {
        return datModIce;
    }

    public void setDatModIce(Date datModIce) {
        this.datModIce = datModIce;
    }

    public String getEtaInsDisElp() {
        return etaInsDisElp;
    }

    public void setEtaInsDisElp(String etaInsDisElp) {
        this.etaInsDisElp = etaInsDisElp;
    }

    public String getLibCmtDivElp() {
        return libCmtDivElp;
    }

    public void setLibCmtDivElp(String libCmtDivElp) {
        this.libCmtDivElp = libCmtDivElp;
    }

    public String getLicCmtDivElp() {
        return licCmtDivElp;
    }

    public void setLicCmtDivElp(String licCmtDivElp) {
        this.licCmtDivElp = licCmtDivElp;
    }

    public String getTemInsElpInf() {
        return temInsElpInf;
    }

    public void setTemInsElpInf(String temInsElpInf) {
        this.temInsElpInf = temInsElpInf;
    }

    public String getTemInsElpAtmq() {
        return temInsElpAtmq;
    }

    public void setTemInsElpAtmq(String temInsElpAtmq) {
        this.temInsElpAtmq = temInsElpAtmq;
    }

    public String getLibCmtIce() {
        return libCmtIce;
    }

    public void setLibCmtIce(String libCmtIce) {
        this.libCmtIce = libCmtIce;
    }

    public String getTemPrcIce() {
        return temPrcIce;
    }

    public void setTemPrcIce(String temPrcIce) {
        this.temPrcIce = temPrcIce;
    }

    public CentreInsPed getCodCip() {
        return codCip;
    }

    public void setCodCip(CentreInsPed codCip) {
        this.codCip = codCip;
    }

    public ElpAutFex getElpAutFex() {
        return elpAutFex;
    }

    public void setElpAutFex(ElpAutFex elpAutFex) {
        this.elpAutFex = elpAutFex;
    }

    public ElpCorrespondElp getCodLccIce() {
        return codLccIce;
    }

    public void setCodLccIce(ElpCorrespondElp codLccIce) {
        this.codLccIce = codLccIce;
    }

    public ElpRegroupeLse getElpRegroupeLse() {
        return elpRegroupeLse;
    }

    public void setElpRegroupeLse(ElpRegroupeLse elpRegroupeLse) {
        this.elpRegroupeLse = elpRegroupeLse;
    }

    public InsPedagogiEtp getInsPedagogiEtp() {
        return insPedagogiEtp;
    }

    public void setInsPedagogiEtp(InsPedagogiEtp insPedagogiEtp) {
        this.insPedagogiEtp = insPedagogiEtp;
    }

    public LseRegroupeElp getLseRegroupeElp() {
        return lseRegroupeElp;
    }

    public void setLseRegroupeElp(LseRegroupeElp lseRegroupeElp) {
        this.lseRegroupeElp = lseRegroupeElp;
    }

    public PeriodeElp getCodPel() {
        return codPel;
    }

    public void setCodPel(PeriodeElp codPel) {
        this.codPel = codPel;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indContratElpPK != null ? indContratElpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndContratElp)) {
            return false;
        }
        IndContratElp other = (IndContratElp) object;
        if ((this.indContratElpPK == null && other.indContratElpPK != null) || (this.indContratElpPK != null && !this.indContratElpPK.equals(other.indContratElpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.IndContratElp[ indContratElpPK=" + indContratElpPK + " ]";
    }
    
}
