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
public class VersionDiplomePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "COD_DIP")
    private String codDip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_VRS_VDI")
    private short codVrsVdi;

    public VersionDiplomePK() {
    }

    public VersionDiplomePK(String codDip, short codVrsVdi) {
        this.codDip = codDip;
        this.codVrsVdi = codVrsVdi;
    }

    public String getCodDip() {
        return codDip;
    }

    public void setCodDip(String codDip) {
        this.codDip = codDip;
    }

    public short getCodVrsVdi() {
        return codVrsVdi;
    }

    public void setCodVrsVdi(short codVrsVdi) {
        this.codVrsVdi = codVrsVdi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDip != null ? codDip.hashCode() : 0);
        hash += (int) codVrsVdi;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionDiplomePK)) {
            return false;
        }
        VersionDiplomePK other = (VersionDiplomePK) object;
        if ((this.codDip == null && other.codDip != null) || (this.codDip != null && !this.codDip.equals(other.codDip))) {
            return false;
        }
        if (this.codVrsVdi != other.codVrsVdi) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.VersionDiplomePK[ codDip=" + codDip + ", codVrsVdi=" + codVrsVdi + " ]";
    }
    
}
