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
@Table(name = "DIPLOME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diplome.findAll", query = "SELECT d FROM Diplome d"),
    @NamedQuery(name = "Diplome.findByCodDip", query = "SELECT d FROM Diplome d WHERE d.codDip = :codDip"),
    @NamedQuery(name = "Diplome.findByLibDip", query = "SELECT d FROM Diplome d WHERE d.libDip = :libDip"),
    @NamedQuery(name = "Diplome.findByLicDip", query = "SELECT d FROM Diplome d WHERE d.licDip = :licDip"),
    @NamedQuery(name = "Diplome.findByNbrMaxInscDeug", query = "SELECT d FROM Diplome d WHERE d.nbrMaxInscDeug = :nbrMaxInscDeug"),
    @NamedQuery(name = "Diplome.findByTemCouAccTrvDip", query = "SELECT d FROM Diplome d WHERE d.temCouAccTrvDip = :temCouAccTrvDip"),
    @NamedQuery(name = "Diplome.findByTemOuvDrtSsoDip", query = "SELECT d FROM Diplome d WHERE d.temOuvDrtSsoDip = :temOuvDrtSsoDip"),
    @NamedQuery(name = "Diplome.findByLibDipArb", query = "SELECT d FROM Diplome d WHERE d.libDipArb = :libDipArb"),
    @NamedQuery(name = "Diplome.findByLicDipArb", query = "SELECT d FROM Diplome d WHERE d.licDipArb = :licDipArb"),
    @NamedQuery(name = "Diplome.findByCodPer", query = "SELECT d FROM Diplome d WHERE d.codPer = :codPer")})
public class Diplome implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "COD_DIP")
    private String codDip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_DIP")
    private String libDip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIC_DIP")
    private String licDip;
    @Column(name = "NBR_MAX_INSC_DEUG")
    private Short nbrMaxInscDeug;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_COU_ACC_TRV_DIP")
    private String temCouAccTrvDip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_OUV_DRT_SSO_DIP")
    private String temOuvDrtSsoDip;
    @Size(max = 60)
    @Column(name = "LIB_DIP_ARB")
    private String libDipArb;
    @Size(max = 25)
    @Column(name = "LIC_DIP_ARB")
    private String licDipArb;
    @Column(name = "COD_PER")
    private Integer codPer;
    @JoinColumn(name = "COD_CYC", referencedColumnName = "COD_CYC")
    @ManyToOne(optional = false)
    private Cycle codCyc;
    @JoinColumn(name = "COD_ETB", referencedColumnName = "COD_ETB")
    @ManyToOne
    private Etablissement codEtb;
    @JoinColumn(name = "COD_NDI", referencedColumnName = "COD_NDI")
    @ManyToOne(optional = false)
    private NatureDiplome codNdi;
    @JoinColumn(name = "COD_NIM", referencedColumnName = "COD_NIM")
    @ManyToOne
    private NiveauIntermini codNim;
    @JoinColumn(name = "COD_SDS", referencedColumnName = "COD_SDS")
    @ManyToOne
    private SecDisSis codSds;
    @JoinColumn(name = "COD_TPD_ETB", referencedColumnName = "COD_TPD_ETB")
    @ManyToOne(optional = false)
    private TypDiplome codTpdEtb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diplome")
    private List<VersionDiplome> versionDiplomeList;

    public Diplome() {
    }

    public Diplome(String codDip) {
        this.codDip = codDip;
    }

    public Diplome(String codDip, String libDip, String licDip, String temCouAccTrvDip, String temOuvDrtSsoDip) {
        this.codDip = codDip;
        this.libDip = libDip;
        this.licDip = licDip;
        this.temCouAccTrvDip = temCouAccTrvDip;
        this.temOuvDrtSsoDip = temOuvDrtSsoDip;
    }

    public String getCodDip() {
        return codDip;
    }

    public void setCodDip(String codDip) {
        this.codDip = codDip;
    }

    public String getLibDip() {
        return libDip;
    }

    public void setLibDip(String libDip) {
        this.libDip = libDip;
    }

    public String getLicDip() {
        return licDip;
    }

    public void setLicDip(String licDip) {
        this.licDip = licDip;
    }

    public Short getNbrMaxInscDeug() {
        return nbrMaxInscDeug;
    }

    public void setNbrMaxInscDeug(Short nbrMaxInscDeug) {
        this.nbrMaxInscDeug = nbrMaxInscDeug;
    }

    public String getTemCouAccTrvDip() {
        return temCouAccTrvDip;
    }

    public void setTemCouAccTrvDip(String temCouAccTrvDip) {
        this.temCouAccTrvDip = temCouAccTrvDip;
    }

    public String getTemOuvDrtSsoDip() {
        return temOuvDrtSsoDip;
    }

    public void setTemOuvDrtSsoDip(String temOuvDrtSsoDip) {
        this.temOuvDrtSsoDip = temOuvDrtSsoDip;
    }

    public String getLibDipArb() {
        return libDipArb;
    }

    public void setLibDipArb(String libDipArb) {
        this.libDipArb = libDipArb;
    }

    public String getLicDipArb() {
        return licDipArb;
    }

    public void setLicDipArb(String licDipArb) {
        this.licDipArb = licDipArb;
    }

    public Integer getCodPer() {
        return codPer;
    }

    public void setCodPer(Integer codPer) {
        this.codPer = codPer;
    }

    public Cycle getCodCyc() {
        return codCyc;
    }

    public void setCodCyc(Cycle codCyc) {
        this.codCyc = codCyc;
    }

    public Etablissement getCodEtb() {
        return codEtb;
    }

    public void setCodEtb(Etablissement codEtb) {
        this.codEtb = codEtb;
    }

    public NatureDiplome getCodNdi() {
        return codNdi;
    }

    public void setCodNdi(NatureDiplome codNdi) {
        this.codNdi = codNdi;
    }

    public NiveauIntermini getCodNim() {
        return codNim;
    }

    public void setCodNim(NiveauIntermini codNim) {
        this.codNim = codNim;
    }

    public SecDisSis getCodSds() {
        return codSds;
    }

    public void setCodSds(SecDisSis codSds) {
        this.codSds = codSds;
    }

    public TypDiplome getCodTpdEtb() {
        return codTpdEtb;
    }

    public void setCodTpdEtb(TypDiplome codTpdEtb) {
        this.codTpdEtb = codTpdEtb;
    }

    @XmlTransient
    public List<VersionDiplome> getVersionDiplomeList() {
        return versionDiplomeList;
    }

    public void setVersionDiplomeList(List<VersionDiplome> versionDiplomeList) {
        this.versionDiplomeList = versionDiplomeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDip != null ? codDip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diplome)) {
            return false;
        }
        Diplome other = (Diplome) object;
        if ((this.codDip == null && other.codDip != null) || (this.codDip != null && !this.codDip.equals(other.codDip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.Diplome[ codDip=" + codDip + " ]";
    }
    
}
