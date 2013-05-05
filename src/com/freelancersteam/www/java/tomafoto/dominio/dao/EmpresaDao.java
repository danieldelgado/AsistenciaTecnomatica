/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.dominio.dao;

import com.freelancersteam.www.java.tomafoto.dominio.Empresa;

/**
 *
 * @author alumno
 */
public interface EmpresaDao {
  java.util.List<Empresa> listarEmpresa();
  public void addEmpresa(Empresa a);
  public void deleteEmpresa(Empresa a);
  public void upDateEmpresa(Empresa a);
  public Empresa getEmpresa(int idEmpleado);
}
