package Parcial;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Operaciones op = new Operaciones();

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        definitiva = new javax.swing.JTextField();
        aprovados = new javax.swing.JButton();
        mayoresMenores = new javax.swing.JButton();
        aprovadosDesaprovados = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        cambio = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        organizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calcular Definitiva");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Definitiva");

        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        definitiva.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aprovados.setText("Cantidad Aprovados");
        aprovados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprovadosActionPerformed(evt);
            }
        });

        mayoresMenores.setText("Mayores y Menores");
        mayoresMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayoresMenoresActionPerformed(evt);
            }
        });

        aprovadosDesaprovados.setText("Aprobados y Desaprobados");
        aprovadosDesaprovados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprovadosDesaprovadosActionPerformed(evt);
            }
        });

        crear.setText("Ingresar Estudiante");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        mostrar.setText("Buscar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        imprimir.setText("Imprimir Lista");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        cambio.setText("Cambiar Nombre");
        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });

        borrar.setText("Eliminar Estudiante");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        organizar.setText("Organizar Edades");
        organizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addComponent(definitiva)
                            .addComponent(edad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imprimir)
                    .addComponent(crear)
                    .addComponent(aprovados)
                    .addComponent(mayoresMenores)
                    .addComponent(aprovadosDesaprovados)
                    .addComponent(mostrar)
                    .addComponent(cambio)
                    .addComponent(borrar)
                    .addComponent(organizar))
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {aprovados, aprovadosDesaprovados, borrar, cambio, crear, imprimir, mayoresMenores, mostrar, organizar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(definitiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(crear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aprovados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mayoresMenores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aprovadosDesaprovados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(organizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imprimir)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {aprovados, aprovadosDesaprovados, borrar, cambio, crear, imprimir, mayoresMenores, mostrar, organizar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        if (comprobateBox()) {
            if (checkNumbers()) {
                if (promedyCheck()) {
                    if (checkAge()) {
                        String name = nombre.getText();
                        int age = Integer.parseInt(edad.getText());
                        double def = Double.parseDouble(definitiva.getText());
                        op.crearNodo(name, age, def);
                        cleanBox();
                    }
                }
            }
        }
    }//GEN-LAST:event_crearActionPerformed

    public void cleanBox() {
        nombre.setText("");
        edad.setText("");
        definitiva.setText("");
    }

    public boolean comprobateBox() {
        if (nombre.getText().isEmpty() || edad.getText().isEmpty() || definitiva.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha Deligenciado Alguno de los Campos");
            return false;
        }
        return true;
    }

    public boolean promedyCheck() {
        double n = Double.parseDouble(definitiva.getText());;

        if (n > 5 || n < 0) {
            JOptionPane.showMessageDialog(rootPane, "Valor Definitiva Aceptado Desde 0 ~ 5");
            definitiva.setText("");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkNumbers() {
        try {
            Integer.parseInt(edad.getText());
            Double.parseDouble(definitiva.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Ingrese Solo Numero en los Campos Definitiva y Edad");
            return false;
        }
        return true;
    }

    public boolean checkAge() {
        int n = Integer.parseInt(edad.getText());

        if (n <= 0 || n > 120) {
            JOptionPane.showMessageDialog(rootPane, "La Edad Ingresada no es Valida");
            edad.setText("");
            return false;
        } else {
            return true;
        }
    }

    private void aprovadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprovadosActionPerformed
        if (op.listEmpty()) {
            op.contarGanadores();
        }
    }//GEN-LAST:event_aprovadosActionPerformed

    private void mayoresMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayoresMenoresActionPerformed
        if (op.listEmpty()) {
            op.mayoresAndMenores();
        }
    }//GEN-LAST:event_mayoresMenoresActionPerformed

    private void aprovadosDesaprovadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprovadosDesaprovadosActionPerformed
        if (op.listEmpty()) {
            op.contadorAprobadoDesaprobado();
        }
    }//GEN-LAST:event_aprovadosDesaprovadosActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        if (op.listEmpty()) {
            String name = JOptionPane.showInputDialog("Ingrese el nombre a buscar de la lista");
            op.buscarAndMostrar(name);
        }

    }//GEN-LAST:event_mostrarActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        if (op.listEmpty()) {
            op.imprimir();
        }
    }//GEN-LAST:event_imprimirActionPerformed

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed
        if (op.listEmpty()) {
            String name = JOptionPane.showInputDialog("Ingrese el nombre a buscar de la lista");
            op.cambioDeNombre(name);
        }
    }//GEN-LAST:event_cambioActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if (op.listEmpty()) {
            op.deleteStudent(JOptionPane.showInputDialog("Ingrese el Nombre del Estudiante a Eliminar"));
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void organizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizarActionPerformed
        if (op.listEmpty()) {
            op.orderPerAge();
        }
    }//GEN-LAST:event_organizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aprovados;
    private javax.swing.JButton aprovadosDesaprovados;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cambio;
    private javax.swing.JButton crear;
    private javax.swing.JTextField definitiva;
    private javax.swing.JTextField edad;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton mayoresMenores;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton organizar;
    // End of variables declaration//GEN-END:variables
}
