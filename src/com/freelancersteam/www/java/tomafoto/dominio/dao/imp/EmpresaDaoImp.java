/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.dominio.dao.imp;

import com.freelancersteam.www.java.tomafoto.dominio.Empresa;
import com.freelancersteam.www.java.tomafoto.dominio.dao.EmpresaDao;
import com.freelancersteam.www.java.tomafoto.hibernateUtil.Conexion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

/**
 *
 * @author alumno
 */
public class EmpresaDaoImp extends Conexion implements EmpresaDao {

    public List<Empresa> listarEmpresa() {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Empresa.class);
        List<Empresa> lista = (List<Empresa>)criteria.list();
        session.getTransaction().commit();        
        session.close();
        return lista;
    }

    public void addEmpresa(Empresa a) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(a);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteEmpresa(Empresa a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void upDateEmpresa(Empresa a) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.update(a);
        session.getTransaction().commit();
        session.close();
    }

    public Empresa getEmpresa(int idEmpresa) {
         Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Empresa a = (Empresa) session.get(Empresa.class,idEmpresa);
        session.getTransaction().commit();
        session.close();
        return a;
    }
    
}
