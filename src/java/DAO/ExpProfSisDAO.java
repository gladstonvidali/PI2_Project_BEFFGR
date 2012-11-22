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


public class ExpProfSisDAO {
    
    public static void inserir(ExpProfSistema expprofsis) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(expprofsis);
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
    
    public static void editar(ExpProfSistema expprofsis) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(expprofsis);
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
    
    public static void remover(int Cod_Exp_Prof){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(buscarExpProfSis(Cod_Exp_Prof));
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
  
    public static ExpProfSistema buscarExpProfSis(int Cod_Exp_Prof) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ExpProfSistema e = (ExpProfSistema) session.createCriteria(ExpProfSistema.class)
                .add(Restrictions.eq("codcodExpProf", Cod_Exp_Prof))
                .setMaxResults(1).list().get(0);
        return e;
    }
    
    public static ExpProfSistema buscarExpProfSisCod_Usr(int Cod_Usr) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ExpProfSistema e = (ExpProfSistema) session.createCriteria(ExpProfSistema.class)
                .add(Restrictions.eq("Cod_Usr", Cod_Usr))
                .setMaxResults(1).list().get(0);
        return e;
    }
    
}
