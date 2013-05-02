/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.dominio.dao.imp;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import com.freelancersteam.www.java.tomafoto.dominio.dao.AsistenciaDao;
import com.freelancersteam.www.java.tomafoto.hibernateUtil.Conexion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author alumno
 */
public class AsistenciaDaoImp extends Conexion implements AsistenciaDao {

    public List<Asistencia> listarAsistencia() {
        
        Session session = getSessionFactory().openSession();
        //session.beginTransaction();
        Criteria criteria = session.createCriteria(Asistencia.class);
        criteria.addOrder(Order.asc("idAsistencia"));
         List<Asistencia> lista = (List<Asistencia>)criteria.list();
        //session.getTransaction().commit();        
        session.close();
        return lista;
       
    }
    public List<Asistencia> listarAsistencia(Empleado e) {
        Session session = getSessionFactory().openSession();
       // session.beginTransaction();
        Criteria criteria = session.createCriteria(Asistencia.class);
        criteria.addOrder(Order.asc("idAsistencia"));
        criteria.add(Restrictions.eq("empleado", e));
        List<Asistencia> lista = criteria.list();
     //   session.getTransaction().commit();
        session.close();
        return lista;
       
    }

    public void addAsistencia(Asistencia a) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(a);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteAsistencia(Asistencia a) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(a);
        session.getTransaction().commit();
        session.close();
    }

    public void upDateAsistencia(Asistencia a) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.update(a);
        session.getTransaction().commit();
        session.close();
    }

    public Asistencia getAsistencia(int idAsistencia) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Asistencia a = (Asistencia) session.get(Asistencia.class,idAsistencia);
        session.getTransaction().commit();
        session.close();
        return a;
    }

/*
     * obtinenw obj[1] legajo , y obj[2] nombre empleado
     */
    
    public Object[] getLegajoYNombreEmpleadoDeAsis(int idAsistencia) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Asistencia a = (Asistencia) session.get(Asistencia.class,idAsistencia);
        Empleado e = a.getEmpleado();
        Object[] o ={e.getLegajo(),e.getNombre()};
         session.getTransaction().commit();
        session.close();
        return o;
    }

    /**
     * 
     * @param fechaInicio
     * @param fechaFin
     * @return
     * Importante : luego cada vez que se utilize este metodo utilizar
     *  Conexion.getSessionFactory().close();   xq la sesion no esta cerrada en el metodo
     */
    public List<Asistencia> listarAsistencia(Date fechaInicio, Date fechaFin) {
        Session session = getSessionFactory().openSession();
          Criteria criteria = session.createCriteria(Asistencia.class);
        criteria.addOrder(Order.asc("idAsistencia"));
         criteria.add( Restrictions.ge("fecha", fechaInicio) );
         criteria.add( Restrictions.le("fecha", fechaFin) ); 
         List<Asistencia> lista = criteria.list();
//         session.close();
          return lista;
    }
   
    /**
     * 
     * @param e objeto empleado 
     * @param fechaInicio  fecha de inicio 
     * @param fechaFin  fechea final 
     * @return  lista de asisistencia de un empleado dentro de un intervalo de fecha   >= y <=
     *  Importante : luego cada vez que se utilize este metodo utilizar 
     *   Conexion.getSessionFactory().close();
     */
    public List<Asistencia> listarAsistencia(Empleado e ,Date fechaInicio, Date fechaFin) {
        Session session = getSessionFactory().openSession();
         Criteria criteria = session.createCriteria(Asistencia.class);
        criteria.addOrder(Order.asc("idAsistencia"));
         criteria.add(Restrictions.eq("empleado", e));
         criteria.add( Restrictions.ge("fecha", fechaInicio) );
         criteria.add( Restrictions.le("fecha", fechaFin) ); 
         List<Asistencia> lista = criteria.list();
         
//         session.close();
          return lista;
    }
   
    
}

