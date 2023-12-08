package Parqueadero;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Operaciones {

    Car inicio;

    Operaciones() {
        inicio = null;
    }

    public void ingresarDatos(String placa, String documento, String nombre, String telefono, int posicion) {
        String hora = calcularHora();

        Car nuevo = new Car();
        nuevo.setPlaca(placa);
        nuevo.setName(nombre);
        nuevo.setPhone(telefono);
        nuevo.setHora(hora);
        nuevo.setDocumento(documento);
        nuevo.setPos(posicion);
        nuevo.setAnt(null);
        nuevo.setSig(null);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setSig(inicio);
            inicio.setAnt(nuevo);
            inicio = nuevo;
        }
    }

    public void search(String plate) {

        Car temporal = inicio;
        boolean band = true;

        while (temporal != null) {
            if (plate.equalsIgnoreCase(temporal.getPlaca())) {
                JOptionPane.showMessageDialog(null, "El Automovil se Encuentra en el Lugar N°" + temporal.getPos());
                return;
            }
            temporal = temporal.getSig();
        }

        if (band) {
            JOptionPane.showMessageDialog(null, "No se encuentra en el Parqueadero");
        }
    }

    public void eliminarAuto(int pos) {
        Car temporal = inicio;
        boolean band = true;
        int n = calcularSize();

        if (n == 1 & inicio.getPos() == pos) {
            inicio = null;
            return;
        } else if (n == 2) {
            if (inicio.getPos() == pos) {
                inicio = inicio.getSig();
                return;
            } else if(inicio.getSig().getPos() == pos) {
                inicio.setSig(null);
                return;
            }
        } else if (n>2){
            while (temporal != null) {
                if (temporal.getPos() == pos) {
                    temporal.getAnt().setSig(temporal.getSig());
                    temporal.getSig().setAnt(temporal.getAnt());
                    return;
                } else if (temporal.getPos() == pos && temporal.getSig() == null && temporal.getAnt()!=null) {
                    temporal.getAnt().setSig(null);
                    return;
                } else if (temporal.getPos() == pos && temporal.getSig() != null && temporal.getAnt() ==null) {
                    inicio.getSig().setAnt(null);
                    inicio = temporal.getSig();
                    return;
                }
                temporal = temporal.getSig();
            }
        }

        if (!band) {
            JOptionPane.showMessageDialog(null, "No se Encuentra ningun Auto en el Lugar");
        }

    }

    public int calcularSize() {
        Car temporal = inicio;
        int n = 0;

        while (temporal != null) {
            temporal = temporal.getSig();
            n++;
        }

        return n;
    }

    public boolean validarListNull() {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay Carros en el Parqueadero");
            return false;
        } else {
            return true;
        }
    }

    public boolean validarListFull() {
        if (calcularSize() == 10) {
            JOptionPane.showMessageDialog(null, "No hay Carros en el Parqueadero");
            return false;
        } else {
            return true;
        }
    }

    public String calcularHora() {
        LocalDateTime horaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        return horaActual.format(formato);
    }

    public void showState() {
        Car temporal = inicio;

        while (temporal != null) {
            JOptionPane.showMessageDialog(null, "El Auto identificado con Matricula " + temporal.getPlaca()
                    + "\nSe encuentra ubicado en el Lugar N°" + temporal.getPos()+ "\nLlegando a las "+ temporal.getHora());
            temporal = temporal.getSig();
        }
    }

    public boolean validatePlate(String placa) {
        Car temporal = inicio;
        boolean band = true;
        while (temporal != null) {
            if (temporal.getPlaca().equals(placa)) {
                JOptionPane.showMessageDialog(null, "La Matricula ya Se Encuentra Vinculada!!");
                band = false;
            }
            temporal = temporal.getSig();
        }
        
        return band;
    }
}
