/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacegrafico;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.Timer;
import personaltraining_app.services.UsuariosService;
import personaltraining_app.exercicios.Usuario;

public class saudeIMC extends javax.swing.JFrame {
    
    public saudeIMC() {
        initComponents();
        
        // Tamanho do JFrame
        setSize(500, 400);
        // Bloquear a possibilidade de fazer resize
        setResizable(false);
        // Pre-definir o que faz o botao de fecho
        setDefaultCloseOperation(saudeIMC.EXIT_ON_CLOSE);
        // Centralizar o JFrame no meio da tela
        setLocationRelativeTo(null);
        
        outputTextoImc.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        altura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        outputImc = new javax.swing.JLabel();
        botaoCalculo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextoImc = new javax.swing.JTextArea();
        voltarMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fitness APP - Movimenta-te");
        setBackground(jLabel1.getBackground());
        setResizable(false);

        jLabel2.setText("Qual é a sua altura?");

        altura.setAutoscrolls(false);
        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });

        jLabel3.setText("(em cm)");

        jLabel4.setText("Qual é o seu peso ?");

        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        jLabel5.setText("(em Kg)");

        outputImc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        outputImc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botaoCalculo.setText("Calcular I.M.C.");
        botaoCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalculoActionPerformed(evt);
            }
        });

        outputTextoImc.setEditable(false);
        outputTextoImc.setColumns(20);
        outputTextoImc.setLineWrap(true);
        outputTextoImc.setRows(5);
        outputTextoImc.setWrapStyleWord(true);
        outputTextoImc.setBorder(null);
        outputTextoImc.setOpaque(false);
        outputTextoImc.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(outputTextoImc);

        voltarMenu.setText("Voltar ao Menu Inicial");
        voltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(voltarMenu)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(botaoCalculo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputImc)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(peso))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(botaoCalculo)
                .addGap(26, 26, 26)
                .addComponent(outputImc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(voltarMenu)
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaActionPerformed

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed

    private void botaoCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalculoActionPerformed
    
        // TODO add your handling code here:

        // limitar a inserção dos dados de peso entre 3 e 225kg e limitar a inserção da altura entre 45 e 225cm
        if (peso.getText().isEmpty() || altura.getText().isEmpty() || Double.parseDouble(peso.getText()) < 3 || Double.parseDouble(peso.getText()) > 225 || Double.parseDouble(altura.getText()) < 45 || Double.parseDouble(altura.getText()) > 225){
            outputImc.setForeground(new java.awt.Color(255, 0, 51)); // o aviso passa a ter cor vermelha
            outputImc.setText("      Dados Inválidos");
            outputTextoImc.setVisible(false);
            piscapisca(); //alerta visual de dados invalidos
        }
        
        else{
            Usuario user = new Usuario("",0, Double.parseDouble(peso.getText()),Double.parseDouble(altura.getText()));
            UsuariosService userservice = new UsuariosService();
            userservice.calcularIMC(user);
            //outputImc.setForeground(new java.awt.Color(0, 0, 0)); // o output mantem (ou muda) para coloração a preto
            String imc = new DecimalFormat("#.0#").format(userservice.getImc());
            
            // coloração veermelho, amarelo e verde do output do IMC
            if (userservice.getImc() < 18.5) {
                outputImc.setForeground(new java.awt.Color(255, 0, 0));     
            } else if (userservice.getImc() >= 18.5 && userservice.getImc() < 24.9) {
                outputImc.setForeground(new java.awt.Color(0, 128, 0));
            } else if (userservice.getImc() >= 24.9 && userservice.getImc() < 29.9) {
                outputImc.setForeground(new java.awt.Color(255, 255, 0));
            } else if (userservice.getImc() >= 29.9 && userservice.getImc() < 34.9) {
                outputImc.setForeground(new java.awt.Color(255, 0, 0));
            } else if (userservice.getImc() >= 34.9 && userservice.getImc() < 39.9) {
                outputImc.setForeground(new java.awt.Color(139, 0, 0));
            } else{
                outputImc.setForeground(new java.awt.Color(139, 0, 0));
            }
            
            outputImc.setText("O seu I.M.C é de " + imc);
            outputTextoImc.setVisible(true);
            outputTextoImc.setText(userservice.getEstadoIMC());
            outputTextoImc.setCaretPosition(0);
        }
    }//GEN-LAST:event_botaoCalculoActionPerformed

    private void voltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuActionPerformed
        dispose();
        primeiroMenu.main();
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(saudeIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(saudeIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(saudeIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(saudeIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new saudeIMC().setVisible(true);

            }
        });
    }
    
    private void piscapisca() {
        
        final Timer[] temporizador = {new Timer(500, null)}; // Declaração final e inicialização do Timer
        int[] contador = {0}; // contador para controlar o número de vezes que a label piscou
        temporizador[0] = new Timer(500, (ActionEvent e) -> {
            outputImc.setVisible(!outputImc.isVisible()); // Inverte a visibilidade da JLabel
            contador[0]++; // Incrementa o contador
            if (contador[0] >= 10) { // Se a label piscar 10 vezes
                temporizador[0].stop(); // Para o temporizador
            }
        });
        temporizador[0].start();    
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JButton botaoCalculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel outputImc;
    private javax.swing.JTextArea outputTextoImc;
    private javax.swing.JTextField peso;
    private javax.swing.JButton voltarMenu;
    // End of variables declaration//GEN-END:variables
}