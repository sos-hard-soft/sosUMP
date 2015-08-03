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
@Table(name = "MTF_AFL_SSO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MtfAflSso.findAll", query = "SELECT m FROM MtfAflSso m"),
    @NamedQuery(name = "MtfAflSso.findByCodMfs", query = "SELECT m FROM MtfAflSso m WHERE m.codMfs = :codMfs"),
    @NamedQuery(name = "MtfAflSso.findByLibMfs", query = "SELECT m FROM MtfAflSso m WHERE m.libMfs = :libMfs"),
    @NamedQuery(name = "MtfAflSso.findByLicMfs", query = "SELECT m FROM MtfAflSso m WHERE m.licMfs = :licMfs"),
    @NamedQuery(name = "MtfAflSso.findByTemPrlMfs", query = "SELECT m FROM MtfAflSso m WHERE m.temPrlMfs = :temPrlMfs"),
    @NamedQuery(name = "MtfAflSso.findByTemEnSveMfs", query = "SELECT m FROM MtfAflSso m WHERE m.temEnSveMfs = :temEnSveMfs"),
    @NamedQuery(name = "MtfAflSso.findByTemDel", query = "SELECT m FROM MtfAflSso m WHERE m.temDel = :temDel"),
    @NamedQuery(name = "MtfAflSso.findByLim1Mfs", query = "SELECT m FROM MtfAflSso m WHERE m.lim1Mfs = :lim1Mfs"),
    @NamedQuery(name = "MtfAflSso.findByLim2Mfs", query = "SELECT m FROM MtfAflSso m WHERE m.lim2Mfs = :lim2Mfs"),
    @NamedQuery(name = "MtfAflSso.findByLim3Mfs", query = "SELECT m FROM MtfAflSso m WHERE m.lim3Mfs = :lim3Mfs"),
    @NamedQuery(name = "MtfAflSso.findByTemMinMfs", query = "SELECT m FROM MtfAflSso m WHERE m.temMinMfs = :temMinMfs"),
    @NamedQuery(name = "MtfAflSso.findByNumOrdMfs", query = "SELECT m FROM MtfAflSso m WHERE m.numOrdMfs = :numOrdMfs"),
    @NamedQuery(name = "MtfAflSso.findByLibWebMfs", query = "SELECT m FROM MtfAflSso m WHERE m.libWebMfs = :libWebMfs")})
public class MtfAflSso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_MFS")
    private String codMfs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_MFS")
    private String libMfs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_MFS")
    private String licMfs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PRL_MFS")
    private String temPrlMfs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_MFS")
    private String temEnSveMfs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 35)
    @Column(name = "LIM1_MFS")
    private String lim1Mfs;
    @Size(max = 35)
    @Column(name = "LIM2_MFS")
    private String lim2Mfs;
    @Size(max = 35)
    @Column(name = "LIM3_MFS")
    private String lim3Mfs;
    @Size(max = 1)
    @Column(name = "TEM_MIN_MFS")
    private String temMinMfs;
    @Column(name = "NUM_ORD_MFS")
    private Short numOrdMfs;
    @Size(max = 120)
    @Column(name = "LIB_WEB_MFS")
    private String libWebMfs;
    @OneToMany(mappedBy = "codMfs")
    private List<InsAdmAnu> insAdmAnuList;

    public MtfAflSso() {
    }

    public MtfAflSso(String codMfs) {
        this.codMfs = codMfs;
    }

    public MtfAflSso(String codMfs, String libMfs, String licMfs, String temPrlMfs, String temEnSveMfs, String temDel) {
        this.codMfs = codMfs;
        this.libMfs = libMfs;
        this.licMfs = licMfs;
        this.temPrlMfs = temPrlMfs;
        this.temEnSveMfs = temEnSveMfs;
        this.temDel = temDel;
    }

    public String getCodMfs() {
        return codMfs;
    }

    public void setCodMfs(String codMfs) {
        this.codMfs = codMfs;
    }

    public String getLibMfs() {
        return libMfs;
    }

    public void setLibMfs(String libMfs) {
        this.libMfs = libMfs;
    }

    public String getLicMfs() {
        return licMfs;
    }

    public void setLicMfs(String licMfs) {
        this.licMfs = licMfs;
    }

    public String getTemPrlMfs() {
        return temPrlMfs;
    }

    public void setTemPrlMfs(String temPrlMfs) {
        this.temPrlMfs = temPrlMfs;
    }

    public String getTemEnSveMfs() {
        return temEnSveMfs;
    }

    public void setTemEnSveMfs(String temEnSveMfs) {
        this.temEnSveMfs = temEnSveMfs;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getLim1Mfs() {
        return lim1Mfs;
    }

    public void setLim1Mfs(String lim1Mfs) {
        this.lim1Mfs = lim1Mfs;
    }

    public String getLim2Mfs() {
        return lim2Mfs;
    }

    public void setLim2Mfs(String lim2Mfs) {
        this.lim2Mfs = lim2Mfs;
    }

    public String getLim3Mfs() {
        return lim3Mfs;
    }

    public void setLim3Mfs(String lim3Mfs) {
        this.lim3Mfs = lim3Mfs;
    }

    public String getTemMinMfs() {
        return temMinMfs;
    }

    public void setTemMinMfs(String temMinMfs) {
        this.temMinMfs = temMinMfs;
    }

    public Short getNumOrdMfs() {
        return numOrdMfs;
    }

    public void setNumOrdMfs(Short numOrdMfs) {
        this.numOrdMfs = numOrdMfs;
    }

    public String getLibWebMfs() {
        return libWebMfs;
    }

    public void setLibWebMfs(String libWebMfs) {
        this.libWebMfs = libWebMfs;
    }

    @XmlTransient
    public List<InsAdmAnu> getInsAdmAnuList() {
        return insAdmAnuList;
    }

    public void setInsAdmAnuList(List<InsAdmAnu> insAdmAnuList) {
        this.insAdmAnuList = insAdmAnuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMfs != null ? codMfs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtfAflSso)) {
            return false;
        }
        MtfAflSso other = (MtfAflSso) object;
        if ((this.codMfs == null && other.codMfs != null) || (this.codMfs != null && !this.codMfs.equals(other.codMfs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.MtfAflSso[ codMfs=" + codMfs + " ]";
    }
    
}
