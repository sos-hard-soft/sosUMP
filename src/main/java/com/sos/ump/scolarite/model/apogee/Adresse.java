/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "ADRESSE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adresse.findAll", query = "SELECT a FROM Adresse a"),
    @NamedQuery(name = "Adresse.findByCodAdr", query = "SELECT a FROM Adresse a WHERE a.codAdr = :codAdr"),
    @NamedQuery(name = "Adresse.findByLibAd1", query = "SELECT a FROM Adresse a WHERE a.libAd1 = :libAd1"),
    @NamedQuery(name = "Adresse.findByLibAd2", query = "SELECT a FROM Adresse a WHERE a.libAd2 = :libAd2"),
    @NamedQuery(name = "Adresse.findByLibAd3", query = "SELECT a FROM Adresse a WHERE a.libAd3 = :libAd3"),
    @NamedQuery(name = "Adresse.findByLibAde", query = "SELECT a FROM Adresse a WHERE a.libAde = :libAde"),
    @NamedQuery(name = "Adresse.findByNumTel", query = "SELECT a FROM Adresse a WHERE a.numTel = :numTel"),
    @NamedQuery(name = "Adresse.findByCodCuvRuv", query = "SELECT a FROM Adresse a WHERE a.codCuvRuv = :codCuvRuv"),
    @NamedQuery(name = "Adresse.findByCodDep", query = "SELECT a FROM Adresse a WHERE a.codDep = :codDep"),
    @NamedQuery(name = "Adresse.findByCodMilAdr", query = "SELECT a FROM Adresse a WHERE a.codMilAdr = :codMilAdr")})
public class Adresse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_ADR")
    private Long codAdr;
    @Size(max = 32)
    @Column(name = "LIB_AD1")
    private String libAd1;
    @Size(max = 32)
    @Column(name = "LIB_AD2")
    private String libAd2;
    @Size(max = 32)
    @Column(name = "LIB_AD3")
    private String libAd3;
    @Size(max = 32)
    @Column(name = "LIB_ADE")
    private String libAde;
    @Size(max = 15)
    @Column(name = "NUM_TEL")
    private String numTel;
    @Size(max = 3)
    @Column(name = "COD_CUV_RUV")
    private String codCuvRuv;
    @Size(max = 3)
    @Column(name = "COD_DEP")
    private String codDep;
    @Size(max = 1)
    @Column(name = "COD_MIL_ADR")
    private String codMilAdr;
    @JoinColumns({
        @JoinColumn(name = "COD_BDI", referencedColumnName = "COD_BDI"),
        @JoinColumn(name = "COD_COM", referencedColumnName = "COD_COM")})
    @ManyToOne
    private ComBdi comBdi;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND")
    @OneToOne
    private Individu codInd;
    @JoinColumns({
        @JoinColumn(name = "COD_ANU_INA", referencedColumnName = "COD_ANU"),
        @JoinColumn(name = "COD_IND_INA", referencedColumnName = "COD_IND")})
    @OneToOne
    private InsInfoAnu insInfoAnu;
    @JoinColumn(name = "COD_PAY", referencedColumnName = "COD_PAY")
    @ManyToOne(optional = false)
    private Pays codPay;

    public Adresse() {
    }

    public Adresse(Long codAdr) {
        this.codAdr = codAdr;
    }

    public Long getCodAdr() {
        return codAdr;
    }

    public void setCodAdr(Long codAdr) {
        this.codAdr = codAdr;
    }

    public String getLibAd1() {
        return libAd1;
    }

    public void setLibAd1(String libAd1) {
        this.libAd1 = libAd1;
    }

    public String getLibAd2() {
        return libAd2;
    }

    public void setLibAd2(String libAd2) {
        this.libAd2 = libAd2;
    }

    public String getLibAd3() {
        return libAd3;
    }

    public void setLibAd3(String libAd3) {
        this.libAd3 = libAd3;
    }

    public String getLibAde() {
        return libAde;
    }

    public void setLibAde(String libAde) {
        this.libAde = libAde;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getCodCuvRuv() {
        return codCuvRuv;
    }

    public void setCodCuvRuv(String codCuvRuv) {
        this.codCuvRuv = codCuvRuv;
    }

    public String getCodDep() {
        return codDep;
    }

    public void setCodDep(String codDep) {
        this.codDep = codDep;
    }

    public String getCodMilAdr() {
        return codMilAdr;
    }

    public void setCodMilAdr(String codMilAdr) {
        this.codMilAdr = codMilAdr;
    }

    public ComBdi getComBdi() {
        return comBdi;
    }

    public void setComBdi(ComBdi comBdi) {
        this.comBdi = comBdi;
    }

    public Individu getCodInd() {
        return codInd;
    }

    public void setCodInd(Individu codInd) {
        this.codInd = codInd;
    }

    public InsInfoAnu getInsInfoAnu() {
        return insInfoAnu;
    }

    public void setInsInfoAnu(InsInfoAnu insInfoAnu) {
        this.insInfoAnu = insInfoAnu;
    }

    public Pays getCodPay() {
        return codPay;
    }

    public void setCodPay(Pays codPay) {
        this.codPay = codPay;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAdr != null ? codAdr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adresse)) {
            return false;
        }
        Adresse other = (Adresse) object;
        if ((this.codAdr == null && other.codAdr != null) || (this.codAdr != null && !this.codAdr.equals(other.codAdr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Adresse[ codAdr=" + codAdr + " ]";
    }
    
}
