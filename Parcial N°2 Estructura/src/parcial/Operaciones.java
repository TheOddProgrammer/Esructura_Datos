package Parcial;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operaciones {

    Nodo inicio = null;
    Nodo ultimo = null;

    Operaciones() {
        inicio = null;
        ultimo = null;
    }

    public void crearNodo(String nombre, int edad, double definitiva) {
        Nodo nuevo = new Nodo();
        nuevo.setName(nombre);
        nuevo.setAge(edad);
        nuevo.setDef(definitiva);
        nuevo.setSig(null);
        nuevo.setAnt(null);

        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSig(inicio);
            inicio.setAnt(nuevo);
            inicio = nuevo;
            inicio.setAnt(ultimo);
            ultimo.setSig(inicio);
        }
    }

    public void contarGanadores() {
        Nodo temporal = inicio;
        int contadorGanadores = 0;

        do {
            if (temporal.getDef() >= 3.0) {
                contadorGanadores++;
            }
            temporal = temporal.getSig();

            if (temporal == null) {
                break;
            }
        } while (temporal != inicio);

        JOptionPane.showMessageDialog(null, "La cantidad de estudiantes que aprobaron la materia es de: " + contadorGanadores);
    }

    public void mayoresAndMenores() {
        Nodo temporal = inicio;
        int contadorMayores = 0;
        int contadorMenores = 0;

        do {
            if (temporal.getAge() >= 18) {
                contadorMayores++;
            } else {
                contadorMenores++;
            }
            temporal = temporal.getSig();
            if (temporal == null) {
                break;
            }
        } while (temporal != inicio);

        JOptionPane.showMessageDialog(null, "La cantidad de mayores de edad es de: " + contadorMayores);
        JOptionPane.showMessageDialog(null, "La cantidad de menores de edad es de: " + contadorMenores);
    }

    public void contadorAprobadoDesaprobado() {
        Nodo temporal = inicio;
        int contadorAprobados = 0;
        int contadorDesaprobados = 0;
        do {
            if (temporal.getDef() >= 3.0) {
                contadorAprobados++;
            } else {
                contadorDesaprobados++;
            }
            temporal = temporal.getSig();
            if (temporal == null) {
                break;
            }

        } while (temporal != inicio);

        JOptionPane.showMessageDialog(null, "La cantidad de aprovados es de: " + contadorAprobados);
        JOptionPane.showMessageDialog(null, "La cantidad de desaprovados es de: " + contadorDesaprobados);
    }

    public void buscarAndMostrar(String nombre) {
        Nodo temporal = inicio;

        do {
            if (!(temporal.getName().equalsIgnoreCase(nombre))) {
                temporal = temporal.getSig();
            } else {
                break;
            }

            if (temporal == null) {
                break;
            }
        } while (temporal != inicio);

        if (temporal != null) {
            if (!(temporal.getName().equalsIgnoreCase(nombre))) {
                JOptionPane.showMessageDialog(null, "La Persona Buscada no se Encuentra en Lista");
            } else {
                if (temporal == inicio && ultimo == inicio) {
                    JOptionPane.showMessageDialog(null, "Se Encuentra y es el Unico Dato en Lista");
                } else if (temporal.getAnt() == ultimo && temporal.getSig() == ultimo) {
                    JOptionPane.showMessageDialog(null, "El estudiante al frente es: " + temporal.getSig().getName());
                    JOptionPane.showMessageDialog(null, "No hay estudiante atras");
                } else if (temporal.getSig() == inicio && temporal.getAnt() == inicio) {
                    JOptionPane.showMessageDialog(null, "No existe estudiante al frente.");
                    JOptionPane.showMessageDialog(null, "El estudiante atras del buscado es: " + inicio.getName());
                } else if (temporal.getAnt() == ultimo && temporal.getSig() != ultimo) {
                    JOptionPane.showMessageDialog(null, "El estudiante al frente es: " + temporal.getSig().getName());
                    JOptionPane.showMessageDialog(null, "No hay estudiante atras del buscado.");
                } else if (temporal.getAnt() == inicio && temporal.getSig() == ultimo) {
                    JOptionPane.showMessageDialog(null, "El estudiante atras del buscado es: " + inicio.getName());
                    JOptionPane.showMessageDialog(null, "El estudiante al frente del buscado es: " + ultimo.getName());
                } else if (temporal.getSig() == inicio && temporal.getAnt() != inicio) {
                    JOptionPane.showMessageDialog(null, "El estudiante atras del buscado es: " + temporal.getAnt().getName());
                    JOptionPane.showMessageDialog(null, "No hay estudiante al frente del buscado");
                } else if (temporal.getAnt() == inicio && temporal.getSig() != ultimo) {
                    JOptionPane.showMessageDialog(null, "El estudiante atras del buscado es " + inicio.getName());
                    JOptionPane.showMessageDialog(null, "El estudiante al frente del buscado es " + temporal.getSig().getName());
                } else if (temporal.getAnt() != inicio && temporal.getSig() == ultimo) {
                    JOptionPane.showMessageDialog(null, "El estudiante atras del buscado es " + temporal.getAnt().getName());
                    JOptionPane.showMessageDialog(null, "El estudiante al frente  del buscado es " + ultimo.getName());
                } else {
                    JOptionPane.showMessageDialog(null, "El estudiante atras del buscado es " + temporal.getAnt().getName());
                    JOptionPane.showMessageDialog(null, "El estudiante al frente  del buscado es " + temporal.getSig().getName());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha Encontrado");
        }
    }

    public void imprimir() {
        Nodo temporal = inicio;
        do {
            JOptionPane.showMessageDialog(null, "Estudiante: " + temporal.getName() + "\nEdad: " + temporal.getAge() + "\nDefinitiva: " + temporal.getDef());
            temporal = temporal.getSig();
            if (temporal == null) {
                break;
            }
        } while (temporal != inicio);
    }

    public boolean listEmpty() {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
            return false;
        } else {
            return true;
        }
    }

    public void cambioDeNombre(String nombre) {
        Nodo temporal = inicio;
        int count = 0;

        for (int i = 0; i < 2; i++) {
            temporal = inicio;
            do {
                if (i == 0) {
                    if (temporal == null) {
                        break;
                    }
                    if (temporal.getName().equalsIgnoreCase(nombre)) {
                        count++;
                    }
                    temporal = temporal.getSig();
                } else {
                    if (temporal == null) {
                        break;
                    }
                    if (temporal.getName().equalsIgnoreCase(nombre)) {
                        break;
                    }
                    temporal = temporal.getSig();
                }
            } while (temporal!=inicio);
        }

        if (count == 1) {
            temporal.setName(JOptionPane.showInputDialog("Ingrese el Nuevo Nombre"));
        } else if (count > 1) {
            JOptionPane.showMessageDialog(null, "Hay Mas de Dos Nombre, no se Puede Realizar");
        } else if(count==0){
            JOptionPane.showMessageDialog(null, "Persona no Se Encuentra en Lista");
        } else {
            System.out.println("Ni Modo");
        }
    }

    public void deleteStudent(String name) {
        Nodo temporal = inicio;

        do {
            if (!(temporal.getName().equalsIgnoreCase(name))) {
                temporal = temporal.getSig();
            } else {
                break;
            }
        } while (temporal != inicio);

        if (!(temporal.getName().equalsIgnoreCase(name))) {
            JOptionPane.showMessageDialog(null, "La Persona no se Encuentra en Lista");
        } else {
            JOptionPane.showMessageDialog(null, "Accion Realizada!!");
            if (inicio == ultimo) {
                inicio = null;
                ultimo = null;
            } else if (temporal == inicio & temporal.getSig() == ultimo) {
                inicio = ultimo;
                inicio.setAnt(ultimo);
                ultimo.setSig(inicio);
            } else if (temporal == ultimo & temporal.getAnt() == inicio) {
                ultimo = inicio;
                inicio.setAnt(ultimo);
                ultimo.setSig(inicio);
            } else if (temporal == inicio & temporal.getSig() != ultimo) {
                inicio = temporal.getSig();
                ultimo.setSig(inicio);
            } else if (temporal == ultimo & temporal.getAnt() != inicio) {
                ultimo = temporal.getAnt();
                ultimo.setSig(inicio);
            } else {
                temporal.getAnt().setSig(temporal.getSig());
                temporal.getSig().setAnt(temporal.getAnt());
            }
        }
    }

    public void orderPerAge() {
        ArrayList<Nodo> list = new ArrayList<>();
        ArrayList<String> ordenada = new ArrayList<>();

        int bigger = 0;
        int tamaño = size();
        Nodo temporal = inicio;
        Nodo prueba = null;

        for (int i = 0; i < tamaño; i++) {
            list.add(temporal);
            temporal = temporal.getSig();
        }

        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAge() > bigger) {
                    bigger = list.get(i).getAge();
                    prueba = list.get(i);
                }
            }
            ordenada.add(prueba.getName());
            list.remove(prueba);
            bigger = 0;
            prueba = null;
            j = 0;
        }

        list.forEach(System.out::println);

        if (size() > 1) {
            ordenada.add(list.get(0).getName());
        }

        for (int i = 0; i < ordenada.size(); i++) {
            JOptionPane.showMessageDialog(null, ordenada.get(i));
        }
    }

    public int size() {
        Nodo temporal = inicio;
        int count = 0;

        do {
            count++;
            temporal = temporal.getSig();
            if (temporal == null) {
                break;
            }
        } while (temporal != inicio);

        return count;
    }
}
