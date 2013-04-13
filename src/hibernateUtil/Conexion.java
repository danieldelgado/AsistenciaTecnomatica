package hibernateUtil;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Alumno
 */
public class Conexion {
    private Session session;
    private SessionFactory sessionFactory;

    public Conexion() {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        session= sessionFactory.openSession();
        
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
}
