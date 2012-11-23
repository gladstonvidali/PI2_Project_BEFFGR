/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gladstonvidali
 */
@Entity
@Table(name = "Exp_Prof_Sistema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExpProfSistema.findAll", query = "SELECT e FROM ExpProfSistema e"),
    @NamedQuery(name = "ExpProfSistema.findByCodExpProf", query = "SELECT e FROM ExpProfSistema e WHERE e.codExpProf = :codExpProf"),
    @NamedQuery(name = "ExpProfSistema.findByDescricao", query = "SELECT e FROM ExpProfSistema e WHERE e.descricao = :descricao"),
    @NamedQuery(name = "ExpProfSistema.findByCodEmpresa", query = "SELECT e FROM ExpProfSistema e WHERE e.codEmpresa = :codEmpresa"),
    @NamedQuery(name = "ExpProfSistema.findByCodUsr", query = "SELECT e FROM ExpProfSistema e WHERE e.codUsr = :codUsr")})
public class ExpProfSistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Exp_Prof")
    private Integer codExpProf;
    @Size(max = 20)
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "Cod_Empresa")
    private Integer codEmpresa;
    @Column(name = "Cod_Usr")
    private Integer codUsr;

    public ExpProfSistema() {
    }

    public ExpProfSistema(Integer codExpProf) {
        this.codExpProf = codExpProf;
    }

    public Integer getCodExpProf() {
        return codExpProf;
    }

    public void setCodExpProf(Integer codExpProf) {
        this.codExpProf = codExpProf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public Integer getCodUsr() {
        return codUsr;
    }

    public void setCodUsr(Integer codUsr) {
        this.codUsr = codUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codExpProf != null ? codExpProf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExpProfSistema)) {
            return false;
        }
        ExpProfSistema other = (ExpProfSistema) object;
        if ((this.codExpProf == null && other.codExpProf != null) || (this.codExpProf != null && !this.codExpProf.equals(other.codExpProf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.ExpProfSistema[ codExpProf=" + codExpProf + " ]";
    }
    
}
