package estudiandojmf;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cmop
 */
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.media.Buffer;
import javax.media.Player;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JPanel;


public class miPlayer {
    public static void iniciarPlayer(Player p)
    {
        if(p!=null)
            p.start();
    }
    public static void detenerPlayer(Player p)
    {
        if(p!=null)
        {
            p.stop();
            p.deallocate();
            p.close();
        }
    }
    public static void verCamara(JPanel c,Player p1,String dispositivo,int formato)
    {
        if(p1!=null)
           p1.close();
        p1=jDispositivos.reproductor(dispositivo,formato);
        miPlayer.iniciarPlayer(p1);
        c.add(p1.getVisualComponent());
    }
    public static Image capturaFoto(Player p)
    {
        Image img=null;
        if(p!=null)
        {
            FrameGrabbingControl fgc = (FrameGrabbingControl)p.getControl("javax.media.control.FrameGrabbingControl");
            Buffer buf = fgc.grabFrame();
            BufferToImage btoi = new BufferToImage((VideoFormat)buf.getFormat());
            img = btoi.createImage(buf);
        }
        else
        {
            mensajero.mensajeError(null, "No se ha iniciado el player!");
        }
        return img;
    }

    public static void guardaImagenEnFichero(Image img,File imagenArch)
    {
        String formato = "JPEG";
        try {
            if(img !=null && imagenArch!=null)
                ImageIO.write((RenderedImage) img, formato, imagenArch);
        } catch (IOException ex) {
            mensajero.mensajeError(null, "Error de escritura en Disco");
        }
    }
    
    public static void guardaImagenEnBD(Image img)
    {
        String formato = "JPEG";
        if(img !=null)
        try
        {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ImageIO.write((RenderedImage) img, formato, out);
            InputStream in = new ByteArrayInputStream(out.toByteArray());
            String sql = "INSERT INTO imagen(imagen) VALUES (?)";
            Connection cn=conexion.iniciaConexion();
            PreparedStatement stmt = cn.prepareStatement(sql);
            stmt.setBinaryStream(1, in);
            stmt.execute();
            stmt.close();
            conexion.cerrarConexion(cn);
        } catch (SQLException ex) {
            mensajero.mensajeError(null, "Error Al ejecutar sentencia SQL");
        } catch (IOException ex) {
            mensajero.mensajeError(null, "Error de Entrada/Salida");
        }
    }
    public static void guardaImagenEnBD2(Image img)
    {
        String formato = "JPEG";
        if(img !=null)
        try
        {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ImageIO.write((RenderedImage) img, formato, out);
            InputStream in = new ByteArrayInputStream(out.toByteArray());
            String sql = "INSERT INTO asistencia(imagen) VALUES (?)";
            Connection cn=conexion.iniciaConexion();
            PreparedStatement stmt = cn.prepareStatement(sql);
            stmt.setBinaryStream(1, in);
            stmt.execute();
            stmt.close();
            conexion.cerrarConexion(cn);
        } catch (SQLException ex) {
            mensajero.mensajeError(null, "Error Al ejecutar sentencia SQL");
        } catch (IOException ex) {
            mensajero.mensajeError(null, "Error de Entrada/Salida");
        }
    }
}
