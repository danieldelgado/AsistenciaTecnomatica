/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.util;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class EmpleadoUtil {
    
    public static Empleado CreateEmpleadoAdministrador(){
        Empleado empleado = new Empleado();
        empleado.setLegajo(123456);
        empleado.setNombre("Empleado Ficticio");
        empleado.setApellido("Administrador ficticio");
        empleado.setClave("654321");
        empleado.setAdministrador(true);
        return empleado;
    }
    public static boolean getValidarEmpleado(Empleado e , String clave){
        boolean encontrado= false;
        if (e!=null) {
             if ( e.getClave().equals(clave)) {
             encontrado = true;
           
        }
        }
        return encontrado;
    }
 
    /**
     * 
     * @param lista recibe una lista con empleados
     * @param dni  del empleado a buscar
     * @return  un objeto empleado si existe ,  NULL si no existe
     */
    public static Empleado getEmpleado(List<Empleado> lista , String dni){
        Empleado e = null;
        for (Empleado empleado : lista) {
            if (empleado.getDni().equals(dni)) {
                e = empleado;
                break;
            }
        }
        return e;
    }
 
   
    
}


 