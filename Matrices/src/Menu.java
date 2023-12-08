
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
    int[][] mNumeros;
    
    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        llenar = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matrices en Java");

        llenar.setText("Llenar Matriz");
        llenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarActionPerformed(evt);
            }
        });

        imprimir.setText("Imprimir Matriz");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        buscar.setText("Buscar Pares");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(llenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(imprimir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llenar)
                    .addComponent(buscar))
                .addGap(18, 18, 18)
                .addComponent(imprimir)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarActionPerformed
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero De Filas"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero De Columnas"));
        
        mNumeros = new int[fila][columnas];
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columnas; j++) {
                mNumeros[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor de la Pocicion ("+i+","+j+")"));
            }
        }
    }//GEN-LAST:event_llenarActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        for (int i = 0; i < mNumeros.length; i++) {
            for (int j = 0; j < mNumeros[0].length; j++) {
                JOptionPane.showMessageDialog(rootPane,"El Valor de la Pocicion ("+i+","+j+") es: "+ mNumeros[i][j]);
            }
        }
    }//GEN-LAST:event_imprimirActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        String posicionPares = "";
        
        for (int i = 0; i < mNumeros.length; i++) {
            for (int j = 0; j < mNumeros[0].length; j++) {
                if (mNumeros[i][j]%2==0 & posicionPares.equals("")) {
                    posicionPares +=  "("+String.valueOf(i)+","+String.valueOf(j)+")";
                } else if (mNumeros[i][j]%2==0 & !posicionPares.equals("")) {
                    posicionPares +=  ", ("+String.valueOf(i)+","+String.valueOf(j)+")";
                }
            }
        }
        
        JOptionPane.showMessageDialog(rootPane, "Las Posiciones con Numeros Pares Son: "+posicionPares);
    }//GEN-LAST:event_buscarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton llenar;
    // End of variables declaration//GEN-END:variables
}
