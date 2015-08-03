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
public class VersionModeleDipPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_MOD_VMD")
    private String codModVmd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_VRS_VMD")
    private String codVrsVmd;

    public VersionModeleDipPK() {
    }

    public VersionModeleDipPK(String codModVmd, String codVrsVmd) {
        this.codModVmd = codModVmd;
        this.codVrsVmd = codVrsVmd;
    }

    public String getCodModVmd() {
        return codModVmd;
    }

    public void setCodModVmd(String codModVmd) {
        this.codModVmd = codModVmd;
    }

    public String getCodVrsVmd() {
        return codVrsVmd;
    }

    public void setCodVrsVmd(String codVrsVmd) {
        this.codVrsVmd = codVrsVmd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codModVmd != null ? codModVmd.hashCode() : 0);
        hash += (codVrsVmd != null ? codVrsVmd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionModeleDipPK)) {
            return false;
        }
        VersionModeleDipPK other = (VersionModeleDipPK) object;
        if ((this.codModVmd == null && other.codModVmd != null) || (this.codModVmd != null && !this.codModVmd.equals(other.codModVmd))) {
            return false;
        }
        if ((this.codVrsVmd == null && other.codVrsVmd != null) || (this.codVrsVmd != null && !this.codVrsVmd.equals(other.codVrsVmd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.VersionModeleDipPK[ codModVmd=" + codModVmd + ", codVrsVmd=" + codVrsVmd + " ]";
    }
    
}
