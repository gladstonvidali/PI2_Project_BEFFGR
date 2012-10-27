/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gladstonvidali
 */
import DAO.*;
import JPA2.*;
import java.util.List;
import javax.persistence.*;
       
public class Teste {
    public static void main(String[] args){
        
        
        Usuario u = new Usuario();
        u.setCpf("25");
        u.setNome("Gladston");
        u.setSenha("Gladston");
        u.setCodCv(0);
        u.setCodFa(0);
        
        
        List<Usuario> listaUsuarios = DAO.UsuarioDAO.buscarTudo();
        for (JPA2.Usuario us : listaUsuarios) {
            System.out.println(" - " + us.getNome());
        }
        
        /*
        List<Usuario> listaUsuarios = UsuarioDAO.buscarTudo();
        for (Usuario u1 : listaUsuarios) {
            System.out.println(" - " + u1.getNome() );
        }
        */
    }
}
