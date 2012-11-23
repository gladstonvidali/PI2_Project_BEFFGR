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
public class RepFormacaoAcademica {
     public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    
    private EntityManager em;
    
    public RepFormacaoAcademica(){
        em = createEntityManager();
    }
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(FormacaoAcademica formacaoacademica){
        //em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(formacaoacademica);
        em.getTransaction().commit();
    }
    
    public List<FormacaoAcademica> Buscar(int cod_FA){
        Query query = em.createQuery("SELECT e FROM FormacaoAcademica e WHERE e.codFormacaoAcademica LIKE :cod_FA")
                .setParameter("cod_FA", cod_FA);
        List<FormacaoAcademica> v = query.getResultList();
        return v;
    }
    
    public List<FormacaoAcademica> BuscarTodos(){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM FormacaoAcademica e");
        List<FormacaoAcademica> vagas = query.getResultList();
        return vagas;
    }
    
    public List<FormacaoAcademica> BuscarCodUsr(int cod_Usr){
        Query query = em.createQuery("SELECT e FROM FormacaoAcademica e WHERE e.codUsr LIKE :cod_Usr")
                .setParameter("cod_Usr", cod_Usr);
        List<FormacaoAcademica> v = query.getResultList();
        return v;
    }
    
    public boolean remover(int cod_FA){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            FormacaoAcademica a1 = Buscar(cod_FA).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(FormacaoAcademica formacaoacademica){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            em.remove(formacaoacademica);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(FormacaoAcademica formacaoacademica){
          //em.getEntityManagerFactory();
          em.getTransaction().begin();
          FormacaoAcademica  fa = em.find(FormacaoAcademica.class, formacaoacademica.getCodFa());
          em.persist(fa);
          em.getTransaction().commit();
      }
    
}



