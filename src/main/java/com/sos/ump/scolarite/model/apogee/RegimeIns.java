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
@Table(name = "REGIME_INS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegimeIns.findAll", query = "SELECT r FROM RegimeIns r"),
    @NamedQuery(name = "RegimeIns.findByCodRgi", query = "SELECT r FROM RegimeIns r WHERE r.codRgi = :codRgi"),
    @NamedQuery(name = "RegimeIns.findByCodSisRgi", query = "SELECT r FROM RegimeIns r WHERE r.codSisRgi = :codSisRgi"),
    @NamedQuery(name = "RegimeIns.findByLibRgi", query = "SELECT r FROM RegimeIns r WHERE r.libRgi = :libRgi"),
    @NamedQuery(name = "RegimeIns.findByLicRgi", query = "SELECT r FROM RegimeIns r WHERE r.licRgi = :licRgi"),
    @NamedQuery(name = "RegimeIns.findByTemEnSveRgi", query = "SELECT r FROM RegimeIns r WHERE r.temEnSveRgi = :temEnSveRgi"),
    @NamedQuery(name = "RegimeIns.findByEtaSisRgi", query = "SELECT r FROM RegimeIns r WHERE r.etaSisRgi = :etaSisRgi"),
    @NamedQuery(name = "RegimeIns.findByTemPecMinRgi", query = "SELECT r FROM RegimeIns r WHERE r.temPecMinRgi = :temPecMinRgi"),
    @NamedQuery(name = "RegimeIns.findByTemPdfRgi", query = "SELECT r FROM RegimeIns r WHERE r.temPdfRgi = :temPdfRgi")})
public class RegimeIns implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_RGI")
    private String codRgi;
    @Size(max = 2)
    @Column(name = "COD_SIS_RGI")
    private String codSisRgi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_RGI")
    private String libRgi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_RGI")
    private String licRgi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_RGI")
    private String temEnSveRgi;
    @Size(max = 2)
    @Column(name = "ETA_SIS_RGI")
    private String etaSisRgi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PEC_MIN_RGI")
    private String temPecMinRgi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PDF_RGI")
    private String temPdfRgi;
    @OneToMany(mappedBy = "codRgi")
    private List<InsAdmAnu> insAdmAnuList;

    public RegimeIns() {
    }

    public RegimeIns(String codRgi) {
        this.codRgi = codRgi;
    }

    public RegimeIns(String codRgi, String libRgi, String licRgi, String temEnSveRgi, String temPecMinRgi, String temPdfRgi) {
        this.codRgi = codRgi;
        this.libRgi = libRgi;
        this.licRgi = licRgi;
        this.temEnSveRgi = temEnSveRgi;
        this.temPecMinRgi = temPecMinRgi;
        this.temPdfRgi = temPdfRgi;
    }

    public String getCodRgi() {
        return codRgi;
    }

    public void setCodRgi(String codRgi) {
        this.codRgi = codRgi;
    }

    public String getCodSisRgi() {
        return codSisRgi;
    }

    public void setCodSisRgi(String codSisRgi) {
        this.codSisRgi = codSisRgi;
    }

    public String getLibRgi() {
        return libRgi;
    }

    public void setLibRgi(String libRgi) {
        this.libRgi = libRgi;
    }

    public String getLicRgi() {
        return licRgi;
    }

    public void setLicRgi(String licRgi) {
        this.licRgi = licRgi;
    }

    public String getTemEnSveRgi() {
        return temEnSveRgi;
    }

    public void setTemEnSveRgi(String temEnSveRgi) {
        this.temEnSveRgi = temEnSveRgi;
    }

    public String getEtaSisRgi() {
        return etaSisRgi;
    }

    public void setEtaSisRgi(String etaSisRgi) {
        this.etaSisRgi = etaSisRgi;
    }

    public String getTemPecMinRgi() {
        return temPecMinRgi;
    }

    public void setTemPecMinRgi(String temPecMinRgi) {
        this.temPecMinRgi = temPecMinRgi;
    }

    public String getTemPdfRgi() {
        return temPdfRgi;
    }

    public void setTemPdfRgi(String temPdfRgi) {
        this.temPdfRgi = temPdfRgi;
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
        hash += (codRgi != null ? codRgi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegimeIns)) {
            return false;
        }
        RegimeIns other = (RegimeIns) object;
        if ((this.codRgi == null && other.codRgi != null) || (this.codRgi != null && !this.codRgi.equals(other.codRgi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.RegimeIns[ codRgi=" + codRgi + " ]";
    }
    
}
