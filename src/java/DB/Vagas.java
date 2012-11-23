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
@Table(name = "Vagas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vagas.findAll", query = "SELECT v FROM Vagas v"),
    @NamedQuery(name = "Vagas.findByCodVaga", query = "SELECT v FROM Vagas v WHERE v.codVaga = :codVaga"),
    @NamedQuery(name = "Vagas.findBySalario", query = "SELECT v FROM Vagas v WHERE v.salario = :salario"),
    @NamedQuery(name = "Vagas.findByDescricao", query = "SELECT v FROM Vagas v WHERE v.descricao = :descricao"),
    @NamedQuery(name = "Vagas.findByCodEmpresa", query = "SELECT v FROM Vagas v WHERE v.codEmpresa = :codEmpresa"),
    @NamedQuery(name = "Vagas.findByCodAreaAtuacao", query = "SELECT v FROM Vagas v WHERE v.codAreaAtuacao = :codAreaAtuacao")})
public class Vagas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Vaga")
    private Integer codVaga;
    @Column(name = "Salario")
    private Integer salario;
    @Size(max = 50)
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "Cod_Empresa")
    private Integer codEmpresa;
    @Column(name = "Cod_Area_Atuacao")
    private Integer codAreaAtuacao;

    public Vagas() {
    }

    public Vagas(Integer codVaga) {
        this.codVaga = codVaga;
    }

    public Integer getCodVaga() {
        return codVaga;
    }

    public void setCodVaga(Integer codVaga) {
        this.codVaga = codVaga;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
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

    public Integer getCodAreaAtuacao() {
        return codAreaAtuacao;
    }

    public void setCodAreaAtuacao(Integer codAreaAtuacao) {
        this.codAreaAtuacao = codAreaAtuacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVaga != null ? codVaga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vagas)) {
            return false;
        }
        Vagas other = (Vagas) object;
        if ((this.codVaga == null && other.codVaga != null) || (this.codVaga != null && !this.codVaga.equals(other.codVaga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.Vagas[ codVaga=" + codVaga + " ]";
    }
    
}
