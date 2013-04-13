/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import dominio.Asistencia;
import dominio.OrdenarAsistenciaPorId;
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
        if ("empleado".equals(jrf.getName())) {
            valor =  listaAsistencia.get(index).getEmpleado().getNombre();
        }else if("estado".equals(jrf.getName())){
            valor = listaAsistencia.get(index).getEstado();
        }else if("fecha".equals(jrf.getName())){
            valor = Util.FechaUtil.getDateDDMMAAAA(listaAsistencia.get(index).getFecha());
        }else if("hora".equals(jrf.getName())){
            valor = Util.FechaUtil.getHora(listaAsistencia.get(index).getHora());
        }
        
        
        return valor;
    }
     public void addAsistencia(Asistencia a)
    {
        this.listaAsistencia.add(a);
    }
    
    
}
