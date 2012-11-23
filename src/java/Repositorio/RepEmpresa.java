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
public class RepEmpresa {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("mack");
    private EntityManager em = null;
    
    private EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public RepEmpresa(){
        em = createEntityManager();
    }
    
    public void Adicionar(Empresa usuario){
        //em.getEntityManagerFactory();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }
    
    public List<Empresa> BuscarCNPJ(String cnpj){
       // em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM Empresa e WHERE e.cnpj LIKE :cnpj")
                .setParameter("cnpj", cnpj);
        List<Empresa> usuarios = query.getResultList();
        return usuarios;
    }
    
     public List<Empresa> BuscarCod(int codEmpresa){
       // em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM Empresa e WHERE e.codEmpresa LIKE :codEmpresa")
                .setParameter("codEmpresa", codEmpresa);
        List<Empresa> usuarios = query.getResultList();
        return usuarios;
    }
     
    public List<Empresa> BuscarTodos(){
      //  em.getEntityManagerFactory();
        Query query = em.createQuery("SELECT e FROM Empresa e");
        List<Empresa> usuarios = query.getResultList();
        return usuarios;
    }
    public boolean remover(String cnpj){
        boolean status = false;
        try{
        //    em.getEntityManagerFactory();
            em.getTransaction().begin();
            Empresa a1 = BuscarCNPJ(cnpj).get(0);
            em.remove(a1);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    
      public boolean remover(Empresa empresa){
        boolean status = false;
        try{
        //    em.getEntityManagerFactory();
            em.getTransaction().begin();
            em.remove(empresa);
            em.getTransaction().commit();
            return status = true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
      }
      
      public void Alterar(Empresa empresa){
        //  em.getEntityManagerFactory();
          em.getTransaction().begin();
          em.refresh(empresa);
          em.getTransaction().commit();
      }
    
}
