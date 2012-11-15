package JPA2;
// Generated Oct 27, 2012 7:04:32 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ExpProfSistema generated by hbm2java
 */
@Entity
@Table(name="Exp_Prof_Sistema"
    ,catalog="mack"
)
public class ExpProfSistema  implements java.io.Serializable {

    
     @Id
     @GeneratedValue (strategy= GenerationType.AUTO)
     @Column(name="Cod_Exp_Prof", unique=true, nullable=false)
     private Integer codExpProf;
    @Column(name="Descricao", length=20)
     private String descricao;
    @Column(name="Cod_Empresa")
     private Integer codEmpresa;

    public ExpProfSistema() {
    }

    public ExpProfSistema(String descricao, Integer codEmpresa) {
       this.descricao = descricao;
       this.codEmpresa = codEmpresa;
    }
    
        public Integer getCodExpProf() {
        return this.codExpProf;
    }
    
    public void setCodExpProf(Integer codExpProf) {
        this.codExpProf = codExpProf;
    }
    
        public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
        public Integer getCodEmpresa() {
        return this.codEmpresa;
    }
    
    public void setCodEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }




}


