/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;



import dominio.Asistencia;
import dominio.Empleado;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class TablaUtil {
    
    
    /**
     * Crea la estructura de la tabla Asamblea , indica que columnas contendra
     * @param modelo  modelo de la tabla asamblea 
     * @param tablaAsamblea  tabla donde contendra informacion de todas las asableas
     */
    public static void prepararTablaAsistencia(DefaultTableModel modelo, JTable tablaAsistencia){
        
        String[] titulos = {"LEGAJO","EMPLEADO","ENTRADA/SALIDA","FECHA","HORA"};
       modelo= new DefaultTableModel(null,titulos);
       tablaAsistencia.setModel(modelo);
    }
    
    /**
     * Carga todos registros en la tabla Asamblea 
     * @param modelo  modelos de la tabla asamblea
     * @param listaAsamblea  
     * @param tablaAsamblea tabla donde contiene toda la informacion de las asambleas
     */
    
    public static void cargarModeloAsistencia(DefaultTableModel modelo,Set<Asistencia> listaOrdenDia,JTable tablaOrdendelDia){
         modelo =(DefaultTableModel) tablaOrdendelDia.getModel();
       for (Iterator it = listaOrdenDia.iterator(); it.hasNext();) {
        Asistencia a = (Asistencia) it.next();
       String fecha= FechaUtil.getDateDDMMAAAA(a.getFecha());
        
        Object[] filaAsistencia = {a.getEmpleado().getLegajo(),a.getEmpleado().getApellido()+" "+a.getEmpleado().getNombre(),a.getEstado(),fecha,FechaUtil.getHora(a.getHora())}; 
  
           modelo.addRow(filaAsistencia);
    }
}
  public static void prepararTablaEmpleado(DefaultTableModel modelo, JTable tablaEmpleado){
        
        String[] titulos = {"LEGAJO","EMPLEADO"};
       modelo= new DefaultTableModel(null,titulos);
       tablaEmpleado.setModel(modelo);
    }  
    public static void cargarModeloEmpleado(DefaultTableModel modelo,List<Empleado>listaEmpleado,JTable tablaEmpleado){
         modelo =(DefaultTableModel) tablaEmpleado.getModel();
        for ( Empleado a : listaEmpleado) {
          Object[] filaEmpleado = {a.getLegajo(),a.getApellido() +" "+ a.getNombre()}; 
           modelo.addRow(filaEmpleado);
           
           }
    }
  
}
    
    
 