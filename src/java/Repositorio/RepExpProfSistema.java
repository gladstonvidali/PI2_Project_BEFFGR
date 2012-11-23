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
public class RepExpProfSistema {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    
    private EntityManager em;
    
    public RepExpProfSistema(){
        em = createEntityManager();
    }
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(ExpProfSistema expprofsis){
        //em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(expprofsis);
        em.getTransaction().commit();
    }
    public List<ExpProfSistema> BuscarCodUsr(int cod_Usr){
        Query query = em.createQuery("SELECT e FROM ExpProfSistema e WHERE e.codUsr LIKE :cod_Usr")
                .setParameter("cod_Usr", cod_Usr);
        List<ExpProfSistema> v = query.getResultList();
        return v;
    }
    
    public List<ExpProfSistema> Buscar(int cod_ExpProf){
        Query query = em.createQuery("SELECT e FROM ExpProfSistema e WHERE e.codExpProfSistema LIKE :cod_ExpProf")
                .setParameter("cod_ExpProf", cod_ExpProf);
        List<ExpProfSistema> v = query.getResultList();
        return v;
    }
    
    public List<ExpProfSistema> BuscarTodos(){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM ExpProfSistema e");
        List<ExpProfSistema> vagas = query.getResultList();
        return vagas;
    }
    public boolean remover(int cod_ExpProf){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            ExpProfSistema a1 = Buscar(cod_ExpProf).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(ExpProfSistema expprofsis){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            em.remove(expprofsis);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(ExpProfSistema expprofsis){
          //em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(expprofsis);
          em.getTransaction().commit();
      }
    
}



