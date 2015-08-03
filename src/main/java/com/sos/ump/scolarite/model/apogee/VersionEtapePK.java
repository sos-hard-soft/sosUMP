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
public class VersionEtapePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "COD_ETP")
    private String codEtp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_VRS_VET")
    private short codVrsVet;

    public VersionEtapePK() {
    }

    public VersionEtapePK(String codEtp, short codVrsVet) {
        this.codEtp = codEtp;
        this.codVrsVet = codVrsVet;
    }

    public String getCodEtp() {
        return codEtp;
    }

    public void setCodEtp(String codEtp) {
        this.codEtp = codEtp;
    }

    public short getCodVrsVet() {
        return codVrsVet;
    }

    public void setCodVrsVet(short codVrsVet) {
        this.codVrsVet = codVrsVet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEtp != null ? codEtp.hashCode() : 0);
        hash += (int) codVrsVet;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionEtapePK)) {
            return false;
        }
        VersionEtapePK other = (VersionEtapePK) object;
        if ((this.codEtp == null && other.codEtp != null) || (this.codEtp != null && !this.codEtp.equals(other.codEtp))) {
            return false;
        }
        if (this.codVrsVet != other.codVrsVet) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.VersionEtapePK[ codEtp=" + codEtp + ", codVrsVet=" + codVrsVet + " ]";
    }
    
}
