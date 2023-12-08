
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Operaciones {
    
    //Declaracion Variables Globales
    Cliente inicio;
    public final double MINIMUM_MONEY = 10000000;
    public final int MINIMUM_AGE = 65;
    
    //Métodos
    
    Operaciones() {
        inicio = null;
    }
    
    public void crearLista(String identificationCard,String name, String birthDate, String money) {
        Cliente nuevo = new Cliente();
        nuevo.setName(name);
        nuevo.setBirthDate(birthDate);
        nuevo.setIdentificationCard(identificationCard);
        nuevo.setMoney(Double.parseDouble(money));
        int age = calculateAge(nuevo.getBirthDate());
        nuevo.setAge(age);
        nuevo.setNext(null);
        
        if (inicio == null) {
            inicio = nuevo;
        } else {
            if (nuevo.getAge()>=MINIMUM_AGE) {
                addInit(nuevo);
            } else if (nuevo.getMoney()>=MINIMUM_MONEY) {
                addBetween(nuevo);
            } else {
                addFinal(nuevo);
            }
        }
    }
    
    private void addInit(Cliente nuevo) {
        nuevo.setNext(inicio);
        inicio = nuevo;
    }
    
    private void addFinal(Cliente nuevo) {
        Cliente temporal = inicio;
        
        while(temporal.getNext() != null) {
            temporal = temporal.getNext();
        }
        
        temporal.setNext(nuevo);
    }
    
    private void addBetween(Cliente nuevo) {
        Cliente temporal = inicio;
        int counter = 0;
        
        while(temporal.getNext() != null) {
            temporal = temporal.getNext();
            counter++;
        }
        
        if (counter > 1) {
            temporal = inicio;
            while(temporal.getAge() >= MINIMUM_AGE) {
                temporal = temporal.getNext();
            }
            nuevo.setNext(temporal.getNext());
            temporal.setNext(nuevo);
        } else {
            addInit(nuevo);
        }
    }
    
    public void printData() {
        Cliente temporal = inicio;
        
        while(temporal != null) {
            JOptionPane.showMessageDialog(null, temporal.getName());
            temporal = temporal.getNext();
        }
    }
    
    public void search(String id) {
        Cliente temporal = inicio;
        int count = 0;
        boolean band = false;
        
        while(temporal != null) {
            if (temporal.getIdentificationCard().equals(id)) {
                JOptionPane.showMessageDialog(null, "La Persona Con Documento "+ id +" de Nombre "+ temporal.getName() +" esta en El Turno: " + (count+1));
                band = true;
            }
            temporal = temporal.getNext();
            count++;
        }
        
        if (!band) {
            JOptionPane.showMessageDialog(null,"No se Encuentra en Lista");
        }
        
    }
    
    private int calculateAge(String fecha) {
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
    
    public ArrayList leerCSV(String nombreArchivo) {
        String linea;
        BufferedReader lector;
        ArrayList<String> list = new ArrayList<>(); 
        
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while((linea = lector.readLine()) != null){
                list.add(linea);
            }
            lector.close();
            return list;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Archivo no Encontrado por Favor, presiones Agreagar para Crear un Archivo");
            return null;
        }
    }
    
    public void write(String rute,String content) {
        BufferedReader lector;
        String linea;
        ArrayList<String> list = new ArrayList<>(); 
        BufferedWriter bw;
        String contenido = "";
        try {
            lector = new BufferedReader(new FileReader(rute));
            while((linea = lector.readLine()) != null){
                list.add(linea);
            }
            String ruta = rute;
            for (int i = 0; i < list.size(); i++) {
                contenido += list.get(i) + "\n";
            }
            contenido += content;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (IOException e) {
            System.out.println("Oh no, Se ha Generado un Error con el Archivo!!");
        }
    }
    
    public boolean validar(String id) {
        Cliente temporal = inicio;
        boolean band = false;
        
        while(temporal != null) {
            if (temporal.getIdentificationCard().equals(id)) {
                JOptionPane.showMessageDialog(null, "La Persona Con Documento Ya se Encuentra Registradas");
                band = true;
            }
            temporal = temporal.getNext();
        }
        
        return band;
    }
}
