/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class19;

/**
 *
 * @author Estudiante
 */
public class Pila {
    private NodoDeLista raiz;
    
    public Pila(){
        raiz = null;
    }
    
    public  void Push(String dato){
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        if (raiz==null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        }
        else{
            nuevo.setSiguiente(raiz);
            raiz=nuevo;
        }
        
    }
    
    public Object Pop(){
        if (raiz!=null) {
            Object info=raiz.getDato();
            raiz=raiz.getSiguiente();
            return info;
        }
        return new Object();
    }
    
    public void Imprimir(){
    NodoDeLista recorrido=raiz;
        System.out.println("Listado de todos los elemento de la pila.");
        while (recorrido!=null){
            System.out.println(recorrido.getDato()+"-");
            recorrido=recorrido.getSiguiente();
        }
        System.out.println();
    }
    
    public boolean Vacia(){
        if (raiz == null) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public int Cantidad(){
        int cantidad=0;
        NodoDeLista recorrido = raiz;
        while(recorrido != null){
            cantidad++;
            recorrido=recorrido.getSiguiente();
        }
        return  cantidad;
    }
    
}
