/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Nathanael
 */
public class StartScreen extends javax.swing.JFrame {

    /**
     * Creates new form clientIdentification
     */
    public StartScreen() {
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

        jPanel1 = new javax.swing.JPanel();
        txtCredito = new javax.swing.JTextField();
        btnZerar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblOrientacao1 = new javax.swing.JLabel();
        btn10Reais = new javax.swing.JButton();
        btn2Reais = new javax.swing.JButton();
        btn5Reais = new javax.swing.JButton();
        btn20Reais = new javax.swing.JButton();
        btn1Real = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insersão de crédito");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(197, 55, 60));

        txtCredito.setEditable(false);
        txtCredito.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        txtCredito.setText("R$ 0,00");
        txtCredito.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnZerar.setBackground(new java.awt.Color(0, 0, 0));
        btnZerar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnZerar.setForeground(new java.awt.Color(255, 255, 255));
        btnZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZerarActionPerformed(evt);
            }
        });

        btnContinuar.setBackground(new java.awt.Color(0, 0, 0));
        btnContinuar.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        lblOrientacao1.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        lblOrientacao1.setForeground(new java.awt.Color(255, 255, 255));
        lblOrientacao1.setText("Caro cliente, por favor, deposite o crédito desejado:");

        btn10Reais.setBackground(new java.awt.Color(245, 239, 223));
        btn10Reais.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btn10Reais.setText("R$ 10,00");
        btn10Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ReaisActionPerformed(evt);
            }
        });

        btn2Reais.setBackground(new java.awt.Color(245, 239, 223));
        btn2Reais.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btn2Reais.setText("R$ 2,00");
        btn2Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ReaisActionPerformed(evt);
            }
        });

        btn5Reais.setBackground(new java.awt.Color(245, 239, 223));
        btn5Reais.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btn5Reais.setText("R$ 5,00");
        btn5Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ReaisActionPerformed(evt);
            }
        });

        btn20Reais.setBackground(new java.awt.Color(245, 239, 223));
        btn20Reais.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btn20Reais.setText("R$ 20,00");
        btn20Reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ReaisActionPerformed(evt);
            }
        });

        btn1Real.setBackground(new java.awt.Color(245, 239, 223));
        btn1Real.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        btn1Real.setText("R$ 1,00");
        btn1Real.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1RealActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btn1Real, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn20Reais, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(btn10Reais, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn5Reais, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(btn2Reais, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(74, 74, 74)
                            .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblOrientacao1)))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblOrientacao1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn20Reais)
                            .addComponent(btn10Reais))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5Reais)
                            .addComponent(btn2Reais))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCredito)
                            .addComponent(btnZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addComponent(btn1Real)
                .addGap(38, 38, 38)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    MachineInterface maquinaDeVendas = new MachineInterface();
    DecimalFormat creditoFormat = new DecimalFormat("R$ 0.00");
    
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

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if((getCredito()>0)){
            maquinaDeVendas = new MachineInterface();
            maquinaDeVendas.setSaldo(getCredito());
            maquinaDeVendas.setVisible(true);
            this.setVisible(false);   
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Para continuar, é necessário inserir algum crédito.");
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZerarActionPerformed
        txtCredito.setText(creditoFormat.format(0));
    }//GEN-LAST:event_btnZerarActionPerformed
    
    private double getCredito(){
        double credito = Double.parseDouble(txtCredito.getText().replace(",", ".").replace("R$ ", ""));
        return credito;
    }
    private void adicionarCredito(double valor){
        double credito = Double.parseDouble(txtCredito.getText().replace(",", ".").replace("R$ ", "")) + valor;
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
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
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
    private javax.swing.JButton btnZerar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOrientacao1;
    private javax.swing.JTextField txtCredito;
    // End of variables declaration//GEN-END:variables
}