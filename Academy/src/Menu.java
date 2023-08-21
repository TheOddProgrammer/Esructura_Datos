
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
    DecimalFormat df = new DecimalFormat("###.##");

    public Menu() {
        initComponents();
        n3.setEditable(false);
        setenta.setEditable(false);
        definitiva.setText("Esperando...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        n3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        calcularn3 = new javax.swing.JButton();
        calcularsetenta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        setenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        treinta = new javax.swing.JTextField();
        calculartreinta = new javax.swing.JButton();
        definitiva = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        textoned = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora Academica");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Parcial Nº1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Parcial Nº2");

        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tercera Nota");

        calcularn3.setText("Calcular 3ª Nota");
        calcularn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularn3ActionPerformed(evt);
            }
        });

        calcularsetenta.setText("Calcular 70%");
        calcularsetenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularsetentaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("70%");

        setenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setentaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("30%");

        treinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintaActionPerformed(evt);
            }
        });

        calculartreinta.setText("Calcular 30%");
        calculartreinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculartreintaActionPerformed(evt);
            }
        });

        definitiva.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        definitiva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        definitiva.setText("Esperando...");

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 255, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 255, 153));
        jSeparator1.setToolTipText("");

        textoned.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoned.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jSeparator2.setBackground(new java.awt.Color(51, 255, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 255, 153));
        jSeparator2.setToolTipText("");

        jButton1.setText("Need");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(limpiar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(p1)
                                .addComponent(p2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                    .addComponent(calcularn3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(setenta, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(treinta, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(9, 9, 9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(calcularsetenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(calculartreinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(textoned, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(definitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularn3)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularsetenta)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(treinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculartreinta)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoned)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(definitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(limpiar)
                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        
    }//GEN-LAST:event_n3ActionPerformed

    private void calcularn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularn3ActionPerformed
        int dato = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas Notas Se Obtuvieron en Clase"));
        float sumatoria = 0;
        float numero=0;
        for (int i = 0; i < dato; i++) {
            do {
                if (numero>5 || numero<0) {
                    JOptionPane.showMessageDialog(rootPane,"Ingrese Un valor entre 0.0 y 5.0");
                }
                numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la Nota N°"+(i+1)));
            } while(numero<0 || numero>5);
            sumatoria+= numero;
        }
        double resultado = Math.round((sumatoria/dato)*100)/100d;
        
        n3.setText(
                String.valueOf(resultado)
        );
    }//GEN-LAST:event_calcularn3ActionPerformed

    private void treintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_treintaActionPerformed

    private void calcularsetentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularsetentaActionPerformed
        if(p1.getText().equals("") || p2.getText().equals("") || n3.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Todos los Campos son Obligatorios");
        } else {
            setenta.setText(
                    String.valueOf(
                Math.round((((Float.parseFloat(p1.getText()) +
                Float.parseFloat(p2.getText()) + 
                Float.parseFloat(n3.getText()))/3)*0.7) * 100) / 100d
                    )
            );
        }
        
    }//GEN-LAST:event_calcularsetentaActionPerformed

    private void setentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setentaActionPerformed
        
    }//GEN-LAST:event_setentaActionPerformed

    private void calculartreintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculartreintaActionPerformed

        textoned.setText("Nota Final");
        float num = 0;
        do {
            if (num<0 || num>5) {
                JOptionPane.showMessageDialog(rootPane,"Ingrese Numero entre 0.0 y 5.0");
            }
            num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Nota del Examen Final"));
        } while (num<0 || num>5);
        
        treinta.setText(
                String.valueOf(
                     Math.round((num*0.3) * 100) / 100d
                )
        );
        if(setenta.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Debe Rellenarse Datos del 70% para Obetener Nota Final");
        } else {
            definitiva.setText(
                "Su Definitiva Es: " + String.valueOf(
                        (Float.parseFloat(treinta.getText())+Float.parseFloat(setenta.getText()))
                )
            );
        }
        
    }//GEN-LAST:event_calculartreintaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        p1.setText("");
        p2.setText("");
        n3.setText("");
        setenta.setText("");
        treinta.setText("");
        definitiva.setText("Esperando...");
        textoned.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float data = Float.parseFloat(setenta.getText());
        float restante = (3-data);
        double need = Math.round((restante/0.3)*100)/100d;
        textoned.setText("Nececita Sacar En El Examen Final");
        
        if (restante<=0) {
            definitiva.setText("0.0");
        } else if (restante>0 && restante<5) {
            definitiva.setText(String.valueOf(need));
        } else if (need>5) {
            definitiva.setText(String.valueOf(need));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularn3;
    private javax.swing.JButton calcularsetenta;
    private javax.swing.JButton calculartreinta;
    private javax.swing.JLabel definitiva;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField setenta;
    private javax.swing.JLabel textoned;
    private javax.swing.JTextField treinta;
    // End of variables declaration//GEN-END:variables
}
