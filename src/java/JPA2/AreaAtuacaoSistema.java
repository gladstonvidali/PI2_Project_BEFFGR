package JPA2;
// Generated Oct 27, 2012 7:04:32 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AreaAtuacaoSistema generated by hbm2java
 */
@Entity
@Table(name="Area_Atuacao_Sistema"
    ,catalog="mack"
)
public class AreaAtuacaoSistema  implements java.io.Serializable {


     private Integer codAreaAtuacao;
     private String descricao;

    public AreaAtuacaoSistema() {
    }

    public AreaAtuacaoSistema(String descricao) {
       this.descricao = descricao;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="Cod_Area_Atuacao", unique=true, nullable=false)
    public Integer getCodAreaAtuacao() {
        return this.codAreaAtuacao;
    }
    
    public void setCodAreaAtuacao(Integer codAreaAtuacao) {
        this.codAreaAtuacao = codAreaAtuacao;
    }
    
    @Column(name="Descricao", length=20)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}


