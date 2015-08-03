/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "GRP_RESULTAT_ELP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrpResultatElp.findAll", query = "SELECT g FROM GrpResultatElp g"),
    @NamedQuery(name = "GrpResultatElp.findByCodElp", query = "SELECT g FROM GrpResultatElp g WHERE g.grpResultatElpPK.codElp = :codElp"),
    @NamedQuery(name = "GrpResultatElp.findByCodAnu", query = "SELECT g FROM GrpResultatElp g WHERE g.grpResultatElpPK.codAnu = :codAnu"),
    @NamedQuery(name = "GrpResultatElp.findByCodSes", query = "SELECT g FROM GrpResultatElp g WHERE g.grpResultatElpPK.codSes = :codSes"),
    @NamedQuery(name = "GrpResultatElp.findByCodAdm", query = "SELECT g FROM GrpResultatElp g WHERE g.grpResultatElpPK.codAdm = :codAdm"),
    @NamedQuery(name = "GrpResultatElp.findByEtaAvcElp", query = "SELECT g FROM GrpResultatElp g WHERE g.etaAvcElp = :etaAvcElp"),
    @NamedQuery(name = "GrpResultatElp.findByDatAvcElp", query = "SELECT g FROM GrpResultatElp g WHERE g.datAvcElp = :datAvcElp"),
    @NamedQuery(name = "GrpResultatElp.findByTemAvcHerElp", query = "SELECT g FROM GrpResultatElp g WHERE g.temAvcHerElp = :temAvcHerElp"),
    @NamedQuery(name = "GrpResultatElp.findByTemIniTabResElp", query = "SELECT g FROM GrpResultatElp g WHERE g.temIniTabResElp = :temIniTabResElp"),
    @NamedQuery(name = "GrpResultatElp.findByTemTrtRptGeg", query = "SELECT g FROM GrpResultatElp g WHERE g.temTrtRptGeg = :temTrtRptGeg")})
public class GrpResultatElp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrpResultatElpPK grpResultatElpPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_AVC_ELP")
    private String etaAvcElp;
    @Column(name = "DAT_AVC_ELP")
    @Temporal(TemporalType.DATE)
    private Date datAvcElp;
    @Size(max = 1)
    @Column(name = "TEM_AVC_HER_ELP")
    private String temAvcHerElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INI_TAB_RES_ELP")
    private String temIniTabResElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TRT_RPT_GEG")
    private String temTrtRptGeg;
    @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AnneeUni anneeUni;
    @JoinColumn(name = "COD_ELP", referencedColumnName = "COD_ELP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ElementPedagogi elementPedagogi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grpResultatElp")
    private List<ResultatElp> resultatElpList;

    public GrpResultatElp() {
    }

    public GrpResultatElp(GrpResultatElpPK grpResultatElpPK) {
        this.grpResultatElpPK = grpResultatElpPK;
    }

    public GrpResultatElp(GrpResultatElpPK grpResultatElpPK, String etaAvcElp, String temIniTabResElp, String temTrtRptGeg) {
        this.grpResultatElpPK = grpResultatElpPK;
        this.etaAvcElp = etaAvcElp;
        this.temIniTabResElp = temIniTabResElp;
        this.temTrtRptGeg = temTrtRptGeg;
    }

    public GrpResultatElp(String codElp, String codAnu, String codSes, String codAdm) {
        this.grpResultatElpPK = new GrpResultatElpPK(codElp, codAnu, codSes, codAdm);
    }

    public GrpResultatElpPK getGrpResultatElpPK() {
        return grpResultatElpPK;
    }

    public void setGrpResultatElpPK(GrpResultatElpPK grpResultatElpPK) {
        this.grpResultatElpPK = grpResultatElpPK;
    }

    public String getEtaAvcElp() {
        return etaAvcElp;
    }

    public void setEtaAvcElp(String etaAvcElp) {
        this.etaAvcElp = etaAvcElp;
    }

    public Date getDatAvcElp() {
        return datAvcElp;
    }

    public void setDatAvcElp(Date datAvcElp) {
        this.datAvcElp = datAvcElp;
    }

    public String getTemAvcHerElp() {
        return temAvcHerElp;
    }

    public void setTemAvcHerElp(String temAvcHerElp) {
        this.temAvcHerElp = temAvcHerElp;
    }

    public String getTemIniTabResElp() {
        return temIniTabResElp;
    }

    public void setTemIniTabResElp(String temIniTabResElp) {
        this.temIniTabResElp = temIniTabResElp;
    }

    public String getTemTrtRptGeg() {
        return temTrtRptGeg;
    }

    public void setTemTrtRptGeg(String temTrtRptGeg) {
        this.temTrtRptGeg = temTrtRptGeg;
    }

    public AnneeUni getAnneeUni() {
        return anneeUni;
    }

    public void setAnneeUni(AnneeUni anneeUni) {
        this.anneeUni = anneeUni;
    }

    public ElementPedagogi getElementPedagogi() {
        return elementPedagogi;
    }

    public void setElementPedagogi(ElementPedagogi elementPedagogi) {
        this.elementPedagogi = elementPedagogi;
    }

    @XmlTransient
    public List<ResultatElp> getResultatElpList() {
        return resultatElpList;
    }

    public void setResultatElpList(List<ResultatElp> resultatElpList) {
        this.resultatElpList = resultatElpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grpResultatElpPK != null ? grpResultatElpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrpResultatElp)) {
            return false;
        }
        GrpResultatElp other = (GrpResultatElp) object;
        if ((this.grpResultatElpPK == null && other.grpResultatElpPK != null) || (this.grpResultatElpPK != null && !this.grpResultatElpPK.equals(other.grpResultatElpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.GrpResultatElp[ grpResultatElpPK=" + grpResultatElpPK + " ]";
    }
    
}
