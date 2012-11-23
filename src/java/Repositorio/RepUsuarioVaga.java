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
public class RepUsuarioVaga {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    
    private EntityManager em;
    
    public RepUsuarioVaga(){
        em = createEntityManager();
    }
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void Adicionar(UsuarioVaga vaga){
        //em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(vaga);
        em.getTransaction().commit();
    }
    
    public List<UsuarioVaga> Buscar(int cod_Uv){
        Query query = em.createQuery("SELECT e FROM UsuarioVaga e WHERE e.codVaga LIKE :cod_Uv")
                .setParameter("cod_Uv", cod_Uv);
        List<UsuarioVaga> v = query.getResultList();
        return v;
    }
    
    public List<UsuarioVaga> BuscarTodos(){
        //em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM UsuarioVaga e");
        List<UsuarioVaga> vagas = query.getResultList();
        return vagas;
    }
    public boolean remover(int cod_Vaga){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            UsuarioVaga a1 = Buscar(cod_Vaga).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(UsuarioVaga usuarioVaga){
        boolean status = false;
        try{
            //em.getEntityManagerFactory();
            em.getTransaction().begin();
            em.remove(usuarioVaga);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(UsuarioVaga usuarioVaga){
          //em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(usuarioVaga);
          em.getTransaction().commit();
      }
    
}

