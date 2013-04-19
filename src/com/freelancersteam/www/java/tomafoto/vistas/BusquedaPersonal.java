/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.vistas;

import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import com.freelancersteam.www.java.tomafoto.dominio.dao.EmpleadoDao;
import com.freelancersteam.www.java.tomafoto.dominio.dao.imp.EmpleadoDaoImp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo
 */
public class BusquedaPersonal extends javax.swing.JDialog {
    private DefaultTableModel modelo;
    private List<Empleado> listaEmpleado;
    private boolean seleccionado;
    private int legajo;
    EmpleadoDao empleados = new EmpleadoDaoImp();
   
    public BusquedaPersonal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarTablaConEmpleado();
        setLocationRelativeTo(this);
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTranslucidoComplete21 = new org.edisoncor.gui.panel.PanelTranslucidoComplete2();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new org.jdesktop.swingx.JXTable();
        btnSeleccion = new org.edisoncor.gui.button.ButtonIpod();
        txtEmpleado = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        btnCancelar = new org.edisoncor.gui.button.ButtonIpod();
        btnBuscar = new org.edisoncor.gui.button.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelTranslucidoComplete21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSQUEDA DE PERSONAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 28))); // NOI18N
        panelTranslucidoComplete21.setOpaque(false);

        tblEmpleado.setBackground(new java.awt.Color(135, 133, 133));
        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LEGAJO", "EMPLEADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleado.setGridColor(new java.awt.Color(255, 255, 255));
        tblEmpleado.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblEmpleado);

        btnSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OK.jpg"))); // NOI18N
        btnSeleccion.setText("Seleccionar");
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });

        txtEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpleadoKeyPressed(evt);
            }
        });

        labelMetric1.setText("Empleado");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CANCEL3.jpg"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(java.awt.SystemColor.controlDkShadow);
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTranslucidoComplete21Layout = new javax.swing.GroupLayout(panelTranslucidoComplete21);
        panelTranslucidoComplete21.setLayout(panelTranslucidoComplete21Layout);
        panelTranslucidoComplete21Layout.setHorizontalGroup(
            panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                        .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoComplete21Layout.createSequentialGroup()
                        .addComponent(btnSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelTranslucidoComplete21Layout.setVerticalGroup(
            panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucidoComplete21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucidoComplete21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isBotonSeleccionado() {
        return seleccionado;
    }

    public int getLegajo() {
        return legajo;
    }

    
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        
        int fila = tblEmpleado.getSelectedRow();
        if (fila== -1) {
            // no se selecciono ninguna fila de la lista
            JOptionPane.showMessageDialog(null, "debes seleccionar un Empleado ", "Informacion",JOptionPane.INFORMATION_MESSAGE);
        } else {
            seleccionado = true;
            modelo = (DefaultTableModel)tblEmpleado.getModel();
            legajo = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
            this.dispose();
        }
    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void txtEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoKeyPressed
        
    }//GEN-LAST:event_txtEmpleadoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // filtrar las coincidencias con el contenido de la caja de texto
        if ( txtEmpleado.getText().trim().isEmpty()) {
          listaEmpleado = filtrarPorNombreEmpleado(empleados.listarEmpleado(),txtEmpleado.getText()); 
          com.freelancersteam.www.java.tomafoto.util.TablaUtil.prepararTablaEmpleado(modelo, tblEmpleado);
          com.freelancersteam.www.java.tomafoto.util.TablaUtil.cargarModeloEmpleado(modelo, listaEmpleado, tblEmpleado);
        }else{
 
        listaEmpleado = filtrarPorNombreEmpleado(empleados.listarEmpleado(),txtEmpleado.getText()); 
        com.freelancersteam.www.java.tomafoto.util.TablaUtil.prepararTablaEmpleado(modelo, tblEmpleado);
        com.freelancersteam.www.java.tomafoto.util.TablaUtil.cargarModeloEmpleado(modelo, listaEmpleado, tblEmpleado);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusquedaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BusquedaPersonal dialog = new BusquedaPersonal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound btnBuscar;
    private org.edisoncor.gui.button.ButtonIpod btnCancelar;
    private org.edisoncor.gui.button.ButtonIpod btnSeleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.PanelTranslucidoComplete2 panelTranslucidoComplete21;
    private org.jdesktop.swingx.JXTable tblEmpleado;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtEmpleado;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaConEmpleado() {
//       EmpleadoDao empleados = new EmpleadoDaoImp();
       listaEmpleado = empleados.listarEmpleado();
       com.freelancersteam.www.java.tomafoto.util.TablaUtil.prepararTablaEmpleado(modelo, tblEmpleado);
       com.freelancersteam.www.java.tomafoto.util.TablaUtil.cargarModeloEmpleado(modelo, listaEmpleado, tblEmpleado);
    }

    private List<Empleado> filtrarPorNombreEmpleado(List<Empleado> listaEmpleado, String text) {
         List<Empleado> list = new ArrayList<Empleado>();
         for (Empleado empleado : listaEmpleado) {
             if (empleado.getApellido().contains(text)||empleado.getNombre().contains(text)) {
                 list.add(empleado);
             }
        }
         return list;
    }
}