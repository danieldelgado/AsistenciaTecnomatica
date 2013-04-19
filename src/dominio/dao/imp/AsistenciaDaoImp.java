/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao.imp;

import dominio.Asistencia;
import dominio.dao.AsistenciaDao;
import hibernateUtil.Conexion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;

/**
 *
 * @author alumno
 */
public class AsistenciaDaoImp extends Conexion implements AsistenciaDao {

    public List<Asistencia> listarAsistencia() {
      Criteria criteria = getSession().createCriteria(Asistencia.class);
        return criteria.list();
    }

    public void addAsistencia(Asistencia a) {
       Transaction t = getSession().beginTransaction();
          getSession().save(a);
        t.commit();
    }

    public void deleteAsistencia(Asistencia a) {
       Transaction t = getSession().beginTransaction();
          getSession().delete(a);
       t.commit();
    }

    public void upDateAsistencia(Asistencia a) {
        Transaction t = getSession().beginTransaction();
         getSession().update(a);
      t.commit();
    }

    public Asistencia getAsistencia(int idAsistencia) {
        Transaction t = getSession().beginTransaction();
           Asistencia a = (Asistencia) getSession().get(Asistencia.class, idAsistencia);
        t.commit();
       return a;
    }
    
}
