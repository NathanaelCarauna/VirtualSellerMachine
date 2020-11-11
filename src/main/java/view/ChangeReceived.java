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
        lblAgradecimento1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTroco = new javax.swing.JTextArea();
        btnNovaCompra = new javax.swing.JButton();
        btnNovaCompra1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seu troco");

        lblAgradecimento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAgradecimento.setText("Muito Obrigado por comprar conosco!");

        lblAgradecimento1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAgradecimento1.setText("Segue o seu troco:");

        txtAreaTroco.setColumns(20);
        txtAreaTroco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAreaTroco.setRows(5);
        jScrollPane1.setViewportView(txtAreaTroco);

        btnNovaCompra.setBackground(new java.awt.Color(153, 255, 153));
        btnNovaCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovaCompra.setText("Nova compra");

        btnNovaCompra1.setBackground(new java.awt.Color(255, 204, 204));
        btnNovaCompra1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovaCompra1.setText("Encerrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovaCompra1)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovaCompra))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAgradecimento)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAgradecimento1)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblAgradecimento)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgradecimento1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaCompra)
                    .addComponent(btnNovaCompra1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
    private javax.swing.JButton btnNovaCompra;
    private javax.swing.JButton btnNovaCompra1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgradecimento;
    private javax.swing.JLabel lblAgradecimento1;
    private javax.swing.JTextArea txtAreaTroco;
    // End of variables declaration//GEN-END:variables
}