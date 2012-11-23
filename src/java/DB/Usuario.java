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
@Table(name = "Usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCodUsr", query = "SELECT u FROM Usuario u WHERE u.codUsr = :codUsr"),
    @NamedQuery(name = "Usuario.findByCpf", query = "SELECT u FROM Usuario u WHERE u.cpf = :cpf"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByCodCv", query = "SELECT u FROM Usuario u WHERE u.codCv = :codCv"),
    @NamedQuery(name = "Usuario.findByCodFa", query = "SELECT u FROM Usuario u WHERE u.codFa = :codFa")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Usr")
    private Integer codUsr;
    @Size(max = 11)
    @Column(name = "CPF")
    private String cpf;
    @Size(max = 30)
    @Column(name = "Nome")
    private String nome;
    @Size(max = 10)
    @Column(name = "Senha")
    private String senha;
    @Column(name = "Cod_Cv")
    private Integer codCv;
    @Column(name = "Cod_Fa")
    private Integer codFa;

    public Usuario() {
    }

    public Usuario(Integer codUsr) {
        this.codUsr = codUsr;
    }

    public Integer getCodUsr() {
        return codUsr;
    }

    public void setCodUsr(Integer codUsr) {
        this.codUsr = codUsr;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getCodCv() {
        return codCv;
    }

    public void setCodCv(Integer codCv) {
        this.codCv = codCv;
    }

    public Integer getCodFa() {
        return codFa;
    }

    public void setCodFa(Integer codFa) {
        this.codFa = codFa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsr != null ? codUsr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codUsr == null && other.codUsr != null) || (this.codUsr != null && !this.codUsr.equals(other.codUsr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.Usuario[ codUsr=" + codUsr + " ]";
    }
    
}
