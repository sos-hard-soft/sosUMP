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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
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
@Table(name = "COMPOSANTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Composante.findAll", query = "SELECT c FROM Composante c"),
    @NamedQuery(name = "Composante.findByCodCmp", query = "SELECT c FROM Composante c WHERE c.codCmp = :codCmp"),
    @NamedQuery(name = "Composante.findByCodRneCmp", query = "SELECT c FROM Composante c WHERE c.codRneCmp = :codRneCmp"),
    @NamedQuery(name = "Composante.findByLibCmp", query = "SELECT c FROM Composante c WHERE c.libCmp = :libCmp"),
    @NamedQuery(name = "Composante.findByLicCmp", query = "SELECT c FROM Composante c WHERE c.licCmp = :licCmp"),
    @NamedQuery(name = "Composante.findByLibCmtCmp", query = "SELECT c FROM Composante c WHERE c.libCmtCmp = :libCmtCmp"),
    @NamedQuery(name = "Composante.findByLibAd1Cmp", query = "SELECT c FROM Composante c WHERE c.libAd1Cmp = :libAd1Cmp"),
    @NamedQuery(name = "Composante.findByLibAd2Cmp", query = "SELECT c FROM Composante c WHERE c.libAd2Cmp = :libAd2Cmp"),
    @NamedQuery(name = "Composante.findByLibAd3Cmp", query = "SELECT c FROM Composante c WHERE c.libAd3Cmp = :libAd3Cmp"),
    @NamedQuery(name = "Composante.findByTemCouAccTrvCmp", query = "SELECT c FROM Composante c WHERE c.temCouAccTrvCmp = :temCouAccTrvCmp"),
    @NamedQuery(name = "Composante.findByTemElcCmp", query = "SELECT c FROM Composante c WHERE c.temElcCmp = :temElcCmp"),
    @NamedQuery(name = "Composante.findByTemEnSveCmp", query = "SELECT c FROM Composante c WHERE c.temEnSveCmp = :temEnSveCmp"),
    @NamedQuery(name = "Composante.findByCodNatCmp", query = "SELECT c FROM Composante c WHERE c.codNatCmp = :codNatCmp"),
    @NamedQuery(name = "Composante.findByLim1Cmp", query = "SELECT c FROM Composante c WHERE c.lim1Cmp = :lim1Cmp"),
    @NamedQuery(name = "Composante.findByLim2Cmp", query = "SELECT c FROM Composante c WHERE c.lim2Cmp = :lim2Cmp"),
    @NamedQuery(name = "Composante.findByLim3Cmp", query = "SELECT c FROM Composante c WHERE c.lim3Cmp = :lim3Cmp"),
    @NamedQuery(name = "Composante.findByTemMinCmp", query = "SELECT c FROM Composante c WHERE c.temMinCmp = :temMinCmp"),
    @NamedQuery(name = "Composante.findByNumOrdCmp", query = "SELECT c FROM Composante c WHERE c.numOrdCmp = :numOrdCmp"),
    @NamedQuery(name = "Composante.findByInt1EdiDipCmp", query = "SELECT c FROM Composante c WHERE c.int1EdiDipCmp = :int1EdiDipCmp"),
    @NamedQuery(name = "Composante.findByInt2EdiDipCmp", query = "SELECT c FROM Composante c WHERE c.int2EdiDipCmp = :int2EdiDipCmp"),
    @NamedQuery(name = "Composante.findByLibWebCmp", query = "SELECT c FROM Composante c WHERE c.libWebCmp = :libWebCmp"),
    @NamedQuery(name = "Composante.findByLibCmpArb", query = "SELECT c FROM Composante c WHERE c.libCmpArb = :libCmpArb"),
    @NamedQuery(name = "Composante.findByLicCmpArb", query = "SELECT c FROM Composante c WHERE c.licCmpArb = :licCmpArb"),
    @NamedQuery(name = "Composante.findByLibArtCmp", query = "SELECT c FROM Composante c WHERE c.libArtCmp = :libArtCmp"),
    @NamedQuery(name = "Composante.findByLibAd1CmpArb", query = "SELECT c FROM Composante c WHERE c.libAd1CmpArb = :libAd1CmpArb"),
    @NamedQuery(name = "Composante.findByLibAd2CmpArb", query = "SELECT c FROM Composante c WHERE c.libAd2CmpArb = :libAd2CmpArb"),
    @NamedQuery(name = "Composante.findByLibAd3CmpArb", query = "SELECT c FROM Composante c WHERE c.libAd3CmpArb = :libAd3CmpArb"),
    @NamedQuery(name = "Composante.findByLibVilCmp", query = "SELECT c FROM Composante c WHERE c.libVilCmp = :libVilCmp"),
    @NamedQuery(name = "Composante.findByLibVilCmpArb", query = "SELECT c FROM Composante c WHERE c.libVilCmpArb = :libVilCmpArb"),
    @NamedQuery(name = "Composante.findByLibTtr", query = "SELECT c FROM Composante c WHERE c.libTtr = :libTtr"),
    @NamedQuery(name = "Composante.findByLibTtrArb", query = "SELECT c FROM Composante c WHERE c.libTtrArb = :libTtrArb"),
    @NamedQuery(name = "Composante.findByLibPhr1", query = "SELECT c FROM Composante c WHERE c.libPhr1 = :libPhr1"),
    @NamedQuery(name = "Composante.findByLibPhr2", query = "SELECT c FROM Composante c WHERE c.libPhr2 = :libPhr2"),
    @NamedQuery(name = "Composante.findByLibPhr3", query = "SELECT c FROM Composante c WHERE c.libPhr3 = :libPhr3"),
    @NamedQuery(name = "Composante.findByInt1EdiDipCmpArb", query = "SELECT c FROM Composante c WHERE c.int1EdiDipCmpArb = :int1EdiDipCmpArb"),
    @NamedQuery(name = "Composante.findByInt2EdiDipCmpArb", query = "SELECT c FROM Composante c WHERE c.int2EdiDipCmpArb = :int2EdiDipCmpArb"),
    @NamedQuery(name = "Composante.findByCodCoSig", query = "SELECT c FROM Composante c WHERE c.codCoSig = :codCoSig"),
    @NamedQuery(name = "Composante.findBySurCmpTot", query = "SELECT c FROM Composante c WHERE c.surCmpTot = :surCmpTot"),
    @NamedQuery(name = "Composante.findBySurCmpLib", query = "SELECT c FROM Composante c WHERE c.surCmpLib = :surCmpLib"),
    @NamedQuery(name = "Composante.findBySurCmpCou", query = "SELECT c FROM Composante c WHERE c.surCmpCou = :surCmpCou"),
    @NamedQuery(name = "Composante.findBySurCmpVer", query = "SELECT c FROM Composante c WHERE c.surCmpVer = :surCmpVer"),
    @NamedQuery(name = "Composante.findByLibCmtCmpArb", query = "SELECT c FROM Composante c WHERE c.libCmtCmpArb = :libCmtCmpArb")})
public class Composante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_CMP")
    private String codCmp;
    @Size(max = 8)
    @Column(name = "COD_RNE_CMP")
    private String codRneCmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "LIB_CMP")
    private String libCmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_CMP")
    private String licCmp;
    @Size(max = 200)
    @Column(name = "LIB_CMT_CMP")
    private String libCmtCmp;
    @Size(max = 32)
    @Column(name = "LIB_AD1_CMP")
    private String libAd1Cmp;
    @Size(max = 32)
    @Column(name = "LIB_AD2_CMP")
    private String libAd2Cmp;
    @Size(max = 32)
    @Column(name = "LIB_AD3_CMP")
    private String libAd3Cmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_COU_ACC_TRV_CMP")
    private String temCouAccTrvCmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ELC_CMP")
    private String temElcCmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CMP")
    private String temEnSveCmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_NAT_CMP")
    private String codNatCmp;
    @Size(max = 35)
    @Column(name = "LIM1_CMP")
    private String lim1Cmp;
    @Size(max = 35)
    @Column(name = "LIM2_CMP")
    private String lim2Cmp;
    @Size(max = 35)
    @Column(name = "LIM3_CMP")
    private String lim3Cmp;
    @Size(max = 1)
    @Column(name = "TEM_MIN_CMP")
    private String temMinCmp;
    @Column(name = "NUM_ORD_CMP")
    private Short numOrdCmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "INT_1_EDI_DIP_CMP")
    private String int1EdiDipCmp;
    @Size(max = 60)
    @Column(name = "INT_2_EDI_DIP_CMP")
    private String int2EdiDipCmp;
    @Size(max = 120)
    @Column(name = "LIB_WEB_CMP")
    private String libWebCmp;
    @Size(max = 80)
    @Column(name = "LIB_CMP_ARB")
    private String libCmpArb;
    @Size(max = 10)
    @Column(name = "LIC_CMP_ARB")
    private String licCmpArb;
    @Size(max = 3)
    @Column(name = "LIB_ART_CMP")
    private String libArtCmp;
    @Lob
    @Column(name = "LOGO_CMP")
    private byte[] logoCmp;
    @Size(max = 32)
    @Column(name = "LIB_AD1_CMP_ARB")
    private String libAd1CmpArb;
    @Size(max = 32)
    @Column(name = "LIB_AD2_CMP_ARB")
    private String libAd2CmpArb;
    @Size(max = 32)
    @Column(name = "LIB_AD3_CMP_ARB")
    private String libAd3CmpArb;
    @Size(max = 30)
    @Column(name = "LIB_VIL_CMP")
    private String libVilCmp;
    @Size(max = 30)
    @Column(name = "LIB_VIL_CMP_ARB")
    private String libVilCmpArb;
    @Size(max = 30)
    @Column(name = "LIB_TTR")
    private String libTtr;
    @Size(max = 30)
    @Column(name = "LIB_TTR_ARB")
    private String libTtrArb;
    @Size(max = 30)
    @Column(name = "LIB_PHR1")
    private String libPhr1;
    @Size(max = 30)
    @Column(name = "LIB_PHR2")
    private String libPhr2;
    @Size(max = 30)
    @Column(name = "LIB_PHR3")
    private String libPhr3;
    @Size(max = 60)
    @Column(name = "INT_1_EDI_DIP_CMP_ARB")
    private String int1EdiDipCmpArb;
    @Size(max = 60)
    @Column(name = "INT_2_EDI_DIP_CMP_ARB")
    private String int2EdiDipCmpArb;
    @Size(max = 2)
    @Column(name = "COD_CO_SIG")
    private String codCoSig;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUR_CMP_TOT")
    private BigDecimal surCmpTot;
    @Column(name = "SUR_CMP_LIB")
    private BigDecimal surCmpLib;
    @Column(name = "SUR_CMP_COU")
    private BigDecimal surCmpCou;
    @Column(name = "SUR_CMP_VER")
    private BigDecimal surCmpVer;
    @Size(max = 200)
    @Column(name = "LIB_CMT_CMP_ARB")
    private String libCmtCmpArb;
    @JoinTable(name = "UTI_CMP", joinColumns = {
        @JoinColumn(name = "COD_CMP", referencedColumnName = "COD_CMP")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_UTI", referencedColumnName = "COD_UTI")})
    @ManyToMany
    private List<Utilisateur> utilisateurList;
    @JoinTable(name = "CMP_CORESPONSABLE_ELP", joinColumns = {
        @JoinColumn(name = "COD_CMP", referencedColumnName = "COD_CMP")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_ELP", referencedColumnName = "COD_ELP")})
    @ManyToMany
    private List<ElementPedagogi> elementPedagogiList;
    @ManyToMany(mappedBy = "composanteList")
    private List<CentreInsPed> centreInsPedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCmp")
    private List<VersionEtape> versionEtapeList;
    @JoinColumns({
        @JoinColumn(name = "COD_POS_ADR_CMP", referencedColumnName = "COD_BDI"),
        @JoinColumn(name = "COD_COM_ADR_CMP", referencedColumnName = "COD_COM")})
    @ManyToOne
    private ComBdi comBdi;
    @JoinColumn(name = "COD_CMP_ETB", referencedColumnName = "COD_ETB")
    @ManyToOne
    private Etablissement codCmpEtb;
    @JoinColumn(name = "COD_SIG", referencedColumnName = "COD_SIG")
    @ManyToOne
    private Signataire codSig;
    @JoinColumn(name = "COD_TPC", referencedColumnName = "COD_TPC")
    @ManyToOne(optional = false)
    private TypComposante codTpc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCmp")
    private List<ElementPedagogi> elementPedagogiList1;
    @OneToMany(mappedBy = "codCmp")
    private List<VersionDiplome> versionDiplomeList;
    @OneToMany(mappedBy = "codCmp")
    private List<InsAdmEtp> insAdmEtpList;

    public Composante() {
    }

    public Composante(String codCmp) {
        this.codCmp = codCmp;
    }

    public Composante(String codCmp, String libCmp, String licCmp, String temCouAccTrvCmp, String temElcCmp, String temEnSveCmp, String codNatCmp, String int1EdiDipCmp) {
        this.codCmp = codCmp;
        this.libCmp = libCmp;
        this.licCmp = licCmp;
        this.temCouAccTrvCmp = temCouAccTrvCmp;
        this.temElcCmp = temElcCmp;
        this.temEnSveCmp = temEnSveCmp;
        this.codNatCmp = codNatCmp;
        this.int1EdiDipCmp = int1EdiDipCmp;
    }

    public String getCodCmp() {
        return codCmp;
    }

    public void setCodCmp(String codCmp) {
        this.codCmp = codCmp;
    }

    public String getCodRneCmp() {
        return codRneCmp;
    }

    public void setCodRneCmp(String codRneCmp) {
        this.codRneCmp = codRneCmp;
    }

    public String getLibCmp() {
        return libCmp;
    }

    public void setLibCmp(String libCmp) {
        this.libCmp = libCmp;
    }

    public String getLicCmp() {
        return licCmp;
    }

    public void setLicCmp(String licCmp) {
        this.licCmp = licCmp;
    }

    public String getLibCmtCmp() {
        return libCmtCmp;
    }

    public void setLibCmtCmp(String libCmtCmp) {
        this.libCmtCmp = libCmtCmp;
    }

    public String getLibAd1Cmp() {
        return libAd1Cmp;
    }

    public void setLibAd1Cmp(String libAd1Cmp) {
        this.libAd1Cmp = libAd1Cmp;
    }

    public String getLibAd2Cmp() {
        return libAd2Cmp;
    }

    public void setLibAd2Cmp(String libAd2Cmp) {
        this.libAd2Cmp = libAd2Cmp;
    }

    public String getLibAd3Cmp() {
        return libAd3Cmp;
    }

    public void setLibAd3Cmp(String libAd3Cmp) {
        this.libAd3Cmp = libAd3Cmp;
    }

    public String getTemCouAccTrvCmp() {
        return temCouAccTrvCmp;
    }

    public void setTemCouAccTrvCmp(String temCouAccTrvCmp) {
        this.temCouAccTrvCmp = temCouAccTrvCmp;
    }

    public String getTemElcCmp() {
        return temElcCmp;
    }

    public void setTemElcCmp(String temElcCmp) {
        this.temElcCmp = temElcCmp;
    }

    public String getTemEnSveCmp() {
        return temEnSveCmp;
    }

    public void setTemEnSveCmp(String temEnSveCmp) {
        this.temEnSveCmp = temEnSveCmp;
    }

    public String getCodNatCmp() {
        return codNatCmp;
    }

    public void setCodNatCmp(String codNatCmp) {
        this.codNatCmp = codNatCmp;
    }

    public String getLim1Cmp() {
        return lim1Cmp;
    }

    public void setLim1Cmp(String lim1Cmp) {
        this.lim1Cmp = lim1Cmp;
    }

    public String getLim2Cmp() {
        return lim2Cmp;
    }

    public void setLim2Cmp(String lim2Cmp) {
        this.lim2Cmp = lim2Cmp;
    }

    public String getLim3Cmp() {
        return lim3Cmp;
    }

    public void setLim3Cmp(String lim3Cmp) {
        this.lim3Cmp = lim3Cmp;
    }

    public String getTemMinCmp() {
        return temMinCmp;
    }

    public void setTemMinCmp(String temMinCmp) {
        this.temMinCmp = temMinCmp;
    }

    public Short getNumOrdCmp() {
        return numOrdCmp;
    }

    public void setNumOrdCmp(Short numOrdCmp) {
        this.numOrdCmp = numOrdCmp;
    }

    public String getInt1EdiDipCmp() {
        return int1EdiDipCmp;
    }

    public void setInt1EdiDipCmp(String int1EdiDipCmp) {
        this.int1EdiDipCmp = int1EdiDipCmp;
    }

    public String getInt2EdiDipCmp() {
        return int2EdiDipCmp;
    }

    public void setInt2EdiDipCmp(String int2EdiDipCmp) {
        this.int2EdiDipCmp = int2EdiDipCmp;
    }

    public String getLibWebCmp() {
        return libWebCmp;
    }

    public void setLibWebCmp(String libWebCmp) {
        this.libWebCmp = libWebCmp;
    }

    public String getLibCmpArb() {
        return libCmpArb;
    }

    public void setLibCmpArb(String libCmpArb) {
        this.libCmpArb = libCmpArb;
    }

    public String getLicCmpArb() {
        return licCmpArb;
    }

    public void setLicCmpArb(String licCmpArb) {
        this.licCmpArb = licCmpArb;
    }

    public String getLibArtCmp() {
        return libArtCmp;
    }

    public void setLibArtCmp(String libArtCmp) {
        this.libArtCmp = libArtCmp;
    }

    public byte[] getLogoCmp() {
        return logoCmp;
    }

    public void setLogoCmp(byte[] logoCmp) {
        this.logoCmp = logoCmp;
    }

    public String getLibAd1CmpArb() {
        return libAd1CmpArb;
    }

    public void setLibAd1CmpArb(String libAd1CmpArb) {
        this.libAd1CmpArb = libAd1CmpArb;
    }

    public String getLibAd2CmpArb() {
        return libAd2CmpArb;
    }

    public void setLibAd2CmpArb(String libAd2CmpArb) {
        this.libAd2CmpArb = libAd2CmpArb;
    }

    public String getLibAd3CmpArb() {
        return libAd3CmpArb;
    }

    public void setLibAd3CmpArb(String libAd3CmpArb) {
        this.libAd3CmpArb = libAd3CmpArb;
    }

    public String getLibVilCmp() {
        return libVilCmp;
    }

    public void setLibVilCmp(String libVilCmp) {
        this.libVilCmp = libVilCmp;
    }

    public String getLibVilCmpArb() {
        return libVilCmpArb;
    }

    public void setLibVilCmpArb(String libVilCmpArb) {
        this.libVilCmpArb = libVilCmpArb;
    }

    public String getLibTtr() {
        return libTtr;
    }

    public void setLibTtr(String libTtr) {
        this.libTtr = libTtr;
    }

    public String getLibTtrArb() {
        return libTtrArb;
    }

    public void setLibTtrArb(String libTtrArb) {
        this.libTtrArb = libTtrArb;
    }

    public String getLibPhr1() {
        return libPhr1;
    }

    public void setLibPhr1(String libPhr1) {
        this.libPhr1 = libPhr1;
    }

    public String getLibPhr2() {
        return libPhr2;
    }

    public void setLibPhr2(String libPhr2) {
        this.libPhr2 = libPhr2;
    }

    public String getLibPhr3() {
        return libPhr3;
    }

    public void setLibPhr3(String libPhr3) {
        this.libPhr3 = libPhr3;
    }

    public String getInt1EdiDipCmpArb() {
        return int1EdiDipCmpArb;
    }

    public void setInt1EdiDipCmpArb(String int1EdiDipCmpArb) {
        this.int1EdiDipCmpArb = int1EdiDipCmpArb;
    }

    public String getInt2EdiDipCmpArb() {
        return int2EdiDipCmpArb;
    }

    public void setInt2EdiDipCmpArb(String int2EdiDipCmpArb) {
        this.int2EdiDipCmpArb = int2EdiDipCmpArb;
    }

    public String getCodCoSig() {
        return codCoSig;
    }

    public void setCodCoSig(String codCoSig) {
        this.codCoSig = codCoSig;
    }

    public BigDecimal getSurCmpTot() {
        return surCmpTot;
    }

    public void setSurCmpTot(BigDecimal surCmpTot) {
        this.surCmpTot = surCmpTot;
    }

    public BigDecimal getSurCmpLib() {
        return surCmpLib;
    }

    public void setSurCmpLib(BigDecimal surCmpLib) {
        this.surCmpLib = surCmpLib;
    }

    public BigDecimal getSurCmpCou() {
        return surCmpCou;
    }

    public void setSurCmpCou(BigDecimal surCmpCou) {
        this.surCmpCou = surCmpCou;
    }

    public BigDecimal getSurCmpVer() {
        return surCmpVer;
    }

    public void setSurCmpVer(BigDecimal surCmpVer) {
        this.surCmpVer = surCmpVer;
    }

    public String getLibCmtCmpArb() {
        return libCmtCmpArb;
    }

    public void setLibCmtCmpArb(String libCmtCmpArb) {
        this.libCmtCmpArb = libCmtCmpArb;
    }

    @XmlTransient
    public List<Utilisateur> getUtilisateurList() {
        return utilisateurList;
    }

    public void setUtilisateurList(List<Utilisateur> utilisateurList) {
        this.utilisateurList = utilisateurList;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList() {
        return elementPedagogiList;
    }

    public void setElementPedagogiList(List<ElementPedagogi> elementPedagogiList) {
        this.elementPedagogiList = elementPedagogiList;
    }

    @XmlTransient
    public List<CentreInsPed> getCentreInsPedList() {
        return centreInsPedList;
    }

    public void setCentreInsPedList(List<CentreInsPed> centreInsPedList) {
        this.centreInsPedList = centreInsPedList;
    }

    @XmlTransient
    public List<VersionEtape> getVersionEtapeList() {
        return versionEtapeList;
    }

    public void setVersionEtapeList(List<VersionEtape> versionEtapeList) {
        this.versionEtapeList = versionEtapeList;
    }

    public ComBdi getComBdi() {
        return comBdi;
    }

    public void setComBdi(ComBdi comBdi) {
        this.comBdi = comBdi;
    }

    public Etablissement getCodCmpEtb() {
        return codCmpEtb;
    }

    public void setCodCmpEtb(Etablissement codCmpEtb) {
        this.codCmpEtb = codCmpEtb;
    }

    public Signataire getCodSig() {
        return codSig;
    }

    public void setCodSig(Signataire codSig) {
        this.codSig = codSig;
    }

    public TypComposante getCodTpc() {
        return codTpc;
    }

    public void setCodTpc(TypComposante codTpc) {
        this.codTpc = codTpc;
    }

    @XmlTransient
    public List<ElementPedagogi> getElementPedagogiList1() {
        return elementPedagogiList1;
    }

    public void setElementPedagogiList1(List<ElementPedagogi> elementPedagogiList1) {
        this.elementPedagogiList1 = elementPedagogiList1;
    }

    @XmlTransient
    public List<VersionDiplome> getVersionDiplomeList() {
        return versionDiplomeList;
    }

    public void setVersionDiplomeList(List<VersionDiplome> versionDiplomeList) {
        this.versionDiplomeList = versionDiplomeList;
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
        hash += (codCmp != null ? codCmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Composante)) {
            return false;
        }
        Composante other = (Composante) object;
        if ((this.codCmp == null && other.codCmp != null) || (this.codCmp != null && !this.codCmp.equals(other.codCmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Composante[ codCmp=" + codCmp + " ]";
    }
    
}
