package Practice;

import javax.swing.JOptionPane;

public class Operaciones {
    Nodo primero;
    Nodo ultimo;
    
    Operaciones() {
        primero = null;
        ultimo = null;
    }
    
    public void inicio(int age) {
        Nodo nuevo = new Nodo();
        nuevo.setAge(age);
        nuevo.setSig(nuevo);
        nuevo.setAnt(nuevo);
        
        if (primero == null) {
            primero = nuevo;
            ultimo =  nuevo;
        } else {
            nuevo.setSig(primero);
            primero.setAnt(nuevo);
            primero = nuevo;
            primero.setAnt(ultimo);
            ultimo.setSig(primero);
        }
    }
    
    public void printFront(){
        Nodo temporal = primero;
        
        do {
            JOptionPane.showMessageDialog(null, temporal.getAge());
            temporal = temporal.getSig();
        } while (temporal.getAnt()!=ultimo);
    }
    
    public void printBack(){
        Nodo temporal = ultimo;
        
        do {
            JOptionPane.showMessageDialog(null, temporal.getAge());
            temporal = temporal.getAnt();
        } while (temporal.getSig()!=primero);
    }
}
