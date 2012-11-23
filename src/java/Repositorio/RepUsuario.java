/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import DB.Usuario;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author gladstonvidali
 */
public class RepUsuario {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    
    private EntityManager em;
    
    public RepUsuario(){
        em = createEntityManager();
    }
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(Usuario usuario){
        //em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }
    
    public List<Usuario> Buscar(String cpf){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM Usuario e");
        List<Usuario> u = query.getResultList();
        return u;
    }
    
    public List<Usuario> BuscarTodos(){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM Usuario e");
        List<Usuario> usuarios = query.getResultList();
        return usuarios;
    }
    public boolean remover(String cpf){
        boolean status = false;
        try{
          //  em.getEntityManagerFactory();
            em.getTransaction().begin();
            Usuario a1 = Buscar(cpf).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(Usuario usuario){
        boolean status = false;
        try{
          //  em.getEntityManagerFactory();
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(Usuario a){
        //  em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(a);
          em.getTransaction().commit();
      }
    
}
