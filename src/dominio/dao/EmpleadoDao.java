/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.dao;

import dominio.Empleado;

/**
 *
 * @author alumno
 */
public interface EmpleadoDao {
    java.util.List<Empleado> listarEmpleado();
  public void addEmpleado(Empleado a);
  public void deleteEmpleado(Empleado a);
  public void upDateEmpleado(Empleado a);
  public Empleado getEmpleado(int idEmpleado);
}
