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
@Table(name = "TELE_ENSEIGNEMENT_MODE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TeleEnseignementMode.findAll", query = "SELECT t FROM TeleEnseignementMode t"),
    @NamedQuery(name = "TeleEnseignementMode.findByCodTls", query = "SELECT t FROM TeleEnseignementMode t WHERE t.codTls = :codTls"),
    @NamedQuery(name = "TeleEnseignementMode.findByCodSisTls", query = "SELECT t FROM TeleEnseignementMode t WHERE t.codSisTls = :codSisTls"),
    @NamedQuery(name = "TeleEnseignementMode.findByLibTls", query = "SELECT t FROM TeleEnseignementMode t WHERE t.libTls = :libTls"),
    @NamedQuery(name = "TeleEnseignementMode.findByLicTls", query = "SELECT t FROM TeleEnseignementMode t WHERE t.licTls = :licTls"),
    @NamedQuery(name = "TeleEnseignementMode.findByTemEnSveTls", query = "SELECT t FROM TeleEnseignementMode t WHERE t.temEnSveTls = :temEnSveTls")})
public class TeleEnseignementMode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_TLS")
    private String codTls;
    @Size(max = 1)
    @Column(name = "COD_SIS_TLS")
    private String codSisTls;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_TLS")
    private String libTls;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_TLS")
    private String licTls;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_TLS")
    private String temEnSveTls;
    @OneToMany(mappedBy = "codTls")
    private List<InsAdmEtp> insAdmEtpList;

    public TeleEnseignementMode() {
    }

    public TeleEnseignementMode(String codTls) {
        this.codTls = codTls;
    }

    public TeleEnseignementMode(String codTls, String libTls, String licTls, String temEnSveTls) {
        this.codTls = codTls;
        this.libTls = libTls;
        this.licTls = licTls;
        this.temEnSveTls = temEnSveTls;
    }

    public String getCodTls() {
        return codTls;
    }

    public void setCodTls(String codTls) {
        this.codTls = codTls;
    }

    public String getCodSisTls() {
        return codSisTls;
    }

    public void setCodSisTls(String codSisTls) {
        this.codSisTls = codSisTls;
    }

    public String getLibTls() {
        return libTls;
    }

    public void setLibTls(String libTls) {
        this.libTls = libTls;
    }

    public String getLicTls() {
        return licTls;
    }

    public void setLicTls(String licTls) {
        this.licTls = licTls;
    }

    public String getTemEnSveTls() {
        return temEnSveTls;
    }

    public void setTemEnSveTls(String temEnSveTls) {
        this.temEnSveTls = temEnSveTls;
    }

    @XmlTransient
    public List<InsAdmEtp> getInsAdmEtpList() {
        return insAdmEtpList;
    }

    public void setInsAdmEtpList(List<InsAdmEtp> insAdmEtpList) {
        this.insAdmEtpList = insAdmEtpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTls != null ? codTls.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeleEnseignementMode)) {
            return false;
        }
        TeleEnseignementMode other = (TeleEnseignementMode) object;
        if ((this.codTls == null && other.codTls != null) || (this.codTls != null && !this.codTls.equals(other.codTls))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.TeleEnseignementMode[ codTls=" + codTls + " ]";
    }
    
}
