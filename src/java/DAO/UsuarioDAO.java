/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import JPA2.*;
import Hibernate.*;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class UsuarioDAO {
    
    public static void inserir(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(usuario);
            tx.commit();
            tx = null;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public static void editar(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(usuario);
            tx.commit();
            tx = null;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
  
    public static void remover(int Cod_Usr) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(buscarUsuario(Cod_Usr));
            tx.commit();
            tx = null;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public static Usuario buscarUsuario(int Cod_Usr) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Usuario u = (Usuario) session.createCriteria(Usuario.class)
            .add(Restrictions.eq("codUsr", Cod_Usr))
            .setMaxResults(1).list().get(0);
        return u;
    }
    
     public static Usuario buscarUsuario(String cpf) {
         Session session = HibernateUtil.getSessionFactory().openSession();
         Usuario u = (Usuario) session.createCriteria(Usuario.class)
                 .add( Restrictions.eq("cpf",cpf))
                 .setMaxResults(1).list().get(0);
         
         return u;
    }
     
     
    public static Usuario validarLogin(String cpf, String senha){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Usuario u = (Usuario) session.createCriteria(Usuario.class)
            .add( Restrictions.like("cpf", cpf) )
            .add( Restrictions.like("senha", senha) )
            .setMaxResults(1).list().get(0);
        return u;
    }
    
   
}
