/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.freelancersteam.www.java.tomafoto.estudiandojmf;

import com.freelancersteam.www.java.tomafoto.vistas.Camara;
import javax.media.Player;

/**
 *
 * @author Cmop
 */

/*
 * Es el nexo entre la Clase camara y el Player la primera Vez que se activa
 * la cámara
 */
public class panelCamara {


    public static void estableceCamara(Camara camara,String dispositivo,int formato)
    {
        Player player=jDispositivos.reproductor(dispositivo,formato);
        camara.setPlayer(player);
        miPlayer.iniciarPlayer(player);
        camara.getCamara().add(player.getVisualComponent());
    }
}
