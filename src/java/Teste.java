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
        u.setCpf("26");
        u.setNome("Bruno");
        u.setSenha("Bruno");
        u.setCodCv(0);
        u.setCodFa(0);
        
        DAO.UsuarioDAO.inserir(u);
        
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
