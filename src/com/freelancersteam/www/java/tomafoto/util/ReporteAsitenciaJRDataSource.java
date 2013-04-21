/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.util;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import java.util.List;

/**
 *
 * @author alumno
 */
public class ReporteAsitenciaJRDataSource implements JRDataSource{
    
     int index =-1;
     List<Asistencia> listaAsistencia = new ArrayList<Asistencia>();
        
     public boolean next() throws JRException {
        
        return ++index < listaAsistencia.size();
    }

    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor=null;
        if ("legajo".equals(jrf.getName())) {
            valor =  listaAsistencia.get(index).getEmpleado().getLegajo();
        } else if ("empleado".equals(jrf.getName())) {
            valor =  listaAsistencia.get(index).getEmpleado().getNombre();
        }else if("estado".equals(jrf.getName())){
            valor = listaAsistencia.get(index).getEstado();
        }else if("fecha".equals(jrf.getName())){
            valor = com.freelancersteam.www.java.tomafoto.util.FechaUtil.getDateDDMMAAAA(listaAsistencia.get(index).getFecha());
        }else if("hora".equals(jrf.getName())){
            valor = com.freelancersteam.www.java.tomafoto.util.FechaUtil.getHora(listaAsistencia.get(index).getHora());
        }
        
        
        return valor;
    }
     public void addAsistencia(Asistencia a)
    {
        this.listaAsistencia.add(a);
    }
    
     public void setListAsistencia(List<Asistencia> e){
         this.listaAsistencia = e;
     }
    
}
