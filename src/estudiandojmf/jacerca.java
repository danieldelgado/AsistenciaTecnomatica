/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jacerca.java
 *
 * Created on 15/06/2010, 08:40:17 PM
 */

package estudiandojmf;

/**
 *
 * @author Cmop
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("http://cmop17.wordpress.com");

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 14));
        jTextArea1.setForeground(new java.awt.Color(204, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("           ..Na...\n     .,\" .d4#HMMMMM@`\n   .M3..M@ ,%   `?`\n  JM! JMM@ .%           ...    .,     .,          .J.        .,    .,\n JM$  JMM@ .%         .dMMMr.,MMMN, .MMMN.\"   ..NMMMMMNa,  JMMMb .MMMM,\n.MM|  JMM@ .%           dMM@^  dMM#=  JMM@    dMMr  `WMM$   .MMM\"  ,MMM\n.MML  JMMF .%           JMMF   JMMF   JMMF    dMMr   JMM$   .MMN    MMM\n.MMM, JM3  .%           JMMF   JMMF   JMMF    dMMr   JMM$   .MMN    MMM\n JMMMg=    .%       .   JMMF   JMMF   JMMF    dMMr   JMM$   .MMN    MMM\n  JMMMNa,  .%    .JM^   JMMF   JMMF   JMMb    dMML,  JMM$  ..MMN..  MMM\n    7MMMMMMMNNMMM#=    .MMMM; .MMMM|  ,MMMk3 ,T\"MMMMNMM9'  \"TMMMMMMMM\"`\n       ?\"\"\"\"\"\"\"`         T\"     7\"     .\"'        `T=       .MMN ?\"'\n                                                            .MMM,\n                                                            '  ?5,");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("\"Porque busco la libertad que sólo en el conocimiento se puede encontrar\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-630)/2, (screenSize.height-402)/2, 630, 402);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
