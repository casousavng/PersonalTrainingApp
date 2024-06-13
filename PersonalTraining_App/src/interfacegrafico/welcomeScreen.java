/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacegrafico;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Casa
 */
public class welcomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form welcomeScreen
     */
    public welcomeScreen() {
        initComponents();
        
        // Tamanho do JFrame
        setSize(500, 400);
        // Bloquear a possibilidade de fazer resize
        setResizable(false);
        // Pre-definir o que faz o botao de fecho
        setDefaultCloseOperation(welcomeScreen.EXIT_ON_CLOSE);
        // Centralizar o JFrame no meio da tela
        setLocationRelativeTo(null);
        
        ImageIcon imagem = new ImageIcon(getClass().getResource("/images/logo_noback.png"));
     
        jLabel1.setIcon(imagem);
        
        fecharComDelay();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fitness APP - Movimenta-te");
        setBackground(jLabel1.getBackground());
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(494, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(394, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(welcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomeScreen().setVisible(true);
            }
        });
    }
    
    private void fecharComDelay() {
        
        // Criar um temporizador com um atraso de 2 segundos (2000 milissegundos)
        Timer temporizador = new Timer(2000, (ActionEvent e) -> {
            // Fechar o JFrame após o atraso e chamar o menu seguinte
            dispose();
            primeiroMenu.main(); // janela que abre a seguir ao welcomeScreen
            
        });
        // Iniciar o temporizador
        temporizador.setRepeats(false); // Para garantir que só seja executado uma vez
        temporizador.start();
      

        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}