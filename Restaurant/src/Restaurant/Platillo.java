package Restaurant;

public class Platillo {
    private String nombre;
    private double precio;
    private int cantidad;
    private String hora;
    private Platillo ant;
    private Platillo sig;
    private int turn;

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Platillo getAnt() {
        return ant;
    }

    public void setAnt(Platillo ant) {
        this.ant = ant;
    }

    public Platillo getSig() {
        return sig;
    }

    public void setSig(Platillo sig) {
        this.sig = sig;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }    
}
