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
@Table(name = "PAYS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pays.findAll", query = "SELECT p FROM Pays p"),
    @NamedQuery(name = "Pays.findByCodPay", query = "SELECT p FROM Pays p WHERE p.codPay = :codPay"),
    @NamedQuery(name = "Pays.findByCodSisPay", query = "SELECT p FROM Pays p WHERE p.codSisPay = :codSisPay"),
    @NamedQuery(name = "Pays.findByLibPay", query = "SELECT p FROM Pays p WHERE p.libPay = :libPay"),
    @NamedQuery(name = "Pays.findByLicPay", query = "SELECT p FROM Pays p WHERE p.licPay = :licPay"),
    @NamedQuery(name = "Pays.findByLibNat", query = "SELECT p FROM Pays p WHERE p.libNat = :libNat"),
    @NamedQuery(name = "Pays.findByTemOuvDrtSsoPay", query = "SELECT p FROM Pays p WHERE p.temOuvDrtSsoPay = :temOuvDrtSsoPay"),
    @NamedQuery(name = "Pays.findByTemEnSvePay", query = "SELECT p FROM Pays p WHERE p.temEnSvePay = :temEnSvePay"),
    @NamedQuery(name = "Pays.findByTemDel", query = "SELECT p FROM Pays p WHERE p.temDel = :temDel"),
    @NamedQuery(name = "Pays.findByTemAflDecIndPay", query = "SELECT p FROM Pays p WHERE p.temAflDecIndPay = :temAflDecIndPay"),
    @NamedQuery(name = "Pays.findByLibPayArb", query = "SELECT p FROM Pays p WHERE p.libPayArb = :libPayArb"),
    @NamedQuery(name = "Pays.findByLicPayArb", query = "SELECT p FROM Pays p WHERE p.licPayArb = :licPayArb"),
    @NamedQuery(name = "Pays.findByLibNatArb", query = "SELECT p FROM Pays p WHERE p.libNatArb = :libNatArb")})
public class Pays implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_PAY")
    private String codPay;
    @Size(max = 3)
    @Column(name = "COD_SIS_PAY")
    private String codSisPay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_PAY")
    private String libPay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_PAY")
    private String licPay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_NAT")
    private String libNat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_OUV_DRT_SSO_PAY")
    private String temOuvDrtSsoPay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_PAY")
    private String temEnSvePay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_AFL_DEC_IND_PAY")
    private String temAflDecIndPay;
    @Size(max = 50)
    @Column(name = "LIB_PAY_ARB")
    private String libPayArb;
    @Size(max = 25)
    @Column(name = "LIC_PAY_ARB")
    private String licPayArb;
    @Size(max = 40)
    @Column(name = "LIB_NAT_ARB")
    private String libNatArb;
    @OneToMany(mappedBy = "codPayNat")
    private List<IndOpi> indOpiList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPay")
    private List<Adresse> adresseList;
    @OneToMany(mappedBy = "codPayAdrEtb")
    private List<Etablissement> etablissementList;
    @OneToMany(mappedBy = "codPayNat")
    private List<Individu> individuList;

    public Pays() {
    }

    public Pays(String codPay) {
        this.codPay = codPay;
    }

    public Pays(String codPay, String libPay, String licPay, String libNat, String temOuvDrtSsoPay, String temEnSvePay, String temDel, String temAflDecIndPay) {
        this.codPay = codPay;
        this.libPay = libPay;
        this.licPay = licPay;
        this.libNat = libNat;
        this.temOuvDrtSsoPay = temOuvDrtSsoPay;
        this.temEnSvePay = temEnSvePay;
        this.temDel = temDel;
        this.temAflDecIndPay = temAflDecIndPay;
    }

    public String getCodPay() {
        return codPay;
    }

    public void setCodPay(String codPay) {
        this.codPay = codPay;
    }

    public String getCodSisPay() {
        return codSisPay;
    }

    public void setCodSisPay(String codSisPay) {
        this.codSisPay = codSisPay;
    }

    public String getLibPay() {
        return libPay;
    }

    public void setLibPay(String libPay) {
        this.libPay = libPay;
    }

    public String getLicPay() {
        return licPay;
    }

    public void setLicPay(String licPay) {
        this.licPay = licPay;
    }

    public String getLibNat() {
        return libNat;
    }

    public void setLibNat(String libNat) {
        this.libNat = libNat;
    }

    public String getTemOuvDrtSsoPay() {
        return temOuvDrtSsoPay;
    }

    public void setTemOuvDrtSsoPay(String temOuvDrtSsoPay) {
        this.temOuvDrtSsoPay = temOuvDrtSsoPay;
    }

    public String getTemEnSvePay() {
        return temEnSvePay;
    }

    public void setTemEnSvePay(String temEnSvePay) {
        this.temEnSvePay = temEnSvePay;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getTemAflDecIndPay() {
        return temAflDecIndPay;
    }

    public void setTemAflDecIndPay(String temAflDecIndPay) {
        this.temAflDecIndPay = temAflDecIndPay;
    }

    public String getLibPayArb() {
        return libPayArb;
    }

    public void setLibPayArb(String libPayArb) {
        this.libPayArb = libPayArb;
    }

    public String getLicPayArb() {
        return licPayArb;
    }

    public void setLicPayArb(String licPayArb) {
        this.licPayArb = licPayArb;
    }

    public String getLibNatArb() {
        return libNatArb;
    }

    public void setLibNatArb(String libNatArb) {
        this.libNatArb = libNatArb;
    }

    @XmlTransient
    public List<IndOpi> getIndOpiList() {
        return indOpiList;
    }

    public void setIndOpiList(List<IndOpi> indOpiList) {
        this.indOpiList = indOpiList;
    }

    @XmlTransient
    public List<Adresse> getAdresseList() {
        return adresseList;
    }

    public void setAdresseList(List<Adresse> adresseList) {
        this.adresseList = adresseList;
    }

    @XmlTransient
    public List<Etablissement> getEtablissementList() {
        return etablissementList;
    }

    public void setEtablissementList(List<Etablissement> etablissementList) {
        this.etablissementList = etablissementList;
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
        hash += (codPay != null ? codPay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.codPay == null && other.codPay != null) || (this.codPay != null && !this.codPay.equals(other.codPay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Pays[ codPay=" + codPay + " ]";
    }
    
}
