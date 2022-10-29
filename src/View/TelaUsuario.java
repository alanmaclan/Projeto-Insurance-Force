
package View;


public class TelaUsuario extends javax.swing.JFrame {

    
    public TelaUsuario() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacaoUsuario = new javax.swing.JLabel();
        lblNomeCompleto = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblIconUsuario = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblIconFormulario = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        btnInformacaoSeguro = new javax.swing.JButton();
        lblIconAtendente = new javax.swing.JLabel();
        btnFalarAtendente = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblFundoTelaUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblSaudacaoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 260, 30));

        lblNomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNomeCompleto.setForeground(new java.awt.Color(0, 0, 204));
        lblNomeCompleto.setText("n");
        getContentPane().add(lblNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, 30));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 204));
        lblEmail.setText("e");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 110, 30));

        lblIconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/icone usuario.png"))); // NOI18N
        getContentPane().add(lblIconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, 80));

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(0, 0, 204));
        lblCpf.setText("c");
        getContentPane().add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, 30));

        lblIconFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/icone formulario.png"))); // NOI18N
        getContentPane().add(lblIconFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 90));

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(0, 0, 204));
        lblEndereco.setText("end");
        getContentPane().add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 180, 30));

        btnInformacaoSeguro.setBackground(new java.awt.Color(153, 204, 255));
        btnInformacaoSeguro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInformacaoSeguro.setForeground(new java.awt.Color(0, 0, 204));
        btnInformacaoSeguro.setText("Informações do seguro");
        getContentPane().add(btnInformacaoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 200, 30));

        lblIconAtendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/Atendente.PNG"))); // NOI18N
        getContentPane().add(lblIconAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 60));

        btnFalarAtendente.setBackground(new java.awt.Color(153, 204, 255));
        btnFalarAtendente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFalarAtendente.setForeground(new java.awt.Color(0, 0, 204));
        btnFalarAtendente.setText("Fale com um atendente");
        getContentPane().add(btnFalarAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 382, 200, 30));

        btnSair.setBackground(new java.awt.Color(51, 153, 255));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 90, 30));

        lblFundoTelaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela de fundo admin.png"))); // NOI18N
        getContentPane().add(lblFundoTelaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFalarAtendente;
    private javax.swing.JButton btnInformacaoSeguro;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFundoTelaUsuario;
    private javax.swing.JLabel lblIconAtendente;
    private javax.swing.JLabel lblIconFormulario;
    private javax.swing.JLabel lblIconUsuario;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblSaudacaoUsuario;
    // End of variables declaration//GEN-END:variables
}
