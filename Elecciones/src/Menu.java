
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        config = new javax.swing.JButton();
        ganador = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        promedio = new javax.swing.JButton();
        total = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tabla de Datos Electorales 2023");

        config.setText("Configuracion");
        config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configActionPerformed(evt);
            }
        });

        ganador.setText("Ganador");
        ganador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganadorActionPerformed(evt);
            }
        });

        mas.setText("Mas");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        menos.setText("Menos");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        promedio.setText("Promedio");
        promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioActionPerformed(evt);
            }
        });

        total.setText("Total");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(config)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(menos)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ganador)
                    .addComponent(promedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(config)
                            .addComponent(ganador)
                            .addComponent(mas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menos)
                            .addComponent(promedio)
                            .addComponent(total))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Candidatos[] array = {
        new Candidatos("Julian","1"),
        new Candidatos("Andrea","2"),
        new Candidatos("Pedro","3"),
        new Candidatos("Uribe","4")
    };
    
    // Declaracion de Variables
    
    String[][] data;
    int[] votosCandidatos;
    int[] votosMesas;
    String point;
    int totalVotos;
    
    //Logica

    private void configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configActionPerformed
        totalVotos = 0;
        point  = JOptionPane.showInputDialog("Ingrese El Punto de Votacion");
        data = new String[array.length][Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Mesas"))+1];
        votosCandidatos = new int[array.length];
        votosMesas = new int[data[0].length-1];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                
                if (j==0) {
                    data[i][j] = array[i].getName();
                } else {
                    data[i][j] = JOptionPane.showInputDialog("Ingrese Numero De Votos de la Mesa N°"+j+" para el candidato "+data[i][0]);
                    votosCandidatos[i] += Integer.parseInt(data[i][j]);
                    
                    if (j<=votosMesas.length) {
                        votosMesas[j-1] += Integer.parseInt(data[i][j]);
                    }
                }
            }
        }
        
        for (int i = 0; i < votosMesas.length; i++) {
            totalVotos += votosMesas[i];
        }
    }//GEN-LAST:event_configActionPerformed

    private void ganadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganadorActionPerformed
        int posicion=0;
        int mayor=0;
        boolean caso = false;
        
        for (int i = 0; i < votosCandidatos.length; i++) {
            if (votosCandidatos[i]>mayor) {
                mayor = votosCandidatos[i];
                posicion = i;
                
            } else if (mayor==votosCandidatos[i] && mayor!=0) {
                caso = true;
            }
        }
        
        if (caso) {
            JOptionPane.showMessageDialog(rootPane, "Hay un Empate en las Urnas!!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "El Ganador Es "+data[posicion][0]+" con "+mayor+" votos en " + point+".");
        }
    }//GEN-LAST:event_ganadorActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        int posicion = 0;
        int mayor = 0;
        
        for (int i = 0; i < votosMesas.length; i++) {
            if (votosMesas[i]>mayor) {
                mayor = votosMesas[i];
                posicion = i;
            }
        }
        
        for (int i = 0; i < votosMesas.length; i++) {
            System.out.println(votosMesas[i]);
        }
        
        JOptionPane.showMessageDialog(rootPane, "La mesa con mas Votos es la Mesa N°"+(posicion+1)+" con "+mayor+" Votos.");
    }//GEN-LAST:event_masActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        int posicion = 0;
        int menos = 1000;
        
        for (int i = 0; i < votosMesas.length; i++) {
            if (votosMesas[i]<menos) {
                menos = votosMesas[i];
                posicion = i;
            }
        }
        
        for (int i = 0; i < votosMesas.length; i++) {
            System.out.println(votosMesas[i]);
        }
        
        JOptionPane.showMessageDialog(rootPane, "La mesa con mas Votos es la Mesa N°"+(posicion+1)+" con "+menos+" votos.");
    }//GEN-LAST:event_menosActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        JOptionPane.showMessageDialog(rootPane, "En Total Fueron "+String.valueOf(totalVotos)+" Votos en "+point+".");
    }//GEN-LAST:event_totalActionPerformed

    private void promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioActionPerformed
        JOptionPane.showMessageDialog(rootPane, "En Promedio Fueron "+String.valueOf(totalVotos/votosMesas.length)+" Votos por Mesa en "+point+".");
    }//GEN-LAST:event_promedioActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton config;
    private javax.swing.JButton ganador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton promedio;
    private javax.swing.JButton total;
    // End of variables declaration//GEN-END:variables
}
