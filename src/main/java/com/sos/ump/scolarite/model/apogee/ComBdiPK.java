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
public class ComBdiPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "COD_BDI")
    private String codBdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "COD_COM")
    private String codCom;

    public ComBdiPK() {
    }

    public ComBdiPK(String codBdi, String codCom) {
        this.codBdi = codBdi;
        this.codCom = codCom;
    }

    public String getCodBdi() {
        return codBdi;
    }

    public void setCodBdi(String codBdi) {
        this.codBdi = codBdi;
    }

    public String getCodCom() {
        return codCom;
    }

    public void setCodCom(String codCom) {
        this.codCom = codCom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codBdi != null ? codBdi.hashCode() : 0);
        hash += (codCom != null ? codCom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComBdiPK)) {
            return false;
        }
        ComBdiPK other = (ComBdiPK) object;
        if ((this.codBdi == null && other.codBdi != null) || (this.codBdi != null && !this.codBdi.equals(other.codBdi))) {
            return false;
        }
        if ((this.codCom == null && other.codCom != null) || (this.codCom != null && !this.codCom.equals(other.codCom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ComBdiPK[ codBdi=" + codBdi + ", codCom=" + codCom + " ]";
    }
    
}
