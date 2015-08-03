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
@Table(name = "TYP_DIPLOME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypDiplome.findAll", query = "SELECT t FROM TypDiplome t"),
    @NamedQuery(name = "TypDiplome.findByCodTpdEtb", query = "SELECT t FROM TypDiplome t WHERE t.codTpdEtb = :codTpdEtb"),
    @NamedQuery(name = "TypDiplome.findByCodTpdSis", query = "SELECT t FROM TypDiplome t WHERE t.codTpdSis = :codTpdSis"),
    @NamedQuery(name = "TypDiplome.findByLibTpd", query = "SELECT t FROM TypDiplome t WHERE t.libTpd = :libTpd"),
    @NamedQuery(name = "TypDiplome.findByLicTpd", query = "SELECT t FROM TypDiplome t WHERE t.licTpd = :licTpd"),
    @NamedQuery(name = "TypDiplome.findByTemEnSveTpd", query = "SELECT t FROM TypDiplome t WHERE t.temEnSveTpd = :temEnSveTpd"),
    @NamedQuery(name = "TypDiplome.findByEtaThsHdrDrt", query = "SELECT t FROM TypDiplome t WHERE t.etaThsHdrDrt = :etaThsHdrDrt"),
    @NamedQuery(name = "TypDiplome.findByTemEnqSisTpd", query = "SELECT t FROM TypDiplome t WHERE t.temEnqSisTpd = :temEnqSisTpd"),
    @NamedQuery(name = "TypDiplome.findByTemNatEur", query = "SELECT t FROM TypDiplome t WHERE t.temNatEur = :temNatEur"),
    @NamedQuery(name = "TypDiplome.findByTemSante", query = "SELECT t FROM TypDiplome t WHERE t.temSante = :temSante")})
public class TypDiplome implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_TPD_ETB")
    private String codTpdEtb;
    @Size(max = 2)
    @Column(name = "COD_TPD_SIS")
    private String codTpdSis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_TPD")
    private String libTpd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_TPD")
    private String licTpd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_TPD")
    private String temEnSveTpd;
    @Size(max = 1)
    @Column(name = "ETA_THS_HDR_DRT")
    private String etaThsHdrDrt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ENQ_SIS_TPD")
    private String temEnqSisTpd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NAT_EUR")
    private String temNatEur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SANTE")
    private String temSante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codTpdEtb")
    private List<Diplome> diplomeList;
    @JoinColumn(name = "COD_NIF", referencedColumnName = "COD_NIF")
    @ManyToOne(optional = false)
    private NiveauFormation codNif;
    @JoinColumn(name = "COD_TDS", referencedColumnName = "COD_TDS")
    @ManyToOne
    private TypDiplomeSise codTds;

    public TypDiplome() {
    }

    public TypDiplome(String codTpdEtb) {
        this.codTpdEtb = codTpdEtb;
    }

    public TypDiplome(String codTpdEtb, String libTpd, String licTpd, String temEnSveTpd, String temEnqSisTpd, String temNatEur, String temSante) {
        this.codTpdEtb = codTpdEtb;
        this.libTpd = libTpd;
        this.licTpd = licTpd;
        this.temEnSveTpd = temEnSveTpd;
        this.temEnqSisTpd = temEnqSisTpd;
        this.temNatEur = temNatEur;
        this.temSante = temSante;
    }

    public String getCodTpdEtb() {
        return codTpdEtb;
    }

    public void setCodTpdEtb(String codTpdEtb) {
        this.codTpdEtb = codTpdEtb;
    }

    public String getCodTpdSis() {
        return codTpdSis;
    }

    public void setCodTpdSis(String codTpdSis) {
        this.codTpdSis = codTpdSis;
    }

    public String getLibTpd() {
        return libTpd;
    }

    public void setLibTpd(String libTpd) {
        this.libTpd = libTpd;
    }

    public String getLicTpd() {
        return licTpd;
    }

    public void setLicTpd(String licTpd) {
        this.licTpd = licTpd;
    }

    public String getTemEnSveTpd() {
        return temEnSveTpd;
    }

    public void setTemEnSveTpd(String temEnSveTpd) {
        this.temEnSveTpd = temEnSveTpd;
    }

    public String getEtaThsHdrDrt() {
        return etaThsHdrDrt;
    }

    public void setEtaThsHdrDrt(String etaThsHdrDrt) {
        this.etaThsHdrDrt = etaThsHdrDrt;
    }

    public String getTemEnqSisTpd() {
        return temEnqSisTpd;
    }

    public void setTemEnqSisTpd(String temEnqSisTpd) {
        this.temEnqSisTpd = temEnqSisTpd;
    }

    public String getTemNatEur() {
        return temNatEur;
    }

    public void setTemNatEur(String temNatEur) {
        this.temNatEur = temNatEur;
    }

    public String getTemSante() {
        return temSante;
    }

    public void setTemSante(String temSante) {
        this.temSante = temSante;
    }

    @XmlTransient
    public List<Diplome> getDiplomeList() {
        return diplomeList;
    }

    public void setDiplomeList(List<Diplome> diplomeList) {
        this.diplomeList = diplomeList;
    }

    public NiveauFormation getCodNif() {
        return codNif;
    }

    public void setCodNif(NiveauFormation codNif) {
        this.codNif = codNif;
    }

    public TypDiplomeSise getCodTds() {
        return codTds;
    }

    public void setCodTds(TypDiplomeSise codTds) {
        this.codTds = codTds;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTpdEtb != null ? codTpdEtb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypDiplome)) {
            return false;
        }
        TypDiplome other = (TypDiplome) object;
        if ((this.codTpdEtb == null && other.codTpdEtb != null) || (this.codTpdEtb != null && !this.codTpdEtb.equals(other.codTpdEtb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TypDiplome[ codTpdEtb=" + codTpdEtb + " ]";
    }
    
}
