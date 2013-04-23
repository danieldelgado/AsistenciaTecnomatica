/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.freelancersteam.www.java.tomafoto.estudiandojmf;

/**
 *
 * @author Cmop
 */
import java.awt.Component;
import javax.swing.JOptionPane;

public class mensajero extends JOptionPane{
   public static final String NOMBRE_SISTEMA = "SISTEMA REGISTRO DE ASISTENCIA";
   public static final String ACCION_ALTA = "ALTA";
   public static final String ACCION_BAJA = "BAJA";
   public static final String ACCION_ACTUALIZACION = "ACTUALIZACION";
    public static void mensajeError(Component padre,String mensaje)
    {
        JOptionPane.showMessageDialog(padre,mensaje,NOMBRE_SISTEMA,JOptionPane.ERROR_MESSAGE);
    }
    public static void mensajeInformacionAtualizacion(Component padre, String mensaje){
        JOptionPane.showMessageDialog(padre,mensaje,ACCION_ACTUALIZACION,JOptionPane.INFORMATION_MESSAGE);
    }
}
