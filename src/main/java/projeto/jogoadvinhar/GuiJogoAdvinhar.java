/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto.jogoadvinhar;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Família Santos
 */
public class GuiJogoAdvinhar extends javax.swing.JFrame {
    int numeroGeradoAleatoriamente;
    int tentativas;
    /**
     * Creates new form GuiJogoAdvinhar
     */
    public GuiJogoAdvinhar() {
        initComponents();
        numeroGeradoAleatoriamente = 0;
        tentativas = 0;
        jSpinnerTentativas.setValue(tentativas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelGenioPensando = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonPensar = new javax.swing.JButton();
        jTextFieldNumero = new javax.swing.JTextField();
        jButtonVerificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerTentativas = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Advinhar");
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelGenioPensando.setText("<html>Vou pensar em um número,<br/>"
            + "tente advinhar!</html>");
        jLabelGenioPensando.setMaximumSize(new java.awt.Dimension(130, 100));
        jLabelGenioPensando.setMinimumSize(new java.awt.Dimension(130, 100));
        jLabelGenioPensando.setPreferredSize(new java.awt.Dimension(130, 100));
        jLabelGenioPensando.setRequestFocusEnabled(false);
        getContentPane().add(jLabelGenioPensando, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 180, 100));

        jLabel1.setText("Qual foi o número?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jButtonPensar.setText("Pensar Número");
        jButtonPensar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPensarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPensar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 40, -1));

        jButtonVerificar.setText("Verificar");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel2.setText("Tentativas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        getContentPane().add(jSpinnerTentativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/genio.png"))); // NOI18N
        jLabel4.setText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 330, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jButtonPensarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPensarActionPerformed
        // TODO add your handling code here:
        if (tentativas > 4) {
            jLabelGenioPensando.setText("<html>Vou pensar em número,<br/> tente advinhar!</html>");
            JOptionPane.showMessageDialog(rootPane,"Gamer Over!");
            tentativas = 0;
            jSpinnerTentativas.setValue(tentativas);
            // "<html>Vou pensar em um número,<br/>"
            jTextFieldNumero.setText("");
        } else {
            Random random = new Random();
            numeroGeradoAleatoriamente = random.nextInt(10)+1;
            System.out.println("Número Aleatório: " +numeroGeradoAleatoriamente);
        }

    }//GEN-LAST:event_jButtonPensarActionPerformed

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
        // TODO add your handling code here:
        int valorInformado = Integer.parseInt(jTextFieldNumero.getText());
        
        if (valorInformado == numeroGeradoAleatoriamente) {
            jLabelGenioPensando.setText("Parabéns! Você acertou!");
            JOptionPane.showMessageDialog(rootPane, "Parabéns! Você acertou! Jogar Novamente?");
            tentativas=0;
            jSpinnerTentativas.setValue(tentativas);
            jTextFieldNumero.setText("");
            jLabelGenioPensando.setText("<html>Vou pensar em m número, <br/>tente advinhar!</html>");
        } else {
            if (tentativas >= 4) {
                jLabelGenioPensando.setText("<html>Vou pensar em m número, <br/>tente advinhar!</html>");
                JOptionPane.showMessageDialog(rootPane, "Game Over! Jogar Novamente!");
                jTextFieldNumero.setText("");
                tentativas = 0;
                jSpinnerTentativas.setValue(tentativas);
            } else {
                jLabelGenioPensando.setText("Você errou!");
                tentativas+=1;
                jSpinnerTentativas.setValue(tentativas);    
            }
            
        }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiJogoAdvinhar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiJogoAdvinhar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiJogoAdvinhar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiJogoAdvinhar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiJogoAdvinhar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPensar;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelGenioPensando;
    private javax.swing.JSpinner jSpinnerTentativas;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
