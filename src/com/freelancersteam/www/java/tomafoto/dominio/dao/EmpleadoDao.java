/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.dominio.dao;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import java.util.Set;

/**
 *
 * @author alumno
 */
public interface EmpleadoDao {
  java.util.List<Empleado> listarEmpleado();
  java.util.List<Empleado> listarEmpleadoAdministradores();
  public void addEmpleado(Empleado a);
  public void deleteEmpleado(Empleado a);
  public void upDateEmpleado(Empleado a);
  public Empleado getEmpleado(int idEmpleado);
  public Set<Asistencia> getAsistencia(int idEmpleado);
  public Empleado getEmpleadoDni(int DniEmpleado);
  public Empleado getEmpleadoAdministrador(int dni,boolean adm,String clave);
  
  
}
