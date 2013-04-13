/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Leo
 */
public class ListadoPersonal extends javax.swing.JDialog {

    /**
     * Creates new form ListadoPersonal
     */
    public ListadoPersonal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelTranslucidoComplete21 = new org.edisoncor.gui.panel.PanelTranslucidoComplete2();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        cmbBusqueda = new org.edisoncor.gui.comboBox.ComboBoxRound();
        txtBusqueda = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        rdbHoy = new javax.swing.JRadioButton();
        rdbActual = new javax.swing.JRadioButton();
        rdbFecha = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        datInicio = new com.toedter.calendar.JDateChooser();
        datFin = new com.toedter.calendar.JDateChooser();
        btnBuscar = new org.edisoncor.gui.button.ButtonIpod();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListado = new org.jdesktop.swingx.JXTable();
        buttonIpod2 = new org.edisoncor.gui.button.ButtonIpod();
        buttonIpod3 = new org.edisoncor.gui.button.ButtonIpod();
        buttonIpod4 = new org.edisoncor.gui.button.ButtonIpod();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelTranslucidoComplete21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSQUEDA DE EMPLEADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 28))); // NOI18N
        panelTranslucidoComplete21.setOpaque(false);

        labelMetric1.setText("Busqueda");

        cmbBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE UNA OPCION", "APELLIDO", "LEGAJO" }));
        cmbBusqueda.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        panelShadow1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTRO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        panelShadow1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rdbHoy);
        rdbHoy.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rdbHoy.setText("Hoy");
        panelShadow1.add(rdbHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        buttonGroup1.add(rdbActual);
        rdbActual.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rdbActual.setText("Mes Actual");
        panelShadow1.add(rdbActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        rdbFecha.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdbFecha);
        rdbFecha.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rdbFecha.setText("Entre las Fechas");
        panelShadow1.add(rdbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Y");
        panelShadow1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        datInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datInicio.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        panelShadow1.add(datInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 130, -1));

        datFin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datFin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        datFin.setMaxSelectableDate(new java.util.Date(253370775670000L));
        panelShadow1.add(datFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 130, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BUSCAR2.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");

        tblListado.setBackground(new java.awt.Color(135, 133, 133));
        tblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblListado);

        buttonIpod2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMPRIMIR.jpg"))); // NOI18N
        buttonIpod2.setText("IMPRIMIR");

        buttonIpod3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PDF1.png"))); // NOI18N
        buttonIpod3.setText("PDF");

        buttonIpod4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SALIR.jpg"))); // NOI18N
        buttonIpod4.setText("SALIR");

        javax.swing.GroupLayout panelTranslucidoComplete21Layout = new javax.swing.GroupLayout(panelTranslucidoComplete21);
        panelTranslucidoComplete21.setLayout(panelTranslucidoComplete21Layout);
        panelTranslucidoComplete21Layout.setHorizontalGroup(
            panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                        .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(buttonIpod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209)
                                .addComponent(buttonIpod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(228, 228, 228)
                                .addComponent(buttonIpod4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        panelTranslucidoComplete21Layout.setVerticalGroup(
            panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonIpod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonIpod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonIpod4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucidoComplete21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTranslucidoComplete21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListadoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListadoPersonal dialog = new ListadoPersonal(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonIpod btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.edisoncor.gui.button.ButtonIpod buttonIpod2;
    private org.edisoncor.gui.button.ButtonIpod buttonIpod3;
    private org.edisoncor.gui.button.ButtonIpod buttonIpod4;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbBusqueda;
    private com.toedter.calendar.JDateChooser datFin;
    private com.toedter.calendar.JDateChooser datInicio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    private org.edisoncor.gui.panel.PanelTranslucidoComplete2 panelTranslucidoComplete21;
    private javax.swing.JRadioButton rdbActual;
    private javax.swing.JRadioButton rdbFecha;
    private javax.swing.JRadioButton rdbHoy;
    private org.jdesktop.swingx.JXTable tblListado;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
