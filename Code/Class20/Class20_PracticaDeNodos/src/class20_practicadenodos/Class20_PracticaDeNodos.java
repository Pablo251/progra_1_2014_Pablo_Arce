/*
 *Name: Class20
 
 *Information: Nodos.
 
 *Date: 18/07/2014.
 
 *Copyright.
  
 */
package class20_practicadenodos;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class20_PracticaDeNodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Listas oListas = new Listas();
        oListas.Insertar(002);
        oListas.Insertar(013);
        oListas.Insertar(045);
        oListas.Insertar(105);        
        oListas.Insertar(063);        
        oListas.Insertar(666);        
        oListas.Insertar(000);        


        int opt = 0;

        Scanner oTeclado = new Scanner(System.in);
        do{
        //Menú de la práctica
        System.out.println("Prática nodos");
        System.out.println("1. Incertar nodos ordenadamente en una lista de números enteros.");
        System.out.println("2. Mostrar el primer nodo de la lista y  el total de elementos de la lista.");
        System.out.println("3. Conteo de numeros flotantes.");        
        opt = oTeclado.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Instrucion: Ingrese una serie de numeros sucesivamente hasta que ingrese 0");

                /*
                 OrdenamientoBurbuja ob=new OrdenamientoBurbuja();
                 arregloOdenado=ob.OrdenamientoB(arreglo2, "B");
                 System.out.println("Oedenamiento Burbuja.");
                 for (int i = 0; i < arregloOdenado.length; i++) {
                 System.out.println(arregloOdenado[i]);
                 }
                 */
                /*OrdenamientoBurbuja1 Ob1 = new OrdenamientoBurbuja1();
                arregloOrdenado = Ob1.OrdenamientoB(arregloPt1);
                System.out.println("Orden de números.");
                for (int i = 0; i < arregloOrdenado.length; i++) {
                    System.out.println(arregloOrdenado[1]);
                }*/
                System.out.println("No funciona.");
                break;

            case 2:
                System.out.println(oListas.ImpEjer2());
                break;
                
            case 3:
                break;
                

            default:
                break;

        }
    }while(opt < 5);

    }
}
