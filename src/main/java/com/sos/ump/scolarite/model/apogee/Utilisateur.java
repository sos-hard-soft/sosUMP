/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "UTILISATEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByCodUti", query = "SELECT u FROM Utilisateur u WHERE u.codUti = :codUti"),
    @NamedQuery(name = "Utilisateur.findByLibCmtUti", query = "SELECT u FROM Utilisateur u WHERE u.libCmtUti = :libCmtUti"),
    @NamedQuery(name = "Utilisateur.findByTemEnSveUti", query = "SELECT u FROM Utilisateur u WHERE u.temEnSveUti = :temEnSveUti"),
    @NamedQuery(name = "Utilisateur.findByRepExpUti", query = "SELECT u FROM Utilisateur u WHERE u.repExpUti = :repExpUti"),
    @NamedQuery(name = "Utilisateur.findByCodNumUti", query = "SELECT u FROM Utilisateur u WHERE u.codNumUti = :codNumUti"),
    @NamedQuery(name = "Utilisateur.findByTemPilUti", query = "SELECT u FROM Utilisateur u WHERE u.temPilUti = :temPilUti"),
    @NamedQuery(name = "Utilisateur.findByCodImpWinA3", query = "SELECT u FROM Utilisateur u WHERE u.codImpWinA3 = :codImpWinA3"),
    @NamedQuery(name = "Utilisateur.findByTemAutSpeMcc", query = "SELECT u FROM Utilisateur u WHERE u.temAutSpeMcc = :temAutSpeMcc")})
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "COD_UTI")
    private String codUti;
    @Size(max = 200)
    @Column(name = "LIB_CMT_UTI")
    private String libCmtUti;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_UTI")
    private String temEnSveUti;
    @Size(max = 60)
    @Column(name = "REP_EXP_UTI")
    private String repExpUti;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_NUM_UTI")
    private int codNumUti;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PIL_UTI")
    private String temPilUti;
    @Size(max = 32)
    @Column(name = "COD_IMP_WIN_A3")
    private String codImpWinA3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_AUT_SPE_MCC")
    private String temAutSpeMcc;
    @ManyToMany(mappedBy = "utilisateurList")
    private List<Composante> composanteList;
    @JoinColumn(name = "COD_CGE", referencedColumnName = "COD_CGE")
    @ManyToOne
    private CentreGestion codCge;
    @JoinColumn(name = "COD_CIN", referencedColumnName = "COD_CIN")
    @ManyToOne
    private CentreIncomp codCin;
    @JoinColumn(name = "COD_CIP", referencedColumnName = "COD_CIP")
    @ManyToOne
    private CentreInsPed codCip;
    @JoinColumn(name = "COD_IMP", referencedColumnName = "COD_IMP")
    @ManyToOne
    private Imprimante codImp;
    @JoinColumn(name = "COD_TUT", referencedColumnName = "COD_TUT")
    @ManyToOne(optional = false)
    private TypUtilisateur codTut;
    @OneToMany(mappedBy = "codUtiMod")
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codUti")
    private List<InsAdmAnu> insAdmAnuList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUti")
    private List<IndContratElp> indContratElpList;
    @OneToMany(mappedBy = "codUtiMod")
    private List<IndContratElp> indContratElpList1;
    @OneToMany(mappedBy = "codUti")
    private List<InsPedagogiEtp> insPedagogiEtpList;
    @OneToMany(mappedBy = "codUtiMod")
    private List<InsPedagogiEtp> insPedagogiEtpList1;
    @OneToMany(mappedBy = "codUtiAcc")
    private List<InsPedagogiEtp> insPedagogiEtpList2;
    @OneToMany(mappedBy = "codUtiMod")
    private List<InsAdmEtp> insAdmEtpList;
    @OneToMany(mappedBy = "codUtiAcc")
    private List<InsAdmEtp> insAdmEtpList1;
    @OneToMany(mappedBy = "codUti")
    private List<InsAdmEtp> insAdmEtpList2;
    @OneToMany(mappedBy = "codUti")
    private List<Individu> individuList;
    @OneToMany(mappedBy = "codUtiMod")
    private List<Individu> individuList1;
    @OneToMany(mappedBy = "codUtiBlo")
    private List<Individu> individuList2;

    public Utilisateur() {
    }

    public Utilisateur(String codUti) {
        this.codUti = codUti;
    }

    public Utilisateur(String codUti, String temEnSveUti, int codNumUti, String temPilUti, String temAutSpeMcc) {
        this.codUti = codUti;
        this.temEnSveUti = temEnSveUti;
        this.codNumUti = codNumUti;
        this.temPilUti = temPilUti;
        this.temAutSpeMcc = temAutSpeMcc;
    }

    public String getCodUti() {
        return codUti;
    }

    public void setCodUti(String codUti) {
        this.codUti = codUti;
    }

    public String getLibCmtUti() {
        return libCmtUti;
    }

    public void setLibCmtUti(String libCmtUti) {
        this.libCmtUti = libCmtUti;
    }

    public String getTemEnSveUti() {
        return temEnSveUti;
    }

    public void setTemEnSveUti(String temEnSveUti) {
        this.temEnSveUti = temEnSveUti;
    }

    public String getRepExpUti() {
        return repExpUti;
    }

    public void setRepExpUti(String repExpUti) {
        this.repExpUti = repExpUti;
    }

    public int getCodNumUti() {
        return codNumUti;
    }

    public void setCodNumUti(int codNumUti) {
        this.codNumUti = codNumUti;
    }

    public String getTemPilUti() {
        return temPilUti;
    }

    public void setTemPilUti(String temPilUti) {
        this.temPilUti = temPilUti;
    }

    public String getCodImpWinA3() {
        return codImpWinA3;
    }

    public void setCodImpWinA3(String codImpWinA3) {
        this.codImpWinA3 = codImpWinA3;
    }

    public String getTemAutSpeMcc() {
        return temAutSpeMcc;
    }

    public void setTemAutSpeMcc(String temAutSpeMcc) {
        this.temAutSpeMcc = temAutSpeMcc;
    }

    @XmlTransient
    public List<Composante> getComposanteList() {
        return composanteList;
    }

    public void setComposanteList(List<Composante> composanteList) {
        this.composanteList = composanteList;
    }

    public CentreGestion getCodCge() {
        return codCge;
    }

    public void setCodCge(CentreGestion codCge) {
        this.codCge = codCge;
    }

    public CentreIncomp getCodCin() {
        return codCin;
    }

    public void setCodCin(CentreIncomp codCin) {
        this.codCin = codCin;
    }

    public CentreInsPed getCodCip() {
        return codCip;
    }

    public void setCodCip(CentreInsPed codCip) {
        this.codCip = codCip;
    }

    public Imprimante getCodImp() {
        return codImp;
    }

    public void setCodImp(Imprimante codImp) {
        this.codImp = codImp;
    }

    public TypUtilisateur getCodTut() {
        return codTut;
    }

    public void setCodTut(TypUtilisateur codTut) {
        this.codTut = codTut;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList1() {
        return insAdmAnuList1;
    }

    public void setInsAdmAnuList1(List<InsAdmAnu> insAdmAnuList1) {
        this.insAdmAnuList1 = insAdmAnuList1;
    }

    @XmlTransient
    public List<IndContratElp> getIndContratElpList() {
        return indContratElpList;
    }

    public void setIndContratElpList(List<IndContratElp> indContratElpList) {
        this.indContratElpList = indContratElpList;
    }

    @XmlTransient
    public List<IndContratElp> getIndContratElpList1() {
        return indContratElpList1;
    }

    public void setIndContratElpList1(List<IndContratElp> indContratElpList1) {
        this.indContratElpList1 = indContratElpList1;
    }

    @XmlTransient
    public List<InsPedagogiEtp> getInsPedagogiEtpList() {
        return insPedagogiEtpList;
    }

    public void setInsPedagogiEtpList(List<InsPedagogiEtp> insPedagogiEtpList) {
        this.insPedagogiEtpList = insPedagogiEtpList;
    }

    @XmlTransient
    public List<InsPedagogiEtp> getInsPedagogiEtpList1() {
        return insPedagogiEtpList1;
    }

    public void setInsPedagogiEtpList1(List<InsPedagogiEtp> insPedagogiEtpList1) {
        this.insPedagogiEtpList1 = insPedagogiEtpList1;
    }

    @XmlTransient
    public List<InsPedagogiEtp> getInsPedagogiEtpList2() {
        return insPedagogiEtpList2;
    }

    public void setInsPedagogiEtpList2(List<InsPedagogiEtp> insPedagogiEtpList2) {
        this.insPedagogiEtpList2 = insPedagogiEtpList2;
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

    @XmlTransient
    public List<InsAdmEtp> getInsAdmEtpList2() {
        return insAdmEtpList2;
    }

    public void setInsAdmEtpList2(List<InsAdmEtp> insAdmEtpList2) {
        this.insAdmEtpList2 = insAdmEtpList2;
    }

    @XmlTransient
    public List<Individu> getIndividuList() {
        return individuList;
    }

    public void setIndividuList(List<Individu> individuList) {
        this.individuList = individuList;
    }

    @XmlTransient
    public List<Individu> getIndividuList1() {
        return individuList1;
    }

    public void setIndividuList1(List<Individu> individuList1) {
        this.individuList1 = individuList1;
    }

    @XmlTransient
    public List<Individu> getIndividuList2() {
        return individuList2;
    }

    public void setIndividuList2(List<Individu> individuList2) {
        this.individuList2 = individuList2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUti != null ? codUti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.codUti == null && other.codUti != null) || (this.codUti != null && !this.codUti.equals(other.codUti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Utilisateur[ codUti=" + codUti + " ]";
    }
    
}
