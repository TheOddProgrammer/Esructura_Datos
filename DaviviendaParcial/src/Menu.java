
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Operaciones op = new Operaciones();
    ArrayList<String> list = new ArrayList<>();
    String data[];
    String ficho;
    int count;
    
    public Menu() {
        initComponents();
        count = 0;
        ficho="";
        JOptionPane.showMessageDialog(rootPane, "Por Favor Presionas Actualizar Luego de Agreagar Datos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        print = new javax.swing.JButton();
        search = new javax.swing.JButton();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setText("Turnos Davivienda");

        create.setText("Crear");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        print.setText("Imprimir");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        search.setText("Buscar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Title)
                    .addComponent(create)
                    .addComponent(print)
                    .addComponent(search)
                    .addComponent(add))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(create)
                .addGap(18, 18, 18)
                .addComponent(print)
                .addGap(36, 36, 36)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        
        if (list.isEmpty()) {
            
            ficho = JOptionPane.showInputDialog("Ingrese la Direccion del Archivo:");
            
            if (ficho!=null) {
                list = op.leerCSV(ficho);
            }
            
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Sin Archivo no se Puede Realizar el Proceso \nPor Favor crear Archivo con Agregar");
            } else {
                for (int i = 0; i < list.size(); i++) {
                    data = list.get(i).split(";");
                    op.crearLista(data[0], data[1], data[2], data[3]);
                }
                count = list.size();
                create.setText("Actualizar");
            }
        } else {
            if (count>0) {
                list = op.leerCSV("C:\\Users\\Garzón\\OneDrive\\Escritorio\\Estructura De Datos\\DaviviendaParcial\\src\\Register.txt");
                
                for (int i = count-1; i < list.size(); i++) {
                    data = list.get(i).split(";");
                    op.crearLista(data[0], data[1], data[2], data[3]);
                }   
            }
        }
    }//GEN-LAST:event_createActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        op.printData();
    }//GEN-LAST:event_printActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String identification = JOptionPane.showInputDialog("Ingrese Número de Documento:");
        op.search(identification);
    }//GEN-LAST:event_searchActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String texto = JOptionPane.showInputDialog("Ingrese el Numero de Documento") + ";" +
                JOptionPane.showInputDialog("Ingrese el Nombre") + ";" +
                JOptionPane.showInputDialog("Ingrese la Fecha (dd-mm-yyyy)") + ";" +
                JOptionPane.showInputDialog("Ingrese el Monto de Dinero");
        String arte[] = texto.split(";");
        
        if (!op.validar(arte[0])) {
            boolean band = true;
        
            for (int i = 0; i < arte.length; i++) {
                if (arte[i].equalsIgnoreCase("null") && band) {
                    JOptionPane.showMessageDialog(rootPane, "No se ha Rellenado uno de los Datos");
                    band = false;
                }
            }

            if (band) {
                op.write(ficho, texto);
            }
        }
    }//GEN-LAST:event_addActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton add;
    private javax.swing.JButton create;
    private javax.swing.JButton print;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
