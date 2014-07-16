/*
 *Name: Class8_StringPractice.
 
 *Information: Class8. String practice.
 
 *Date: 30/5/2014.
 
 *Copyright.
  
 */
package class8_stringpractice;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class8_StringPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Varaibles declaring.
        int menu = 0;
        Scanner oScanner = new Scanner(System.in);
        //Start.

        do {
            System.out.println("Bienvenido.");
            System.out.println("1. Ejercicio 1.");
            System.out.println("2. Ejercicio 2.");

            menu = oScanner.nextInt();
            switch (menu) {

                case 1:
                    System.out.println("Ejercicios 1:");
                    System.out.println("Ingrese la palabra que desea evaluar.");
                    Class8Exercice1 oClass8Exercice1 = new Class8Exercice1();
                    oScanner = new Scanner(System.in);
                    oClass8Exercice1.setPalabra(oScanner.nextLine());
                    System.out.println(oClass8Exercice1.Rotar());
                    System.out.println(oClass8Exercice1.RotarPalindromo());
                    System.out.println("Digite una oración.");
                    oScanner = new Scanner(System.in);
                    oClass8Exercice1.setHilera(oScanner.nextLine());
                    System.out.println("Ingrese la palabra que desea que se busque.");
                    oScanner = new Scanner(System.in);
                    oClass8Exercice1.setBusqPalabra(oScanner.nextLine());
                    System.out.println(oClass8Exercice1.Espacio());
                    System.out.println("Digite una oración.");
                    oScanner = new Scanner(System.in);
                    oClass8Exercice1.setHilera2(oScanner.nextLine());
                    System.out.println("Digite la palabra que desea buscar, esta"
                            + " se le montrará la cantidad de veces que aparesca"
                            + "en la ocación que se digitó.");
                    oScanner = new Scanner(System.in);
                    oClass8Exercice1.setBusqPalabra2(oScanner.nextLine());
                    System.out.println(oClass8Exercice1.Buscador());
                    break;

                case 2:
                    System.out.println("Ejercicios 2:");
                    System.out.println("Ingrese una oración o un texto.");
                    Cass8Exercice2 oCass8Exercice2 = new Cass8Exercice2();
                    oScanner = new Scanner(System.in);
                    oCass8Exercice2.setCadena(oScanner.nextLine());
                    System.out.println("Ingrese el número con que iniciará.");
                    oScanner = new Scanner(System.in);
                    oCass8Exercice2.setApertura(Integer.parseInt(oScanner.nextLine()));
                    System.out.println("Ingrese el número con que finalizará.");
                    oScanner = new Scanner(System.in);
                    oCass8Exercice2.setTerminal(Integer.parseInt(oScanner.nextLine()));
                    System.out.println(oCass8Exercice2.Substring());
                    System.out.println("Ingrese nuevamente una oración o un texto.");
                    oScanner = new Scanner(System.in);
                    oCass8Exercice2.setCadena(oScanner.nextLine());
                    System.out.println(oCass8Exercice2.ToUpperCase());
                    System.out.println("Ingrese un número entero.");
                    oScanner = new Scanner(System.in);
                    oCass8Exercice2.setEntero(Integer.parseInt(oScanner.nextLine()));
                    System.out.println(oCass8Exercice2.valueOf());
                    System.out.println(oCass8Exercice2.indexOf());
                    break;
            }

        } while (menu <= 7);
        System.out.println("Muchas gracias, hasta la próxima.");
    }
}
