package Taller;

public class Nodo {
    private String name;
    private String gender;
    private int age;
    private String document;
    private Nodo left;
    private Nodo right;

    public Nodo(String name, String gender, int age, String document) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.document = document;
        this.left = null;
        this.right = null;
    }

    public void insertarEdad(Nodo node) {
        if (node.getAge() < this.age) {
            if (this.left == null) {
                this.left =  new Nodo(this.name, this.gender, this.age, this.document);
            } else {
                this.left.insertarEdad(node);
            }
        } else {
            if (this.right == null) {
                this.right =  new Nodo(this.name, this.gender, this.age, this.document);
            } else {
                this.right.insertarEdad(node);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }
}
