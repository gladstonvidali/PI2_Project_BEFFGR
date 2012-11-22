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
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gladstonvidali
 */
public class ListarDAO {
    
    public static List<Usuario> listarUsuarios() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        return criteria.list();
    }
    
    public static List<AreaAtuacaoSistema> listarAreaAtuacaoSistema() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(AreaAtuacaoSistema.class);
        return criteria.list();
    }
    
    public static List<Curriculo> listarCurriculo() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Curriculo.class);
        return criteria.list();
    }
    
    public static List<Curso> listarCurso() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Curso.class);
        return criteria.list();
    }
    
    public static List<Empresa> listarEmpresa() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Empresa.class);
        Query q = session.createQuery("from Empresa");
        return q.list();
    }
    
    public static List<ExpProfSistema> listarExpProfSistema() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ExpProfSistema.class);
        return criteria.list();
    }
    
    public static List<FormacaoAcademica> listarFormacaoAcademica() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(FormacaoAcademica.class);
        return criteria.list();
    }
    
    public static List<Universidade> listarUniversidade() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Universidade.class);
        return criteria.list();
    }
    
    public static List<UsuarioVaga> listarUsuarioVaga() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(UsuarioVaga.class);
        return criteria.list();
    }
    
    public static List<Vagas> listarVagas() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Vagas.class);
        Query q = session.createQuery("from Vagas");
        return q.list();
    }
}
