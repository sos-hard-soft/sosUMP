/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "STATUT_ETU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatutEtu.findAll", query = "SELECT s FROM StatutEtu s"),
    @NamedQuery(name = "StatutEtu.findByCodStu", query = "SELECT s FROM StatutEtu s WHERE s.codStu = :codStu"),
    @NamedQuery(name = "StatutEtu.findByLibStu", query = "SELECT s FROM StatutEtu s WHERE s.libStu = :libStu"),
    @NamedQuery(name = "StatutEtu.findByLicStu", query = "SELECT s FROM StatutEtu s WHERE s.licStu = :licStu"),
    @NamedQuery(name = "StatutEtu.findByLix1Stu", query = "SELECT s FROM StatutEtu s WHERE s.lix1Stu = :lix1Stu"),
    @NamedQuery(name = "StatutEtu.findByLix2Stu", query = "SELECT s FROM StatutEtu s WHERE s.lix2Stu = :lix2Stu"),
    @NamedQuery(name = "StatutEtu.findByLix3Stu", query = "SELECT s FROM StatutEtu s WHERE s.lix3Stu = :lix3Stu"),
    @NamedQuery(name = "StatutEtu.findByLix4Stu", query = "SELECT s FROM StatutEtu s WHERE s.lix4Stu = :lix4Stu"),
    @NamedQuery(name = "StatutEtu.findByCodTypEdtCrtStu", query = "SELECT s FROM StatutEtu s WHERE s.codTypEdtCrtStu = :codTypEdtCrtStu"),
    @NamedQuery(name = "StatutEtu.findByTemBuStu", query = "SELECT s FROM StatutEtu s WHERE s.temBuStu = :temBuStu"),
    @NamedQuery(name = "StatutEtu.findByTemExaStu", query = "SELECT s FROM StatutEtu s WHERE s.temExaStu = :temExaStu"),
    @NamedQuery(name = "StatutEtu.findByTemOuvDrtSsoStu", query = "SELECT s FROM StatutEtu s WHERE s.temOuvDrtSsoStu = :temOuvDrtSsoStu"),
    @NamedQuery(name = "StatutEtu.findByTemUsaEtuStu", query = "SELECT s FROM StatutEtu s WHERE s.temUsaEtuStu = :temUsaEtuStu"),
    @NamedQuery(name = "StatutEtu.findByTemEnSveStu", query = "SELECT s FROM StatutEtu s WHERE s.temEnSveStu = :temEnSveStu"),
    @NamedQuery(name = "StatutEtu.findByLim1Stu", query = "SELECT s FROM StatutEtu s WHERE s.lim1Stu = :lim1Stu"),
    @NamedQuery(name = "StatutEtu.findByLim2Stu", query = "SELECT s FROM StatutEtu s WHERE s.lim2Stu = :lim2Stu"),
    @NamedQuery(name = "StatutEtu.findByLim3Stu", query = "SELECT s FROM StatutEtu s WHERE s.lim3Stu = :lim3Stu"),
    @NamedQuery(name = "StatutEtu.findByTemMinStu", query = "SELECT s FROM StatutEtu s WHERE s.temMinStu = :temMinStu"),
    @NamedQuery(name = "StatutEtu.findByNumOrdStu", query = "SELECT s FROM StatutEtu s WHERE s.numOrdStu = :numOrdStu"),
    @NamedQuery(name = "StatutEtu.findByTemPecMinStu", query = "SELECT s FROM StatutEtu s WHERE s.temPecMinStu = :temPecMinStu"),
    @NamedQuery(name = "StatutEtu.findByLibWebStu", query = "SELECT s FROM StatutEtu s WHERE s.libWebStu = :libWebStu")})
public class StatutEtu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_STU")
    private String codStu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIB_STU")
    private String libStu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_STU")
    private String licStu;
    @Size(max = 40)
    @Column(name = "LIX_1_STU")
    private String lix1Stu;
    @Size(max = 40)
    @Column(name = "LIX_2_STU")
    private String lix2Stu;
    @Size(max = 40)
    @Column(name = "LIX_3_STU")
    private String lix3Stu;
    @Size(max = 40)
    @Column(name = "LIX_4_STU")
    private String lix4Stu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_TYP_EDT_CRT_STU")
    private String codTypEdtCrtStu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_BU_STU")
    private String temBuStu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EXA_STU")
    private String temExaStu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_OUV_DRT_SSO_STU")
    private String temOuvDrtSsoStu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_USA_ETU_STU")
    private String temUsaEtuStu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_STU")
    private String temEnSveStu;
    @Size(max = 35)
    @Column(name = "LIM1_STU")
    private String lim1Stu;
    @Size(max = 35)
    @Column(name = "LIM2_STU")
    private String lim2Stu;
    @Size(max = 35)
    @Column(name = "LIM3_STU")
    private String lim3Stu;
    @Size(max = 1)
    @Column(name = "TEM_MIN_STU")
    private String temMinStu;
    @Column(name = "NUM_ORD_STU")
    private Short numOrdStu;
    @Size(max = 1)
    @Column(name = "TEM_PEC_MIN_STU")
    private String temPecMinStu;
    @Size(max = 120)
    @Column(name = "LIB_WEB_STU")
    private String libWebStu;
    @OneToMany(mappedBy = "codStu")
    private List<InsAdmAnu> insAdmAnuList;
    @JoinColumn(name = "COD_PRU", referencedColumnName = "COD_PRU")
    @ManyToOne
    private ProfilEtu codPru;

    public StatutEtu() {
    }

    public StatutEtu(String codStu) {
        this.codStu = codStu;
    }

    public StatutEtu(String codStu, String libStu, String licStu, String codTypEdtCrtStu, String temBuStu, String temExaStu, String temOuvDrtSsoStu, String temUsaEtuStu, String temEnSveStu) {
        this.codStu = codStu;
        this.libStu = libStu;
        this.licStu = licStu;
        this.codTypEdtCrtStu = codTypEdtCrtStu;
        this.temBuStu = temBuStu;
        this.temExaStu = temExaStu;
        this.temOuvDrtSsoStu = temOuvDrtSsoStu;
        this.temUsaEtuStu = temUsaEtuStu;
        this.temEnSveStu = temEnSveStu;
    }

    public String getCodStu() {
        return codStu;
    }

    public void setCodStu(String codStu) {
        this.codStu = codStu;
    }

    public String getLibStu() {
        return libStu;
    }

    public void setLibStu(String libStu) {
        this.libStu = libStu;
    }

    public String getLicStu() {
        return licStu;
    }

    public void setLicStu(String licStu) {
        this.licStu = licStu;
    }

    public String getLix1Stu() {
        return lix1Stu;
    }

    public void setLix1Stu(String lix1Stu) {
        this.lix1Stu = lix1Stu;
    }

    public String getLix2Stu() {
        return lix2Stu;
    }

    public void setLix2Stu(String lix2Stu) {
        this.lix2Stu = lix2Stu;
    }

    public String getLix3Stu() {
        return lix3Stu;
    }

    public void setLix3Stu(String lix3Stu) {
        this.lix3Stu = lix3Stu;
    }

    public String getLix4Stu() {
        return lix4Stu;
    }

    public void setLix4Stu(String lix4Stu) {
        this.lix4Stu = lix4Stu;
    }

    public String getCodTypEdtCrtStu() {
        return codTypEdtCrtStu;
    }

    public void setCodTypEdtCrtStu(String codTypEdtCrtStu) {
        this.codTypEdtCrtStu = codTypEdtCrtStu;
    }

    public String getTemBuStu() {
        return temBuStu;
    }

    public void setTemBuStu(String temBuStu) {
        this.temBuStu = temBuStu;
    }

    public String getTemExaStu() {
        return temExaStu;
    }

    public void setTemExaStu(String temExaStu) {
        this.temExaStu = temExaStu;
    }

    public String getTemOuvDrtSsoStu() {
        return temOuvDrtSsoStu;
    }

    public void setTemOuvDrtSsoStu(String temOuvDrtSsoStu) {
        this.temOuvDrtSsoStu = temOuvDrtSsoStu;
    }

    public String getTemUsaEtuStu() {
        return temUsaEtuStu;
    }

    public void setTemUsaEtuStu(String temUsaEtuStu) {
        this.temUsaEtuStu = temUsaEtuStu;
    }

    public String getTemEnSveStu() {
        return temEnSveStu;
    }

    public void setTemEnSveStu(String temEnSveStu) {
        this.temEnSveStu = temEnSveStu;
    }

    public String getLim1Stu() {
        return lim1Stu;
    }

    public void setLim1Stu(String lim1Stu) {
        this.lim1Stu = lim1Stu;
    }

    public String getLim2Stu() {
        return lim2Stu;
    }

    public void setLim2Stu(String lim2Stu) {
        this.lim2Stu = lim2Stu;
    }

    public String getLim3Stu() {
        return lim3Stu;
    }

    public void setLim3Stu(String lim3Stu) {
        this.lim3Stu = lim3Stu;
    }

    public String getTemMinStu() {
        return temMinStu;
    }

    public void setTemMinStu(String temMinStu) {
        this.temMinStu = temMinStu;
    }

    public Short getNumOrdStu() {
        return numOrdStu;
    }

    public void setNumOrdStu(Short numOrdStu) {
        this.numOrdStu = numOrdStu;
    }

    public String getTemPecMinStu() {
        return temPecMinStu;
    }

    public void setTemPecMinStu(String temPecMinStu) {
        this.temPecMinStu = temPecMinStu;
    }

    public String getLibWebStu() {
        return libWebStu;
    }

    public void setLibWebStu(String libWebStu) {
        this.libWebStu = libWebStu;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    public ProfilEtu getCodPru() {
        return codPru;
    }

    public void setCodPru(ProfilEtu codPru) {
        this.codPru = codPru;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codStu != null ? codStu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatutEtu)) {
            return false;
        }
        StatutEtu other = (StatutEtu) object;
        if ((this.codStu == null && other.codStu != null) || (this.codStu != null && !this.codStu.equals(other.codStu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.StatutEtu[ codStu=" + codStu + " ]";
    }
    
}
