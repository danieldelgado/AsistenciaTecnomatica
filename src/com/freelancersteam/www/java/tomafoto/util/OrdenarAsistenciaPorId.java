/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.util;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class OrdenarAsistenciaPorId implements Comparator<Asistencia> {

    public int compare(Asistencia o1, Asistencia o2) {
       return o1.getIdAsistencia() - o2.getIdAsistencia();
               
    }
    
}
