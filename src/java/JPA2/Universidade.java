package JPA2;
// Generated Nov 22, 2012 5:49:27 PM by Hibernate Tools 3.2.1.GA



/**
 * Universidade generated by hbm2java
 */
public class Universidade  implements java.io.Serializable {


     private Integer codUniversidade;
     private String nome;

    public Universidade() {
    }

    public Universidade(String nome) {
       this.nome = nome;
    }
   
    public Integer getCodUniversidade() {
        return this.codUniversidade;
    }
    
    public void setCodUniversidade(Integer codUniversidade) {
        this.codUniversidade = codUniversidade;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }




}


