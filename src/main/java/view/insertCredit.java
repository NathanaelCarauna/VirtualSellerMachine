/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormat;


/**
 *
 * @author Nathanael
 */
public class insertCredit extends javax.swing.JFrame {

    /**
     * Creates new form clientIdentification
     */
    public insertCredit() {
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

        btn20Reais = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btn10Reais = new javax.swing.JButton();
        btn5Reais = new javax.swing.JButton();
        btn2Reais = new javax.swing.JButton();
        btn1Real = new javax.swing.JButton();
        lblOrientacao1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblReal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCredito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insersão de crédito");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn20Reais.setBackground(new java.awt.Color(204, 204, 255));
        btn20Reais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn20Reais.setText("R$ 20,00");
        btn20Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ReaisActionPerformed(evt);
            }
        });
        getContentPane().add(btn20Reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        btnContinuar.setBackground(new java.awt.Color(153, 255, 153));
        btnContinuar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 350, 40));

        btn10Reais.setBackground(new java.awt.Color(204, 204, 255));
        btn10Reais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn10Reais.setText("R$ 10,00");
        btn10Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ReaisActionPerformed(evt);
            }
        });
        getContentPane().add(btn10Reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, -1));

        btn5Reais.setBackground(new java.awt.Color(204, 204, 255));
        btn5Reais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn5Reais.setText("R$ 5,00");
        btn5Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ReaisActionPerformed(evt);
            }
        });
        getContentPane().add(btn5Reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        btn2Reais.setBackground(new java.awt.Color(204, 204, 255));
        btn2Reais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn2Reais.setText("R$ 2,00");
        btn2Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ReaisActionPerformed(evt);
            }
        });
        getContentPane().add(btn2Reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, -1));

        btn1Real.setBackground(new java.awt.Color(204, 204, 255));
        btn1Real.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn1Real.setText("R$ 1,00");
        btn1Real.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1RealActionPerformed(evt);
            }
        });
        getContentPane().add(btn1Real, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 116, -1));

        lblOrientacao1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOrientacao1.setText("Caro cliente, por favor, deposite o crédito desejado:");
        getContentPane().add(lblOrientacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblReal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblReal.setText("R$");

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCredito.setEditable(false);
        txtCredito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCredito.setText("0,00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(lblReal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReal))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn10ReaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ReaisActionPerformed
        adicionarCredito(10.00);
    }//GEN-LAST:event_btn10ReaisActionPerformed

    private void btn20ReaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ReaisActionPerformed
        adicionarCredito(20.00);
    }//GEN-LAST:event_btn20ReaisActionPerformed

    private void btn5ReaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ReaisActionPerformed
        adicionarCredito(5.00);
    }//GEN-LAST:event_btn5ReaisActionPerformed

    private void btn2ReaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ReaisActionPerformed
        adicionarCredito(2.00);
    }//GEN-LAST:event_btn2ReaisActionPerformed

    private void btn1RealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1RealActionPerformed
        adicionarCredito(1.00);
    }//GEN-LAST:event_btn1RealActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtCredito.setText("0,00");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        MachineInterface maquinaDeVendas = new MachineInterface();
        maquinaDeVendas.setSaldo(getCredito());
        maquinaDeVendas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed
    
    private double getCredito(){
        double credito = Double.parseDouble(txtCredito.getText().replace(",", "."));
        return credito;
    }
    private void adicionarCredito(double valor){
        DecimalFormat creditoFormat = new DecimalFormat("00.00");
        double credito = Double.parseDouble(txtCredito.getText().replace(",", ".")) + valor;
        txtCredito.setText(creditoFormat.format(credito));
    }
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
            java.util.logging.Logger.getLogger(insertCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertCredit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10Reais;
    private javax.swing.JButton btn1Real;
    private javax.swing.JButton btn20Reais;
    private javax.swing.JButton btn2Reais;
    private javax.swing.JButton btn5Reais;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOrientacao1;
    private javax.swing.JLabel lblReal;
    private javax.swing.JTextField txtCredito;
    // End of variables declaration//GEN-END:variables
}
