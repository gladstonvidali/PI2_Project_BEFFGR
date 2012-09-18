/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Gladston
 */
public class Test {
    
    public List Listar(){
      
      List stateList;
        
      SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
      Session s = sessionFactory.openSession();
      s.beginTransaction();
      stateList = s.createQuery("SELECT cod_area_atuacao FROM area_atuacao_sistema").list();
      s.getTransaction().commit();
      s.close();
      
      return stateList;
    }
}
    

