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
@Table(name = "NATURE_DIPLOME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NatureDiplome.findAll", query = "SELECT n FROM NatureDiplome n"),
    @NamedQuery(name = "NatureDiplome.findByCodNdi", query = "SELECT n FROM NatureDiplome n WHERE n.codNdi = :codNdi"),
    @NamedQuery(name = "NatureDiplome.findByCodPriNdi", query = "SELECT n FROM NatureDiplome n WHERE n.codPriNdi = :codPriNdi"),
    @NamedQuery(name = "NatureDiplome.findByLibNdi", query = "SELECT n FROM NatureDiplome n WHERE n.libNdi = :libNdi"),
    @NamedQuery(name = "NatureDiplome.findByLicNdi", query = "SELECT n FROM NatureDiplome n WHERE n.licNdi = :licNdi"),
    @NamedQuery(name = "NatureDiplome.findByTemEnSveNdi", query = "SELECT n FROM NatureDiplome n WHERE n.temEnSveNdi = :temEnSveNdi"),
    @NamedQuery(name = "NatureDiplome.findByTemDel", query = "SELECT n FROM NatureDiplome n WHERE n.temDel = :temDel")})
public class NatureDiplome implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_NDI")
    private String codNdi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_PRI_NDI")
    private short codPriNdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_NDI")
    private String libNdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_NDI")
    private String licNdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_NDI")
    private String temEnSveNdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codNdi")
    private List<Diplome> diplomeList;

    public NatureDiplome() {
    }

    public NatureDiplome(String codNdi) {
        this.codNdi = codNdi;
    }

    public NatureDiplome(String codNdi, short codPriNdi, String libNdi, String licNdi, String temEnSveNdi, String temDel) {
        this.codNdi = codNdi;
        this.codPriNdi = codPriNdi;
        this.libNdi = libNdi;
        this.licNdi = licNdi;
        this.temEnSveNdi = temEnSveNdi;
        this.temDel = temDel;
    }

    public String getCodNdi() {
        return codNdi;
    }

    public void setCodNdi(String codNdi) {
        this.codNdi = codNdi;
    }

    public short getCodPriNdi() {
        return codPriNdi;
    }

    public void setCodPriNdi(short codPriNdi) {
        this.codPriNdi = codPriNdi;
    }

    public String getLibNdi() {
        return libNdi;
    }

    public void setLibNdi(String libNdi) {
        this.libNdi = libNdi;
    }

    public String getLicNdi() {
        return licNdi;
    }

    public void setLicNdi(String licNdi) {
        this.licNdi = licNdi;
    }

    public String getTemEnSveNdi() {
        return temEnSveNdi;
    }

    public void setTemEnSveNdi(String temEnSveNdi) {
        this.temEnSveNdi = temEnSveNdi;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    @XmlTransient
    public List<Diplome> getDiplomeList() {
        return diplomeList;
    }

    public void setDiplomeList(List<Diplome> diplomeList) {
        this.diplomeList = diplomeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codNdi != null ? codNdi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NatureDiplome)) {
            return false;
        }
        NatureDiplome other = (NatureDiplome) object;
        if ((this.codNdi == null && other.codNdi != null) || (this.codNdi != null && !this.codNdi.equals(other.codNdi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.NatureDiplome[ codNdi=" + codNdi + " ]";
    }
    
}
