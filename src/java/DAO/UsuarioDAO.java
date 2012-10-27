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
    
    public static void inserir(Object usuario) {
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
    
    public static void editar(Object usuario) {
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
    
    public static List<Usuario> listarUsuarios() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        return criteria.list();
    }
    
    public static Usuario buscarUsuario(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("id", id));
        criteria.setMaxResults(1);
        return (Usuario) criteria.uniqueResult();
    }
    
     public static Usuario buscarUsuario(String cpf) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("cpf", cpf));
        criteria.setMaxResults(1);
        return (Usuario) criteria.uniqueResult();
    }
     
     
    public static Usuario validarLogin(String cpf, String senha){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class); 
        criteria.add( Restrictions.like("cpf", cpf) );
        criteria.add( Restrictions.like("senha", senha) );
        criteria.setMaxResults(1);
        return (Usuario) criteria.uniqueResult();
    }
    
   
}
