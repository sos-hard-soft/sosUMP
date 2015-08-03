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
@Table(name = "SIT_MIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SitMil.findAll", query = "SELECT s FROM SitMil s"),
    @NamedQuery(name = "SitMil.findByCodSim", query = "SELECT s FROM SitMil s WHERE s.codSim = :codSim"),
    @NamedQuery(name = "SitMil.findByLibSim", query = "SELECT s FROM SitMil s WHERE s.libSim = :libSim"),
    @NamedQuery(name = "SitMil.findByLicSim", query = "SELECT s FROM SitMil s WHERE s.licSim = :licSim"),
    @NamedQuery(name = "SitMil.findByTemSaiDmmLbt", query = "SELECT s FROM SitMil s WHERE s.temSaiDmmLbt = :temSaiDmmLbt"),
    @NamedQuery(name = "SitMil.findByTemEnSveSim", query = "SELECT s FROM SitMil s WHERE s.temEnSveSim = :temEnSveSim"),
    @NamedQuery(name = "SitMil.findByTemDel", query = "SELECT s FROM SitMil s WHERE s.temDel = :temDel"),
    @NamedQuery(name = "SitMil.findByLim1Sim", query = "SELECT s FROM SitMil s WHERE s.lim1Sim = :lim1Sim"),
    @NamedQuery(name = "SitMil.findByLim2Sim", query = "SELECT s FROM SitMil s WHERE s.lim2Sim = :lim2Sim"),
    @NamedQuery(name = "SitMil.findByLim3Sim", query = "SELECT s FROM SitMil s WHERE s.lim3Sim = :lim3Sim"),
    @NamedQuery(name = "SitMil.findByTemMinSim", query = "SELECT s FROM SitMil s WHERE s.temMinSim = :temMinSim"),
    @NamedQuery(name = "SitMil.findByNumOrdSim", query = "SELECT s FROM SitMil s WHERE s.numOrdSim = :numOrdSim"),
    @NamedQuery(name = "SitMil.findByTemDelDip", query = "SELECT s FROM SitMil s WHERE s.temDelDip = :temDelDip"),
    @NamedQuery(name = "SitMil.findByLibWebSim", query = "SELECT s FROM SitMil s WHERE s.libWebSim = :libWebSim")})
public class SitMil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_SIM")
    private String codSim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_SIM")
    private String libSim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_SIM")
    private String licSim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SAI_DMM_LBT")
    private String temSaiDmmLbt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_SIM")
    private String temEnSveSim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 35)
    @Column(name = "LIM1_SIM")
    private String lim1Sim;
    @Size(max = 35)
    @Column(name = "LIM2_SIM")
    private String lim2Sim;
    @Size(max = 35)
    @Column(name = "LIM3_SIM")
    private String lim3Sim;
    @Size(max = 1)
    @Column(name = "TEM_MIN_SIM")
    private String temMinSim;
    @Column(name = "NUM_ORD_SIM")
    private Short numOrdSim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL_DIP")
    private String temDelDip;
    @Size(max = 120)
    @Column(name = "LIB_WEB_SIM")
    private String libWebSim;
    @OneToMany(mappedBy = "codSim")
    private List<IndOpi> indOpiList;
    @OneToMany(mappedBy = "codSim")
    private List<Individu> individuList;

    public SitMil() {
    }

    public SitMil(String codSim) {
        this.codSim = codSim;
    }

    public SitMil(String codSim, String libSim, String licSim, String temSaiDmmLbt, String temEnSveSim, String temDel, String temDelDip) {
        this.codSim = codSim;
        this.libSim = libSim;
        this.licSim = licSim;
        this.temSaiDmmLbt = temSaiDmmLbt;
        this.temEnSveSim = temEnSveSim;
        this.temDel = temDel;
        this.temDelDip = temDelDip;
    }

    public String getCodSim() {
        return codSim;
    }

    public void setCodSim(String codSim) {
        this.codSim = codSim;
    }

    public String getLibSim() {
        return libSim;
    }

    public void setLibSim(String libSim) {
        this.libSim = libSim;
    }

    public String getLicSim() {
        return licSim;
    }

    public void setLicSim(String licSim) {
        this.licSim = licSim;
    }

    public String getTemSaiDmmLbt() {
        return temSaiDmmLbt;
    }

    public void setTemSaiDmmLbt(String temSaiDmmLbt) {
        this.temSaiDmmLbt = temSaiDmmLbt;
    }

    public String getTemEnSveSim() {
        return temEnSveSim;
    }

    public void setTemEnSveSim(String temEnSveSim) {
        this.temEnSveSim = temEnSveSim;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getLim1Sim() {
        return lim1Sim;
    }

    public void setLim1Sim(String lim1Sim) {
        this.lim1Sim = lim1Sim;
    }

    public String getLim2Sim() {
        return lim2Sim;
    }

    public void setLim2Sim(String lim2Sim) {
        this.lim2Sim = lim2Sim;
    }

    public String getLim3Sim() {
        return lim3Sim;
    }

    public void setLim3Sim(String lim3Sim) {
        this.lim3Sim = lim3Sim;
    }

    public String getTemMinSim() {
        return temMinSim;
    }

    public void setTemMinSim(String temMinSim) {
        this.temMinSim = temMinSim;
    }

    public Short getNumOrdSim() {
        return numOrdSim;
    }

    public void setNumOrdSim(Short numOrdSim) {
        this.numOrdSim = numOrdSim;
    }

    public String getTemDelDip() {
        return temDelDip;
    }

    public void setTemDelDip(String temDelDip) {
        this.temDelDip = temDelDip;
    }

    public String getLibWebSim() {
        return libWebSim;
    }

    public void setLibWebSim(String libWebSim) {
        this.libWebSim = libWebSim;
    }

    @XmlTransient
    public List<IndOpi> getIndOpiList() {
        return indOpiList;
    }

    public void setIndOpiList(List<IndOpi> indOpiList) {
        this.indOpiList = indOpiList;
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
        hash += (codSim != null ? codSim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SitMil)) {
            return false;
        }
        SitMil other = (SitMil) object;
        if ((this.codSim == null && other.codSim != null) || (this.codSim != null && !this.codSim.equals(other.codSim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.SitMil[ codSim=" + codSim + " ]";
    }
    
}
