/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "LSE_REGROUPE_ELP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LseRegroupeElp.findAll", query = "SELECT l FROM LseRegroupeElp l"),
    @NamedQuery(name = "LseRegroupeElp.findByCodLse", query = "SELECT l FROM LseRegroupeElp l WHERE l.lseRegroupeElpPK.codLse = :codLse"),
    @NamedQuery(name = "LseRegroupeElp.findByCodElp", query = "SELECT l FROM LseRegroupeElp l WHERE l.lseRegroupeElpPK.codElp = :codElp"),
    @NamedQuery(name = "LseRegroupeElp.findByCoeAdm1", query = "SELECT l FROM LseRegroupeElp l WHERE l.coeAdm1 = :coeAdm1"),
    @NamedQuery(name = "LseRegroupeElp.findByCoeAdm2", query = "SELECT l FROM LseRegroupeElp l WHERE l.coeAdm2 = :coeAdm2"),
    @NamedQuery(name = "LseRegroupeElp.findByCoeAdmA", query = "SELECT l FROM LseRegroupeElp l WHERE l.coeAdmA = :coeAdmA"),
    @NamedQuery(name = "LseRegroupeElp.findByCoeElp1", query = "SELECT l FROM LseRegroupeElp l WHERE l.coeElp1 = :coeElp1"),
    @NamedQuery(name = "LseRegroupeElp.findByCoeElp2", query = "SELECT l FROM LseRegroupeElp l WHERE l.coeElp2 = :coeElp2"),
    @NamedQuery(name = "LseRegroupeElp.findByCoeElpA", query = "SELECT l FROM LseRegroupeElp l WHERE l.coeElpA = :coeElpA"),
    @NamedQuery(name = "LseRegroupeElp.findByDurCsvElp", query = "SELECT l FROM LseRegroupeElp l WHERE l.durCsvElp = :durCsvElp"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMa1Num", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMa1Num = :notMa1Num"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMa1Den", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMa1Den = :notMa1Den"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMa2Num", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMa2Num = :notMa2Num"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMa2Den", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMa2Den = :notMa2Den"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMaaNum", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMaaNum = :notMaaNum"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMaaDen", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMaaDen = :notMaaDen"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMi1Num", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMi1Num = :notMi1Num"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMi1Den", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMi1Den = :notMi1Den"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMi2Num", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMi2Num = :notMi2Num"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMi2Den", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMi2Den = :notMi2Den"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMiaNum", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMiaNum = :notMiaNum"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMiaDen", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMiaDen = :notMiaDen"),
    @NamedQuery(name = "LseRegroupeElp.findByTemCalCns", query = "SELECT l FROM LseRegroupeElp l WHERE l.temCalCns = :temCalCns"),
    @NamedQuery(name = "LseRegroupeElp.findByTemElpCsv", query = "SELECT l FROM LseRegroupeElp l WHERE l.temElpCsv = :temElpCsv"),
    @NamedQuery(name = "LseRegroupeElp.findByTemNotElp", query = "SELECT l FROM LseRegroupeElp l WHERE l.temNotElp = :temNotElp"),
    @NamedQuery(name = "LseRegroupeElp.findByTemResElp", query = "SELECT l FROM LseRegroupeElp l WHERE l.temResElp = :temResElp"),
    @NamedQuery(name = "LseRegroupeElp.findByTemElpAsd", query = "SELECT l FROM LseRegroupeElp l WHERE l.temElpAsd = :temElpAsd"),
    @NamedQuery(name = "LseRegroupeElp.findByNotDisFacOblChxNum", query = "SELECT l FROM LseRegroupeElp l WHERE l.notDisFacOblChxNum = :notDisFacOblChxNum"),
    @NamedQuery(name = "LseRegroupeElp.findByNotDisFacOblChxDen", query = "SELECT l FROM LseRegroupeElp l WHERE l.notDisFacOblChxDen = :notDisFacOblChxDen"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMinPntNumFac", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMinPntNumFac = :notMinPntNumFac"),
    @NamedQuery(name = "LseRegroupeElp.findByNotMinPntDenFac", query = "SELECT l FROM LseRegroupeElp l WHERE l.notMinPntDenFac = :notMinPntDenFac"),
    @NamedQuery(name = "LseRegroupeElp.findByNbrPntMaxFac", query = "SELECT l FROM LseRegroupeElp l WHERE l.nbrPntMaxFac = :nbrPntMaxFac"),
    @NamedQuery(name = "LseRegroupeElp.findByTemGesPntFac", query = "SELECT l FROM LseRegroupeElp l WHERE l.temGesPntFac = :temGesPntFac"),
    @NamedQuery(name = "LseRegroupeElp.findByTemElpCpbOblChx", query = "SELECT l FROM LseRegroupeElp l WHERE l.temElpCpbOblChx = :temElpCpbOblChx")})
public class LseRegroupeElp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LseRegroupeElpPK lseRegroupeElpPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COE_ADM_1")
    private BigDecimal coeAdm1;
    @Column(name = "COE_ADM_2")
    private BigDecimal coeAdm2;
    @Column(name = "COE_ADM_A")
    private BigDecimal coeAdmA;
    @Column(name = "COE_ELP_1")
    private BigDecimal coeElp1;
    @Column(name = "COE_ELP_2")
    private BigDecimal coeElp2;
    @Column(name = "COE_ELP_A")
    private BigDecimal coeElpA;
    @Column(name = "DUR_CSV_ELP")
    private Short durCsvElp;
    @Column(name = "NOT_MA1_NUM")
    private BigDecimal notMa1Num;
    @Column(name = "NOT_MA1_DEN")
    private BigDecimal notMa1Den;
    @Column(name = "NOT_MA2_NUM")
    private BigDecimal notMa2Num;
    @Column(name = "NOT_MA2_DEN")
    private BigDecimal notMa2Den;
    @Column(name = "NOT_MAA_NUM")
    private BigDecimal notMaaNum;
    @Column(name = "NOT_MAA_DEN")
    private BigDecimal notMaaDen;
    @Column(name = "NOT_MI1_NUM")
    private BigDecimal notMi1Num;
    @Column(name = "NOT_MI1_DEN")
    private BigDecimal notMi1Den;
    @Column(name = "NOT_MI2_NUM")
    private BigDecimal notMi2Num;
    @Column(name = "NOT_MI2_DEN")
    private BigDecimal notMi2Den;
    @Column(name = "NOT_MIA_NUM")
    private BigDecimal notMiaNum;
    @Column(name = "NOT_MIA_DEN")
    private BigDecimal notMiaDen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CAL_CNS")
    private String temCalCns;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ELP_CSV")
    private String temElpCsv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NOT_ELP")
    private String temNotElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RES_ELP")
    private String temResElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ELP_ASD")
    private String temElpAsd;
    @Column(name = "NOT_DIS_FAC_OBL_CHX_NUM")
    private BigDecimal notDisFacOblChxNum;
    @Column(name = "NOT_DIS_FAC_OBL_CHX_DEN")
    private BigDecimal notDisFacOblChxDen;
    @Column(name = "NOT_MIN_PNT_NUM_FAC")
    private BigDecimal notMinPntNumFac;
    @Column(name = "NOT_MIN_PNT_DEN_FAC")
    private BigDecimal notMinPntDenFac;
    @Column(name = "NBR_PNT_MAX_FAC")
    private Integer nbrPntMaxFac;
    @Size(max = 1)
    @Column(name = "TEM_GES_PNT_FAC")
    private String temGesPntFac;
    @Size(max = 1)
    @Column(name = "TEM_ELP_CPB_OBL_CHX")
    private String temElpCpbOblChx;
    @JoinColumn(name = "COD_ELP", referencedColumnName = "COD_ELP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ElementPedagogi elementPedagogi;
    @JoinColumn(name = "COD_LSE", referencedColumnName = "COD_LSE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeElp listeElp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lseRegroupeElp")
    private List<IndContratElp> indContratElpList;

    public LseRegroupeElp() {
    }

    public LseRegroupeElp(LseRegroupeElpPK lseRegroupeElpPK) {
        this.lseRegroupeElpPK = lseRegroupeElpPK;
    }

    public LseRegroupeElp(LseRegroupeElpPK lseRegroupeElpPK, String temCalCns, String temElpCsv, String temNotElp, String temResElp, String temElpAsd) {
        this.lseRegroupeElpPK = lseRegroupeElpPK;
        this.temCalCns = temCalCns;
        this.temElpCsv = temElpCsv;
        this.temNotElp = temNotElp;
        this.temResElp = temResElp;
        this.temElpAsd = temElpAsd;
    }

    public LseRegroupeElp(String codLse, String codElp) {
        this.lseRegroupeElpPK = new LseRegroupeElpPK(codLse, codElp);
    }

    public LseRegroupeElpPK getLseRegroupeElpPK() {
        return lseRegroupeElpPK;
    }

    public void setLseRegroupeElpPK(LseRegroupeElpPK lseRegroupeElpPK) {
        this.lseRegroupeElpPK = lseRegroupeElpPK;
    }

    public BigDecimal getCoeAdm1() {
        return coeAdm1;
    }

    public void setCoeAdm1(BigDecimal coeAdm1) {
        this.coeAdm1 = coeAdm1;
    }

    public BigDecimal getCoeAdm2() {
        return coeAdm2;
    }

    public void setCoeAdm2(BigDecimal coeAdm2) {
        this.coeAdm2 = coeAdm2;
    }

    public BigDecimal getCoeAdmA() {
        return coeAdmA;
    }

    public void setCoeAdmA(BigDecimal coeAdmA) {
        this.coeAdmA = coeAdmA;
    }

    public BigDecimal getCoeElp1() {
        return coeElp1;
    }

    public void setCoeElp1(BigDecimal coeElp1) {
        this.coeElp1 = coeElp1;
    }

    public BigDecimal getCoeElp2() {
        return coeElp2;
    }

    public void setCoeElp2(BigDecimal coeElp2) {
        this.coeElp2 = coeElp2;
    }

    public BigDecimal getCoeElpA() {
        return coeElpA;
    }

    public void setCoeElpA(BigDecimal coeElpA) {
        this.coeElpA = coeElpA;
    }

    public Short getDurCsvElp() {
        return durCsvElp;
    }

    public void setDurCsvElp(Short durCsvElp) {
        this.durCsvElp = durCsvElp;
    }

    public BigDecimal getNotMa1Num() {
        return notMa1Num;
    }

    public void setNotMa1Num(BigDecimal notMa1Num) {
        this.notMa1Num = notMa1Num;
    }

    public BigDecimal getNotMa1Den() {
        return notMa1Den;
    }

    public void setNotMa1Den(BigDecimal notMa1Den) {
        this.notMa1Den = notMa1Den;
    }

    public BigDecimal getNotMa2Num() {
        return notMa2Num;
    }

    public void setNotMa2Num(BigDecimal notMa2Num) {
        this.notMa2Num = notMa2Num;
    }

    public BigDecimal getNotMa2Den() {
        return notMa2Den;
    }

    public void setNotMa2Den(BigDecimal notMa2Den) {
        this.notMa2Den = notMa2Den;
    }

    public BigDecimal getNotMaaNum() {
        return notMaaNum;
    }

    public void setNotMaaNum(BigDecimal notMaaNum) {
        this.notMaaNum = notMaaNum;
    }

    public BigDecimal getNotMaaDen() {
        return notMaaDen;
    }

    public void setNotMaaDen(BigDecimal notMaaDen) {
        this.notMaaDen = notMaaDen;
    }

    public BigDecimal getNotMi1Num() {
        return notMi1Num;
    }

    public void setNotMi1Num(BigDecimal notMi1Num) {
        this.notMi1Num = notMi1Num;
    }

    public BigDecimal getNotMi1Den() {
        return notMi1Den;
    }

    public void setNotMi1Den(BigDecimal notMi1Den) {
        this.notMi1Den = notMi1Den;
    }

    public BigDecimal getNotMi2Num() {
        return notMi2Num;
    }

    public void setNotMi2Num(BigDecimal notMi2Num) {
        this.notMi2Num = notMi2Num;
    }

    public BigDecimal getNotMi2Den() {
        return notMi2Den;
    }

    public void setNotMi2Den(BigDecimal notMi2Den) {
        this.notMi2Den = notMi2Den;
    }

    public BigDecimal getNotMiaNum() {
        return notMiaNum;
    }

    public void setNotMiaNum(BigDecimal notMiaNum) {
        this.notMiaNum = notMiaNum;
    }

    public BigDecimal getNotMiaDen() {
        return notMiaDen;
    }

    public void setNotMiaDen(BigDecimal notMiaDen) {
        this.notMiaDen = notMiaDen;
    }

    public String getTemCalCns() {
        return temCalCns;
    }

    public void setTemCalCns(String temCalCns) {
        this.temCalCns = temCalCns;
    }

    public String getTemElpCsv() {
        return temElpCsv;
    }

    public void setTemElpCsv(String temElpCsv) {
        this.temElpCsv = temElpCsv;
    }

    public String getTemNotElp() {
        return temNotElp;
    }

    public void setTemNotElp(String temNotElp) {
        this.temNotElp = temNotElp;
    }

    public String getTemResElp() {
        return temResElp;
    }

    public void setTemResElp(String temResElp) {
        this.temResElp = temResElp;
    }

    public String getTemElpAsd() {
        return temElpAsd;
    }

    public void setTemElpAsd(String temElpAsd) {
        this.temElpAsd = temElpAsd;
    }

    public BigDecimal getNotDisFacOblChxNum() {
        return notDisFacOblChxNum;
    }

    public void setNotDisFacOblChxNum(BigDecimal notDisFacOblChxNum) {
        this.notDisFacOblChxNum = notDisFacOblChxNum;
    }

    public BigDecimal getNotDisFacOblChxDen() {
        return notDisFacOblChxDen;
    }

    public void setNotDisFacOblChxDen(BigDecimal notDisFacOblChxDen) {
        this.notDisFacOblChxDen = notDisFacOblChxDen;
    }

    public BigDecimal getNotMinPntNumFac() {
        return notMinPntNumFac;
    }

    public void setNotMinPntNumFac(BigDecimal notMinPntNumFac) {
        this.notMinPntNumFac = notMinPntNumFac;
    }

    public BigDecimal getNotMinPntDenFac() {
        return notMinPntDenFac;
    }

    public void setNotMinPntDenFac(BigDecimal notMinPntDenFac) {
        this.notMinPntDenFac = notMinPntDenFac;
    }

    public Integer getNbrPntMaxFac() {
        return nbrPntMaxFac;
    }

    public void setNbrPntMaxFac(Integer nbrPntMaxFac) {
        this.nbrPntMaxFac = nbrPntMaxFac;
    }

    public String getTemGesPntFac() {
        return temGesPntFac;
    }

    public void setTemGesPntFac(String temGesPntFac) {
        this.temGesPntFac = temGesPntFac;
    }

    public String getTemElpCpbOblChx() {
        return temElpCpbOblChx;
    }

    public void setTemElpCpbOblChx(String temElpCpbOblChx) {
        this.temElpCpbOblChx = temElpCpbOblChx;
    }

    public ElementPedagogi getElementPedagogi() {
        return elementPedagogi;
    }

    public void setElementPedagogi(ElementPedagogi elementPedagogi) {
        this.elementPedagogi = elementPedagogi;
    }

    public ListeElp getListeElp() {
        return listeElp;
    }

    public void setListeElp(ListeElp listeElp) {
        this.listeElp = listeElp;
    }

    @XmlTransient
    public List<IndContratElp> getIndContratElpList() {
        return indContratElpList;
    }

    public void setIndContratElpList(List<IndContratElp> indContratElpList) {
        this.indContratElpList = indContratElpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lseRegroupeElpPK != null ? lseRegroupeElpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LseRegroupeElp)) {
            return false;
        }
        LseRegroupeElp other = (LseRegroupeElp) object;
        if ((this.lseRegroupeElpPK == null && other.lseRegroupeElpPK != null) || (this.lseRegroupeElpPK != null && !this.lseRegroupeElpPK.equals(other.lseRegroupeElpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.LseRegroupeElp[ lseRegroupeElpPK=" + lseRegroupeElpPK + " ]";
    }
    
}
