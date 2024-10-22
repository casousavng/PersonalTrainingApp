/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacegrafico;

import javax.swing.JOptionPane;
import personaltraining_app.services.CardioService;
import personaltraining_app.services.ExerciciosService;
import personaltraining_app.services.FlexibilidadeService;
import personaltraining_app.services.FullBodyService;
import personaltraining_app.services.LowerBodyService;
import personaltraining_app.services.TreinoForcaService;
import personaltraining_app.services.TreinoResistenciaService;
import personaltraining_app.services.TreinoVelocidadeService;
import personaltraining_app.services.UpperBodyService;


/**
 *
 * @author Casa
 */
public class outputTreinoPersonalizado extends javax.swing.JFrame { 

    public outputTreinoPersonalizado(String escolhaTreino) {
        
        initComponents();
     
        
        // Tamanho do JFrame
        setSize(500, 400);
        // Bloquear a possibilidade de fazer resize
        setResizable(false);
        // Pre-definir o que faz o botao de fecho
        setDefaultCloseOperation(outputTreinoPersonalizado.EXIT_ON_CLOSE);
        // Centralizar o JFrame no meio da tela
        setLocationRelativeTo(null);
        
        // regista o nome do treino do dia e da o output na respetiva label
        nomeTreinoLabel(escolhaTreino);
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
        jLabel2 = new javax.swing.JLabel();
        nomeTreino = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaExercicios = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fitness APP - Movimenta-te");
        setBackground(jLabel1.getBackground());
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("O seu Treino personalizado de");

        nomeTreino.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        nomeTreino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeTreino.setText("(nome do exercicio)");
        nomeTreino.setFocusable(false);
        nomeTreino.setInheritsPopupMenu(false);
        nomeTreino.setRequestFocusEnabled(false);
        nomeTreino.setVerifyInputWhenFocusTarget(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        listaExercicios.setEditable(false);
        listaExercicios.setColumns(20);
        listaExercicios.setLineWrap(true);
        listaExercicios.setRows(5);
        listaExercicios.setWrapStyleWord(true);
        listaExercicios.setBorder(null);
        listaExercicios.setFocusable(false);
        listaExercicios.setOpaque(false);
        listaExercicios.setRequestFocusEnabled(false);
        listaExercicios.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(listaExercicios);

        jButton2.setText("Voltar ao Menu anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Exportar Lista Exercicios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nomeTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTreino)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        menuTreinoPersonalizado.main();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
              // TODO add your handling code here:
        ExerciciosService.salvarListaExercicios(listaExercicios.getText());
        JOptionPane.showMessageDialog(null, "Lista exportada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void nomeTreinoLabel(String escolhaTreino) {                                         
        nomeTreino.setText(escolhaTreino);
        outputTreino(escolhaTreino); 
    }

    private static void outputTreino(String escolhaTreino){
        
        switch (escolhaTreino) {
            case "Cardio" -> {
                CardioService cardioService = new CardioService();
                cardioService.lerExerciciosDoArquivo(); 
                // Define o texto no JTextArea listaExercicios
                listaExercicios.setText(cardioService.toString());
                // Move o cursor para o início do texto
                listaExercicios.setCaretPosition(0);
                }
            case "Flexibilidade" -> {
                FlexibilidadeService flexibilidadeService = new FlexibilidadeService();
                flexibilidadeService.lerExerciciosDoArquivo();
                listaExercicios.setText(flexibilidadeService.toString());
                listaExercicios.setCaretPosition(0);
                }
            case "Musculação FullBody" -> {
                FullBodyService fullBodyService = new FullBodyService();
                fullBodyService.lerExerciciosDoArquivo(); 
                listaExercicios.setText(fullBodyService.toString());
                listaExercicios.setCaretPosition(0);
                }
            case "Musculação LowerBody" -> {
                LowerBodyService lowerBodyService = new LowerBodyService();
                lowerBodyService.lerExerciciosDoArquivo(); 
                listaExercicios.setText(lowerBodyService.toString());
                listaExercicios.setCaretPosition(0);
                }
            case "Musculação UpperBody" -> {
                UpperBodyService upperBodyService = new UpperBodyService();
                upperBodyService.lerExerciciosDoArquivo(); 
                listaExercicios.setText(upperBodyService.toString());
                listaExercicios.setCaretPosition(0);
                }
            case "Força" -> {
                TreinoForcaService treinoForcaService = new TreinoForcaService();
                treinoForcaService.lerExerciciosDoArquivo(); 
                listaExercicios.setText(treinoForcaService.toString());
                listaExercicios.setCaretPosition(0);
                }
            case "Velocidade" -> {
                TreinoVelocidadeService treinoVelocidadeService = new TreinoVelocidadeService();
                treinoVelocidadeService.lerExerciciosDoArquivo(); 
                listaExercicios.setText(treinoVelocidadeService.toString());
                listaExercicios.setCaretPosition(0);
                }
            case "Resistência" -> {
                TreinoResistenciaService treinoResistenciaService = new TreinoResistenciaService();
                treinoResistenciaService.lerExerciciosDoArquivo(); 
                listaExercicios.setText(treinoResistenciaService.toString());
                listaExercicios.setCaretPosition(0);
                }
        }
    }

    public static void main(String escolhaTreino) {
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
            java.util.logging.Logger.getLogger(outputTreinoPersonalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(outputTreinoPersonalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(outputTreinoPersonalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(outputTreinoPersonalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new outputTreinoPersonalizado(escolhaTreino).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea listaExercicios;
    private static javax.swing.JLabel nomeTreino;
    // End of variables declaration//GEN-END:variables
}
