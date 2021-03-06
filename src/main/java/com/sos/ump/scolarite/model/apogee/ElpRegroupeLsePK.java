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
public class ElpRegroupeLsePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_ELP")
    private String codElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_LSE")
    private String codLse;

    public ElpRegroupeLsePK() {
    }

    public ElpRegroupeLsePK(String codElp, String codLse) {
        this.codElp = codElp;
        this.codLse = codLse;
    }

    public String getCodElp() {
        return codElp;
    }

    public void setCodElp(String codElp) {
        this.codElp = codElp;
    }

    public String getCodLse() {
        return codLse;
    }

    public void setCodLse(String codLse) {
        this.codLse = codLse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codElp != null ? codElp.hashCode() : 0);
        hash += (codLse != null ? codLse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElpRegroupeLsePK)) {
            return false;
        }
        ElpRegroupeLsePK other = (ElpRegroupeLsePK) object;
        if ((this.codElp == null && other.codElp != null) || (this.codElp != null && !this.codElp.equals(other.codElp))) {
            return false;
        }
        if ((this.codLse == null && other.codLse != null) || (this.codLse != null && !this.codLse.equals(other.codLse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ElpRegroupeLsePK[ codElp=" + codElp + ", codLse=" + codLse + " ]";
    }
    
}
