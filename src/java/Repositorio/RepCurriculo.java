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
public class RepCurriculo {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    
    private EntityManager em;
    
    public RepCurriculo(){
        em = createEntityManager();
    }
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(Curriculo curriculo){
        //em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(curriculo);
        em.getTransaction().commit();
    }
    
    public List<Curriculo> BuscarCodUsr(int cod_Usr){
        Query query = em.createQuery("SELECT e FROM Curriculo e WHERE e.codUsr LIKE :cod_Usr")
                .setParameter("cod_Usr", cod_Usr);
        List<Curriculo> v = query.getResultList();
        return v;
    }
    
    public List<Curriculo> Buscar(int cod_Cv){
        Query query = em.createQuery("SELECT e FROM Curriculo e WHERE e.codCurriculo LIKE :cod_Cv")
                .setParameter("cod_Cv", cod_Cv);
        List<Curriculo> v = query.getResultList();
        return v;
    }
    
    public List<Curriculo> BuscarTodos(){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM Curriculo e");
        List<Curriculo> vagas = query.getResultList();
        return vagas;
    }
    public boolean remover(int cod_Cv){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            Curriculo a1 = Buscar(cod_Cv).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(Curriculo curriculo){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            em.remove(curriculo);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(Curriculo curriculo){
          //em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(curriculo);
          em.getTransaction().commit();
      }
    
}


