/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıqpuzzlerpro;

import javax.swing.JButton;

/**
 *
 * @author zeynep
 */
public class SelectBoardPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelectBoardPanel
     */
    public SelectBoardPanel() {
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

        BackButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        blackButton = new javax.swing.JButton();
        grayButton = new javax.swing.JButton();
        b3dButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setPreferredSize(new java.awt.Dimension(1600, 900));
        setLayout(null);

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 0, 0));
        BackButton.setText("Back");
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        add(BackButton);
        BackButton.setBounds(50, 50, 80, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 200, 30);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        blackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        blackButton.setForeground(new java.awt.Color(255, 0, 51));
        blackButton.setText("Black Board");
        blackButton.setContentAreaFilled(false);
        blackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(blackButton);

        grayButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        grayButton.setForeground(new java.awt.Color(255, 0, 51));
        grayButton.setText("Gray Board");
        grayButton.setContentAreaFilled(false);
        grayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayButtonActionPerformed(evt);
            }
        });
        jPanel1.add(grayButton);

        b3dButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b3dButton.setForeground(new java.awt.Color(255, 0, 51));
        b3dButton.setText("3D Board");
        b3dButton.setContentAreaFilled(false);
        b3dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3dButtonActionPerformed(evt);
            }
        });
        jPanel1.add(b3dButton);

        add(jPanel1);
        jPanel1.setBounds(160, 350, 1160, 80);

        jPanel2.setFocusable(false);
        jPanel2.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ıqpuzzlerpro/Images/board.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ıqpuzzlerpro/Images/gri board.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ıqpuzzlerpro/Images/black board.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addGap(119, 119, 119)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(41, 41, 41))
        );

        add(jPanel2);
        jPanel2.setBounds(140, 450, 1200, 260);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ıqpuzzlerpro/Images/background_Other_1600x900.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1600, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void blackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blackButtonActionPerformed

    private void grayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grayButtonActionPerformed

    private void b3dButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3dButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3dButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton b3dButton;
    private javax.swing.JButton blackButton;
    private javax.swing.JButton grayButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public JButton getBackButton()
    {
        return BackButton;
    }
    
    public JButton getBlackBoardButton()
    {
        return blackButton;
    }
    public JButton getGrayBoardButton()
    {
        return grayButton;
    }
    public JButton getb3DBoardButton()
    {
        return b3dButton;
    }

}
