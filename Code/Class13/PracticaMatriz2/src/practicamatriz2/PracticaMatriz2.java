/*
 *Name: PracticaMatriz2
 
 *Information: This is the first class. 
 
 *Date: 18/6/2014.
 
 *Copyright.
  
 */
package practicamatriz2;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class PracticaMatriz2 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*Declaración de variables.*/
        Scanner oScanner = new Scanner(System.in);
        int menu = 0;

        do {
            //menu
            System.out.println("Práctica matriz 2.");
            System.out.println("1. Mostrar el promedio de los datos de la matriz.");
            System.out.println("2. Imprimir el mayor de los impares.");
            System.out.println("3. Imprimir el promedio pares.");
            System.out.println("4. Mostrar el porcentaje de impares de cada fila.");
            menu = oScanner.nextInt();
            switch (menu) {
                case 1:
                    Ejercicio1 oEjercicio1 = new Ejercicio1();
                    oEjercicio1.CargarMatriz();
                    oEjercicio1.ImprimirPromedio();
                    break;

                case 2:
                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    oEjercicio2.CargarMatriz();
                    oEjercicio2.MayorImpares();
                    break;
                    
                case 3:
                    Ejercicio3 oEjercicio3 = new Ejercicio3();
                    oEjercicio3.CargarMatriz();
                    oEjercicio3.PromedioPares();
                    break;
                    
                case 4:
                    Ejercicio4 oEjercicio4 = new Ejercicio4();
                    oEjercicio4.CargarMatriz();
                    oEjercicio4.PorcentageImparesXFila();
                    break;
                   
                default:
                    break;

            }

        } while (menu < 5);

    }
}
