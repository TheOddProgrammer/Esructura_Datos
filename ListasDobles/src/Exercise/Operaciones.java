package Exercise;

import javax.swing.JOptionPane;

public class Operaciones {
    
    Nodo inicio = null;
    
    public void listInit(String name) {
        Nodo nuevo = new Nodo();
        nuevo.setBefore(null);
        nuevo.setAfter(null);
        nuevo.setDato(name);
        
        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setAfter(inicio);
            inicio.setBefore(nuevo);
            inicio = nuevo;
        }
    }
    
    public void printBack() {
        Nodo temporal = inicio;
        
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La Lista Esta Vacia");
        } else {
            while(temporal!=null) {
                JOptionPane.showMessageDialog(null, temporal.getDato());
                temporal = temporal.getAfter();
            }
        }
    }
    
    public void printFront() {
        Nodo temporal = inicio;
        
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La Lista Esta Vacia");
        } else {
            while(temporal.getAfter()!=null) {
                temporal = temporal.getAfter();
            }
            
            while(temporal!=null) {
                JOptionPane.showMessageDialog(null, temporal.getDato());
                temporal = temporal.getBefore();
            }
        }
    }
    
    public void search(String data) {
        Nodo temporal = inicio;
        boolean band = false;
        
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La Lista Esta Vacia");
        } else {
            while(temporal!=null) {
                if (temporal.getDato().equalsIgnoreCase(data)) {
                    if (temporal.getBefore() == null & temporal.getAfter() == null) {
                        JOptionPane.showMessageDialog(null, "La persona "+temporal.getDato()+" se encuentra en Fila Sola");
                    } else if (temporal.getAfter()!=null & temporal.getBefore()!=null) {
                        JOptionPane.showMessageDialog(null, "La persona es "+temporal.getDato()+
                            " Adelante tiene a "+temporal.getAfter().getDato() +
                            " Y Detras Tiene a "+temporal.getBefore().getDato());
                    } else if (temporal.getBefore() != null || temporal.getAfter() == null) {
                        JOptionPane.showMessageDialog(null, "La persona es "+temporal.getDato()+
                            " Y Detras Tiene a "+temporal.getBefore().getDato());
                    } else {
                        JOptionPane.showMessageDialog(null, "La persona es "+temporal.getDato()+
                            " Adelante tiene a "+temporal.getAfter().getDato());
                    }
                    band = true;
                }
                temporal = temporal.getAfter();
            }
            
            if (!band) {
                JOptionPane.showMessageDialog(null, "No se Encuentra");
            }
        }
    }
}
