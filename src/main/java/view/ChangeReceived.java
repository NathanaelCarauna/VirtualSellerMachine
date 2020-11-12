/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Nathanael
 */
public class ChangeReceived extends javax.swing.JFrame {

    /**
     * Creates new form TrocoRecebido
     */
    public ChangeReceived() {
        initComponents();
    }
    
    public void escreverNaTela(String mensagem){
        txtAreaTroco.setText(txtAreaTroco.getText()+mensagem);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgradecimento = new javax.swing.JLabel();
        lblTroco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTroco = new javax.swing.JTextArea();
        btnNovaCompra = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaProdutos = new javax.swing.JTextArea();
        lblProdutos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seu troco");

        lblAgradecimento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAgradecimento.setText("Muito Obrigado por comprar conosco!");

        lblTroco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTroco.setText("Troco");

        txtAreaTroco.setEditable(false);
        txtAreaTroco.setColumns(20);
        txtAreaTroco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAreaTroco.setRows(5);
        jScrollPane1.setViewportView(txtAreaTroco);

        btnNovaCompra.setBackground(new java.awt.Color(153, 255, 153));
        btnNovaCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovaCompra.setText("Nova compra");
        btnNovaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCompraActionPerformed(evt);
            }
        });

        btnEncerrar.setBackground(new java.awt.Color(255, 204, 204));
        btnEncerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEncerrar.setText("Encerrar");
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });

        txtAreaProdutos.setEditable(false);
        txtAreaProdutos.setColumns(20);
        txtAreaProdutos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAreaProdutos.setRows(5);
        jScrollPane2.setViewportView(txtAreaProdutos);

        lblProdutos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProdutos.setText("Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAgradecimento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblProdutos)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEncerrar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnNovaCompra))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTroco)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblAgradecimento)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTroco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaCompra)
                    .addComponent(btnEncerrar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    insertCredit telaDeCredito;
    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnNovaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCompraActionPerformed
        telaDeCredito = new insertCredit();
        telaDeCredito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovaCompraActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeReceived.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeReceived.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeReceived.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeReceived.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeReceived().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnNovaCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgradecimento;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblTroco;
    private javax.swing.JTextArea txtAreaProdutos;
    private javax.swing.JTextArea txtAreaTroco;
    // End of variables declaration//GEN-END:variables
}
