/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.dominio.dao;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import java.util.Date;

/**
 *
 * @author alumno
 */
public interface AsistenciaDao {
  java.util.List<Asistencia> listarAsistencia();
  public java.util.List<Asistencia> listarAsistencia(Empleado e);
  public void addAsistencia(Asistencia a);
  public void deleteAsistencia(Asistencia a);
  public void upDateAsistencia(Asistencia a);
  public Asistencia getAsistencia(int idAsistencia);
  public Object[] getLegajoYNombreEmpleadoDeAsis(int idAsistencia);
  public java.util.List<Asistencia> listarAsistencia(Date fechaInicio ,Date fechaFin);
  public java.util.List<Asistencia> listarAsistencia(Empleado e ,Date fechaInicio, Date fechaFin);
}
