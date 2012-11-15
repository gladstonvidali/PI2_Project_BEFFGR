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


public class UsuarioVagaDAO {
    
    public static void inserir(UsuarioVaga uvaga) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(uvaga);
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
    
    public static void editar(UsuarioVaga uvaga) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(uvaga);
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
    
    public static void remover(int Cod_Uv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(buscarUsuarioVaga(Cod_Uv));
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
    
    
    public static UsuarioVaga buscarUsuarioVaga(int Cod_Uv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        UsuarioVaga uv = (UsuarioVaga) session.createCriteria(UsuarioVaga.class)
            .add(Restrictions.eq("codUv", Cod_Uv))
            .setMaxResults(1).list().get(0);
        return uv;
    }
    
    public static UsuarioVaga buscarUsuarioVaga(int Cod_Uv, int Cod_Usr) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        UsuarioVaga uv = (UsuarioVaga) session.createCriteria(UsuarioVaga.class)
            .add(Restrictions.eq("codUv", Cod_Uv))
            .add(Restrictions.eq("codUsr", Cod_Usr))
            .setMaxResults(1).list().get(0);
        return uv;
    }
    
}
