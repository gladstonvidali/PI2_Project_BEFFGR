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
public class RepCurso {
      public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    
    private EntityManager em;
    
    public RepCurso(){
        em = createEntityManager();
    }
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(Curso curso){
        //em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(curso);
        em.getTransaction().commit();
    }
    
    public List<Curso> Buscar(int cod_Curso){
        Query query = em.createQuery("SELECT e FROM Curso e WHERE e.codCurso LIKE :cod_Curso")
                .setParameter("cod_Curso", cod_Curso);
        List<Curso> v = query.getResultList();
        return v;
    }
    
    public List<Curso> BuscarTodos(){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM Curso e");
        List<Curso> vagas = query.getResultList();
        return vagas;
    }
    public boolean remover(int cod_Curso){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            Curso a1 = Buscar(cod_Curso).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(Curso curso){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            em.remove(curso);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(Curso curso){
          //em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(curso);
          em.getTransaction().commit();
      }
    
}
