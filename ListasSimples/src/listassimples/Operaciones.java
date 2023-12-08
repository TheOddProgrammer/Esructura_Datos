package listassimples;

import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Operaciones {

    Cliente inicio;
    public final double MINI = 10000000;

    Operaciones() {
        inicio = null;
    }

    public void CrearLista(String document, String name, String birthDay, double money) {
        Cliente nuevo = new Cliente();
        nuevo.setNombre(name);
        nuevo.setDocumento(document);
        nuevo.setFecha(birthDay);
        nuevo.setDinero(money);
        nuevo.setNext(null);
        int edad = calcularEdad(nuevo.getFecha());
        nuevo.setEdad(edad);
        
        if (inicio == null) {
            inicio = nuevo;
        } else {
            if (edad > 65) {
                insertarInicio(nuevo.getNombre());
            } else if (MINI <= nuevo.getDinero()) {
                insertarEntre(nuevo.getNombre());
            } else {
                insertarFinal(nuevo.getNombre());
            }
        }
    }

    public void insertarInicio(String name) {
        Cliente nuevo = new Cliente();
        nuevo.setNombre(name);
        nuevo.setNext(inicio);
        inicio = nuevo;
    }

    public void insertarFinal(String name) {
        Cliente nuevo = new Cliente();
        nuevo.setNombre(name);
        Cliente temporal = inicio;

        while (temporal.getNext() != null) {
            temporal = temporal.getNext();
        }

        temporal.setNext(nuevo);
    }
    
    public void insertarEntre(String name) {
        Cliente nuevo = new Cliente();
        nuevo.setNombre(name);
        Cliente temporal = inicio;
        
        while (temporal.getEdad()> 65 || temporal.getDinero() > MINI) {
            temporal = temporal.getNext();
        }
        
        nuevo.setNext(temporal);
        temporal.setNext(nuevo);
    }

    public void imprimirLista() {
        Cliente temporal = inicio;
        while(temporal != null) {
            JOptionPane.showMessageDialog(null, "La Persona a Pasar es: "+temporal.getNombre());
            temporal = temporal.getNext();
        }
    }

    public void buscar(String id) {
        int counter = 0;
        boolean band = false;
        
        Cliente temporal = inicio;
        
        while (temporal != null) {
            if (temporal.getDocumento().equals(id)) {
                JOptionPane.showMessageDialog(null, "La Persona Con Documento "+ id +" de Nombre "+ temporal.getNombre() +" esta en El Turno: " + (counter+1));
                band = true;
            }
            temporal = temporal.getNext();
            counter++;
        }

        if (!band) {
            JOptionPane.showMessageDialog(null, "No se Encuentra el Valor");
        }
    }

    public int calcularEdad(String fecha) {
        Date fechaNac = null;

        try {
            fechaNac = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
        } catch (ParseException ex) {
            System.out.println("Error: " + ex);
        }

        Calendar fechaNacimiento = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();

        fechaNacimiento.setTime(fechaNac);

        int año = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);

        if (mes < 0 || (mes == 0 && dia < 0)) {
            año--;
        }

        return año;
    }
}
