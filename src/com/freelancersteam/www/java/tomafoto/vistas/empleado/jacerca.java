/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jacerca.java
 *
 * Created on 15/06/2010, 08:40:17 PM
 */

package com.freelancersteam.www.java.tomafoto.vistas.empleado;

/**
 *
 * @author LEO
 */
public class jacerca extends javax.swing.JDialog {

    /** Creates new form jacerca */
    public jacerca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucidoComplete1 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        panelCurves2 = new org.edisoncor.gui.panel.PanelCurves();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca");

        panelRectTranslucidoComplete1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        panelRectTranslucidoComplete1.setOpaque(false);

        labelMetric1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric1.setText("DISEÑADO Y CREADO POR");
        labelMetric1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

        labelMetric2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric2.setText("JOEL PELAEZ  Y  LEONARDO CAMPOS");
        labelMetric2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

        labelMetric4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric4.setText("FREELANCERS TEAM");
        labelMetric4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

        javax.swing.GroupLayout panelRectTranslucidoComplete1Layout = new javax.swing.GroupLayout(panelRectTranslucidoComplete1);
        panelRectTranslucidoComplete1.setLayout(panelRectTranslucidoComplete1Layout);
        panelRectTranslucidoComplete1Layout.setHorizontalGroup(
            panelRectTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelCurves2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(panelRectTranslucidoComplete1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetric4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRectTranslucidoComplete1Layout.setVerticalGroup(
            panelRectTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(labelMetric2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelMetric4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCurves2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucidoComplete1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucidoComplete1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(630, 402));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.panel.PanelCurves panelCurves2;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete1;
    // End of variables declaration//GEN-END:variables

}
