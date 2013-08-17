/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Camara.java
 *
 * Created on 11/06/2010, 11:53:04 PM
 */

package com.freelancersteam.www.java.tomafoto.vistas.main;

/**
 *
 * @author Cmop
 */
import com.freelancersteam.www.java.tomafoto.vistas.administrador.Login;
import com.freelancersteam.www.java.tomafoto.vistas.empleado.GestorEmpleado;
import com.freelancersteam.www.java.tomafoto.vistas.empleado.AltaEmpleado;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import com.freelancersteam.www.java.tomafoto.dominio.dao.imp.AsistenciaDaoImp;
import com.freelancersteam.www.java.tomafoto.dominio.dao.imp.EmpleadoDaoImp;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.eventos;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.jmfVideo;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.miPlayer;
import com.freelancersteam.www.java.tomafoto.util.Constantes;
import com.freelancersteam.www.java.tomafoto.util.EmpleadoUtil;
import com.freelancersteam.www.java.tomafoto.util.FechaUtil;


import com.freelancersteam.www.java.tomafoto.vistas.administrador.GestorAdministriador;
import com.freelancersteam.www.java.tomafoto.vistas.asistencia.BorrarAsistencia;
import com.freelancersteam.www.java.tomafoto.vistas.asistencia.GestorAsistencia;
import com.freelancersteam.www.java.tomafoto.vistas.empresa.AltaEmpresa;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.Player;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Camara extends javax.swing.JFrame{
    jmfVideo b = new jmfVideo();

    private Player p1;
    private DefaultTableModel modelo;
    /** Creates new form Camara */
    public Camara(){
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/iconTecnomatica.png")).getImage());
//        D:\Poyectos Git\TomaFoto\src\com\freelancersteam\www\java\tomafoto\images\iconTecnomatica.png
        initComponents2();
        setconfigurarcionMenuAdministrador(false);
        txtLDni.requestFocus();
        // para cargar de entrada los empleaedos de entrada, causa lentitud al ejecutar la aplicacion y a veces conflicto con la camara
             // si la tabla esta vacia por defecto que cree un administrador ficticio
        int numeroEmpleado = new EmpleadoDaoImp().listarEmpleado().size();
        if (numeroEmpleado==0) {
            //crea un empleado ficticio
           Empleado e = EmpleadoUtil.CreateEmpleadoAdministrador();
           new EmpleadoDaoImp().addEmpleado(e);
        }
          // habria que ver si ya existe un administrador-------
    }

    private void setPaneldeControl(boolean b){
        panelInicio.setVisible(b);
    }
    private void setconfigurarcionMenuAdministrador(boolean b){
        
        mnuAcerca.setVisible(true);
        mnuEmpleados.setVisible(b);
        mnuAsistencia.setVisible(b);
        mnuEmpresa.setVisible(b);
        //mnu item
        mnuItmIniciarSesion.setVisible(!b);
        mnuItmCerrarSesion.setVisible(b);
       // mnuItmInciarControl.setVisible(b);
        mnuItmSalir.setVisible(true);
        
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
        mnuItmConfigurarEmpresa.addActionListener(e);
        //jmCBD.addActionListener(e);
        mnuItmSalir.addActionListener(e);
        mnuItmAcerca.addActionListener(e);
        //Cargamos en el menu los Dispositivos detectados
       // jDispositivos.menuDispositivos(this,jmDispositivos);
        lblFecha.setText(com.freelancersteam.www.java.tomafoto.util.FechaUtil.getFecha_Dia_DD_De_MM_De_AAAA(new Date())); 
        // agrego al panel  la camara de video
        try{ 
          panelCam.add(b.Componente());    
        } catch(Exception nep){
            JOptionPane.showMessageDialog(this, "La Conexion con la Camara FALLO, revise si su dispositivo esta conectado a la PC y  reincie la aplicacion ", "NO SE RECONOCE LA CAMARA", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }       
        adaptarTamaño(lbliconEmpresa, new ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/iconTecnomatica.png")).getImage());        
        lblNameSistema.setText(Constantes.TITLE_APP);
        setLocationRelativeTo(this); //centramos el formulario

    }

 private void adaptarTamaño (JLabel label , Image img){
         Icon iconoAdaptado= new ImageIcon(img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT)); 
          label.setIcon(iconoAdaptado);//  si manda en pantalla
     }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelInicio = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        panelCam = new javax.swing.JPanel();
        clockDigital2 = new org.edisoncor.gui.varios.ClockDigital();
        clockFace2 = new org.edisoncor.gui.varios.ClockFace();
        btnIngresar = new org.edisoncor.gui.button.ButtonIpod();
        lblFecha = new org.edisoncor.gui.label.LabelCustom();
        cmbElegir = new org.edisoncor.gui.comboBox.ComboBoxRound();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        txtLDni = new org.edisoncor.gui.textField.TextFieldRectIcon();
        lblNameSistema = new javax.swing.JLabel();
        lbliconEmpresa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        titleBar1 = new org.edisoncor.gui.varios.TitleBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuItmIniciarSesion = new javax.swing.JMenuItem();
        mnuItmCerrarSesion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuItmSalir = new javax.swing.JMenuItem();
        mnuEmpleados = new javax.swing.JMenu();
        mnuItemGestorEmpleado = new javax.swing.JMenuItem();
        mnuItmAltaEmpleado = new javax.swing.JMenuItem();
        mnuAsistencia = new javax.swing.JMenu();
        mnuItmeGestorAsistencia = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuEmpresa = new javax.swing.JMenu();
        mnuItmConfigurarEmpresa = new javax.swing.JMenuItem();
        mnuItmCuentaAdmin = new javax.swing.JMenuItem();
        mnuAcerca = new javax.swing.JMenu();
        mnuItmAcerca = new javax.swing.JMenuItem();

        setTitle("CONTROL DE ASISTENCIA");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(560, 420));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setPreferredSize(new java.awt.Dimension(677, 523));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInicio.setBackground(new java.awt.Color(255, 255, 255));
        panelInicio.setColorPrimario(new java.awt.Color(0, 0, 0));
        panelInicio.setFocusable(false);
        panelInicio.setMaximumSize(new java.awt.Dimension(0, 0));
        panelInicio.setOpaque(false);

        panelCam.setBackground(new java.awt.Color(0, 0, 0));
        panelCam.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCam.setLayout(new java.awt.BorderLayout());

        clockDigital2.setBackground(new java.awt.Color(255, 255, 255));
        clockDigital2.setForeground(new java.awt.Color(255, 255, 255));
        clockDigital2.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N

        clockFace2.setRomano(false);

        javax.swing.GroupLayout clockFace2Layout = new javax.swing.GroupLayout(clockFace2);
        clockFace2.setLayout(clockFace2Layout);
        clockFace2Layout.setHorizontalGroup(
            clockFace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        clockFace2Layout.setVerticalGroup(
            clockFace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/MB_0004_photo.png"))); // NOI18N
        btnIngresar.setText("MARCAR");
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

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Martes 12, de Marzo de 2013");
        lblFecha.setBorde(true);
        lblFecha.setColorDeSombra(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblFecha.setForma(org.edisoncor.gui.label.LabelCustom.Forma.BOTTOM);

        cmbElegir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENTRADA", "SALIDA" }));
        cmbElegir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbElegirActionPerformed(evt);
            }
        });
        cmbElegir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbElegirKeyPressed(evt);
            }
        });

        labelMetric1.setText("DNI");
        labelMetric1.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N

        txtLDni.setColorDeBorde(new java.awt.Color(204, 204, 204));
        txtLDni.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtLDni.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLDniActionPerformed(evt);
            }
        });
        txtLDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLDniKeyTyped(evt);
            }
        });

        lblNameSistema.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        lblNameSistema.setForeground(new java.awt.Color(204, 204, 204));
        lblNameSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameSistema.setText("Sistema  Control de Asociado V1.0");

        lbliconEmpresa.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lbliconEmpresa.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("www.tecnomati.co");

        labelMetric2.setText("ACCION");
        labelMetric2.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInicioLayout.createSequentialGroup()
                                .addComponent(lbliconEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInicioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clockFace2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(clockDigital2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                            .addGroup(panelInicioLayout.createSequentialGroup()
                                                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelMetric1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtLDni, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                                    .addComponent(cmbElegir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(31, 31, 31)))))
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNameSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addComponent(clockFace2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clockDigital2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelCam, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbliconEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap())))
        );

        jPanel1.add(panelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, -1, -1));
        jPanel1.add(titleBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 1, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(null);
        jMenuBar1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(320, 19));

        mnuArchivo.setBackground(new java.awt.Color(51, 51, 51));
        mnuArchivo.setForeground(new java.awt.Color(204, 204, 204));
        mnuArchivo.setText("Archivo");
        mnuArchivo.setActionCommand("  Archivo");
        mnuArchivo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        mnuItmIniciarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        mnuItmIniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        mnuItmIniciarSesion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mnuItmIniciarSesion.setForeground(new java.awt.Color(204, 204, 204));
        mnuItmIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/Profile.png"))); // NOI18N
        mnuItmIniciarSesion.setText("Iniciar Sesion");
        mnuItmIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmIniciarSesionActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItmIniciarSesion);

        mnuItmCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mnuItmCerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        mnuItmCerrarSesion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mnuItmCerrarSesion.setForeground(new java.awt.Color(204, 204, 204));
        mnuItmCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/cerrar sesion - copia.png"))); // NOI18N
        mnuItmCerrarSesion.setText("Cerrar Sesion");
        mnuItmCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmCerrarSesionActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItmCerrarSesion);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        mnuArchivo.add(jSeparator1);

        mnuItmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mnuItmSalir.setBackground(new java.awt.Color(51, 51, 51));
        mnuItmSalir.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mnuItmSalir.setForeground(new java.awt.Color(204, 204, 204));
        mnuItmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/Exit.png"))); // NOI18N
        mnuItmSalir.setText("Salir");
        mnuItmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuItmSalirMouseClicked(evt);
            }
        });
        mnuItmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItmSalir);

        jMenuBar1.add(mnuArchivo);

        mnuEmpleados.setBackground(new java.awt.Color(51, 51, 51));
        mnuEmpleados.setForeground(new java.awt.Color(204, 204, 204));
        mnuEmpleados.setText("Empleados");
        mnuEmpleados.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        mnuItemGestorEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuItemGestorEmpleado.setBackground(new java.awt.Color(51, 51, 51));
        mnuItemGestorEmpleado.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mnuItemGestorEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        mnuItemGestorEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/gestor empleado.png"))); // NOI18N
        mnuItemGestorEmpleado.setText("Gestor de Empleado");
        mnuItemGestorEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemGestorEmpleadoActionPerformed(evt);
            }
        });
        mnuEmpleados.add(mnuItemGestorEmpleado);

        mnuItmAltaEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        mnuItmAltaEmpleado.setBackground(new java.awt.Color(51, 51, 51));
        mnuItmAltaEmpleado.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mnuItmAltaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        mnuItmAltaEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/user_32.png"))); // NOI18N
        mnuItmAltaEmpleado.setText("Alta de Empleado");
        mnuItmAltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmAltaEmpleadoActionPerformed(evt);
            }
        });
        mnuEmpleados.add(mnuItmAltaEmpleado);

        jMenuBar1.add(mnuEmpleados);

        mnuAsistencia.setBackground(new java.awt.Color(51, 51, 51));
        mnuAsistencia.setForeground(new java.awt.Color(204, 204, 204));
        mnuAsistencia.setText("Asistencia");
        mnuAsistencia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        mnuItmeGestorAsistencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuItmeGestorAsistencia.setBackground(new java.awt.Color(51, 51, 51));
        mnuItmeGestorAsistencia.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mnuItmeGestorAsistencia.setForeground(new java.awt.Color(204, 204, 204));
        mnuItmeGestorAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/asistencia empelado.png"))); // NOI18N
        mnuItmeGestorAsistencia.setText("Gestor de Asistencia");
        mnuItmeGestorAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmeGestorAsistenciaActionPerformed(evt);
            }
        });
        mnuAsistencia.add(mnuItmeGestorAsistencia);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/Modify.png"))); // NOI18N
        jMenuItem1.setText("Borrar Asistencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuAsistencia.add(jMenuItem1);

        jMenuBar1.add(mnuAsistencia);

        mnuEmpresa.setBackground(new java.awt.Color(51, 51, 51));
        mnuEmpresa.setForeground(new java.awt.Color(204, 204, 204));
        mnuEmpresa.setText("Configurarcion");
        mnuEmpresa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        mnuItmConfigurarEmpresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        mnuItmConfigurarEmpresa.setBackground(new java.awt.Color(51, 51, 51));
        mnuItmConfigurarEmpresa.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mnuItmConfigurarEmpresa.setForeground(new java.awt.Color(204, 204, 204));
        mnuItmConfigurarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/home_32.png"))); // NOI18N
        mnuItmConfigurarEmpresa.setText("Configurar Datos de Empresa");
        mnuItmConfigurarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmConfigurarEmpresaActionPerformed(evt);
            }
        });
        mnuEmpresa.add(mnuItmConfigurarEmpresa);

        mnuItmCuentaAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        mnuItmCuentaAdmin.setBackground(new java.awt.Color(51, 51, 51));
        mnuItmCuentaAdmin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mnuItmCuentaAdmin.setForeground(new java.awt.Color(204, 204, 204));
        mnuItmCuentaAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/key_32.png"))); // NOI18N
        mnuItmCuentaAdmin.setText("Cuenta Administrador");
        mnuItmCuentaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItmCuentaAdminActionPerformed(evt);
            }
        });
        mnuEmpresa.add(mnuItmCuentaAdmin);

        jMenuBar1.add(mnuEmpresa);

        mnuAcerca.setBackground(new java.awt.Color(51, 51, 51));
        mnuAcerca.setForeground(new java.awt.Color(204, 204, 204));
        mnuAcerca.setText("Acerca");
        mnuAcerca.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        mnuItmAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        mnuItmAcerca.setBackground(new java.awt.Color(51, 51, 51));
        mnuItmAcerca.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mnuItmAcerca.setForeground(new java.awt.Color(204, 204, 204));
        mnuItmAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/Info.png"))); // NOI18N
        mnuItmAcerca.setText("Acerca");
        mnuAcerca.add(mnuItmAcerca);

        jMenuBar1.add(mnuAcerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void mnuItmConfigurarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmConfigurarEmpresaActionPerformed
   new AltaEmpresa(this,true);
    
}//GEN-LAST:event_mnuItmConfigurarEmpresaActionPerformed

private void cmbElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbElegirActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cmbElegirActionPerformed
private void setearDatos(){
    txtLDni.setText("");
//    txtClave.setText("");
    txtLDni.requestFocus();
}
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       // validar el empleado
       
         try{
       Empleado e = new EmpleadoDaoImp().getEmpleadoDni(Integer.parseInt(txtLDni.getText()));

       if (e!=null) {
        // try{
            //saco foto 
            b.capturarImagen();
            // detengo la camara
            b.getPlayer().stop();
            //capturo el dato si es Entrada o Salida  q eligio el user
            String elegir = (String)cmbElegir.getSelectedItem();
            //guardo la foto en la tabla asistencia
        //  Recupero en byte[] a la imagen , a travez de un puente  
            //1-guardo en fichero :crea img.jpeg donde se encuentra el .jar o sea en la carpeta dist 
            File file = new File(new File ("img.jpeg").getAbsolutePath ()); 
            miPlayer.guardaImagenEnFichero(b.getImagen(), file);
           //2- lo recupero del fichero para poder convertirlo en byte[]
            byte[] bFile = new byte[(int) file.length()];
            try {
                   FileInputStream fileInputStream = new FileInputStream(file);
                   //convert file into array of bytes
                   fileInputStream.read(bFile);
                   fileInputStream.close();
                 } catch (Exception eio) {
                   eio.printStackTrace();
                 }
           // creo el objeto  asitencia              
           Asistencia asistencia = new Asistencia();
           asistencia.setImagen(bFile);
           asistencia.setEstado(elegir);
           asistencia.setEmpleado(e);
           asistencia.setFecha(new Date());
           asistencia.setHora(new Date());
           asistencia.setModificado(false);
           asistencia.setCorrecto(true);
           //agrego ala BD
//           for (int i = 0; i < 1000; i++) {
          new AsistenciaDaoImp().addAsistencia(asistencia);
          // cuando guardo la asistencia automaticamente hibernate completa el campo idAsistencia con su valor
          //luego si quiero saber el numero que le asigno solo consulto al objeto que le pase 
          System.out.println("id asstencia"+ asistencia.getIdAsistencia());
     
//           }
          
                try {
                    // Detengo la aplicacion para que el usuario vea su foto durante 2 segundos y luego reinicio la camara
                     Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Camara.class.getName()).log(Level.SEVERE, null, ex);
                }
           b.getPlayer().start();
          // muestro un mensaje de bienvenida 
         JOptionPane.showMessageDialog(this, "Asociado: "+e.getApellido()+" "+e.getNombre()+"\n"+"DIA : "+ FechaUtil.getFecha_Dia_DD_De_MM_De_AAAA(asistencia.getFecha())+"\n"+"HORA: "+ FechaUtil.getHora(asistencia.getHora()) , asistencia.getEstado(), JOptionPane.INFORMATION_MESSAGE);
            
            //  limpio las cajas de texto                 
              setearDatos();
        
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
  
    private void mnuItmeGestorAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmeGestorAsistenciaActionPerformed
       GestorAsistencia listado = new GestorAsistencia(this, true);
    }//GEN-LAST:event_mnuItmeGestorAsistenciaActionPerformed

    
    
    
    private void mnuItmAltaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmAltaEmpleadoActionPerformed
        AltaEmpleado personal = new AltaEmpleado(this, true);
    }//GEN-LAST:event_mnuItmAltaEmpleadoActionPerformed

    private void mnuItmIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmIniciarSesionActionPerformed
        Login login = new Login(this, true);
        if (login.isBotonAceptar()) {
             setconfigurarcionMenuAdministrador(true);
             setPaneldeControl(false);
             
             
             
        } 
        
        
       
    }//GEN-LAST:event_mnuItmIniciarSesionActionPerformed

    private void txtLDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLDniKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
//           btnIngresarActionPerformed(null);
            cmbElegir.requestFocus();
                        
        }
         else{
             if (evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_PLUS) {
                 btnIngresar.requestFocus();
             } else {
                 if (evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_MINUS) {
                     cmbElegir.requestFocus();
                 }
               
             }
    
         }
        
        
    }//GEN-LAST:event_txtLDniKeyPressed

    private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnIngresarActionPerformed(null);
        }
         else{
             if (evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_PLUS) {
                  cmbElegir.requestFocus();
             } else {
                 if (evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_MINUS) {
                     txtLDni.requestFocus();
                 }
               
             }
    
         }
    }//GEN-LAST:event_btnIngresarKeyPressed

    private void txtLDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLDniKeyTyped
        // conusmir los caracteres del legajo excepto los numeros
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
        
    }//GEN-LAST:event_txtLDniKeyTyped

    private void mnuItemGestorEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemGestorEmpleadoActionPerformed
      GestorEmpleado ventanaGestorEmpleado= new GestorEmpleado(this, true,GestorEmpleado.MENU);
       
    }//GEN-LAST:event_mnuItemGestorEmpleadoActionPerformed

    private void txtLDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLDniActionPerformed

    private void mnuItmCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmCerrarSesionActionPerformed
       setconfigurarcionMenuAdministrador(false);
       setPaneldeControl(true);
        
    }//GEN-LAST:event_mnuItmCerrarSesionActionPerformed

private void cmbElegirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbElegirKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnIngresar.requestFocus();
        }
         else{
             if (evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_PLUS) {
                  cmbElegir.requestFocus();
             } else {
                 if (evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_MINUS  ) {
                     txtLDni.requestFocus();
                 }
               
             }
    
         }
      
}//GEN-LAST:event_cmbElegirKeyPressed

private void mnuItmCuentaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmCuentaAdminActionPerformed
      GestorAdministriador ventanaGestAdmin = new GestorAdministriador(this, true);
      
}//GEN-LAST:event_mnuItmCuentaAdminActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   BorrarAsistencia ventanaBorrarAsis = new BorrarAsistencia(this, true);
   
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuItmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItmSalirActionPerformed
 
             
    }//GEN-LAST:event_mnuItmSalirActionPerformed

    private void mnuItmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuItmSalirMouseClicked

    }//GEN-LAST:event_mnuItmSalirMouseClicked
       
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelCustom lblFecha;
    private javax.swing.JLabel lblNameSistema;
    private javax.swing.JLabel lbliconEmpresa;
    private javax.swing.JMenu mnuAcerca;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAsistencia;
    private javax.swing.JMenu mnuEmpleados;
    private javax.swing.JMenu mnuEmpresa;
    private javax.swing.JMenuItem mnuItemGestorEmpleado;
    private javax.swing.JMenuItem mnuItmAcerca;
    private javax.swing.JMenuItem mnuItmAltaEmpleado;
    private javax.swing.JMenuItem mnuItmCerrarSesion;
    private javax.swing.JMenuItem mnuItmConfigurarEmpresa;
    private javax.swing.JMenuItem mnuItmCuentaAdmin;
    private javax.swing.JMenuItem mnuItmIniciarSesion;
    private javax.swing.JMenuItem mnuItmSalir;
    private javax.swing.JMenuItem mnuItmeGestorAsistencia;
    private javax.swing.JPanel panelCam;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelInicio;
    private org.edisoncor.gui.varios.TitleBar titleBar1;
    private org.edisoncor.gui.textField.TextFieldRectIcon txtLDni;
    // End of variables declaration//GEN-END:variables

}
