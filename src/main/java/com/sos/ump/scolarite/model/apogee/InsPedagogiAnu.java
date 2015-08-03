/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "INS_PEDAGOGI_ANU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InsPedagogiAnu.findAll", query = "SELECT i FROM InsPedagogiAnu i"),
    @NamedQuery(name = "InsPedagogiAnu.findByCodAnu", query = "SELECT i FROM InsPedagogiAnu i WHERE i.insPedagogiAnuPK.codAnu = :codAnu"),
    @NamedQuery(name = "InsPedagogiAnu.findByCodInd", query = "SELECT i FROM InsPedagogiAnu i WHERE i.insPedagogiAnuPK.codInd = :codInd")})
public class InsPedagogiAnu implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsPedagogiAnuPK insPedagogiAnuPK;
    @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AnneeUni anneeUni;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "insPedagogiAnu")
    private List<InsPedagogiEtp> insPedagogiEtpList;

    public InsPedagogiAnu() {
    }

    public InsPedagogiAnu(InsPedagogiAnuPK insPedagogiAnuPK) {
        this.insPedagogiAnuPK = insPedagogiAnuPK;
    }

    public InsPedagogiAnu(String codAnu, int codInd) {
        this.insPedagogiAnuPK = new InsPedagogiAnuPK(codAnu, codInd);
    }

    public InsPedagogiAnuPK getInsPedagogiAnuPK() {
        return insPedagogiAnuPK;
    }

    public void setInsPedagogiAnuPK(InsPedagogiAnuPK insPedagogiAnuPK) {
        this.insPedagogiAnuPK = insPedagogiAnuPK;
    }

    public AnneeUni getAnneeUni() {
        return anneeUni;
    }

    public void setAnneeUni(AnneeUni anneeUni) {
        this.anneeUni = anneeUni;
    }

    public Individu getIndividu() {
        return individu;
    }

    public void setIndividu(Individu individu) {
        this.individu = individu;
    }

    @XmlTransient
    public List<InsPedagogiEtp> getInsPedagogiEtpList() {
        return insPedagogiEtpList;
    }

    public void setInsPedagogiEtpList(List<InsPedagogiEtp> insPedagogiEtpList) {
        this.insPedagogiEtpList = insPedagogiEtpList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insPedagogiAnuPK != null ? insPedagogiAnuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsPedagogiAnu)) {
            return false;
        }
        InsPedagogiAnu other = (InsPedagogiAnu) object;
        if ((this.insPedagogiAnuPK == null && other.insPedagogiAnuPK != null) || (this.insPedagogiAnuPK != null && !this.insPedagogiAnuPK.equals(other.insPedagogiAnuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.InsPedagogiAnu[ insPedagogiAnuPK=" + insPedagogiAnuPK + " ]";
    }
    
}
