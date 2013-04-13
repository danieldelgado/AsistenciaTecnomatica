/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao;

import dominio.Asistencia;

/**
 *
 * @author alumno
 */
public interface AsistenciaDao {
    java.util.List<Asistencia> listarAsistencia();
  public void addAsistencia(Asistencia a);
  public void deleteAsistencia(Asistencia a);
  public void upDateAsistencia(Asistencia a);
  public Asistencia getAsistencia(int idAsistencia);  
}
