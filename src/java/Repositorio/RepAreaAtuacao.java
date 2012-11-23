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
public class RepAreaAtuacao {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    
    private EntityManager em;
    
    public RepAreaAtuacao(){
        em = createEntityManager();
    }
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(AreaAtuacaoSistema area){
       // em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(area);
        em.getTransaction().commit();
    }
    
    public List<AreaAtuacaoSistema> Buscar(int codAreaAtuacao){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM AreaAtuacaoSistema e WHERE e.codAreaAtuacao LIKE :codAreaAtuacao")
                .setParameter("codAreaAtuacao", codAreaAtuacao);
        List<AreaAtuacaoSistema> u = query.getResultList();
        return u;
    }
    
    public List<AreaAtuacaoSistema> BuscarTodos(){
       // em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT * FROM AreaAtuacaoSistema");
        List<AreaAtuacaoSistema> usuarios = query.getResultList();
        return usuarios;
    }
    public boolean remover(int codAreaAtuacao){
        boolean status = false;
        try{
          //  em.getEntityManagerFactory();
            em.getTransaction().begin();
            AreaAtuacaoSistema a1 = Buscar(codAreaAtuacao).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(AreaAtuacaoSistema area){
        boolean status = false;
        try{
          //  em.getEntityManagerFactory();
            em.getTransaction().begin();
            em.remove(area);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(AreaAtuacaoSistema a){
       //   em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(a);
          em.getTransaction().commit();
      }
    
}

