/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package estudiandojmf;

/**
 *
 * @author Cmop
 */
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;

public class guardaComo {
    public static File verDialogo(Component padre)
    {
        File rpta=null;
        String imagen="";
        JFileChooser f = new JFileChooser();
        f.setDialogTitle("Guardar Captura como...");
        f.showSaveDialog(padre);
        if(f.getSelectedFile()!=null)
        {
            imagen= f.getSelectedFile().getAbsolutePath();
            if (imagen.lastIndexOf(".") > 0)
            imagen = imagen.substring(0,imagen.lastIndexOf("."));

            imagen = imagen+".JPG";
            rpta = new File(imagen);
        }
        return rpta;
    }
}
