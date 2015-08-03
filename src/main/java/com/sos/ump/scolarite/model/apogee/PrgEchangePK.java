/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author infofso-ws1
 */
@Embeddable
public class PrgEchangePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_PRG")
    private String codPrg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SNS_PRG")
    private String temSnsPrg;

    public PrgEchangePK() {
    }

    public PrgEchangePK(String codPrg, String temSnsPrg) {
        this.codPrg = codPrg;
        this.temSnsPrg = temSnsPrg;
    }

    public String getCodPrg() {
        return codPrg;
    }

    public void setCodPrg(String codPrg) {
        this.codPrg = codPrg;
    }

    public String getTemSnsPrg() {
        return temSnsPrg;
    }

    public void setTemSnsPrg(String temSnsPrg) {
        this.temSnsPrg = temSnsPrg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPrg != null ? codPrg.hashCode() : 0);
        hash += (temSnsPrg != null ? temSnsPrg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrgEchangePK)) {
            return false;
        }
        PrgEchangePK other = (PrgEchangePK) object;
        if ((this.codPrg == null && other.codPrg != null) || (this.codPrg != null && !this.codPrg.equals(other.codPrg))) {
            return false;
        }
        if ((this.temSnsPrg == null && other.temSnsPrg != null) || (this.temSnsPrg != null && !this.temSnsPrg.equals(other.temSnsPrg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.PrgEchangePK[ codPrg=" + codPrg + ", temSnsPrg=" + temSnsPrg + " ]";
    }
    
}
