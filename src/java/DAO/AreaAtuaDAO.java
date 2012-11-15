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


public class AreaAtuaDAO {
    
    public static void inserir(AreaAtuacaoSistema areaatusis) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(areaatusis);
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
    
    public static void editar(AreaAtuacaoSistema areaatusis) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(areaatusis);
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
    
    public static void remover(int Cod_Area_Atuacao){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(buscarAreaAtuacao(Cod_Area_Atuacao));
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
  
    public static AreaAtuacaoSistema buscarAreaAtuacao(int codAreaAtuacao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        AreaAtuacaoSistema u = (AreaAtuacaoSistema) session.createCriteria(AreaAtuacaoSistema.class)
            .add( Restrictions.like("codAreaAtuacao", codAreaAtuacao) )
            .setMaxResults(1).list().get(0);
        return u;
    }
    
}
