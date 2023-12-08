package Lista;

public class Operaciones {
    Car inicio;
    
    Operaciones(){
        inicio = null;
    }
    
    public void ingresarDatos(String placa, String documento,String nombre, String telefono, int posicion) {
        
        String hora = "7:00";
        
        Car nuevo = new Car();
        nuevo.setPlaca(placa);
        nuevo.setName(nombre);
        nuevo.setPhone(telefono);
        nuevo.setHora(hora);
        nuevo.setDocumento(documento);
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
    }
}
