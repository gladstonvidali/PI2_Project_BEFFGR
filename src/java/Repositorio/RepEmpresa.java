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
public class RepEmpresa {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    private EntityManager em = null;
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(Empresa usuario){
        em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }
    
    public Usuario Buscar(String cnpj){
        em.getEntityManagerFactory();
        return em.find(Usuario.class, cnpj);
    }
    
    public List<Usuario> BuscarTodos(){
        em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT * FROM Empresa");
        List<Usuario> usuarios = query.getResultList();
        return usuarios;
    }
    public boolean remover(String cnpj){
        boolean status = false;
        try{
            em.getEntityManagerFactory();
            em.getTransaction().begin();
            Usuario a1 = Buscar(cnpj);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(Empresa usuario){
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
      
      public void Alterar(Empresa a){
          em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(a);
          em.getTransaction().commit();
      }
    
}
