package JPA2;
// Generated Oct 27, 2012 7:04:32 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UsuarioVaga generated by hbm2java
 */
@Entity
@Table(name="Usuario_Vaga"
    ,catalog="mack"
)
public class UsuarioVaga  implements java.io.Serializable {


     private Integer codUv;
     private Integer codUsr;
     private Integer codVaga;

    public UsuarioVaga() {
    }

    public UsuarioVaga(Integer codUsr, Integer codVaga) {
       this.codUsr = codUsr;
       this.codVaga = codVaga;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="Cod_Uv", unique=true, nullable=false)
    public Integer getCodUv() {
        return this.codUv;
    }
    
    public void setCodUv(Integer codUv) {
        this.codUv = codUv;
    }
    
    @Column(name="Cod_Usr")
    public Integer getCodUsr() {
        return this.codUsr;
    }
    
    public void setCodUsr(Integer codUsr) {
        this.codUsr = codUsr;
    }
    
    @Column(name="Cod_Vaga")
    public Integer getCodVaga() {
        return this.codVaga;
    }
    
    public void setCodVaga(Integer codVaga) {
        this.codVaga = codVaga;
    }




}


