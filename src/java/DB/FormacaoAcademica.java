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
@Table(name = "Formacao_Academica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormacaoAcademica.findAll", query = "SELECT f FROM FormacaoAcademica f"),
    @NamedQuery(name = "FormacaoAcademica.findByCodFa", query = "SELECT f FROM FormacaoAcademica f WHERE f.codFa = :codFa"),
    @NamedQuery(name = "FormacaoAcademica.findByCodUsr", query = "SELECT f FROM FormacaoAcademica f WHERE f.codUsr = :codUsr"),
    @NamedQuery(name = "FormacaoAcademica.findByCodUniversidade", query = "SELECT f FROM FormacaoAcademica f WHERE f.codUniversidade = :codUniversidade"),
    @NamedQuery(name = "FormacaoAcademica.findBySituacao", query = "SELECT f FROM FormacaoAcademica f WHERE f.situacao = :situacao"),
    @NamedQuery(name = "FormacaoAcademica.findBySemestreAtual", query = "SELECT f FROM FormacaoAcademica f WHERE f.semestreAtual = :semestreAtual"),
    @NamedQuery(name = "FormacaoAcademica.findBySemestreFormacao", query = "SELECT f FROM FormacaoAcademica f WHERE f.semestreFormacao = :semestreFormacao"),
    @NamedQuery(name = "FormacaoAcademica.findByAnoFormacao", query = "SELECT f FROM FormacaoAcademica f WHERE f.anoFormacao = :anoFormacao"),
    @NamedQuery(name = "FormacaoAcademica.findByCodCurso", query = "SELECT f FROM FormacaoAcademica f WHERE f.codCurso = :codCurso")})
public class FormacaoAcademica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Fa")
    private Integer codFa;
    @Column(name = "Cod_Usr")
    private Integer codUsr;
    @Column(name = "Cod_Universidade")
    private Integer codUniversidade;
    @Size(max = 20)
    @Column(name = "Situacao")
    private String situacao;
    @Column(name = "Semestre_Atual")
    private Integer semestreAtual;
    @Column(name = "Semestre_Formacao")
    private Integer semestreFormacao;
    @Column(name = "Ano_Formacao")
    private Integer anoFormacao;
    @Column(name = "Cod_Curso")
    private Integer codCurso;

    public FormacaoAcademica() {
    }

    public FormacaoAcademica(Integer codFa) {
        this.codFa = codFa;
    }

    public Integer getCodFa() {
        return codFa;
    }

    public void setCodFa(Integer codFa) {
        this.codFa = codFa;
    }

    public Integer getCodUsr() {
        return codUsr;
    }

    public void setCodUsr(Integer codUsr) {
        this.codUsr = codUsr;
    }

    public Integer getCodUniversidade() {
        return codUniversidade;
    }

    public void setCodUniversidade(Integer codUniversidade) {
        this.codUniversidade = codUniversidade;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getSemestreAtual() {
        return semestreAtual;
    }

    public void setSemestreAtual(Integer semestreAtual) {
        this.semestreAtual = semestreAtual;
    }

    public Integer getSemestreFormacao() {
        return semestreFormacao;
    }

    public void setSemestreFormacao(Integer semestreFormacao) {
        this.semestreFormacao = semestreFormacao;
    }

    public Integer getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(Integer anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFa != null ? codFa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormacaoAcademica)) {
            return false;
        }
        FormacaoAcademica other = (FormacaoAcademica) object;
        if ((this.codFa == null && other.codFa != null) || (this.codFa != null && !this.codFa.equals(other.codFa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.FormacaoAcademica[ codFa=" + codFa + " ]";
    }
    
}
