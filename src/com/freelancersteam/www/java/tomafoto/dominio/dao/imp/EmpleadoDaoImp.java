/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.dominio.dao.imp;

import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import com.freelancersteam.www.java.tomafoto.dominio.dao.EmpleadoDao;
import com.freelancersteam.www.java.tomafoto.hibernateUtil.Conexion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author alumno
 */
public class EmpleadoDaoImp extends Conexion implements EmpleadoDao {

    public List<Empleado> listarEmpleado() {
         Criteria criteria = getSession().createCriteria(Empleado.class);
        return criteria.list();
    }

    public void addEmpleado(Empleado a) {
         Transaction t = getSession().beginTransaction();
          getSession().save(a);
         t.commit();
    }

    public void deleteEmpleado(Empleado a) {
        Transaction t = getSession().beginTransaction();
          getSession().delete(a);
       t.commit();
    }

    public void upDateEmpleado(Empleado a) {
      Transaction t = getSession().beginTransaction();
         getSession().update(a);
      t.commit();
    }

    public Empleado getEmpleado(int idEmpleado) {
       Transaction t = getSession().beginTransaction();
           Empleado a = (Empleado) getSession().get(Empleado.class, idEmpleado);
        t.commit();
       return a;
    }


}
