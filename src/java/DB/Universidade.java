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
@Table(name = "Universidade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Universidade.findAll", query = "SELECT u FROM Universidade u"),
    @NamedQuery(name = "Universidade.findByCodUniversidade", query = "SELECT u FROM Universidade u WHERE u.codUniversidade = :codUniversidade"),
    @NamedQuery(name = "Universidade.findByNome", query = "SELECT u FROM Universidade u WHERE u.nome = :nome")})
public class Universidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Universidade")
    private Integer codUniversidade;
    @Size(max = 100)
    @Column(name = "Nome")
    private String nome;

    public Universidade() {
    }

    public Universidade(Integer codUniversidade) {
        this.codUniversidade = codUniversidade;
    }

    public Integer getCodUniversidade() {
        return codUniversidade;
    }

    public void setCodUniversidade(Integer codUniversidade) {
        this.codUniversidade = codUniversidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUniversidade != null ? codUniversidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Universidade)) {
            return false;
        }
        Universidade other = (Universidade) object;
        if ((this.codUniversidade == null && other.codUniversidade != null) || (this.codUniversidade != null && !this.codUniversidade.equals(other.codUniversidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.Universidade[ codUniversidade=" + codUniversidade + " ]";
    }
    
}
