/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import dominio.Asistencia;
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
            if(( Util.FechaUtil.getAnio(asistencia.getFecha())<Util.FechaUtil.getAnio(fechaInicio))||( Util.FechaUtil.getAnio(asistencia.getFecha())>Util.FechaUtil.getAnio(fechaFin))){
               it.remove();
               cont++;
            }
    }
        System.out.println("contador de año "+cont);
        return conjunto;
    }
    public static Set<Asistencia> getAsistenciasFiltradoPorMes (Set<Asistencia> conjunto,Date fechaInicio, Date fechaFin){
        int cont=0;
        for (Iterator<Asistencia> it = conjunto.iterator(); it.hasNext();) {
            Asistencia asistencia = it.next();
             if(( Util.FechaUtil.getMes(asistencia.getFecha())<Util.FechaUtil.getMes(fechaInicio))||( Util.FechaUtil.getMes(asistencia.getFecha())>Util.FechaUtil.getMes(fechaFin))){
                it.remove();
                cont++;
                }
        }     
        System.out.println("contador de mes  "+ cont);

        return conjunto;
    }
    public static Set<Asistencia> getAsistenciasFiltradoPorDia (Set<Asistencia> conjunto,Date fechaInicio, Date fechaFin){
        int cont=0;
        for (Iterator<Asistencia> it = conjunto.iterator(); it.hasNext();) {
            Asistencia asistencia = it.next();
             if(( Util.FechaUtil.getDia(asistencia.getFecha())<Util.FechaUtil.getDia(fechaInicio))||( Util.FechaUtil.getDia(asistencia.getFecha())>Util.FechaUtil.getDia(fechaFin))){
                it.remove();
                cont++;
                }
        }   
        System.out.println("contador de dia "+cont);
        return conjunto;
    }
    
}
