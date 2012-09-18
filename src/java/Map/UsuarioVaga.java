package Map;
// Generated Sep 16, 2012 5:53:47 PM by Hibernate Tools 3.2.1.GA



/**
 * UsuarioVaga generated by hbm2java
 */
public class UsuarioVaga  implements java.io.Serializable {


     private int codUv;
     private Integer codUsr;
     private Integer codVaga;
     private int fk1CodUsr;
     private int fk2CodVaga;
     private int fk2Fk1CodAreaAtuacao;

    public UsuarioVaga() {
    }

	
    public UsuarioVaga(int codUv, int fk1CodUsr, int fk2CodVaga, int fk2Fk1CodAreaAtuacao) {
        this.codUv = codUv;
        this.fk1CodUsr = fk1CodUsr;
        this.fk2CodVaga = fk2CodVaga;
        this.fk2Fk1CodAreaAtuacao = fk2Fk1CodAreaAtuacao;
    }
    public UsuarioVaga(int codUv, Integer codUsr, Integer codVaga, int fk1CodUsr, int fk2CodVaga, int fk2Fk1CodAreaAtuacao) {
       this.codUv = codUv;
       this.codUsr = codUsr;
       this.codVaga = codVaga;
       this.fk1CodUsr = fk1CodUsr;
       this.fk2CodVaga = fk2CodVaga;
       this.fk2Fk1CodAreaAtuacao = fk2Fk1CodAreaAtuacao;
    }
   
    public int getCodUv() {
        return this.codUv;
    }
    
    public void setCodUv(int codUv) {
        this.codUv = codUv;
    }
    public Integer getCodUsr() {
        return this.codUsr;
    }
    
    public void setCodUsr(Integer codUsr) {
        this.codUsr = codUsr;
    }
    public Integer getCodVaga() {
        return this.codVaga;
    }
    
    public void setCodVaga(Integer codVaga) {
        this.codVaga = codVaga;
    }
    public int getFk1CodUsr() {
        return this.fk1CodUsr;
    }
    
    public void setFk1CodUsr(int fk1CodUsr) {
        this.fk1CodUsr = fk1CodUsr;
    }
    public int getFk2CodVaga() {
        return this.fk2CodVaga;
    }
    
    public void setFk2CodVaga(int fk2CodVaga) {
        this.fk2CodVaga = fk2CodVaga;
    }
    public int getFk2Fk1CodAreaAtuacao() {
        return this.fk2Fk1CodAreaAtuacao;
    }
    
    public void setFk2Fk1CodAreaAtuacao(int fk2Fk1CodAreaAtuacao) {
        this.fk2Fk1CodAreaAtuacao = fk2Fk1CodAreaAtuacao;
    }




}


