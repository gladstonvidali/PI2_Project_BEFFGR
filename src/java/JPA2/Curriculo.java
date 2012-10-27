package JPA2;
// Generated Oct 27, 2012 12:41:22 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Curriculo generated by hbm2java
 */
@Entity
@Table(name="Curriculo"
    ,catalog="mack"
)
public class Curriculo  implements java.io.Serializable {


     private int codCv;
     private Integer codExpProf;
     private Integer cerficado;
     private int codAreaAtuacao;

    public Curriculo() {
    }

	
    public Curriculo(int codCv, int codAreaAtuacao) {
        this.codCv = codCv;
        this.codAreaAtuacao = codAreaAtuacao;
    }
    public Curriculo(int codCv, Integer codExpProf, Integer cerficado, int codAreaAtuacao) {
       this.codCv = codCv;
       this.codExpProf = codExpProf;
       this.cerficado = cerficado;
       this.codAreaAtuacao = codAreaAtuacao;
    }
   
     @Id 
    
    @Column(name="Cod_Cv", unique=true, nullable=false)
    public int getCodCv() {
        return this.codCv;
    }
    
    public void setCodCv(int codCv) {
        this.codCv = codCv;
    }
    
    @Column(name="Cod_Exp_Prof")
    public Integer getCodExpProf() {
        return this.codExpProf;
    }
    
    public void setCodExpProf(Integer codExpProf) {
        this.codExpProf = codExpProf;
    }
    
    @Column(name="Cerficado")
    public Integer getCerficado() {
        return this.cerficado;
    }
    
    public void setCerficado(Integer cerficado) {
        this.cerficado = cerficado;
    }
    
    @Column(name="Cod_Area_Atuacao", nullable=false)
    public int getCodAreaAtuacao() {
        return this.codAreaAtuacao;
    }
    
    public void setCodAreaAtuacao(int codAreaAtuacao) {
        this.codAreaAtuacao = codAreaAtuacao;
    }




}


