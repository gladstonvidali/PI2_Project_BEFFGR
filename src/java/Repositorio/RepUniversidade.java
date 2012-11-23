/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import DB.*;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author gladstonvidali
 */
public class RepUniversidade {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    
    private EntityManager em;
    
    public RepUniversidade(){
        em = createEntityManager();
    }
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(Universidade universidade){
        //em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(universidade);
        em.getTransaction().commit();
    }
    
    public List<Universidade> Buscar(int cod_Uni){
        Query query = em.createQuery("SELECT e FROM Universidade e WHERE e.codUniversidade LIKE :cod_Uni")
                .setParameter("cod_Uni", cod_Uni);
        List<Universidade> v = query.getResultList();
        return v;
    }
    
    public List<Universidade> BuscarTodos(){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM Universidade e");
        List<Universidade> vagas = query.getResultList();
        return vagas;
    }
    public boolean remover(int cod_Uni){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            Universidade a1 = Buscar(cod_Uni).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(Universidade universidade){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            em.remove(universidade);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(Universidade universidade){
          //em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(universidade);
          em.getTransaction().commit();
      }
    
}


