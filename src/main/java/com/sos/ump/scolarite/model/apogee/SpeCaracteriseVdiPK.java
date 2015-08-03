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
public class SpeCaracteriseVdiPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_SPE")
    private String codSpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "COD_DIP")
    private String codDip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_VRS_VDI")
    private short codVrsVdi;

    public SpeCaracteriseVdiPK() {
    }

    public SpeCaracteriseVdiPK(String codSpe, String codDip, short codVrsVdi) {
        this.codSpe = codSpe;
        this.codDip = codDip;
        this.codVrsVdi = codVrsVdi;
    }

    public String getCodSpe() {
        return codSpe;
    }

    public void setCodSpe(String codSpe) {
        this.codSpe = codSpe;
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
        hash += (codSpe != null ? codSpe.hashCode() : 0);
        hash += (codDip != null ? codDip.hashCode() : 0);
        hash += (int) codVrsVdi;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpeCaracteriseVdiPK)) {
            return false;
        }
        SpeCaracteriseVdiPK other = (SpeCaracteriseVdiPK) object;
        if ((this.codSpe == null && other.codSpe != null) || (this.codSpe != null && !this.codSpe.equals(other.codSpe))) {
            return false;
        }
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
        return "com.sos.ump.scolarite.model.apogee.SpeCaracteriseVdiPK[ codSpe=" + codSpe + ", codDip=" + codDip + ", codVrsVdi=" + codVrsVdi + " ]";
    }
    
}
