/*
 *Name: Class14_Ordenamiento de Selección.
 
 *Information: Ordenamiento de Slección.
 
 *Date: 20/6/2014.
 
 *Copyright.
  
 */
package class14;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arreglo = {56,4,85,87,42};
        int[] arregloOrdenado;
        OrdenamientoSelección os = new OrdenamientoSelección();
        arregloOrdenado = os.OrdenS(arreglo, "A");
        for (int i = 0; i < arregloOrdenado.length-1; i++) {
            System.out.println(arregloOrdenado[i]);
        }
    }
}
