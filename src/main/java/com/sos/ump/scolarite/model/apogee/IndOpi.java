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
@Table(name = "IND_OPI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IndOpi.findAll", query = "SELECT i FROM IndOpi i"),
    @NamedQuery(name = "IndOpi.findByCodIndOpi", query = "SELECT i FROM IndOpi i WHERE i.codIndOpi = :codIndOpi"),
    @NamedQuery(name = "IndOpi.findByCodNneIndOpi", query = "SELECT i FROM IndOpi i WHERE i.codNneIndOpi = :codNneIndOpi"),
    @NamedQuery(name = "IndOpi.findByCodCleNneIndOpi", query = "SELECT i FROM IndOpi i WHERE i.codCleNneIndOpi = :codCleNneIndOpi"),
    @NamedQuery(name = "IndOpi.findByDateNaiIndOpi", query = "SELECT i FROM IndOpi i WHERE i.dateNaiIndOpi = :dateNaiIndOpi"),
    @NamedQuery(name = "IndOpi.findByTemDateNaiRelOpi", query = "SELECT i FROM IndOpi i WHERE i.temDateNaiRelOpi = :temDateNaiRelOpi"),
    @NamedQuery(name = "IndOpi.findByDaaLbtIndOpi", query = "SELECT i FROM IndOpi i WHERE i.daaLbtIndOpi = :daaLbtIndOpi"),
    @NamedQuery(name = "IndOpi.findByDmmLbtIndOpi", query = "SELECT i FROM IndOpi i WHERE i.dmmLbtIndOpi = :dmmLbtIndOpi"),
    @NamedQuery(name = "IndOpi.findByDaaEntEtbOpi", query = "SELECT i FROM IndOpi i WHERE i.daaEntEtbOpi = :daaEntEtbOpi"),
    @NamedQuery(name = "IndOpi.findByLibNomPatIndOpi", query = "SELECT i FROM IndOpi i WHERE i.libNomPatIndOpi = :libNomPatIndOpi"),
    @NamedQuery(name = "IndOpi.findByLibNomUsuIndOpi", query = "SELECT i FROM IndOpi i WHERE i.libNomUsuIndOpi = :libNomUsuIndOpi"),
    @NamedQuery(name = "IndOpi.findByLibPr1IndOpi", query = "SELECT i FROM IndOpi i WHERE i.libPr1IndOpi = :libPr1IndOpi"),
    @NamedQuery(name = "IndOpi.findByLibPr2IndOpi", query = "SELECT i FROM IndOpi i WHERE i.libPr2IndOpi = :libPr2IndOpi"),
    @NamedQuery(name = "IndOpi.findByLibPr3IndOpi", query = "SELECT i FROM IndOpi i WHERE i.libPr3IndOpi = :libPr3IndOpi"),
    @NamedQuery(name = "IndOpi.findByNumTelIndOpi", query = "SELECT i FROM IndOpi i WHERE i.numTelIndOpi = :numTelIndOpi"),
    @NamedQuery(name = "IndOpi.findByCodEtuOpi", query = "SELECT i FROM IndOpi i WHERE i.codEtuOpi = :codEtuOpi"),
    @NamedQuery(name = "IndOpi.findByLibVilNaiEtuOpi", query = "SELECT i FROM IndOpi i WHERE i.libVilNaiEtuOpi = :libVilNaiEtuOpi"),
    @NamedQuery(name = "IndOpi.findByCodOpiIntEpo", query = "SELECT i FROM IndOpi i WHERE i.codOpiIntEpo = :codOpiIntEpo"),
    @NamedQuery(name = "IndOpi.findByDurExpProEpo", query = "SELECT i FROM IndOpi i WHERE i.durExpProEpo = :durExpProEpo"),
    @NamedQuery(name = "IndOpi.findByNumTelTempEpo", query = "SELECT i FROM IndOpi i WHERE i.numTelTempEpo = :numTelTempEpo"),
    @NamedQuery(name = "IndOpi.findByTemExpProEpo", query = "SELECT i FROM IndOpi i WHERE i.temExpProEpo = :temExpProEpo"),
    @NamedQuery(name = "IndOpi.findByTemIntEpo", query = "SELECT i FROM IndOpi i WHERE i.temIntEpo = :temIntEpo"),
    @NamedQuery(name = "IndOpi.findByTemMiTpsEpo", query = "SELECT i FROM IndOpi i WHERE i.temMiTpsEpo = :temMiTpsEpo"),
    @NamedQuery(name = "IndOpi.findByCodDepPayNai", query = "SELECT i FROM IndOpi i WHERE i.codDepPayNai = :codDepPayNai"),
    @NamedQuery(name = "IndOpi.findByCodTypDepPayNai", query = "SELECT i FROM IndOpi i WHERE i.codTypDepPayNai = :codTypDepPayNai"),
    @NamedQuery(name = "IndOpi.findByDaaEnsSupOpi", query = "SELECT i FROM IndOpi i WHERE i.daaEnsSupOpi = :daaEnsSupOpi"),
    @NamedQuery(name = "IndOpi.findByDaaEtbOpi", query = "SELECT i FROM IndOpi i WHERE i.daaEtbOpi = :daaEtbOpi"),
    @NamedQuery(name = "IndOpi.findByLibNomIndOpiArb", query = "SELECT i FROM IndOpi i WHERE i.libNomIndOpiArb = :libNomIndOpiArb"),
    @NamedQuery(name = "IndOpi.findByCinIndOpi", query = "SELECT i FROM IndOpi i WHERE i.cinIndOpi = :cinIndOpi"),
    @NamedQuery(name = "IndOpi.findByCodSexOpi", query = "SELECT i FROM IndOpi i WHERE i.codSexOpi = :codSexOpi"),
    @NamedQuery(name = "IndOpi.findByLibPrnIndOpiArb", query = "SELECT i FROM IndOpi i WHERE i.libPrnIndOpiArb = :libPrnIndOpiArb"),
    @NamedQuery(name = "IndOpi.findByLibVilNaiEtuOpiArb", query = "SELECT i FROM IndOpi i WHERE i.libVilNaiEtuOpiArb = :libVilNaiEtuOpiArb"),
    @NamedQuery(name = "IndOpi.findByCodThp", query = "SELECT i FROM IndOpi i WHERE i.codThp = :codThp")})
public class IndOpi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_IND_OPI")
    private Integer codIndOpi;
    @Size(max = 10)
    @Column(name = "COD_NNE_IND_OPI")
    private String codNneIndOpi;
    @Size(max = 1)
    @Column(name = "COD_CLE_NNE_IND_OPI")
    private String codCleNneIndOpi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_NAI_IND_OPI")
    @Temporal(TemporalType.DATE)
    private Date dateNaiIndOpi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DATE_NAI_REL_OPI")
    private String temDateNaiRelOpi;
    @Size(max = 4)
    @Column(name = "DAA_LBT_IND_OPI")
    private String daaLbtIndOpi;
    @Size(max = 2)
    @Column(name = "DMM_LBT_IND_OPI")
    private String dmmLbtIndOpi;
    @Size(max = 4)
    @Column(name = "DAA_ENT_ETB_OPI")
    private String daaEntEtbOpi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "LIB_NOM_PAT_IND_OPI")
    private String libNomPatIndOpi;
    @Size(max = 30)
    @Column(name = "LIB_NOM_USU_IND_OPI")
    private String libNomUsuIndOpi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "LIB_PR1_IND_OPI")
    private String libPr1IndOpi;
    @Size(max = 20)
    @Column(name = "LIB_PR2_IND_OPI")
    private String libPr2IndOpi;
    @Size(max = 20)
    @Column(name = "LIB_PR3_IND_OPI")
    private String libPr3IndOpi;
    @Size(max = 15)
    @Column(name = "NUM_TEL_IND_OPI")
    private String numTelIndOpi;
    @Column(name = "COD_ETU_OPI")
    private Integer codEtuOpi;
    @Size(max = 30)
    @Column(name = "LIB_VIL_NAI_ETU_OPI")
    private String libVilNaiEtuOpi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_OPI_INT_EPO")
    private String codOpiIntEpo;
    @Column(name = "DUR_EXP_PRO_EPO")
    private Short durExpProEpo;
    @Size(max = 15)
    @Column(name = "NUM_TEL_TEMP_EPO")
    private String numTelTempEpo;
    @Size(max = 1)
    @Column(name = "TEM_EXP_PRO_EPO")
    private String temExpProEpo;
    @Size(max = 1)
    @Column(name = "TEM_INT_EPO")
    private String temIntEpo;
    @Column(name = "TEM_MI_TPS_EPO")
    private Short temMiTpsEpo;
    @Size(max = 3)
    @Column(name = "COD_DEP_PAY_NAI")
    private String codDepPayNai;
    @Size(max = 1)
    @Column(name = "COD_TYP_DEP_PAY_NAI")
    private String codTypDepPayNai;
    @Size(max = 4)
    @Column(name = "DAA_ENS_SUP_OPI")
    private String daaEnsSupOpi;
    @Size(max = 4)
    @Column(name = "DAA_ETB_OPI")
    private String daaEtbOpi;
    @Size(max = 30)
    @Column(name = "LIB_NOM_IND_OPI_ARB")
    private String libNomIndOpiArb;
    @Size(max = 10)
    @Column(name = "CIN_IND_OPI")
    private String cinIndOpi;
    @Size(max = 1)
    @Column(name = "COD_SEX_OPI")
    private String codSexOpi;
    @Size(max = 30)
    @Column(name = "LIB_PRN_IND_OPI_ARB")
    private String libPrnIndOpiArb;
    @Size(max = 30)
    @Column(name = "LIB_VIL_NAI_ETU_OPI_ARB")
    private String libVilNaiEtuOpiArb;
    @Size(max = 2)
    @Column(name = "COD_THP")
    private String codThp;
    @JoinColumn(name = "COD_PCS", referencedColumnName = "COD_PCS")
    @ManyToOne
    private CatSocPfl codPcs;
    @JoinColumn(name = "COD_DAP", referencedColumnName = "COD_DAP")
    @ManyToOne
    private DomaineActPfl codDap;
    @JoinColumn(name = "COD_ETB", referencedColumnName = "COD_ETB")
    @ManyToOne
    private Etablissement codEtb;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND")
    @ManyToOne
    private Individu codInd;
    @JoinColumn(name = "COD_PAY_NAT", referencedColumnName = "COD_PAY")
    @ManyToOne
    private Pays codPayNat;
    @JoinColumn(name = "COD_FAM", referencedColumnName = "COD_FAM")
    @ManyToOne
    private SitFam codFam;
    @JoinColumn(name = "COD_SIM", referencedColumnName = "COD_SIM")
    @ManyToOne
    private SitMil codSim;
    @OneToMany(mappedBy = "codIndOpi")
    private List<Individu> individuList;

    public IndOpi() {
    }

    public IndOpi(Integer codIndOpi) {
        this.codIndOpi = codIndOpi;
    }

    public IndOpi(Integer codIndOpi, Date dateNaiIndOpi, String temDateNaiRelOpi, String libNomPatIndOpi, String libPr1IndOpi, String codOpiIntEpo) {
        this.codIndOpi = codIndOpi;
        this.dateNaiIndOpi = dateNaiIndOpi;
        this.temDateNaiRelOpi = temDateNaiRelOpi;
        this.libNomPatIndOpi = libNomPatIndOpi;
        this.libPr1IndOpi = libPr1IndOpi;
        this.codOpiIntEpo = codOpiIntEpo;
    }

    public Integer getCodIndOpi() {
        return codIndOpi;
    }

    public void setCodIndOpi(Integer codIndOpi) {
        this.codIndOpi = codIndOpi;
    }

    public String getCodNneIndOpi() {
        return codNneIndOpi;
    }

    public void setCodNneIndOpi(String codNneIndOpi) {
        this.codNneIndOpi = codNneIndOpi;
    }

    public String getCodCleNneIndOpi() {
        return codCleNneIndOpi;
    }

    public void setCodCleNneIndOpi(String codCleNneIndOpi) {
        this.codCleNneIndOpi = codCleNneIndOpi;
    }

    public Date getDateNaiIndOpi() {
        return dateNaiIndOpi;
    }

    public void setDateNaiIndOpi(Date dateNaiIndOpi) {
        this.dateNaiIndOpi = dateNaiIndOpi;
    }

    public String getTemDateNaiRelOpi() {
        return temDateNaiRelOpi;
    }

    public void setTemDateNaiRelOpi(String temDateNaiRelOpi) {
        this.temDateNaiRelOpi = temDateNaiRelOpi;
    }

    public String getDaaLbtIndOpi() {
        return daaLbtIndOpi;
    }

    public void setDaaLbtIndOpi(String daaLbtIndOpi) {
        this.daaLbtIndOpi = daaLbtIndOpi;
    }

    public String getDmmLbtIndOpi() {
        return dmmLbtIndOpi;
    }

    public void setDmmLbtIndOpi(String dmmLbtIndOpi) {
        this.dmmLbtIndOpi = dmmLbtIndOpi;
    }

    public String getDaaEntEtbOpi() {
        return daaEntEtbOpi;
    }

    public void setDaaEntEtbOpi(String daaEntEtbOpi) {
        this.daaEntEtbOpi = daaEntEtbOpi;
    }

    public String getLibNomPatIndOpi() {
        return libNomPatIndOpi;
    }

    public void setLibNomPatIndOpi(String libNomPatIndOpi) {
        this.libNomPatIndOpi = libNomPatIndOpi;
    }

    public String getLibNomUsuIndOpi() {
        return libNomUsuIndOpi;
    }

    public void setLibNomUsuIndOpi(String libNomUsuIndOpi) {
        this.libNomUsuIndOpi = libNomUsuIndOpi;
    }

    public String getLibPr1IndOpi() {
        return libPr1IndOpi;
    }

    public void setLibPr1IndOpi(String libPr1IndOpi) {
        this.libPr1IndOpi = libPr1IndOpi;
    }

    public String getLibPr2IndOpi() {
        return libPr2IndOpi;
    }

    public void setLibPr2IndOpi(String libPr2IndOpi) {
        this.libPr2IndOpi = libPr2IndOpi;
    }

    public String getLibPr3IndOpi() {
        return libPr3IndOpi;
    }

    public void setLibPr3IndOpi(String libPr3IndOpi) {
        this.libPr3IndOpi = libPr3IndOpi;
    }

    public String getNumTelIndOpi() {
        return numTelIndOpi;
    }

    public void setNumTelIndOpi(String numTelIndOpi) {
        this.numTelIndOpi = numTelIndOpi;
    }

    public Integer getCodEtuOpi() {
        return codEtuOpi;
    }

    public void setCodEtuOpi(Integer codEtuOpi) {
        this.codEtuOpi = codEtuOpi;
    }

    public String getLibVilNaiEtuOpi() {
        return libVilNaiEtuOpi;
    }

    public void setLibVilNaiEtuOpi(String libVilNaiEtuOpi) {
        this.libVilNaiEtuOpi = libVilNaiEtuOpi;
    }

    public String getCodOpiIntEpo() {
        return codOpiIntEpo;
    }

    public void setCodOpiIntEpo(String codOpiIntEpo) {
        this.codOpiIntEpo = codOpiIntEpo;
    }

    public Short getDurExpProEpo() {
        return durExpProEpo;
    }

    public void setDurExpProEpo(Short durExpProEpo) {
        this.durExpProEpo = durExpProEpo;
    }

    public String getNumTelTempEpo() {
        return numTelTempEpo;
    }

    public void setNumTelTempEpo(String numTelTempEpo) {
        this.numTelTempEpo = numTelTempEpo;
    }

    public String getTemExpProEpo() {
        return temExpProEpo;
    }

    public void setTemExpProEpo(String temExpProEpo) {
        this.temExpProEpo = temExpProEpo;
    }

    public String getTemIntEpo() {
        return temIntEpo;
    }

    public void setTemIntEpo(String temIntEpo) {
        this.temIntEpo = temIntEpo;
    }

    public Short getTemMiTpsEpo() {
        return temMiTpsEpo;
    }

    public void setTemMiTpsEpo(Short temMiTpsEpo) {
        this.temMiTpsEpo = temMiTpsEpo;
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

    public String getDaaEnsSupOpi() {
        return daaEnsSupOpi;
    }

    public void setDaaEnsSupOpi(String daaEnsSupOpi) {
        this.daaEnsSupOpi = daaEnsSupOpi;
    }

    public String getDaaEtbOpi() {
        return daaEtbOpi;
    }

    public void setDaaEtbOpi(String daaEtbOpi) {
        this.daaEtbOpi = daaEtbOpi;
    }

    public String getLibNomIndOpiArb() {
        return libNomIndOpiArb;
    }

    public void setLibNomIndOpiArb(String libNomIndOpiArb) {
        this.libNomIndOpiArb = libNomIndOpiArb;
    }

    public String getCinIndOpi() {
        return cinIndOpi;
    }

    public void setCinIndOpi(String cinIndOpi) {
        this.cinIndOpi = cinIndOpi;
    }

    public String getCodSexOpi() {
        return codSexOpi;
    }

    public void setCodSexOpi(String codSexOpi) {
        this.codSexOpi = codSexOpi;
    }

    public String getLibPrnIndOpiArb() {
        return libPrnIndOpiArb;
    }

    public void setLibPrnIndOpiArb(String libPrnIndOpiArb) {
        this.libPrnIndOpiArb = libPrnIndOpiArb;
    }

    public String getLibVilNaiEtuOpiArb() {
        return libVilNaiEtuOpiArb;
    }

    public void setLibVilNaiEtuOpiArb(String libVilNaiEtuOpiArb) {
        this.libVilNaiEtuOpiArb = libVilNaiEtuOpiArb;
    }

    public String getCodThp() {
        return codThp;
    }

    public void setCodThp(String codThp) {
        this.codThp = codThp;
    }

    public CatSocPfl getCodPcs() {
        return codPcs;
    }

    public void setCodPcs(CatSocPfl codPcs) {
        this.codPcs = codPcs;
    }

    public DomaineActPfl getCodDap() {
        return codDap;
    }

    public void setCodDap(DomaineActPfl codDap) {
        this.codDap = codDap;
    }

    public Etablissement getCodEtb() {
        return codEtb;
    }

    public void setCodEtb(Etablissement codEtb) {
        this.codEtb = codEtb;
    }

    public Individu getCodInd() {
        return codInd;
    }

    public void setCodInd(Individu codInd) {
        this.codInd = codInd;
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

    @XmlTransient
    public List<Individu> getIndividuList() {
        return individuList;
    }

    public void setIndividuList(List<Individu> individuList) {
        this.individuList = individuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codIndOpi != null ? codIndOpi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndOpi)) {
            return false;
        }
        IndOpi other = (IndOpi) object;
        if ((this.codIndOpi == null && other.codIndOpi != null) || (this.codIndOpi != null && !this.codIndOpi.equals(other.codIndOpi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.IndOpi[ codIndOpi=" + codIndOpi + " ]";
    }
    
}
