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
@Table(name = "SEC_DIS_SIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecDisSis.findAll", query = "SELECT s FROM SecDisSis s"),
    @NamedQuery(name = "SecDisSis.findByCodSds", query = "SELECT s FROM SecDisSis s WHERE s.codSds = :codSds"),
    @NamedQuery(name = "SecDisSis.findByLibSds", query = "SELECT s FROM SecDisSis s WHERE s.libSds = :libSds"),
    @NamedQuery(name = "SecDisSis.findByLicSds", query = "SELECT s FROM SecDisSis s WHERE s.licSds = :licSds"),
    @NamedQuery(name = "SecDisSis.findByTemEnSveSds", query = "SELECT s FROM SecDisSis s WHERE s.temEnSveSds = :temEnSveSds")})
public class SecDisSis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_SDS")
    private String codSds;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_SDS")
    private String libSds;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_SDS")
    private String licSds;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_SDS")
    private String temEnSveSds;
    @OneToMany(mappedBy = "codSds")
    private List<Diplome> diplomeList;
    @JoinColumn(name = "COD_DSI", referencedColumnName = "COD_DSI")
    @ManyToOne(optional = false)
    private DisciplineSis codDsi;

    public SecDisSis() {
    }

    public SecDisSis(String codSds) {
        this.codSds = codSds;
    }

    public SecDisSis(String codSds, String libSds, String licSds, String temEnSveSds) {
        this.codSds = codSds;
        this.libSds = libSds;
        this.licSds = licSds;
        this.temEnSveSds = temEnSveSds;
    }

    public String getCodSds() {
        return codSds;
    }

    public void setCodSds(String codSds) {
        this.codSds = codSds;
    }

    public String getLibSds() {
        return libSds;
    }

    public void setLibSds(String libSds) {
        this.libSds = libSds;
    }

    public String getLicSds() {
        return licSds;
    }

    public void setLicSds(String licSds) {
        this.licSds = licSds;
    }

    public String getTemEnSveSds() {
        return temEnSveSds;
    }

    public void setTemEnSveSds(String temEnSveSds) {
        this.temEnSveSds = temEnSveSds;
    }

    @XmlTransient
    public List<Diplome> getDiplomeList() {
        return diplomeList;
    }

    public void setDiplomeList(List<Diplome> diplomeList) {
        this.diplomeList = diplomeList;
    }

    public DisciplineSis getCodDsi() {
        return codDsi;
    }

    public void setCodDsi(DisciplineSis codDsi) {
        this.codDsi = codDsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSds != null ? codSds.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecDisSis)) {
            return false;
        }
        SecDisSis other = (SecDisSis) object;
        if ((this.codSds == null && other.codSds != null) || (this.codSds != null && !this.codSds.equals(other.codSds))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.SecDisSis[ codSds=" + codSds + " ]";
    }
    
}
