/*
 *Name: Class7.
 
 *Information: Class7... Strings... 
 
 *Date: 28/5/2014.
 
 *Copyright.
  
 */
package class7;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner oScanner = new Scanner(System.in);

        do {
            System.out.println("Hola :D. Digite la opción que desea : ");
            System.out.println("1. Ejercicio 1.");
            System.out.println("2. Ejercicio 2.");

            opcion = oScanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite el correo a evaluar.");
                    oScanner = new Scanner(System.in);
                    Ejercicio1 oEjercicio1 = new Ejercicio1(oScanner.nextLine());
                    System.out.println(oEjercicio1.ValidarCorreo());
                    break;
                case 2:
                    System.out.println("Digite la cadena a evaluar.");
                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    oScanner = new Scanner(System.in);
                    oEjercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oEjercicio2.MediaCadena());
                    System.out.println(oEjercicio2.UltimoValor());
                    System.out.println(oEjercicio2.Alrevez());
                    break;
            }
        } while (opcion <= 7);
        

        
        System.out.println("Digite el correo a evaluar.");
        Ejercicio1 oeEjercicio1 = new Ejercicio1(oScanner.nextLine());
        System.out.println(oeEjercicio1.ValidarCorreo());

    }
}