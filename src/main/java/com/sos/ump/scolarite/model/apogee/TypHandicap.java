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
@Table(name = "TYP_HANDICAP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypHandicap.findAll", query = "SELECT t FROM TypHandicap t"),
    @NamedQuery(name = "TypHandicap.findByCodThp", query = "SELECT t FROM TypHandicap t WHERE t.codThp = :codThp"),
    @NamedQuery(name = "TypHandicap.findByLibThp", query = "SELECT t FROM TypHandicap t WHERE t.libThp = :libThp"),
    @NamedQuery(name = "TypHandicap.findByLicThp", query = "SELECT t FROM TypHandicap t WHERE t.licThp = :licThp"),
    @NamedQuery(name = "TypHandicap.findByTemTieTps", query = "SELECT t FROM TypHandicap t WHERE t.temTieTps = :temTieTps"),
    @NamedQuery(name = "TypHandicap.findByTemEnSveThp", query = "SELECT t FROM TypHandicap t WHERE t.temEnSveThp = :temEnSveThp"),
    @NamedQuery(name = "TypHandicap.findByLim1Thp", query = "SELECT t FROM TypHandicap t WHERE t.lim1Thp = :lim1Thp"),
    @NamedQuery(name = "TypHandicap.findByLim2Thp", query = "SELECT t FROM TypHandicap t WHERE t.lim2Thp = :lim2Thp"),
    @NamedQuery(name = "TypHandicap.findByLim3Thp", query = "SELECT t FROM TypHandicap t WHERE t.lim3Thp = :lim3Thp"),
    @NamedQuery(name = "TypHandicap.findByTemMinThp", query = "SELECT t FROM TypHandicap t WHERE t.temMinThp = :temMinThp"),
    @NamedQuery(name = "TypHandicap.findByNumOrdThp", query = "SELECT t FROM TypHandicap t WHERE t.numOrdThp = :numOrdThp"),
    @NamedQuery(name = "TypHandicap.findByLibWebThp", query = "SELECT t FROM TypHandicap t WHERE t.libWebThp = :libWebThp")})
public class TypHandicap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_THP")
    private String codThp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_THP")
    private String libThp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_THP")
    private String licThp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TIE_TPS")
    private String temTieTps;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_THP")
    private String temEnSveThp;
    @Size(max = 35)
    @Column(name = "LIM1_THP")
    private String lim1Thp;
    @Size(max = 35)
    @Column(name = "LIM2_THP")
    private String lim2Thp;
    @Size(max = 35)
    @Column(name = "LIM3_THP")
    private String lim3Thp;
    @Size(max = 1)
    @Column(name = "TEM_MIN_THP")
    private String temMinThp;
    @Column(name = "NUM_ORD_THP")
    private Short numOrdThp;
    @Size(max = 120)
    @Column(name = "LIB_WEB_THP")
    private String libWebThp;
    @OneToMany(mappedBy = "codThp")
    private List<Individu> individuList;

    public TypHandicap() {
    }

    public TypHandicap(String codThp) {
        this.codThp = codThp;
    }

    public TypHandicap(String codThp, String libThp, String licThp, String temTieTps, String temEnSveThp) {
        this.codThp = codThp;
        this.libThp = libThp;
        this.licThp = licThp;
        this.temTieTps = temTieTps;
        this.temEnSveThp = temEnSveThp;
    }

    public String getCodThp() {
        return codThp;
    }

    public void setCodThp(String codThp) {
        this.codThp = codThp;
    }

    public String getLibThp() {
        return libThp;
    }

    public void setLibThp(String libThp) {
        this.libThp = libThp;
    }

    public String getLicThp() {
        return licThp;
    }

    public void setLicThp(String licThp) {
        this.licThp = licThp;
    }

    public String getTemTieTps() {
        return temTieTps;
    }

    public void setTemTieTps(String temTieTps) {
        this.temTieTps = temTieTps;
    }

    public String getTemEnSveThp() {
        return temEnSveThp;
    }

    public void setTemEnSveThp(String temEnSveThp) {
        this.temEnSveThp = temEnSveThp;
    }

    public String getLim1Thp() {
        return lim1Thp;
    }

    public void setLim1Thp(String lim1Thp) {
        this.lim1Thp = lim1Thp;
    }

    public String getLim2Thp() {
        return lim2Thp;
    }

    public void setLim2Thp(String lim2Thp) {
        this.lim2Thp = lim2Thp;
    }

    public String getLim3Thp() {
        return lim3Thp;
    }

    public void setLim3Thp(String lim3Thp) {
        this.lim3Thp = lim3Thp;
    }

    public String getTemMinThp() {
        return temMinThp;
    }

    public void setTemMinThp(String temMinThp) {
        this.temMinThp = temMinThp;
    }

    public Short getNumOrdThp() {
        return numOrdThp;
    }

    public void setNumOrdThp(Short numOrdThp) {
        this.numOrdThp = numOrdThp;
    }

    public String getLibWebThp() {
        return libWebThp;
    }

    public void setLibWebThp(String libWebThp) {
        this.libWebThp = libWebThp;
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
        hash += (codThp != null ? codThp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypHandicap)) {
            return false;
        }
        TypHandicap other = (TypHandicap) object;
        if ((this.codThp == null && other.codThp != null) || (this.codThp != null && !this.codThp.equals(other.codThp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TypHandicap[ codThp=" + codThp + " ]";
    }
    
}
