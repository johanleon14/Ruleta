/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Zuly Mejia-160003724
 *         Johan Leon-160003717
 */

public class ListaCircularSimple {

    private Nodo cabeza;
    private Nodo cola;
    private int tam;
    String Numeros[] = {"0","32","15","19","4","21","2","25",
                            "17","34","6","27","13","36","11",
                            "30","8","23","10","5","24","16","33",
                            "1","20","14","31","9","22","18",
                            "29","7","28","12","35","3","26"};///numeros disponibles en la ruleta

    /**
     * Constructor por defecto.
     */
    public void Lista() {
        cabeza = null;
        cola = null;
        tam = 0;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public int getTam() {
        return tam;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    public void IniciarPersonajes() {
        for(String i:Numeros){
            agregarAlFinal(i);
        }
    }

    //////////////////AGREGA LOS NUMEROS A UNA LISTA CIRCULAR////////////////
    public void agregarAlFinal(String color) {
        Nodo nuevo = new Nodo();
        nuevo.setNumeros(color);
        if (esVacia()) {
            cabeza = nuevo;
            cola = nuevo;
            cola.setSgte(cabeza);
        } else {
            cola.setSgte(nuevo);
            nuevo.setSgte(cabeza);
            cola = nuevo;
        }
        tam++;
    }

    ///////////////////////ORGANIZA LA LISTA CIRCULAR///////////////////////////
    public void listar() {
        if (!esVacia()) {
            Nodo aux = cabeza;
            int i = 0;
            System.out.print("-> ");
            do {
                System.out.print(i + ".[ " + aux.getNumeros() + " ]" + " ->  ");
                aux = aux.getSgte();
                i++;
            } while (aux != cabeza);
        }
    }
}
