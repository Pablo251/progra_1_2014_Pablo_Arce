/*
 *Name: Class11
 
 *Information: Class11, make a matrix. 
 
 *Date: 11/6/2014.
 
 *Copyright.
  
 */

package class11;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ejercicio1 oEjercicio1=new Ejercicio1();
        oEjercicio1.CargarMatriz();
        oEjercicio1.Imprimir();
        
        Ejercicio2 oEjercicio2=new Ejercicio2();
        oEjercicio2.CargarMatriz();
        oEjercicio2.ImprimirDiagonal();

        
        Ejercicio3 oEjercicio3=new Ejercicio3();
        oEjercicio3.CargarMatriz();
        oEjercicio3.PrimerColumna();
        oEjercicio3.UltimaColumna();
        oEjercicio3.PrimeraFila();
        oEjercicio3.UltimaFila();
    }
    
}
