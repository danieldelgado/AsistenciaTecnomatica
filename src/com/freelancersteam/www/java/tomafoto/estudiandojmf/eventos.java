/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.freelancersteam.www.java.tomafoto.estudiandojmf;

import com.freelancersteam.www.java.tomafoto.vistas.main.Camara;
import com.freelancersteam.www.java.tomafoto.vistas.main.jacerca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Cmop
 */
public class eventos implements WindowListener,ActionListener{
    private Camara padre;
    public eventos(Camara padre){this.padre=padre;}

    public void windowOpened(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
        miPlayer.detenerPlayer(padre.getPlayer());
    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("En Archivo"))
        {
            miPlayer.guardaImagenEnFichero(miPlayer.capturaFoto(padre.getPlayer()),guardaComo.verDialogo(padre));
        }
        else if(e.getActionCommand().equals("En Base de Datos"))
        {
            miPlayer.guardaImagenEnBD(miPlayer.capturaFoto(padre.getPlayer()));
        }
        else if(e.getActionCommand().equals("Salir"))
        {
            miPlayer.detenerPlayer(padre.getPlayer());
            System.exit(0);
        }
        else if(e.getActionCommand().equals("Acerca"))
        {
            new jacerca(padre,true).setVisible(true);
        }
       
        
    }
}