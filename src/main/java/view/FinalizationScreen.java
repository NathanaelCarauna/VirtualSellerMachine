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
public class FinalizationScreen extends javax.swing.JFrame {

    /**
     * Creates new form TrocoRecebido
     */
    public FinalizationScreen() {
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

        lblAgradecimento = new javax.swing.JLabel();
        lblTroco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTroco = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaProdutos = new javax.swing.JTextArea();
        lblProdutos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEncerrar = new javax.swing.JButton();
        btnNovaCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seu troco");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgradecimento.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        lblAgradecimento.setForeground(new java.awt.Color(255, 255, 255));
        lblAgradecimento.setText("Muito Obrigado por comprar conosco!");
        getContentPane().add(lblAgradecimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 53, -1, -1));

        lblTroco.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        lblTroco.setForeground(new java.awt.Color(255, 255, 255));
        lblTroco.setText("Troco");
        getContentPane().add(lblTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 116, -1, -1));

        txtAreaTroco.setEditable(false);
        txtAreaTroco.setBackground(new java.awt.Color(0, 0, 0));
        txtAreaTroco.setColumns(20);
        txtAreaTroco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAreaTroco.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaTroco.setRows(5);
        jScrollPane1.setViewportView(txtAreaTroco);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 140, 335, 163));

        txtAreaProdutos.setEditable(false);
        txtAreaProdutos.setBackground(new java.awt.Color(0, 0, 0));
        txtAreaProdutos.setColumns(20);
        txtAreaProdutos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAreaProdutos.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaProdutos.setRows(5);
        jScrollPane2.setViewportView(txtAreaProdutos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 140, 335, 163));

        lblProdutos.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setText("Produtos adquiridos:");
        getContentPane().add(lblProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 116, -1, -1));

        jPanel1.setBackground(new java.awt.Color(197, 55, 60));

        btnEncerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnEncerrar.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        btnEncerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEncerrar.setText("Encerrar");
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });

        btnNovaCompra.setBackground(new java.awt.Color(0, 0, 0));
        btnNovaCompra.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        btnNovaCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaCompra.setText("Nova compra");
        btnNovaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCompraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Unispace", 2, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nós não nos responsabilizamos por qualquer consequência do uso desses produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnNovaCompra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    StartScreen telaDeCredito;
    
    public void escreverNaTela(String mensagem, int numeroTela){
        if(numeroTela == 1){
            txtAreaProdutos.setText(txtAreaProdutos.getText() + mensagem);
        }
        if(numeroTela == 2){
            txtAreaTroco.setText(txtAreaTroco.getText()+mensagem);
        }
    }
    
    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnNovaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCompraActionPerformed
        telaDeCredito = new StartScreen();
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
            java.util.logging.Logger.getLogger(FinalizationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalizationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalizationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalizationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizationScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnNovaCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgradecimento;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblTroco;
    private javax.swing.JTextArea txtAreaProdutos;
    private javax.swing.JTextArea txtAreaTroco;
    // End of variables declaration//GEN-END:variables
}
