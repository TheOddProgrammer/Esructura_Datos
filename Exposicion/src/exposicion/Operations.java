package exposicion;

import javax.swing.JOptionPane;

public class Operations {

    Nodo inicio;

    Operations() {
        inicio = null;
    }

    public void ingresarDatos(int valor) {
        if (inicio == null) {
            inicio = new Nodo(valor);
        } else {
            inicio.insertar(valor);
        }
    }

    public void selectNodoPre() {
        printPreOrden(inicio);
    }
    
    public void selectNodoIn() {
        printInOrden(inicio);
    }
    
    public void selectNodoPos() {
        printPosOrden(inicio);
    }
    
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void printPreOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            JOptionPane.showMessageDialog(null, nodo.getValor());
            printPreOrden(nodo.getLeft());
            printPreOrden(nodo.getRight());
        }
    }

    @SuppressWarnings("UnnecessaryReturnStatement")
    public void printPosOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            JOptionPane.showMessageDialog(null, nodo.getValor());
            printPosOrden(nodo.getRight());
            printPosOrden(nodo.getLeft());
        }
    }

    @SuppressWarnings("UnnecessaryReturnStatement")
    public void printInOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            printInOrden(nodo.getLeft());
            JOptionPane.showMessageDialog(null, nodo.getValor());
            printInOrden(nodo.getRight());
        }
    }
    
    public void buscarNodo(int dato) {
        Nodo temporal = inicio;
        
        while(temporal.getValor() != dato){
            if (dato < temporal.getValor()) {
                temporal = temporal.getLeft();
            } else {
                temporal = temporal.getRight();
            }
            
            if (temporal == null) {
                JOptionPane.showMessageDialog(null,"No se Encuentra");
                return;
            }
        }
        
        if (dato == temporal.getValor()) {
            JOptionPane.showMessageDialog(null,"Se encuentra "+ temporal.getValor() +" como Raiz, con Hijos");
            
            if (temporal.getLeft()!= null) {
                JOptionPane.showMessageDialog(null,"Izquierdo: " + temporal.getLeft().getValor());
            }
            
            if (temporal.getRight() != null) {
                JOptionPane.showMessageDialog(null,"Derecho: " + temporal.getRight().getValor());
            }
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
