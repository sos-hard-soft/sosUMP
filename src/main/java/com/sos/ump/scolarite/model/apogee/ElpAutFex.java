/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author infofso-ws1
 */
@Entity
@Table(name = "ELP_AUT_FEX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ElpAutFex.findAll", query = "SELECT e FROM ElpAutFex e"),
    @NamedQuery(name = "ElpAutFex.findByCodElp", query = "SELECT e FROM ElpAutFex e WHERE e.elpAutFexPK.codElp = :codElp"),
    @NamedQuery(name = "ElpAutFex.findByCodFex", query = "SELECT e FROM ElpAutFex e WHERE e.elpAutFexPK.codFex = :codFex"),
    @NamedQuery(name = "ElpAutFex.findByTemAftFexElp", query = "SELECT e FROM ElpAutFex e WHERE e.temAftFexElp = :temAftFexElp")})
public class ElpAutFex implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ElpAutFexPK elpAutFexPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_AFT_FEX_ELP")
    private String temAftFexElp;
    @JoinColumn(name = "COD_ELP", referencedColumnName = "COD_ELP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ElementPedagogi elementPedagogi;
    @JoinColumn(name = "COD_FEX", referencedColumnName = "COD_FEX", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FormuleExamen formuleExamen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "elpAutFex")
    private List<IndContratElp> indContratElpList;

    public ElpAutFex() {
    }

    public ElpAutFex(ElpAutFexPK elpAutFexPK) {
        this.elpAutFexPK = elpAutFexPK;
    }

    public ElpAutFex(ElpAutFexPK elpAutFexPK, String temAftFexElp) {
        this.elpAutFexPK = elpAutFexPK;
        this.temAftFexElp = temAftFexElp;
    }

    public ElpAutFex(String codElp, String codFex) {
        this.elpAutFexPK = new ElpAutFexPK(codElp, codFex);
    }

    public ElpAutFexPK getElpAutFexPK() {
        return elpAutFexPK;
    }

    public void setElpAutFexPK(ElpAutFexPK elpAutFexPK) {
        this.elpAutFexPK = elpAutFexPK;
    }

    public String getTemAftFexElp() {
        return temAftFexElp;
    }

    public void setTemAftFexElp(String temAftFexElp) {
        this.temAftFexElp = temAftFexElp;
    }

    public ElementPedagogi getElementPedagogi() {
        return elementPedagogi;
    }

    public void setElementPedagogi(ElementPedagogi elementPedagogi) {
        this.elementPedagogi = elementPedagogi;
    }

    public FormuleExamen getFormuleExamen() {
        return formuleExamen;
    }

    public void setFormuleExamen(FormuleExamen formuleExamen) {
        this.formuleExamen = formuleExamen;
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
        hash += (elpAutFexPK != null ? elpAutFexPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElpAutFex)) {
            return false;
        }
        ElpAutFex other = (ElpAutFex) object;
        if ((this.elpAutFexPK == null && other.elpAutFexPK != null) || (this.elpAutFexPK != null && !this.elpAutFexPK.equals(other.elpAutFexPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ElpAutFex[ elpAutFexPK=" + elpAutFexPK + " ]";
    }
    
}
