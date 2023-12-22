package principal;
import javax.swing.JOptionPane;
import java.lang.Math;

public class principal extends javax.swing.JFrame {
    
    public void operacao(String a) {
        valor1 = Double.parseDouble(visor.getText());
        visor.setText("");
        operacao = a;
    }
    
    public void nBTM(String a) {
        valoratual = visor.getText();
        if (valoratual.length() < 12) {
        visor.setText(valoratual+a);
        } else if (valoratual.length() > 12) {
        }
    }
            
    private String operacao;
    private double valor1;
    private double valor2;
    private String valoratual;
    
    public principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visor = new javax.swing.JTextField();
        btm1 = new javax.swing.JButton();
        btm2 = new javax.swing.JButton();
        btm3 = new javax.swing.JButton();
        btm4 = new javax.swing.JButton();
        btm5 = new javax.swing.JButton();
        btm6 = new javax.swing.JButton();
        btm7 = new javax.swing.JButton();
        btm8 = new javax.swing.JButton();
        btm9 = new javax.swing.JButton();
        btmSOMAR = new javax.swing.JButton();
        btmIGUALA = new javax.swing.JButton();
        btmClear = new javax.swing.JButton();
        btmSUBTRAIR = new javax.swing.JButton();
        btmMULTIPLICAR = new javax.swing.JButton();
        btm0 = new javax.swing.JButton();
        btmDIVIDIR = new javax.swing.JButton();
        btmRAIZquadrada = new javax.swing.JButton();
        btmON = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visorActionPerformed(evt);
            }
        });

        btm1.setText("1");
        btm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm1ActionPerformed(evt);
            }
        });

        btm2.setText("2");
        btm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm2ActionPerformed(evt);
            }
        });

        btm3.setText("3");
        btm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm3ActionPerformed(evt);
            }
        });

        btm4.setText("4");
        btm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm4ActionPerformed(evt);
            }
        });

        btm5.setText("5");
        btm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm5ActionPerformed(evt);
            }
        });

        btm6.setText("6");
        btm6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm6ActionPerformed(evt);
            }
        });

        btm7.setText("7");
        btm7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm7ActionPerformed(evt);
            }
        });

        btm8.setText("8");
        btm8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm8ActionPerformed(evt);
            }
        });

        btm9.setText("9");
        btm9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm9ActionPerformed(evt);
            }
        });

        btmSOMAR.setText("+");
        btmSOMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSOMARActionPerformed(evt);
            }
        });

        btmIGUALA.setText("=");
        btmIGUALA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmIGUALAActionPerformed(evt);
            }
        });

        btmClear.setText("C");
        btmClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmClearActionPerformed(evt);
            }
        });

        btmSUBTRAIR.setText("-");
        btmSUBTRAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSUBTRAIRActionPerformed(evt);
            }
        });

        btmMULTIPLICAR.setText("*");
        btmMULTIPLICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmMULTIPLICARActionPerformed(evt);
            }
        });

        btm0.setText("0");
        btm0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm0ActionPerformed(evt);
            }
        });

        btmDIVIDIR.setText("/");
        btmDIVIDIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmDIVIDIRActionPerformed(evt);
            }
        });

        btmRAIZquadrada.setText("√");
        btmRAIZquadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRAIZquadradaActionPerformed(evt);
            }
        });

        btmON.setText("ON");
        btmON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmONActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Sobre");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("DADOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ajuda");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visor)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btmON, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btmClear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 92, Short.MAX_VALUE)
                        .addComponent(btmRAIZquadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btm1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btm3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btmSOMAR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btm4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btm5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btm6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmSUBTRAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btm7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btm0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btmIGUALA, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btmDIVIDIR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btm8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btm9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btmMULTIPLICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmClear)
                    .addComponent(btmRAIZquadrada)
                    .addComponent(btmON))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmSOMAR, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmSUBTRAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmMULTIPLICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btm0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btmDIVIDIR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btmIGUALA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void visorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorActionPerformed

    }//GEN-LAST:event_visorActionPerformed

    private void btmSOMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSOMARActionPerformed
        operacao("+");
    }//GEN-LAST:event_btmSOMARActionPerformed
    
    private void btm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm1ActionPerformed
        nBTM("1");
    }//GEN-LAST:event_btm1ActionPerformed

    private void btm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm2ActionPerformed
        nBTM("2");
    }//GEN-LAST:event_btm2ActionPerformed

    private void btm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm3ActionPerformed
        nBTM("3");
    }//GEN-LAST:event_btm3ActionPerformed

    private void btmIGUALAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmIGUALAActionPerformed
        valor2 = Double.parseDouble(visor.getText());
        double resultado;
        visor.setText("");
        
        if (operacao.equals("+")) {
            resultado = valor1+valor2;
            visor.setText(""+resultado);
            } else if (operacao.equals("-")) {
                resultado = valor1-valor2;
                visor.setText(""+resultado);
            } else if (operacao.equals("*")) {
                resultado = valor1*valor2;
                visor.setText(""+resultado);
            } else if (operacao.equals("/")) {
                if (valor2 == 0) {
                    visor.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    JOptionPane.showMessageDialog(null,"TENTATIVA DE DIVISÃO POR 0","[ERRO]", JOptionPane.WARNING_MESSAGE);
                } else {
                    resultado = valor1/valor2;
                    visor.setText(""+resultado);
                } 
            }      
    }//GEN-LAST:event_btmIGUALAActionPerformed

    private void btmClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmClearActionPerformed
        valor1 = 0;
        valor2 = 0;
        visor.setText("");
    }//GEN-LAST:event_btmClearActionPerformed

    private void btm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm4ActionPerformed
        nBTM("4");
    }//GEN-LAST:event_btm4ActionPerformed

    private void btm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm5ActionPerformed
        nBTM("5");
    }//GEN-LAST:event_btm5ActionPerformed

    private void btm6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm6ActionPerformed
        nBTM("6");
    }//GEN-LAST:event_btm6ActionPerformed

    private void btmSUBTRAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSUBTRAIRActionPerformed
        operacao("-");
    }//GEN-LAST:event_btmSUBTRAIRActionPerformed

    private void btm7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm7ActionPerformed
        nBTM("7");
    }//GEN-LAST:event_btm7ActionPerformed

    private void btm8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm8ActionPerformed
        nBTM("8");
    }//GEN-LAST:event_btm8ActionPerformed

    private void btm9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm9ActionPerformed
        nBTM("9");
    }//GEN-LAST:event_btm9ActionPerformed

    private void btmMULTIPLICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmMULTIPLICARActionPerformed
        operacao("*");
    }//GEN-LAST:event_btmMULTIPLICARActionPerformed

    private void btm0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm0ActionPerformed
        nBTM("0");
    }//GEN-LAST:event_btm0ActionPerformed

    private void btmDIVIDIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmDIVIDIRActionPerformed
        operacao("/");
    }//GEN-LAST:event_btmDIVIDIRActionPerformed

    private void btmRAIZquadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmRAIZquadradaActionPerformed
        Double r;
        r = Math.sqrt(Double.parseDouble(visor.getText()));
        visor.setText(""+r);
        
    }//GEN-LAST:event_btmRAIZquadradaActionPerformed

    private void btmONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmONActionPerformed
        valor2 = 0;
        visor.setText("");
        // BRUNO EU NÃO SEI O QUE É ON EU PESQUISEI NO GOOGLE E DISSE QUE É PRA APAGAR O ÚLTIMO NÚMERO DIGITADO SEM EXCLUIR TODA A CONTA
    }//GEN-LAST:event_btmONActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        //NOT
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         JOptionPane.showMessageDialog(null, "CRIADO POR:\nFERNANDO GABRIEL RIBEIRO DA SILVA\n2º INFO INTEGRADO\nCALCULADORA POO","sobre",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        //NOT
    }//GEN-LAST:event_jMenu2ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm0;
    private javax.swing.JButton btm1;
    private javax.swing.JButton btm2;
    private javax.swing.JButton btm3;
    private javax.swing.JButton btm4;
    private javax.swing.JButton btm5;
    private javax.swing.JButton btm6;
    private javax.swing.JButton btm7;
    private javax.swing.JButton btm8;
    private javax.swing.JButton btm9;
    private javax.swing.JButton btmClear;
    private javax.swing.JButton btmDIVIDIR;
    private javax.swing.JButton btmIGUALA;
    private javax.swing.JButton btmMULTIPLICAR;
    private javax.swing.JButton btmON;
    private javax.swing.JButton btmRAIZquadrada;
    private javax.swing.JButton btmSOMAR;
    private javax.swing.JButton btmSUBTRAIR;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField visor;
    // End of variables declaration//GEN-END:variables
}
