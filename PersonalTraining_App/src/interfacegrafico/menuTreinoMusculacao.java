/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacegrafico;

/**
 *
 * @author Casa
 */
public class menuTreinoMusculacao extends javax.swing.JFrame {

    /**
     * Creates new form welcomeScreen
     */
    public menuTreinoMusculacao() {
        initComponents();
        
        // Tamanho do JFrame
        setSize(500, 400);
        // Bloquear a possibilidade de fazer resize
        setResizable(false);
        // Pre-definir o que faz o botao de fecho
        setDefaultCloseOperation(menuTreinoMusculacao.EXIT_ON_CLOSE);
        // Centralizar o JFrame no meio da tela
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botaoTreinoUpperB = new javax.swing.JButton();
        botaoTreinoLowerB = new javax.swing.JButton();
        botaoTreinoFullB = new javax.swing.JButton();
        botaoMenuAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fitness APP - Movimenta-te");
        setBackground(jLabel1.getBackground());
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha uma das opções:");
        getContentPane().add(jLabel1);

        botaoTreinoUpperB.setText("TREINO UPPER BODY");
        botaoTreinoUpperB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTreinoUpperBActionPerformed(evt);
            }
        });
        getContentPane().add(botaoTreinoUpperB);

        botaoTreinoLowerB.setText("TREINO LOWER BODY");
        botaoTreinoLowerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTreinoLowerBActionPerformed(evt);
            }
        });
        getContentPane().add(botaoTreinoLowerB);

        botaoTreinoFullB.setText("TREINO FULL BODY");
        botaoTreinoFullB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTreinoFullBActionPerformed(evt);
            }
        });
        getContentPane().add(botaoTreinoFullB);

        botaoMenuAnterior.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        botaoMenuAnterior.setText("VOLTAR AO MENU ANTERIOR");
        botaoMenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMenuAnterior);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTreinoLowerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTreinoLowerBActionPerformed
        dispose();
        outputTreinoPersonalizado.main("Musculação LowerBody");
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoTreinoLowerBActionPerformed

    private void botaoTreinoFullBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTreinoFullBActionPerformed
        dispose();
        outputTreinoPersonalizado.main("Musculação FullBody");
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoTreinoFullBActionPerformed

    private void botaoTreinoUpperBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTreinoUpperBActionPerformed
        dispose();
        outputTreinoPersonalizado.main("Musculação UpperBody");
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoTreinoUpperBActionPerformed

    private void botaoMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuAnteriorActionPerformed
        dispose();
        menuTreinoPersonalizado.main();
    }//GEN-LAST:event_botaoMenuAnteriorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(menuTreinoMusculacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuTreinoMusculacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuTreinoMusculacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuTreinoMusculacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new menuTreinoMusculacao().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMenuAnterior;
    private javax.swing.JButton botaoTreinoFullB;
    private javax.swing.JButton botaoTreinoLowerB;
    private javax.swing.JButton botaoTreinoUpperB;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}