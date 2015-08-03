/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.ump.scolarite.model.apogee;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "ELP_CORRESPOND_ELP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ElpCorrespondElp.findAll", query = "SELECT e FROM ElpCorrespondElp e"),
    @NamedQuery(name = "ElpCorrespondElp.findByCodLcc", query = "SELECT e FROM ElpCorrespondElp e WHERE e.codLcc = :codLcc"),
    @NamedQuery(name = "ElpCorrespondElp.findByPdsS1Lcc", query = "SELECT e FROM ElpCorrespondElp e WHERE e.pdsS1Lcc = :pdsS1Lcc"),
    @NamedQuery(name = "ElpCorrespondElp.findByPdsS2Lcc", query = "SELECT e FROM ElpCorrespondElp e WHERE e.pdsS2Lcc = :pdsS2Lcc"),
    @NamedQuery(name = "ElpCorrespondElp.findByDaaDebValLcc", query = "SELECT e FROM ElpCorrespondElp e WHERE e.daaDebValLcc = :daaDebValLcc"),
    @NamedQuery(name = "ElpCorrespondElp.findByDaaFinValLcc", query = "SELECT e FROM ElpCorrespondElp e WHERE e.daaFinValLcc = :daaFinValLcc"),
    @NamedQuery(name = "ElpCorrespondElp.findByComLienLcc", query = "SELECT e FROM ElpCorrespondElp e WHERE e.comLienLcc = :comLienLcc")})
public class ElpCorrespondElp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_LCC")
    private Integer codLcc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PDS_S1_LCC")
    private BigDecimal pdsS1Lcc;
    @Column(name = "PDS_S2_LCC")
    private BigDecimal pdsS2Lcc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "DAA_DEB_VAL_LCC")
    private String daaDebValLcc;
    @Size(max = 4)
    @Column(name = "DAA_FIN_VAL_LCC")
    private String daaFinValLcc;
    @Size(max = 200)
    @Column(name = "COM_LIEN_LCC")
    private String comLienLcc;
    @JoinColumn(name = "COD_ELP_CIBLE_LCC", referencedColumnName = "COD_ELP")
    @ManyToOne(optional = false)
    private ElementPedagogi codElpCibleLcc;
    @JoinColumn(name = "COD_ELP_S1_LCC", referencedColumnName = "COD_ELP")
    @ManyToOne(optional = false)
    private ElementPedagogi codElpS1Lcc;
    @JoinColumn(name = "COD_ELP_S2_LCC", referencedColumnName = "COD_ELP")
    @ManyToOne
    private ElementPedagogi codElpS2Lcc;
    @OneToMany(mappedBy = "codLccIce")
    private List<IndContratElp> indContratElpList;

    public ElpCorrespondElp() {
    }

    public ElpCorrespondElp(Integer codLcc) {
        this.codLcc = codLcc;
    }

    public ElpCorrespondElp(Integer codLcc, String daaDebValLcc) {
        this.codLcc = codLcc;
        this.daaDebValLcc = daaDebValLcc;
    }

    public Integer getCodLcc() {
        return codLcc;
    }

    public void setCodLcc(Integer codLcc) {
        this.codLcc = codLcc;
    }

    public BigDecimal getPdsS1Lcc() {
        return pdsS1Lcc;
    }

    public void setPdsS1Lcc(BigDecimal pdsS1Lcc) {
        this.pdsS1Lcc = pdsS1Lcc;
    }

    public BigDecimal getPdsS2Lcc() {
        return pdsS2Lcc;
    }

    public void setPdsS2Lcc(BigDecimal pdsS2Lcc) {
        this.pdsS2Lcc = pdsS2Lcc;
    }

    public String getDaaDebValLcc() {
        return daaDebValLcc;
    }

    public void setDaaDebValLcc(String daaDebValLcc) {
        this.daaDebValLcc = daaDebValLcc;
    }

    public String getDaaFinValLcc() {
        return daaFinValLcc;
    }

    public void setDaaFinValLcc(String daaFinValLcc) {
        this.daaFinValLcc = daaFinValLcc;
    }

    public String getComLienLcc() {
        return comLienLcc;
    }

    public void setComLienLcc(String comLienLcc) {
        this.comLienLcc = comLienLcc;
    }

    public ElementPedagogi getCodElpCibleLcc() {
        return codElpCibleLcc;
    }

    public void setCodElpCibleLcc(ElementPedagogi codElpCibleLcc) {
        this.codElpCibleLcc = codElpCibleLcc;
    }

    public ElementPedagogi getCodElpS1Lcc() {
        return codElpS1Lcc;
    }

    public void setCodElpS1Lcc(ElementPedagogi codElpS1Lcc) {
        this.codElpS1Lcc = codElpS1Lcc;
    }

    public ElementPedagogi getCodElpS2Lcc() {
        return codElpS2Lcc;
    }

    public void setCodElpS2Lcc(ElementPedagogi codElpS2Lcc) {
        this.codElpS2Lcc = codElpS2Lcc;
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
        hash += (codLcc != null ? codLcc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElpCorrespondElp)) {
            return false;
        }
        ElpCorrespondElp other = (ElpCorrespondElp) object;
        if ((this.codLcc == null && other.codLcc != null) || (this.codLcc != null && !this.codLcc.equals(other.codLcc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sos.ump.scolarite.model.apogee.ElpCorrespondElp[ codLcc=" + codLcc + " ]";
    }
    
}
