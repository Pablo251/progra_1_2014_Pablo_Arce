/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class20_practicadenodos;

/**
 *
 * @author
 */
public class Listas {
    // cargamos la clase nodo de lista como vriable para utilizara

    private NodoDelista inicio;

    // Variables propias.
    int contNodos = 0;
// Decimos Que la lista inicio esta en nulo
    public Listas() {
        inicio = null;
    }

    // metodo boolean que nos dice si la lista esta vacia o no ¡¡¡
    public boolean EstaVacia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public void Insertar(int dato) {
        NodoDelista nuevo;
        nuevo = new NodoDelista();
        nuevo.setDato(dato);


        if (inicio == null) {
            nuevo.setSiguiente(null);
            inicio = nuevo;
            contNodos++;
        } else {
            NodoDelista auxiliar = inicio;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            contNodos++;
        }
    }
    
    public String ImpEjer2(){
    String retorno = "";
    
    retorno = "El primer elemento de la lista es: " + inicio.getDato() + "\n" +
            "La cantidad total de elementos dentro de la lista es: " + contNodos;
    
    return  retorno;
    }

    public void Imprimir() {
        NodoDelista recorrido = inicio;
        System.out.println("Listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }
}
