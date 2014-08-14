/*
 *Name: Class19
 
 *Information: TDAs_2 
 
 *Date: 16/7/2014.
 
 *Copyright.
  
 */
package class19;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila oPila = new Pila();
        oPila.Push("Efren");
        oPila.Push("Joss");
        oPila.Push("Amdrey");
        oPila.Push("Jose");
        oPila.Imprimir();
        
        System.out.println("La cantidad de elementos es " + oPila.Cantidad());
        if (oPila.Vacia()) 
            System.out.println("La fila no está vacía");        
        else
            System.out.println("La pila está vacía");
        oPila.Pop();
        oPila.Pop();
        oPila.Imprimir();
        
        /*Lista oLista=new Lista();
        oLista.Insertar("Efren", "201111-4");
        oLista.Insertar("Joss", "3666611-5");
        oLista.Insertar("Navas", "744455-8");        
        oLista.Imprimir();*/
        
        
    }
}
