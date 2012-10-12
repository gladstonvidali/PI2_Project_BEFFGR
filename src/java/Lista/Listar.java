/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
import javax.naming.*;
/**
 *
 * @author Gladston
 */
public class Listar {
    private List stateList;
    
    public List AreaAtuacao(){
        stateList = new ArrayList();
        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session s = sessionFactory.openSession();
        
            s.beginTransaction();
            String hql = "SELECT cod_area_atuacao FROM Area_Atuacao_Sistema";
            Query query = s.createSQLQuery(hql);
            List<String> results = query.list();
            return results;
        }catch (Exception e)  
        {  
          System.out.println(e);  
        }  
        return null;
    }
    
    public List Universidade(){
        stateList = new ArrayList();
        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session s = sessionFactory.openSession();
        
            s.beginTransaction();
            String hql = "SELECT Nome FROM universidade";
            Query query = s.createSQLQuery(hql);
            List<String> results = query.list();
            return results;
        }catch (Exception e)  
        {  
          System.out.println(e);  
        }  
        return null;
    }
    
    
    public List Nome(String cpf){
        
        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session s = sessionFactory.openSession();
        
            s.beginTransaction();
            String hql = "SELECT nome FROM usuario WHERE cpf='"+cpf+"'";
            Query query = s.createSQLQuery(hql);
            List<String> results = query.list();
            return results;
        }catch (Exception e)  
        {  
          System.out.println(e);  
        }  
        return null;
    }
    
    public List ExpProf(String cpf){
        
        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session s = sessionFactory.openSession();
        
            s.beginTransaction();
            String hql = "SELECT exp_prof FROM exp_prof_sistema";
            Query query = s.createSQLQuery(hql);
            List<String> results = query.list();
            return results;
        }catch (Exception e)  
        {  
          System.out.println(e);  
        }  
        return null;
    }
    
    
    public List cpfAA(String cpf){
        
        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session s = sessionFactory.openSession();
        
            s.beginTransaction();
            String hql = "SELECT codcv FROM usuario WHERE cpf='"+cpf+"'";
            Query query = s.createSQLQuery(hql);
            List<String> results = query.list();
            return results;
        }catch (Exception e)  
        {  
          System.out.println(e);  
        }  
        return null;
    }
    
    public List Empresas(){
        
        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session s = sessionFactory.openSession();
        
            s.beginTransaction();
            String hql = "SELECT Nome FROM Empresas";
            Query query = s.createSQLQuery(hql);
            List<String> results = query.list();
            return results;
        }catch (Exception e)  
        {  
          System.out.println(e);  
        }  
        return null;
    }
    
    public List Cursos(){
        
        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session s = sessionFactory.openSession();
        
            s.beginTransaction();
            String hql = "SELECT Descricao FROM Curso";
            Query query = s.createSQLQuery(hql);
            List<String> results = query.list();
            return results;
        }catch (Exception e)  
        {  
          System.out.println(e);  
        }  
        return null;
    }
    
    public List cpfFA(String cpf){
        
        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session s = sessionFactory.openSession();
        
            s.beginTransaction();
            String hql = "SELECT codfa FROM usuario WHERE cpf='"+cpf+"'";
            Query query = s.createSQLQuery(hql);
            List<String> results = query.list();
            return results;
        }catch (Exception e)  
        {  
          System.out.println(e);  
        }  
        return null;
    }
    
    public List Vagas(String aa){
        
        try{
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session s = sessionFactory.openSession();
        
            s.beginTransaction();
            String hql = "SELECT descricao FROM vagas WHERE cod_area_atuacao='"+aa+"'";
            Query query = s.createSQLQuery(hql);
            List<String> results = query.list();
            return results;
        }catch (Exception e)  
        {  
          System.out.println(e);  
        }  
        return null;
    }
    
}
