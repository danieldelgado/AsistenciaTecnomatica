/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.util;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import com.freelancersteam.www.java.tomafoto.dominio.dao.imp.AsistenciaDaoImp;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

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
// ver como hacer el cierre de la conexion .....................  con la lista
        Object valor=null;
      //  Object[] empl = new AsistenciaDaoImp().getLegajoYNombreEmpleadoDeAsis(listaAsistencia.get(index).getIdAsistencia());
        if ("legajo".equals(jrf.getName())) {
            valor =  listaAsistencia.get(index).getEmpleado().getLegajo();
//            valor =  listaAsistencia.get(index).getEstado();
//            valor =  empl[0].toString();
        } else if ("empleado".equals(jrf.getName())) {
           valor =  listaAsistencia.get(index).getEmpleado().getApellido()+" "+listaAsistencia.get(index).getEmpleado().getNombre();
//            valor =  listaAsistencia.get(index).getEstado();
////            valor =  empl[1];
        }else if("estado".equals(jrf.getName())){
            valor = listaAsistencia.get(index).getEstado();
        }else if("fecha".equals(jrf.getName())){
            valor = com.freelancersteam.www.java.tomafoto.util.FechaUtil.getDateDDMMAAAA(listaAsistencia.get(index).getFecha());
        }else if("hora".equals(jrf.getName())){
            valor = com.freelancersteam.www.java.tomafoto.util.FechaUtil.getHora(listaAsistencia.get(index).getHora());
        }else if("observacion".equals(jrf.getName())){
            valor = listaAsistencia.get(index).getObservacion();
        }
//        else if("imagen".equals(jrf.getName())){
//            ImageIcon img = new ImageIcon(listaAsistencia.get(index).getImagen());
//            valor = img.getImage();
//           
//               ByteArrayOutputStream os = new ByteArrayOutputStream();
//            try { 
//                ImageIO.write((RenderedImage) img.getImage(),"jpeg", os);
//            } catch (IOException ex) {
//                Logger.getLogger(ReporteAsitenciaJRDataSource.class.getName()).log(Level.SEVERE, null, ex);
//            }
//               InputStream fis = new ByteArrayInputStream(os.toByteArray());
//               valor = fis;
          //  valor =listaAsistencia.get(index).getImagen();
//        }
//        
//        
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
