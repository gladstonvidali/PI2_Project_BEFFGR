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
import javax.persistence.Entity;
import Repositorio.*;
       
public class Teste {
    public static void main(String[] args){
        
      
        Usuario u1 = DAO.UsuarioDAO.buscarUsuario(5); 
        System.out.print(u1.getNome());
        
       
        List<Usuario> listaUsuarios = DAO.ListarDAO.listarUsuarios();
        
        for (JPA2.Usuario us : listaUsuarios) {
            System.out.println(" - " + us.getNome());
        }
        
        /*
        RepUsuario rUser = new RepUsuario();
        
        Usuario U1 = new Usuario();
        U1.setCpf("012345");
        U1.setNome("TPA");
        U1.setSenha("TPA");
        rUser.Adicionar(U1);
        
        List<Usuario> uLista = rUser.BuscarTodos();
        for (Usuario u2 : uLista){
            System.out.println(u2);
        }
        /*
        * 
        * 
        */
        /*
        List<Usuario> listaUsuarios = UsuarioDAO.buscarTudo();
        for (Usuario u1 : listaUsuarios) {
            System.out.println(" - " + u1.getNome() );
        }
        */
    }
}
