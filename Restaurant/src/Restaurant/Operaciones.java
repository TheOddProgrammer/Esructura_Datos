package Restaurant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Operaciones {
    
    Platillo inicio;
    
    Operaciones() {
        inicio = null;
    }
    
    //Ingreso del Platillo y Colocacion en la Lista Doble
    public void ingresarPlatillo(String name, double precio, int cantidad) {
        String hora = calcularHora();
        Platillo nuevo = new Platillo();
        nuevo.setNombre(name);
        nuevo.setHora(hora);
        nuevo.setCantidad(cantidad);
        nuevo.setPrecio(precio);
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
    
    //Metodo que buscara el Platillo y la Persona con Turno que lo Pidio
    public void buscarPlatillo(){
        
    }
    
    //Eliminar el Platillo de la Lista, Se debe Llamar el Metodo Platillo Terminado para Indicar que se ha terminado de consumir
    public void eliminarPlatillo(){
        
    }
    
    //Se agrega a la lista de platillos terminados para llevar cuentas
    public void platilloTerminado(){
        
    }
    
    //Calcula la Hora que se Realizo el Pedido
    public String calcularHora() {
        LocalDateTime horaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        return horaActual.format(formato);
    }
    
    //Se le agrega a un Boton, indicara las Ganancias del Dia
    public void terminarJornada(){
        
    }
    
    //Valida la Lista Vacia
    public boolean validarListaVacia(){
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay Carros en el Parqueadero");
            return false;
        } else {
            return true;
        }
    }
}
