/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import javax.persistence.*;
import JPA2.*;
import java.util.List;

/**
 *
 * @author gladstonvidali
 */
public class RepUsuario {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    private EntityManager em = null;
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(Usuario usuario){
        em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }
    
    public Usuario Buscar(String cpf){
        em.getEntityManagerFactory();
        return em.find(Usuario.class, cpf);
    }
    
    public List<Usuario> BuscarTodos(){
        em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT * FROM Usuario");
        List<Usuario> usuarios = query.getResultList();
        return usuarios;
    }
    public boolean remover(String cpf){
        boolean status = false;
        try{
            em.getEntityManagerFactory();
            em.getTransaction().begin();
            Usuario a1 = Buscar(cpf);
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
            em.getEntityManagerFactory();
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
          em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(a);
          em.getTransaction().commit();
      }
    
}
