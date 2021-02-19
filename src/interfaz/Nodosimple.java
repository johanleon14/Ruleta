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

public class Nodosimple {

    private int dinero;        // Variable en la cual se va a guardar el valor.
    private Nodosimple sgte;  // Variable para enlazar los nodos.
    int id;
    String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Nodo() {
        this.dinero = 0;
        this.sgte = null;
    }

    public Nodosimple getSgte() {
        return sgte;
    }

    public void setSgte(Nodosimple sgte) {
        this.sgte = sgte;
    }

    // Métodos get y set para los atributos.
    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

}
