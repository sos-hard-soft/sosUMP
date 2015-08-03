/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "ELP_REGROUPE_LSE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ElpRegroupeLse.findAll", query = "SELECT e FROM ElpRegroupeLse e"),
    @NamedQuery(name = "ElpRegroupeLse.findByCodElp", query = "SELECT e FROM ElpRegroupeLse e WHERE e.elpRegroupeLsePK.codElp = :codElp"),
    @NamedQuery(name = "ElpRegroupeLse.findByCodLse", query = "SELECT e FROM ElpRegroupeLse e WHERE e.elpRegroupeLsePK.codLse = :codLse"),
    @NamedQuery(name = "ElpRegroupeLse.findByDatCreRelLseElp", query = "SELECT e FROM ElpRegroupeLse e WHERE e.datCreRelLseElp = :datCreRelLseElp"),
    @NamedQuery(name = "ElpRegroupeLse.findByDatFrmRelLseElp", query = "SELECT e FROM ElpRegroupeLse e WHERE e.datFrmRelLseElp = :datFrmRelLseElp"),
    @NamedQuery(name = "ElpRegroupeLse.findByNbrMaxElpOblChx", query = "SELECT e FROM ElpRegroupeLse e WHERE e.nbrMaxElpOblChx = :nbrMaxElpOblChx"),
    @NamedQuery(name = "ElpRegroupeLse.findByNbrMinElpOblChx", query = "SELECT e FROM ElpRegroupeLse e WHERE e.nbrMinElpOblChx = :nbrMinElpOblChx"),
    @NamedQuery(name = "ElpRegroupeLse.findByNumOrdErl", query = "SELECT e FROM ElpRegroupeLse e WHERE e.numOrdErl = :numOrdErl"),
    @NamedQuery(name = "ElpRegroupeLse.findByDatInsErl", query = "SELECT e FROM ElpRegroupeLse e WHERE e.datInsErl = :datInsErl")})
public class ElpRegroupeLse implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ElpRegroupeLsePK elpRegroupeLsePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAT_CRE_REL_LSE_ELP")
    @Temporal(TemporalType.DATE)
    private Date datCreRelLseElp;
    @Column(name = "DAT_FRM_REL_LSE_ELP")
    @Temporal(TemporalType.DATE)
    private Date datFrmRelLseElp;
    @Column(name = "NBR_MAX_ELP_OBL_CHX")
    private Short nbrMaxElpOblChx;
    @Column(name = "NBR_MIN_ELP_OBL_CHX")
    private Short nbrMinElpOblChx;
    @Column(name = "NUM_ORD_ERL")
    private BigInteger numOrdErl;
    @Column(name = "DAT_INS_ERL")
    @Temporal(TemporalType.DATE)
    private Date datInsErl;
    @JoinColumn(name = "COD_ELP", referencedColumnName = "COD_ELP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ElementPedagogi elementPedagogi;
    @JoinColumn(name = "COD_LSE", referencedColumnName = "COD_LSE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeElp listeElp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "elpRegroupeLse")
    private List<IndContratElp> indContratElpList;

    public ElpRegroupeLse() {
    }

    public ElpRegroupeLse(ElpRegroupeLsePK elpRegroupeLsePK) {
        this.elpRegroupeLsePK = elpRegroupeLsePK;
    }

    public ElpRegroupeLse(ElpRegroupeLsePK elpRegroupeLsePK, Date datCreRelLseElp) {
        this.elpRegroupeLsePK = elpRegroupeLsePK;
        this.datCreRelLseElp = datCreRelLseElp;
    }

    public ElpRegroupeLse(String codElp, String codLse) {
        this.elpRegroupeLsePK = new ElpRegroupeLsePK(codElp, codLse);
    }

    public ElpRegroupeLsePK getElpRegroupeLsePK() {
        return elpRegroupeLsePK;
    }

    public void setElpRegroupeLsePK(ElpRegroupeLsePK elpRegroupeLsePK) {
        this.elpRegroupeLsePK = elpRegroupeLsePK;
    }

    public Date getDatCreRelLseElp() {
        return datCreRelLseElp;
    }

    public void setDatCreRelLseElp(Date datCreRelLseElp) {
        this.datCreRelLseElp = datCreRelLseElp;
    }

    public Date getDatFrmRelLseElp() {
        return datFrmRelLseElp;
    }

    public void setDatFrmRelLseElp(Date datFrmRelLseElp) {
        this.datFrmRelLseElp = datFrmRelLseElp;
    }

    public Short getNbrMaxElpOblChx() {
        return nbrMaxElpOblChx;
    }

    public void setNbrMaxElpOblChx(Short nbrMaxElpOblChx) {
        this.nbrMaxElpOblChx = nbrMaxElpOblChx;
    }

    public Short getNbrMinElpOblChx() {
        return nbrMinElpOblChx;
    }

    public void setNbrMinElpOblChx(Short nbrMinElpOblChx) {
        this.nbrMinElpOblChx = nbrMinElpOblChx;
    }

    public BigInteger getNumOrdErl() {
        return numOrdErl;
    }

    public void setNumOrdErl(BigInteger numOrdErl) {
        this.numOrdErl = numOrdErl;
    }

    public Date getDatInsErl() {
        return datInsErl;
    }

    public void setDatInsErl(Date datInsErl) {
        this.datInsErl = datInsErl;
    }

    public ElementPedagogi getElementPedagogi() {
        return elementPedagogi;
    }

    public void setElementPedagogi(ElementPedagogi elementPedagogi) {
        this.elementPedagogi = elementPedagogi;
    }

    public ListeElp getListeElp() {
        return listeElp;
    }

    public void setListeElp(ListeElp listeElp) {
        this.listeElp = listeElp;
    }

    @XmlTransient
    public List<IndContratElp> getIndContratElpList() {
        return indContratElpList;
    }

    public void setIndContratElpList(List<IndContratElp> indContratElpList) {
        this.indContratElpList = indContratElpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (elpRegroupeLsePK != null ? elpRegroupeLsePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElpRegroupeLse)) {
            return false;
        }
        ElpRegroupeLse other = (ElpRegroupeLse) object;
        if ((this.elpRegroupeLsePK == null && other.elpRegroupeLsePK != null) || (this.elpRegroupeLsePK != null && !this.elpRegroupeLsePK.equals(other.elpRegroupeLsePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ElpRegroupeLse[ elpRegroupeLsePK=" + elpRegroupeLsePK + " ]";
    }
    
}
