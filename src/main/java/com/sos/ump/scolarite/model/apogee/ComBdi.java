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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "COM_BDI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComBdi.findAll", query = "SELECT c FROM ComBdi c"),
    @NamedQuery(name = "ComBdi.findByCodBdi", query = "SELECT c FROM ComBdi c WHERE c.comBdiPK.codBdi = :codBdi"),
    @NamedQuery(name = "ComBdi.findByCodCom", query = "SELECT c FROM ComBdi c WHERE c.comBdiPK.codCom = :codCom"),
    @NamedQuery(name = "ComBdi.findByLibAch", query = "SELECT c FROM ComBdi c WHERE c.libAch = :libAch"),
    @NamedQuery(name = "ComBdi.findByEtaPtcLoc", query = "SELECT c FROM ComBdi c WHERE c.etaPtcLoc = :etaPtcLoc"),
    @NamedQuery(name = "ComBdi.findByEtaPtcAch", query = "SELECT c FROM ComBdi c WHERE c.etaPtcAch = :etaPtcAch"),
    @NamedQuery(name = "ComBdi.findByTemEnSveCbd", query = "SELECT c FROM ComBdi c WHERE c.temEnSveCbd = :temEnSveCbd"),
    @NamedQuery(name = "ComBdi.findByCodFicCbd", query = "SELECT c FROM ComBdi c WHERE c.codFicCbd = :codFicCbd")})
public class ComBdi implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComBdiPK comBdiPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "LIB_ACH")
    private String libAch;
    @Size(max = 1)
    @Column(name = "ETA_PTC_LOC")
    private String etaPtcLoc;
    @Size(max = 1)
    @Column(name = "ETA_PTC_ACH")
    private String etaPtcAch;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CBD")
    private String temEnSveCbd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_FIC_CBD")
    private String codFicCbd;
    @OneToMany(mappedBy = "comBdi")
    private List<CentreGestion> centreGestionList;
    @JoinColumn(name = "COD_BDI", referencedColumnName = "COD_BDI", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BureauDis bureauDis;
    @JoinColumn(name = "COD_COM", referencedColumnName = "COD_COM", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Commune commune;
    @OneToMany(mappedBy = "comBdi")
    private List<Composante> composanteList;
    @OneToMany(mappedBy = "comBdi")
    private List<Adresse> adresseList;
    @OneToMany(mappedBy = "comBdi")
    private List<CentrePayeur> centrePayeurList;
    @OneToMany(mappedBy = "comBdi")
    private List<Cpam> cpamList;
    @OneToMany(mappedBy = "comBdi")
    private List<Etablissement> etablissementList;
    @OneToMany(mappedBy = "comBdi")
    private List<Mutuelle> mutuelleList;

    public ComBdi() {
    }

    public ComBdi(ComBdiPK comBdiPK) {
        this.comBdiPK = comBdiPK;
    }

    public ComBdi(ComBdiPK comBdiPK, String libAch, String temEnSveCbd, String codFicCbd) {
        this.comBdiPK = comBdiPK;
        this.libAch = libAch;
        this.temEnSveCbd = temEnSveCbd;
        this.codFicCbd = codFicCbd;
    }

    public ComBdi(String codBdi, String codCom) {
        this.comBdiPK = new ComBdiPK(codBdi, codCom);
    }

    public ComBdiPK getComBdiPK() {
        return comBdiPK;
    }

    public void setComBdiPK(ComBdiPK comBdiPK) {
        this.comBdiPK = comBdiPK;
    }

    public String getLibAch() {
        return libAch;
    }

    public void setLibAch(String libAch) {
        this.libAch = libAch;
    }

    public String getEtaPtcLoc() {
        return etaPtcLoc;
    }

    public void setEtaPtcLoc(String etaPtcLoc) {
        this.etaPtcLoc = etaPtcLoc;
    }

    public String getEtaPtcAch() {
        return etaPtcAch;
    }

    public void setEtaPtcAch(String etaPtcAch) {
        this.etaPtcAch = etaPtcAch;
    }

    public String getTemEnSveCbd() {
        return temEnSveCbd;
    }

    public void setTemEnSveCbd(String temEnSveCbd) {
        this.temEnSveCbd = temEnSveCbd;
    }

    public String getCodFicCbd() {
        return codFicCbd;
    }

    public void setCodFicCbd(String codFicCbd) {
        this.codFicCbd = codFicCbd;
    }

    @XmlTransient
    public List<CentreGestion> getCentreGestionList() {
        return centreGestionList;
    }

    public void setCentreGestionList(List<CentreGestion> centreGestionList) {
        this.centreGestionList = centreGestionList;
    }

    public BureauDis getBureauDis() {
        return bureauDis;
    }

    public void setBureauDis(BureauDis bureauDis) {
        this.bureauDis = bureauDis;
    }

    public Commune getCommune() {
        return commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }

    @XmlTransient
    public List<Composante> getComposanteList() {
        return composanteList;
    }

    public void setComposanteList(List<Composante> composanteList) {
        this.composanteList = composanteList;
    }

    @XmlTransient
    public List<Adresse> getAdresseList() {
        return adresseList;
    }

    public void setAdresseList(List<Adresse> adresseList) {
        this.adresseList = adresseList;
    }

    @XmlTransient
    public List<CentrePayeur> getCentrePayeurList() {
        return centrePayeurList;
    }

    public void setCentrePayeurList(List<CentrePayeur> centrePayeurList) {
        this.centrePayeurList = centrePayeurList;
    }

    @XmlTransient
    public List<Cpam> getCpamList() {
        return cpamList;
    }

    public void setCpamList(List<Cpam> cpamList) {
        this.cpamList = cpamList;
    }

    @XmlTransient
    public List<Etablissement> getEtablissementList() {
        return etablissementList;
    }

    public void setEtablissementList(List<Etablissement> etablissementList) {
        this.etablissementList = etablissementList;
    }

    @XmlTransient
    public List<Mutuelle> getMutuelleList() {
        return mutuelleList;
    }

    public void setMutuelleList(List<Mutuelle> mutuelleList) {
        this.mutuelleList = mutuelleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comBdiPK != null ? comBdiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComBdi)) {
            return false;
        }
        ComBdi other = (ComBdi) object;
        if ((this.comBdiPK == null && other.comBdiPK != null) || (this.comBdiPK != null && !this.comBdiPK.equals(other.comBdiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ComBdi[ comBdiPK=" + comBdiPK + " ]";
    }
    
}
