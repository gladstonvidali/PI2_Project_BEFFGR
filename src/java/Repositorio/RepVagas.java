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
public class RepVagas {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    
    private EntityManager em;
    
    public RepVagas(){
        em = createEntityManager();
    }
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(Vagas vaga){
        //em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(vaga);
        em.getTransaction().commit();
    }
    
    public List<Vagas> Buscar(int cod_Vaga){
        Query query = em.createQuery("SELECT e FROM Vagas e WHERE e.codVaga LIKE :cod_Vaga")
                .setParameter("cod_Vaga", cod_Vaga);
        List<Vagas> v = query.getResultList();
        return v;
    }
    
     public List<Vagas> BuscarCadastradas(int cod_Usr){
       
        Query query = em.createQuery("SELECT v FROM Vagas v, UsuarioVaga uv WHERE uv.codUsr LIKE :cod_Usr AND v.codVaga = uv.codVaga")
                .setParameter("cod_Usr", cod_Usr);
       // Query query1 = em.createNamedQuery("SELECT * FROM Vagas v JOIN 
        //              Usuario_Vaga uv ON v.Cod_Vaga = uv.Cod_Vaga;", Vagas.class);        
        List<Vagas> v = query.getResultList();
        return v;
    }
    
    public List<Vagas> BuscarTodos(){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM Vagas e");
        List<Vagas> vagas = query.getResultList();
        return vagas;
    }
    public boolean remover(int cod_Vaga){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            Vagas a1 = Buscar(cod_Vaga).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(Vagas vaga){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            Vagas v = em.find(Vagas.class, vaga.getCodVaga());
            em.remove(v);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(Vagas a){
          //em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(a);
          em.getTransaction().commit();
      }
    
}

