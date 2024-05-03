/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author DANNA
 */
public class CalculadoraDS extends javax.swing.JFrame {
    Calculadora calcu = new Calculadora();
    
    public CalculadoraDS() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Screen = new javax.swing.JLabel();
        DivideButton = new javax.swing.JButton();
        MultiplyButton = new javax.swing.JButton();
        MinusButton = new javax.swing.JButton();
        PlusButton = new javax.swing.JButton();
        Num9Button = new javax.swing.JButton();
        Num8Button = new javax.swing.JButton();
        Num7Button = new javax.swing.JButton();
        Num6Button = new javax.swing.JButton();
        Num5Button = new javax.swing.JButton();
        Num4Button = new javax.swing.JButton();
        Num3Button = new javax.swing.JButton();
        Num2Button = new javax.swing.JButton();
        Num1Button = new javax.swing.JButton();
        Num0Button = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        EqualsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        Screen.setBackground(new java.awt.Color(255, 255, 255));
        Screen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        Screen.setOpaque(true);

        DivideButton.setText("/");
        DivideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideButtonActionPerformed(evt);
            }
        });

        MultiplyButton.setText("*");
        MultiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyButtonActionPerformed(evt);
            }
        });

        MinusButton.setText("-");
        MinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusButtonActionPerformed(evt);
            }
        });

        PlusButton.setText("+");
        PlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusButtonActionPerformed(evt);
            }
        });

        Num9Button.setText("9");
        Num9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num9ButtonActionPerformed(evt);
            }
        });

        Num8Button.setText("8");
        Num8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num8ButtonActionPerformed(evt);
            }
        });

        Num7Button.setText("7");
        Num7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num7ButtonActionPerformed(evt);
            }
        });

        Num6Button.setText("6");
        Num6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num6ButtonActionPerformed(evt);
            }
        });

        Num5Button.setText("5");
        Num5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num5ButtonActionPerformed(evt);
            }
        });

        Num4Button.setText("4");
        Num4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ButtonActionPerformed(evt);
            }
        });

        Num3Button.setText("3");
        Num3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ButtonActionPerformed(evt);
            }
        });

        Num2Button.setText("2");
        Num2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ButtonActionPerformed(evt);
            }
        });

        Num1Button.setText("1");
        Num1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ButtonActionPerformed(evt);
            }
        });

        Num0Button.setText("0");
        Num0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num0ButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("C");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        EqualsButton.setText("=");
        EqualsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Num1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Num2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(Num3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Num4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Num5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Num6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(Num0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Num7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Num8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Num9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DivideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MultiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(MinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(EqualsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MultiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DivideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Num9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Num4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Num3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Num0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EqualsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Num7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num7ButtonActionPerformed
        
        String text = Screen.getText();
        Screen.setText(text + "7");
    }//GEN-LAST:event_Num7ButtonActionPerformed

    private void Num9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num9ButtonActionPerformed
       
        String text = Screen.getText();
        Screen.setText(text + "9");
    }//GEN-LAST:event_Num9ButtonActionPerformed

    private void MinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusButtonActionPerformed
        
        String text = Screen.getText();
        Screen.setText(text + "-");
    }//GEN-LAST:event_MinusButtonActionPerformed

    private void Num4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ButtonActionPerformed
       
        String text = Screen.getText();
        Screen.setText(text + "4");
    }//GEN-LAST:event_Num4ButtonActionPerformed

    private void Num5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num5ButtonActionPerformed
       
        String text = Screen.getText();
        Screen.setText(text + "5");
    }//GEN-LAST:event_Num5ButtonActionPerformed

    private void Num6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num6ButtonActionPerformed
       
        String text = Screen.getText();
        Screen.setText(text + "6");
    }//GEN-LAST:event_Num6ButtonActionPerformed

    private void Num8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num8ButtonActionPerformed
      
        String text = Screen.getText();
        Screen.setText(text + "8");
    }//GEN-LAST:event_Num8ButtonActionPerformed

    private void Num1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ButtonActionPerformed
       
        String text = Screen.getText();
        Screen.setText(text + "1");
    }//GEN-LAST:event_Num1ButtonActionPerformed

    private void Num2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ButtonActionPerformed
     
        String text = Screen.getText();
        Screen.setText(text + "2");
    }//GEN-LAST:event_Num2ButtonActionPerformed

    private void Num3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ButtonActionPerformed
       
        String text = Screen.getText();
        Screen.setText(text + "3");
    }//GEN-LAST:event_Num3ButtonActionPerformed

    private void Num0ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num0ButtonActionPerformed
       
        String text = Screen.getText();
        Screen.setText(text + "0");
    }//GEN-LAST:event_Num0ButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed

        Screen.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void DivideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideButtonActionPerformed
      
        String text = Screen.getText();
        Screen.setText(text + "/");
    }//GEN-LAST:event_DivideButtonActionPerformed

    private void MultiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyButtonActionPerformed
       
        String text = Screen.getText();
        Screen.setText(text + "*");
    }//GEN-LAST:event_MultiplyButtonActionPerformed

    private void PlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusButtonActionPerformed

        String text = Screen.getText();
        Screen.setText(text + "+");
    }//GEN-LAST:event_PlusButtonActionPerformed

    private void EqualsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsButtonActionPerformed
       
        String text = Screen.getText();
        Screen.setText(calcu.operation(text + " "));                
    }//GEN-LAST:event_EqualsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraDS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DivideButton;
    private javax.swing.JButton EqualsButton;
    private javax.swing.JButton MinusButton;
    private javax.swing.JButton MultiplyButton;
    private javax.swing.JButton Num0Button;
    private javax.swing.JButton Num1Button;
    private javax.swing.JButton Num2Button;
    private javax.swing.JButton Num3Button;
    private javax.swing.JButton Num4Button;
    private javax.swing.JButton Num5Button;
    private javax.swing.JButton Num6Button;
    private javax.swing.JButton Num7Button;
    private javax.swing.JButton Num8Button;
    private javax.swing.JButton Num9Button;
    private javax.swing.JButton PlusButton;
    private javax.swing.JLabel Screen;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
