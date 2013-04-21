/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Camara.java
 *
 * Created on 11/06/2010, 11:53:04 PM
 */

package com.freelancersteam.www.java.tomafoto.vistas;

/**
 *
 * @author Cmop
 */
import com.freelancersteam.www.java.tomafoto.vistas.empleado.AltaEmpleado;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import com.freelancersteam.www.java.tomafoto.dominio.dao.AsistenciaDao;
import com.freelancersteam.www.java.tomafoto.dominio.dao.EmpleadoDao;
import com.freelancersteam.www.java.tomafoto.dominio.dao.imp.AsistenciaDaoImp;
import com.freelancersteam.www.java.tomafoto.dominio.dao.imp.EmpleadoDaoImp;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.eventos;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.jDispositivos;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.jmfVideo;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.mensajero;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.miPlayer;
import com.freelancersteam.www.java.tomafoto.util.FechaUtil;
import com.freelancersteam.www.java.tomafoto.vistas.empleado.JDBajas;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.Player;
import javax.media.Time;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Camara extends javax.swing.JFrame{
    jmfVideo b = new jmfVideo();
//    Set<Asistencia> conjunto;
    
//    EmpleadoDao empleados = new EmpleadoDaoImp();
//    AsistenciaDao asistencias = new AsistenciaDaoImp();
    private Player p1;
    private DefaultTableModel modelo;
    /** Creates new form Camara */
    public Camara(){
        initComponents();
        initComponents2();
        // para cargar de entrada los empleaedos de entrada, causa lentitud al ejecutar la aplicacion y a veces conflicto con la camara
        EmpleadoDao empleadoDao = new EmpleadoDaoImp();
         
          
    }

    public Player getPlayer()
    {
        return p1;
    }
    public void setPlayer(Player pin)
    {
        p1=pin;
    }
    public JPanel getCamara()
    {
        return panelCam;
    }

    private void initComponents2()
    {
        //registramos los Oyentes de eventos
        eventos e=new eventos(this);
        addWindowListener(e);
        jmCArchivo.addActionListener(e);
        jmCBD.addActionListener(e);
        jmSalir.addActionListener(e);
        jmAcerca.addActionListener(e);
        //Cargamos en el menu los Dispositivos detectados
        jDispositivos.menuDispositivos(this,jmDispositivos);
        lblFecha.setText(com.freelancersteam.www.java.tomafoto.util.FechaUtil.getFecha_Dia_DD_De_MM_De_AAAA(new Date())); 
        // agrego al panel  la camara de video
        try{ 
          panelCam.add(b.Componente());    
        } catch(Exception nep){
            JOptionPane.showMessageDialog(this, "La Conexion con la Camara FALLO, revise si su dispositivo esta conectado a la PC y  reincie la aplicacion ", "NO SE RECONOCE LA CAMARA", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }       
         
        setLocationRelativeTo(this); //centramos el formulario

    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucidoComplete2 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        panelCam = new javax.swing.JPanel();
        lbllFotoUser = new javax.swing.JLabel();
        clockDigital2 = new org.edisoncor.gui.varios.ClockDigital();
        clockFace2 = new org.edisoncor.gui.varios.ClockFace();
        btnIngresar = new org.edisoncor.gui.button.ButtonIpod();
        lblFecha = new org.edisoncor.gui.label.LabelCustom();
        cmbElegir = new org.edisoncor.gui.comboBox.ComboBoxRound();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtLegajo = new org.edisoncor.gui.textField.TextFieldRectIcon();
        txtClave = new org.edisoncor.gui.textField.TextFieldRectIcon();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuLogin = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();
        mnuEmpleados = new javax.swing.JMenu();
        mnuAltaEmpleado = new javax.swing.JMenuItem();
        mnuBajaEmpleado = new javax.swing.JMenuItem();
        mnuModEmpleado = new javax.swing.JMenuItem();
        mnuRegistros = new javax.swing.JMenu();
        mnuListado = new javax.swing.JMenuItem();
        mnuModEstados = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmAcerca = new javax.swing.JMenuItem();
        jmCapturar = new javax.swing.JMenu();
        jmCArchivo = new javax.swing.JMenuItem();
        jmCBD = new javax.swing.JMenuItem();
        jmDispositivos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toma una Foto");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        panelRectTranslucidoComplete2.setFocusable(false);
        panelRectTranslucidoComplete2.setOpaque(false);
        panelRectTranslucidoComplete2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCam.setBackground(new java.awt.Color(0, 0, 0));
        panelCam.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCam.setLayout(new java.awt.BorderLayout());
        panelRectTranslucidoComplete2.add(panelCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 250, 230));
        panelRectTranslucidoComplete2.add(lbllFotoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 130, 110));

        clockDigital2.setBackground(new java.awt.Color(255, 255, 255));
        clockDigital2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        panelRectTranslucidoComplete2.add(clockDigital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 113, 42));

        javax.swing.GroupLayout clockFace2Layout = new javax.swing.GroupLayout(clockFace2);
        clockFace2.setLayout(clockFace2Layout);
        clockFace2Layout.setHorizontalGroup(
            clockFace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        clockFace2Layout.setVerticalGroup(
            clockFace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        panelRectTranslucidoComplete2.add(clockFace2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 116, 123));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/OK.jpg"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIngresarKeyPressed(evt);
            }
        });
        panelRectTranslucidoComplete2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 80, 80));

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Martes 12, de Marzo de 2013");
        lblFecha.setBorde(true);
        lblFecha.setColorDeSombra(new java.awt.Color(255, 255, 255));
        lblFecha.setForma(org.edisoncor.gui.label.LabelCustom.Forma.BOTTOM);
        panelRectTranslucidoComplete2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 460, 34));

        cmbElegir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entrada", "Salida" }));
        cmbElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbElegirActionPerformed(evt);
            }
        });
        panelRectTranslucidoComplete2.add(cmbElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 140, -1));

        labelMetric1.setText("Legajo");
        panelRectTranslucidoComplete2.add(labelMetric1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        labelMetric2.setText("Clave");
        panelRectTranslucidoComplete2.add(labelMetric2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLegajoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLegajoKeyTyped(evt);
            }
        });
        panelRectTranslucidoComplete2.add(txtLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });
        panelRectTranslucidoComplete2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        mnuArchivo.setText("Archivo");

        mnuLogin.setText("Iniciar Sesion");
        mnuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLoginActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuLogin);

        jMenuItem1.setText("Cerrar Sesion");
        mnuArchivo.add(jMenuItem1);

        jmSalir.setText("Salir");
        mnuArchivo.add(jmSalir);

        jMenuBar1.add(mnuArchivo);

        mnuEmpleados.setText("Empleados");

        mnuAltaEmpleado.setText("Alta de Empleado");
        mnuAltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaEmpleadoActionPerformed(evt);
            }
        });
        mnuEmpleados.add(mnuAltaEmpleado);

        mnuBajaEmpleado.setText("Baja de Empleado");
        mnuEmpleados.add(mnuBajaEmpleado);

        mnuModEmpleado.setText("Modificacion de Empleado");
        mnuEmpleados.add(mnuModEmpleado);

        jMenuBar1.add(mnuEmpleados);

        mnuRegistros.setText("Registros");

        mnuListado.setText("Listado de Registros");
        mnuListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListadoActionPerformed(evt);
            }
        });
        mnuRegistros.add(mnuListado);

        mnuModEstados.setText("Modificar Estados");
        mnuModEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModEstadosActionPerformed(evt);
            }
        });
        mnuRegistros.add(mnuModEstados);

        jMenuBar1.add(mnuRegistros);

        jMenu4.setText("Acerca");

        jmAcerca.setText("Acerca");
        jMenu4.add(jmAcerca);

        jMenuBar1.add(jMenu4);

        jmCapturar.setText("Capturar");

        jmCArchivo.setText("En Archivo");
        jmCArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCArchivoActionPerformed(evt);
            }
        });
        jmCapturar.add(jmCArchivo);

        jmCBD.setText("En Base de Datos");
        jmCBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCBDActionPerformed(evt);
            }
        });
        jmCapturar.add(jmCBD);

        jMenuBar1.add(jmCapturar);

        jmDispositivos.setText("Dispositivos");
        jMenuBar1.add(jmDispositivos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucidoComplete2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucidoComplete2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jmCArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCArchivoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jmCArchivoActionPerformed

private void cmbElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbElegirActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cmbElegirActionPerformed

private void jmCBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCBDActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jmCBDActionPerformed
private void setearDatos(){
    txtLegajo.setText("");
    txtClave.setText("");
    txtLegajo.requestFocus();
}
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       // validar el empleado
      EmpleadoDaoImp empleados = new EmpleadoDaoImp();
       
   try{
       Empleado e = empleados.getEmpleado(Integer.parseInt(txtLegajo.getText()));
       boolean encontrado = com.freelancersteam.www.java.tomafoto.util.EmpleadoUtil.getValidarEmpleado(e,txtClave.getText().trim());
       if (encontrado) {
         try{
            //saco foto 
            b.capturarImagen();
            // detengo la camara
            b.getPlayer().stop();
            //capturo el dato si es Entrada o Salida  q eligio el user
                String elegir = (String)cmbElegir.getSelectedItem();
            //guardo la foto en la tabla asistencia
            miPlayer.guardaImagenEnBD(b.getImagen());
            // Proceso de actualizaion de la asistencia creada 
           // 1-busco el id de la ultima asistencia guardada
           AsistenciaDaoImp asistencias = new AsistenciaDaoImp();
           List<Asistencia> listaAsistencia ;
           listaAsistencia = asistencias.listarAsistencia();
           int idAsis =listaAsistencia.get(listaAsistencia.size()-1).getIdAsistencia();
           //2-obtengo la ultima asistencia guardada y seteo los valores que falta cargar
           Asistencia asistencia = asistencias.getAsistencia(idAsis);
           asistencia.setEstado(elegir);
           asistencia.setEmpleado(e);
           asistencia.setFecha(new Date());
           asistencia.setHora(new Date());
           asistencia.setModificado(false);
           asistencia.setCorrecto(true);
           // 3-actualizo la assitencia en la bd
           asistencias.upDateAsistencia(asistencia);
           
           // recupero la foto de la base de datos
           byte[] imagenbyte = asistencia.getImagen();
           ImageIcon imgIcon = new ImageIcon(imagenbyte,e.getLegajo()+" "+e.getApellido());
          
           adaptarTamaño(lbllFotoUser, imgIcon.getImage());
          // Detengo la aplicacion para que el usuario vea su foto durante 2 segundos y luego reinicio la camara
            Thread.sleep(1000);
            b.getPlayer().start();
          // muestro un mensaje de bienvenida 
            JOptionPane.showMessageDialog(this, "Empleado: "+e.getApellido()+" "+e.getNombre()+"\n"+"LEGAJO: "+e.getLegajo()+"\n"+"DIA : "+ FechaUtil.getHora(asistencia.getHora())+"\n"+"HORA: "+ FechaUtil.getHora(asistencia.getHora()) , asistencia.getEstado(), JOptionPane.INFORMATION_MESSAGE);
          //  limpio las cajas de texto                 
              setearDatos();
 

       
           }catch (Exception eee){
               mensajero.mensajeError(this,"No se pudo guardar la imagen en la bd, ERROR DE CONEXION CON LA BD");
       
         }
       }else{
               // Ingreso mal los datos de autenticacion 
               JOptionPane.showMessageDialog(this, "Su Identificacion es Incorrecta, por favor Ingrese de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
               setearDatos();
          } 
          
      }catch(java.lang.NumberFormatException edd){
       JOptionPane.showMessageDialog(this, "No pueden estar vacios sus datos de  identidad", "Error", JOptionPane.ERROR_MESSAGE);
       setearDatos();
      }        
   
    }//GEN-LAST:event_btnIngresarActionPerformed
  private void adaptarTamaño (JLabel label , Image img){
         Icon iconoAdaptado= new ImageIcon(img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT)); 
          label.setIcon(iconoAdaptado);//  si manda en pantalla
     }
    private void mnuListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListadoActionPerformed
        ListadoPersonal listado = new ListadoPersonal(this, true);
    }//GEN-LAST:event_mnuListadoActionPerformed

    
    
    
    private void mnuAltaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaEmpleadoActionPerformed
        AltaEmpleado personal = new AltaEmpleado(this, true);
    }//GEN-LAST:event_mnuAltaEmpleadoActionPerformed

    private void mnuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLoginActionPerformed
        Login login = new Login(this, true);
    }//GEN-LAST:event_mnuLoginActionPerformed

    private void txtLegajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLegajoKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
           btnIngresarActionPerformed(null);
        }
         else{
             if (evt.getKeyCode()==KeyEvent.VK_UP) {
                 btnIngresar.requestFocus();
             } else {
                 if (evt.getKeyCode()==KeyEvent.VK_DOWN) {
                     txtClave.requestFocus();
                 }
               
             }
    
         }
        
        
    }//GEN-LAST:event_txtLegajoKeyPressed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnIngresarActionPerformed(null);
        }
         else{
             if (evt.getKeyCode()==KeyEvent.VK_UP) {
                 txtLegajo.requestFocus();
             } else {
                 if (evt.getKeyCode()==KeyEvent.VK_DOWN) {
                     cmbElegir.requestFocus();
                 }
               
             }
    
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveKeyPressed

    private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnIngresarActionPerformed(null);
        }
         else{
             if (evt.getKeyCode()==KeyEvent.VK_UP) {
                  cmbElegir.requestFocus();
             } else {
                 if (evt.getKeyCode()==KeyEvent.VK_DOWN) {
                     txtLegajo.requestFocus();
                 }
               
             }
    
         }
    }//GEN-LAST:event_btnIngresarKeyPressed

    private void txtLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLegajoKeyTyped
        // conusmir los caracteres del legajo excepto los numeros
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
        
    }//GEN-LAST:event_txtLegajoKeyTyped

    private void mnuModEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModEstadosActionPerformed
        JDBajas ventanaBajas = new JDBajas(this, true);
        ventanaBajas.setLocationRelativeTo(this);
        ventanaBajas.setVisible(true);
    }//GEN-LAST:event_mnuModEstadosActionPerformed
       
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new Camara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnIngresar;
    private org.edisoncor.gui.varios.ClockDigital clockDigital2;
    private org.edisoncor.gui.varios.ClockFace clockFace2;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbElegir;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmAcerca;
    private javax.swing.JMenuItem jmCArchivo;
    private javax.swing.JMenuItem jmCBD;
    private javax.swing.JMenu jmCapturar;
    private javax.swing.JMenu jmDispositivos;
    private javax.swing.JMenuItem jmSalir;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelCustom lblFecha;
    private javax.swing.JLabel lbllFotoUser;
    private javax.swing.JMenuItem mnuAltaEmpleado;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuBajaEmpleado;
    private javax.swing.JMenu mnuEmpleados;
    private javax.swing.JMenuItem mnuListado;
    private javax.swing.JMenuItem mnuLogin;
    private javax.swing.JMenuItem mnuModEmpleado;
    private javax.swing.JMenuItem mnuModEstados;
    private javax.swing.JMenu mnuRegistros;
    private javax.swing.JPanel panelCam;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete2;
    private org.edisoncor.gui.textField.TextFieldRectIcon txtClave;
    private org.edisoncor.gui.textField.TextFieldRectIcon txtLegajo;
    // End of variables declaration//GEN-END:variables

}
