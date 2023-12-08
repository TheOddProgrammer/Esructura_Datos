package exposicion;

public class Nodo {
    private int valor;
    private Nodo left;
    private Nodo right;

    public Nodo(int dato) {
        this.valor = dato;
        this.right = null;
        this.left = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getLeft() {
        return left;
    }

    public Nodo getRight() {
        return right;
    }

    public void insertar(int dato) {
        if (dato < this.valor) {
            if (this.left == null) {
                this.left =  new Nodo(dato);
            } else {
                this.left.insertar(dato);
            }
        } else {
            if (this.right == null) {
                this.right =  new Nodo(dato);
            } else {
                this.right.insertar(dato);
            }
        }
    }
}
