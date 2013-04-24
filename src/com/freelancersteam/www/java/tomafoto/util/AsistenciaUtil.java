/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.util;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class AsistenciaUtil {
    public static Set<Asistencia> getAsistenciasFiltradoPorAño (Set<Asistencia> conjunto,Date fechaInicio, Date fechaFin){
        int cont=0;
         for (Iterator<Asistencia> it = conjunto.iterator(); it.hasNext();) {
            Asistencia asistencia = it.next();
            if(( com.freelancersteam.www.java.tomafoto.util.FechaUtil.getAnio(asistencia.getFecha())<com.freelancersteam.www.java.tomafoto.util.FechaUtil.getAnio(fechaInicio))||( com.freelancersteam.www.java.tomafoto.util.FechaUtil.getAnio(asistencia.getFecha())>com.freelancersteam.www.java.tomafoto.util.FechaUtil.getAnio(fechaFin))){
               it.remove();
               cont++;
            }
    }
       
        return conjunto;
    }
    public static Set<Asistencia> getAsistenciasFiltradoPorMes (Set<Asistencia> conjunto,Date fechaInicio, Date fechaFin){
        int cont=0;
        for (Iterator<Asistencia> it = conjunto.iterator(); it.hasNext();) {
            Asistencia asistencia = it.next();
             if(( com.freelancersteam.www.java.tomafoto.util.FechaUtil.getMes(asistencia.getFecha())<com.freelancersteam.www.java.tomafoto.util.FechaUtil.getMes(fechaInicio))||( com.freelancersteam.www.java.tomafoto.util.FechaUtil.getMes(asistencia.getFecha())>com.freelancersteam.www.java.tomafoto.util.FechaUtil.getMes(fechaFin))){
                it.remove();
                cont++;
                }
        }     
       

        return conjunto;
    }
    public static Set<Asistencia> getAsistenciasFiltradoPorDia (Set<Asistencia> conjunto,Date fechaInicio, Date fechaFin){
        int cont=0;
        for (Iterator<Asistencia> it = conjunto.iterator(); it.hasNext();) {
            Asistencia asistencia = it.next();
             if(( com.freelancersteam.www.java.tomafoto.util.FechaUtil.getDia(asistencia.getFecha())<com.freelancersteam.www.java.tomafoto.util.FechaUtil.getDia(fechaInicio))||( com.freelancersteam.www.java.tomafoto.util.FechaUtil.getDia(asistencia.getFecha())>com.freelancersteam.www.java.tomafoto.util.FechaUtil.getDia(fechaFin))){
                it.remove();
                cont++;
                }
        }   
        
        return conjunto;
    }
    
}
