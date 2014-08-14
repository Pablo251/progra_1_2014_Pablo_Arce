/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class20_practicadenodos;

/**
 *
 * @author estudiante
 */
public class NodoDelista {

    private int dato;
    private NodoDelista siguiente;

    public NodoDelista() {
        dato = 0;
        siguiente = null;

    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoDelista getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDelista siguiente) {
        this.siguiente = siguiente;
    }
}

