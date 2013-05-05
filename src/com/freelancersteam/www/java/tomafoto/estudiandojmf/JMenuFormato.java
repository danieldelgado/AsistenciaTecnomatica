/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.freelancersteam.www.java.tomafoto.estudiandojmf;

import com.freelancersteam.www.java.tomafoto.vistas.main.Camara;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Cmop
 */
public class JMenuFormato extends JMenuItem implements ActionListener{

    private int ancho;
    private int alto;
    private JPanel modificable;
    private Camara padre;
    private String dispositivo;
    private int ordinal;

    public JMenuFormato(String dispositivo,String etiqueta,int ordinal,int ancho,int alto,Camara Padre,JPanel modificable)
    {
        super(etiqueta);
        this.modificable=modificable;
        this.ancho=ancho;
        this.alto=alto;
        this.addActionListener(this);
        this.padre=Padre;
        this.dispositivo=dispositivo;
        this.ordinal=ordinal;
    }

    /*
     * Retorna el nombre del dispositivo que representa
     */
    public String getDispositivo()
    {
        return dispositivo;
    }

    public void actionPerformed(ActionEvent e) {
       if(padre.getPlayer()==null)
            panelCamara.estableceCamara(padre, dispositivo, ordinal);
       else
            jDispositivos.cambiaResolucion(dispositivo, padre.getPlayer(), ordinal);
            //padre.setSize(ancho+200, alto+200);
      
       padre.setLocationRelativeTo(padre);
    }
}