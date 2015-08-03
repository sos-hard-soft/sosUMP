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
@Table(name = "PROFIL_ETU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfilEtu.findAll", query = "SELECT p FROM ProfilEtu p"),
    @NamedQuery(name = "ProfilEtu.findByCodPru", query = "SELECT p FROM ProfilEtu p WHERE p.codPru = :codPru"),
    @NamedQuery(name = "ProfilEtu.findByLibPru", query = "SELECT p FROM ProfilEtu p WHERE p.libPru = :libPru"),
    @NamedQuery(name = "ProfilEtu.findByLicPru", query = "SELECT p FROM ProfilEtu p WHERE p.licPru = :licPru"),
    @NamedQuery(name = "ProfilEtu.findByLix1Pru", query = "SELECT p FROM ProfilEtu p WHERE p.lix1Pru = :lix1Pru"),
    @NamedQuery(name = "ProfilEtu.findByLix2Pru", query = "SELECT p FROM ProfilEtu p WHERE p.lix2Pru = :lix2Pru"),
    @NamedQuery(name = "ProfilEtu.findByLix3Pru", query = "SELECT p FROM ProfilEtu p WHERE p.lix3Pru = :lix3Pru"),
    @NamedQuery(name = "ProfilEtu.findByLix4Pru", query = "SELECT p FROM ProfilEtu p WHERE p.lix4Pru = :lix4Pru"),
    @NamedQuery(name = "ProfilEtu.findByTemEnSvePru", query = "SELECT p FROM ProfilEtu p WHERE p.temEnSvePru = :temEnSvePru"),
    @NamedQuery(name = "ProfilEtu.findByTemSpePru", query = "SELECT p FROM ProfilEtu p WHERE p.temSpePru = :temSpePru"),
    @NamedQuery(name = "ProfilEtu.findByTemDel", query = "SELECT p FROM ProfilEtu p WHERE p.temDel = :temDel"),
    @NamedQuery(name = "ProfilEtu.findByLim1Pru", query = "SELECT p FROM ProfilEtu p WHERE p.lim1Pru = :lim1Pru"),
    @NamedQuery(name = "ProfilEtu.findByLim2Pru", query = "SELECT p FROM ProfilEtu p WHERE p.lim2Pru = :lim2Pru"),
    @NamedQuery(name = "ProfilEtu.findByLim3Pru", query = "SELECT p FROM ProfilEtu p WHERE p.lim3Pru = :lim3Pru"),
    @NamedQuery(name = "ProfilEtu.findByTemMinPru", query = "SELECT p FROM ProfilEtu p WHERE p.temMinPru = :temMinPru"),
    @NamedQuery(name = "ProfilEtu.findByNumOrdPru", query = "SELECT p FROM ProfilEtu p WHERE p.numOrdPru = :numOrdPru"),
    @NamedQuery(name = "ProfilEtu.findByTemPecMinPru", query = "SELECT p FROM ProfilEtu p WHERE p.temPecMinPru = :temPecMinPru"),
    @NamedQuery(name = "ProfilEtu.findByTemTypEtpPru", query = "SELECT p FROM ProfilEtu p WHERE p.temTypEtpPru = :temTypEtpPru"),
    @NamedQuery(name = "ProfilEtu.findByLibWebPru", query = "SELECT p FROM ProfilEtu p WHERE p.libWebPru = :libWebPru")})
public class ProfilEtu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_PRU")
    private String codPru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIB_PRU")
    private String libPru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_PRU")
    private String licPru;
    @Size(max = 40)
    @Column(name = "LIX_1_PRU")
    private String lix1Pru;
    @Size(max = 40)
    @Column(name = "LIX_2_PRU")
    private String lix2Pru;
    @Size(max = 40)
    @Column(name = "LIX_3_PRU")
    private String lix3Pru;
    @Size(max = 40)
    @Column(name = "LIX_4_PRU")
    private String lix4Pru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_PRU")
    private String temEnSvePru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SPE_PRU")
    private String temSpePru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 35)
    @Column(name = "LIM1_PRU")
    private String lim1Pru;
    @Size(max = 35)
    @Column(name = "LIM2_PRU")
    private String lim2Pru;
    @Size(max = 35)
    @Column(name = "LIM3_PRU")
    private String lim3Pru;
    @Size(max = 1)
    @Column(name = "TEM_MIN_PRU")
    private String temMinPru;
    @Column(name = "NUM_ORD_PRU")
    private Short numOrdPru;
    @Size(max = 1)
    @Column(name = "TEM_PEC_MIN_PRU")
    private String temPecMinPru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TYP_ETP_PRU")
    private String temTypEtpPru;
    @Size(max = 120)
    @Column(name = "LIB_WEB_PRU")
    private String libWebPru;
    @OneToMany(mappedBy = "codPru")
    private List<InsAdmAnu> insAdmAnuList;
    @OneToMany(mappedBy = "codPruPrl")
    private List<Etablissement> etablissementList;
    @OneToMany(mappedBy = "codPruChg")
    private List<Etablissement> etablissementList1;
    @OneToMany(mappedBy = "codPruPrl")
    private List<TypEtb> typEtbList;
    @OneToMany(mappedBy = "codPruChg")
    private List<TypEtb> typEtbList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPru")
    private List<InsAdmEtp> insAdmEtpList;
    @OneToMany(mappedBy = "codPru")
    private List<StatutEtu> statutEtuList;
    @OneToMany(mappedBy = "codPru")
    private List<PrgEchange> prgEchangeList;

    public ProfilEtu() {
    }

    public ProfilEtu(String codPru) {
        this.codPru = codPru;
    }

    public ProfilEtu(String codPru, String libPru, String licPru, String temEnSvePru, String temSpePru, String temDel, String temTypEtpPru) {
        this.codPru = codPru;
        this.libPru = libPru;
        this.licPru = licPru;
        this.temEnSvePru = temEnSvePru;
        this.temSpePru = temSpePru;
        this.temDel = temDel;
        this.temTypEtpPru = temTypEtpPru;
    }

    public String getCodPru() {
        return codPru;
    }

    public void setCodPru(String codPru) {
        this.codPru = codPru;
    }

    public String getLibPru() {
        return libPru;
    }

    public void setLibPru(String libPru) {
        this.libPru = libPru;
    }

    public String getLicPru() {
        return licPru;
    }

    public void setLicPru(String licPru) {
        this.licPru = licPru;
    }

    public String getLix1Pru() {
        return lix1Pru;
    }

    public void setLix1Pru(String lix1Pru) {
        this.lix1Pru = lix1Pru;
    }

    public String getLix2Pru() {
        return lix2Pru;
    }

    public void setLix2Pru(String lix2Pru) {
        this.lix2Pru = lix2Pru;
    }

    public String getLix3Pru() {
        return lix3Pru;
    }

    public void setLix3Pru(String lix3Pru) {
        this.lix3Pru = lix3Pru;
    }

    public String getLix4Pru() {
        return lix4Pru;
    }

    public void setLix4Pru(String lix4Pru) {
        this.lix4Pru = lix4Pru;
    }

    public String getTemEnSvePru() {
        return temEnSvePru;
    }

    public void setTemEnSvePru(String temEnSvePru) {
        this.temEnSvePru = temEnSvePru;
    }

    public String getTemSpePru() {
        return temSpePru;
    }

    public void setTemSpePru(String temSpePru) {
        this.temSpePru = temSpePru;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getLim1Pru() {
        return lim1Pru;
    }

    public void setLim1Pru(String lim1Pru) {
        this.lim1Pru = lim1Pru;
    }

    public String getLim2Pru() {
        return lim2Pru;
    }

    public void setLim2Pru(String lim2Pru) {
        this.lim2Pru = lim2Pru;
    }

    public String getLim3Pru() {
        return lim3Pru;
    }

    public void setLim3Pru(String lim3Pru) {
        this.lim3Pru = lim3Pru;
    }

    public String getTemMinPru() {
        return temMinPru;
    }

    public void setTemMinPru(String temMinPru) {
        this.temMinPru = temMinPru;
    }

    public Short getNumOrdPru() {
        return numOrdPru;
    }

    public void setNumOrdPru(Short numOrdPru) {
        this.numOrdPru = numOrdPru;
    }

    public String getTemPecMinPru() {
        return temPecMinPru;
    }

    public void setTemPecMinPru(String temPecMinPru) {
        this.temPecMinPru = temPecMinPru;
    }

    public String getTemTypEtpPru() {
        return temTypEtpPru;
    }

    public void setTemTypEtpPru(String temTypEtpPru) {
        this.temTypEtpPru = temTypEtpPru;
    }

    public String getLibWebPru() {
        return libWebPru;
    }

    public void setLibWebPru(String libWebPru) {
        this.libWebPru = libWebPru;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @XmlTransient
    public List<Etablissement> getEtablissementList() {
        return etablissementList;
    }

    public void setEtablissementList(List<Etablissement> etablissementList) {
        this.etablissementList = etablissementList;
    }

    @XmlTransient
    public List<Etablissement> getEtablissementList1() {
        return etablissementList1;
    }

    public void setEtablissementList1(List<Etablissement> etablissementList1) {
        this.etablissementList1 = etablissementList1;
    }

    @XmlTransient
    public List<TypEtb> getTypEtbList() {
        return typEtbList;
    }

    public void setTypEtbList(List<TypEtb> typEtbList) {
        this.typEtbList = typEtbList;
    }

    @XmlTransient
    public List<TypEtb> getTypEtbList1() {
        return typEtbList1;
    }

    public void setTypEtbList1(List<TypEtb> typEtbList1) {
        this.typEtbList1 = typEtbList1;
    }

    @XmlTransient
    public List<InsAdmEtp> getInsAdmEtpList() {
        return insAdmEtpList;
    }

    public void setInsAdmEtpList(List<InsAdmEtp> insAdmEtpList) {
        this.insAdmEtpList = insAdmEtpList;
    }

    @XmlTransient
    public List<StatutEtu> getStatutEtuList() {
        return statutEtuList;
    }

    public void setStatutEtuList(List<StatutEtu> statutEtuList) {
        this.statutEtuList = statutEtuList;
    }

    @XmlTransient
    public List<PrgEchange> getPrgEchangeList() {
        return prgEchangeList;
    }

    public void setPrgEchangeList(List<PrgEchange> prgEchangeList) {
        this.prgEchangeList = prgEchangeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPru != null ? codPru.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfilEtu)) {
            return false;
        }
        ProfilEtu other = (ProfilEtu) object;
        if ((this.codPru == null && other.codPru != null) || (this.codPru != null && !this.codPru.equals(other.codPru))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ProfilEtu[ codPru=" + codPru + " ]";
    }
    
}
