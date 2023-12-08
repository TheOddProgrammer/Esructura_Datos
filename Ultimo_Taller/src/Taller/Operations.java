package Taller;

import javax.swing.JOptionPane;

public class Operations {

    Nodo inicio;

    Operations() {
        inicio = null;
    }
    
    public void ingresarDatosPerEdad(Nodo nodo){
        if (inicio == null) {
            inicio = nodo;
        } else {
            inicio.insertarEdad(nodo);
        }
    }
    
    public void selectNodoPre() {
        printPreOrden(inicio);
    }
    
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void printPreOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            JOptionPane.showMessageDialog(null, nodo.getName() + "\n" + nodo.getAge() + "\n" + nodo.getDocument() + "\n" + nodo.getGender());
            printPreOrden(nodo.getLeft());
            printPreOrden(nodo.getRight());
        }
    }
    
    public boolean validarListaVacia() {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "El Arbol se Encuentra Vacio!");
            return false;
        } else {
            return true;
        }
    }
}
