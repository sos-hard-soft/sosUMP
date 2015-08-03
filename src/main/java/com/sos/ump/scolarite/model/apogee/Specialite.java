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
@Table(name = "SPECIALITE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specialite.findAll", query = "SELECT s FROM Specialite s"),
    @NamedQuery(name = "Specialite.findByCodSpe", query = "SELECT s FROM Specialite s WHERE s.codSpe = :codSpe"),
    @NamedQuery(name = "Specialite.findByLibSpe", query = "SELECT s FROM Specialite s WHERE s.libSpe = :libSpe"),
    @NamedQuery(name = "Specialite.findByLicSpe", query = "SELECT s FROM Specialite s WHERE s.licSpe = :licSpe"),
    @NamedQuery(name = "Specialite.findByTemEnSveSpe", query = "SELECT s FROM Specialite s WHERE s.temEnSveSpe = :temEnSveSpe"),
    @NamedQuery(name = "Specialite.findByLim1Spe", query = "SELECT s FROM Specialite s WHERE s.lim1Spe = :lim1Spe"),
    @NamedQuery(name = "Specialite.findByLim2Spe", query = "SELECT s FROM Specialite s WHERE s.lim2Spe = :lim2Spe"),
    @NamedQuery(name = "Specialite.findByLim3Spe", query = "SELECT s FROM Specialite s WHERE s.lim3Spe = :lim3Spe"),
    @NamedQuery(name = "Specialite.findByLibWebSpe", query = "SELECT s FROM Specialite s WHERE s.libWebSpe = :libWebSpe")})
public class Specialite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_SPE")
    private String codSpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_SPE")
    private String libSpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_SPE")
    private String licSpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_SPE")
    private String temEnSveSpe;
    @Size(max = 35)
    @Column(name = "LIM1_SPE")
    private String lim1Spe;
    @Size(max = 35)
    @Column(name = "LIM2_SPE")
    private String lim2Spe;
    @Size(max = 35)
    @Column(name = "LIM3_SPE")
    private String lim3Spe;
    @Size(max = 120)
    @Column(name = "LIB_WEB_SPE")
    private String libWebSpe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specialite")
    private List<SpeCaracteriseVdi> speCaracteriseVdiList;

    public Specialite() {
    }

    public Specialite(String codSpe) {
        this.codSpe = codSpe;
    }

    public Specialite(String codSpe, String libSpe, String licSpe, String temEnSveSpe) {
        this.codSpe = codSpe;
        this.libSpe = libSpe;
        this.licSpe = licSpe;
        this.temEnSveSpe = temEnSveSpe;
    }

    public String getCodSpe() {
        return codSpe;
    }

    public void setCodSpe(String codSpe) {
        this.codSpe = codSpe;
    }

    public String getLibSpe() {
        return libSpe;
    }

    public void setLibSpe(String libSpe) {
        this.libSpe = libSpe;
    }

    public String getLicSpe() {
        return licSpe;
    }

    public void setLicSpe(String licSpe) {
        this.licSpe = licSpe;
    }

    public String getTemEnSveSpe() {
        return temEnSveSpe;
    }

    public void setTemEnSveSpe(String temEnSveSpe) {
        this.temEnSveSpe = temEnSveSpe;
    }

    public String getLim1Spe() {
        return lim1Spe;
    }

    public void setLim1Spe(String lim1Spe) {
        this.lim1Spe = lim1Spe;
    }

    public String getLim2Spe() {
        return lim2Spe;
    }

    public void setLim2Spe(String lim2Spe) {
        this.lim2Spe = lim2Spe;
    }

    public String getLim3Spe() {
        return lim3Spe;
    }

    public void setLim3Spe(String lim3Spe) {
        this.lim3Spe = lim3Spe;
    }

    public String getLibWebSpe() {
        return libWebSpe;
    }

    public void setLibWebSpe(String libWebSpe) {
        this.libWebSpe = libWebSpe;
    }

    @XmlTransient
    public List<SpeCaracteriseVdi> getSpeCaracteriseVdiList() {
        return speCaracteriseVdiList;
    }

    public void setSpeCaracteriseVdiList(List<SpeCaracteriseVdi> speCaracteriseVdiList) {
        this.speCaracteriseVdiList = speCaracteriseVdiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSpe != null ? codSpe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specialite)) {
            return false;
        }
        Specialite other = (Specialite) object;
        if ((this.codSpe == null && other.codSpe != null) || (this.codSpe != null && !this.codSpe.equals(other.codSpe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Specialite[ codSpe=" + codSpe + " ]";
    }
    
}
