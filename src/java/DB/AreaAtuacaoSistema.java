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
@Table(name = "Area_Atuacao_Sistema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AreaAtuacaoSistema.findAll", query = "SELECT a FROM AreaAtuacaoSistema a"),
    @NamedQuery(name = "AreaAtuacaoSistema.findByCodAreaAtuacao", query = "SELECT a FROM AreaAtuacaoSistema a WHERE a.codAreaAtuacao = :codAreaAtuacao"),
    @NamedQuery(name = "AreaAtuacaoSistema.findByDescricao", query = "SELECT a FROM AreaAtuacaoSistema a WHERE a.descricao = :descricao")})
public class AreaAtuacaoSistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Area_Atuacao")
    private Integer codAreaAtuacao;
    @Size(max = 20)
    @Column(name = "Descricao")
    private String descricao;

    public AreaAtuacaoSistema() {
    }

    public AreaAtuacaoSistema(Integer codAreaAtuacao) {
        this.codAreaAtuacao = codAreaAtuacao;
    }

    public Integer getCodAreaAtuacao() {
        return codAreaAtuacao;
    }

    public void setCodAreaAtuacao(Integer codAreaAtuacao) {
        this.codAreaAtuacao = codAreaAtuacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAreaAtuacao != null ? codAreaAtuacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AreaAtuacaoSistema)) {
            return false;
        }
        AreaAtuacaoSistema other = (AreaAtuacaoSistema) object;
        if ((this.codAreaAtuacao == null && other.codAreaAtuacao != null) || (this.codAreaAtuacao != null && !this.codAreaAtuacao.equals(other.codAreaAtuacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.AreaAtuacaoSistema[ codAreaAtuacao=" + codAreaAtuacao + " ]";
    }
    
}
