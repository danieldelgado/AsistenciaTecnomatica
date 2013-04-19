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

    public static void mensajeError(Component padre,String mensaje)
    {
        JOptionPane.showMessageDialog(padre,mensaje,"TomaFoto",JOptionPane.ERROR_MESSAGE);
    }
}
