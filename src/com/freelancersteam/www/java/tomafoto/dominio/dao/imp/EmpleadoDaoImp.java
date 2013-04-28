/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.dominio.dao.imp;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import com.freelancersteam.www.java.tomafoto.dominio.dao.EmpleadoDao;
import com.freelancersteam.www.java.tomafoto.hibernateUtil.Conexion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author alumno
 */
public class EmpleadoDaoImp extends Conexion implements EmpleadoDao {

    public List<Empleado> listarEmpleado() {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Empleado.class);
//        criteria.addOrder(Order.asc("legajo"));
        List<Empleado> lista = (List<Empleado>)criteria.list();
        session.getTransaction().commit();
        session.close();
        return lista;
                
    }

    public void addEmpleado(Empleado a) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(a);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteEmpleado(Empleado a) {
       Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(a);
        session.getTransaction().commit();
        session.close();
    }

    public void upDateEmpleado(Empleado a) {
       Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.update(a);
        session.getTransaction().commit();
        session.close();
    }

    public Empleado getEmpleado(int idEmpleado) {
       Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Empleado a = (Empleado) session.get(Empleado.class, idEmpleado);
        session.getTransaction().commit();
        session.close();
        return a;
    }
    public Set<Asistencia> getAsistencia(int idEmpleado) {
        Set<Asistencia> setAsistencia = new HashSet<Asistencia>();
       Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Empleado a = (Empleado) session.get(Empleado.class, idEmpleado);
        if (a!=null) {
            setAsistencia = a.getAsistencias();
        }else{
            setAsistencia= null;
        }
        
        session.getTransaction().commit();
        session.close();
        return setAsistencia;
    }


     
}
