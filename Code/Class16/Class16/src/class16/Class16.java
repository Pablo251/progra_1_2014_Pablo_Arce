/*
 *Name: Class1
 
 *Information: This is the first class. 
 
 *Date: 27/6/2014.
 
 *Copyright.
  
 */
package class16;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class16 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo={56,4,85,85,42};
        int[] arreglo2={56,4,85,85,42};        
        int[] arregloOdenado;
        OdernamientoSeleccion os = new OdernamientoSeleccion();
        arregloOdenado = os.OrdenS(arreglo, "A");
        System.out.println("Ordenamiento Selección.");
        for (int i = 0; i < arregloOdenado.length; i++) {
            System.out.println(arregloOdenado[i]);
        }
        
        OrdenamientoBurbuja ob=new OrdenamientoBurbuja();
        arregloOdenado=ob.OrdenamientoB(arreglo2, "B");
        System.out.println("Oedenamiento Burbuja.");
        for (int i = 0; i < arregloOdenado.length; i++) {
            System.out.println(arregloOdenado[i]);
        }
        
    }
}
