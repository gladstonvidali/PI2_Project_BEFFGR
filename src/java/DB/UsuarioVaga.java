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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gladstonvidali
 */
@Entity
@Table(name = "Usuario_Vaga")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioVaga.findAll", query = "SELECT u FROM UsuarioVaga u"),
    @NamedQuery(name = "UsuarioVaga.findByCodUv", query = "SELECT u FROM UsuarioVaga u WHERE u.codUv = :codUv"),
    @NamedQuery(name = "UsuarioVaga.findByCodUsr", query = "SELECT u FROM UsuarioVaga u WHERE u.codUsr = :codUsr"),
    @NamedQuery(name = "UsuarioVaga.findByCodVaga", query = "SELECT u FROM UsuarioVaga u WHERE u.codVaga = :codVaga")})
public class UsuarioVaga implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Uv")
    private Integer codUv;
    @Column(name = "Cod_Usr")
    private Integer codUsr;
    @Column(name = "Cod_Vaga")
    private Integer codVaga;

    public UsuarioVaga() {
    }

    public UsuarioVaga(Integer codUv) {
        this.codUv = codUv;
    }

    public Integer getCodUv() {
        return codUv;
    }

    public void setCodUv(Integer codUv) {
        this.codUv = codUv;
    }

    public Integer getCodUsr() {
        return codUsr;
    }

    public void setCodUsr(Integer codUsr) {
        this.codUsr = codUsr;
    }

    public Integer getCodVaga() {
        return codVaga;
    }

    public void setCodVaga(Integer codVaga) {
        this.codVaga = codVaga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUv != null ? codUv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioVaga)) {
            return false;
        }
        UsuarioVaga other = (UsuarioVaga) object;
        if ((this.codUv == null && other.codUv != null) || (this.codUv != null && !this.codUv.equals(other.codUv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.UsuarioVaga[ codUv=" + codUv + " ]";
    }
    
}
