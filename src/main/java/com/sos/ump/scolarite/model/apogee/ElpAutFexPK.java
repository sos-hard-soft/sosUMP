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
public class ElpAutFexPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_ELP")
    private String codElp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_FEX")
    private String codFex;

    public ElpAutFexPK() {
    }

    public ElpAutFexPK(String codElp, String codFex) {
        this.codElp = codElp;
        this.codFex = codFex;
    }

    public String getCodElp() {
        return codElp;
    }

    public void setCodElp(String codElp) {
        this.codElp = codElp;
    }

    public String getCodFex() {
        return codFex;
    }

    public void setCodFex(String codFex) {
        this.codFex = codFex;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codElp != null ? codElp.hashCode() : 0);
        hash += (codFex != null ? codFex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElpAutFexPK)) {
            return false;
        }
        ElpAutFexPK other = (ElpAutFexPK) object;
        if ((this.codElp == null && other.codElp != null) || (this.codElp != null && !this.codElp.equals(other.codElp))) {
            return false;
        }
        if ((this.codFex == null && other.codFex != null) || (this.codFex != null && !this.codFex.equals(other.codFex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ElpAutFexPK[ codElp=" + codElp + ", codFex=" + codFex + " ]";
    }
    
}
