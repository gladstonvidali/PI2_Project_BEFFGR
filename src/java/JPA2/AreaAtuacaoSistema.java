package JPA2;
// Generated Nov 22, 2012 5:49:27 PM by Hibernate Tools 3.2.1.GA



/**
 * AreaAtuacaoSistema generated by hbm2java
 */
public class AreaAtuacaoSistema  implements java.io.Serializable {


     private Integer codAreaAtuacao;
     private String descricao;

    public AreaAtuacaoSistema() {
    }

    public AreaAtuacaoSistema(String descricao) {
       this.descricao = descricao;
    }
   
    public Integer getCodAreaAtuacao() {
        return this.codAreaAtuacao;
    }
    
    public void setCodAreaAtuacao(Integer codAreaAtuacao) {
        this.codAreaAtuacao = codAreaAtuacao;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}


