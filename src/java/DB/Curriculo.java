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
@Table(name = "Curriculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curriculo.findAll", query = "SELECT c FROM Curriculo c"),
    @NamedQuery(name = "Curriculo.findByCodCv", query = "SELECT c FROM Curriculo c WHERE c.codCv = :codCv"),
    @NamedQuery(name = "Curriculo.findByCodExpProf", query = "SELECT c FROM Curriculo c WHERE c.codExpProf = :codExpProf"),
    @NamedQuery(name = "Curriculo.findByCerficado", query = "SELECT c FROM Curriculo c WHERE c.cerficado = :cerficado"),
    @NamedQuery(name = "Curriculo.findByCodAreaAtuacao", query = "SELECT c FROM Curriculo c WHERE c.codAreaAtuacao = :codAreaAtuacao"),
    @NamedQuery(name = "Curriculo.findByCodUsr", query = "SELECT c FROM Curriculo c WHERE c.codUsr = :codUsr")})
public class Curriculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Cv")
    private Integer codCv;
    @Column(name = "Cod_Exp_Prof")
    private Integer codExpProf;
    @Size(max = 20)
    @Column(name = "Cerficado")
    private String cerficado;
    @Column(name = "Cod_Area_Atuacao")
    private Integer codAreaAtuacao;
    @Column(name = "Cod_Usr")
    private Integer codUsr;

    public Curriculo() {
    }

    public Curriculo(Integer codCv) {
        this.codCv = codCv;
    }

    public Integer getCodCv() {
        return codCv;
    }

    public void setCodCv(Integer codCv) {
        this.codCv = codCv;
    }

    public Integer getCodExpProf() {
        return codExpProf;
    }

    public void setCodExpProf(Integer codExpProf) {
        this.codExpProf = codExpProf;
    }

    public String getCerficado() {
        return cerficado;
    }

    public void setCerficado(String cerficado) {
        this.cerficado = cerficado;
    }

    public Integer getCodAreaAtuacao() {
        return codAreaAtuacao;
    }

    public void setCodAreaAtuacao(Integer codAreaAtuacao) {
        this.codAreaAtuacao = codAreaAtuacao;
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
        hash += (codCv != null ? codCv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curriculo)) {
            return false;
        }
        Curriculo other = (Curriculo) object;
        if ((this.codCv == null && other.codCv != null) || (this.codCv != null && !this.codCv.equals(other.codCv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.Curriculo[ codCv=" + codCv + " ]";
    }
    
}
