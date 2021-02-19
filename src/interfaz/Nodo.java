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

public class Nodo {

    private String numeros;
    private Nodo sgte;

    public void Nodo() {
        this.numeros = "";
        this.sgte = null;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
