package Exercise;

public class Nodo {
    private String dato;
    private Nodo before;
    private Nodo after;

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getBefore() {
        return before;
    }

    public void setBefore(Nodo before) {
        this.before = before;
    }

    public Nodo getAfter() {
        return after;
    }

    public void setAfter(Nodo after) {
        this.after = after;
    }
}
