/*
 *Name: Class9
 
 *Information: Class exercice & task. 
 
 *Date: 4/6/2014 - 6/6/2014
 
 *Copyright.
  
 */
package class9;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] salarios = new double[5];
        int opcion = 0;
        boolean continuar = false;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Ingrese la opción del ejercicio a evaluar.");
            System.out.println("1. Ejercicio 1.");
            System.out.println("2. Ejercicio 2.");
            System.out.println("3. Ejercicio 3.");
            System.out.println("4. Salir.");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio1 oEjercicio1 = new Ejercicio1();
                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Ingrese el número del trabajador # " + (i + 1));
                        oEjercicio1.AgregarSalario(teclado.nextDouble());
                    }
                    System.out.println(oEjercicio1.ImprimirSueldos());
                    break;
                case 2:
                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite la altura de la persona # " + (i + 1));
                        oEjercicio2.AgregarAltura(teclado.nextFloat());
                    }
                    System.out.println("EL promedio es : " + oEjercicio2.Promedio());
                    System.out.println(oEjercicio2.ContarPersonas());
                    break;
                case 3:
                    Ejercicio3 oEjercicio3 = new Ejercicio3();
                    //Mañana.
                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Turno mañana: Ingrese el salario #" + (i + 1));
                        oEjercicio3.TurnoMañana(teclado.nextFloat());
                    }
                    //Tarde.
                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Turno Tarde: Ingrese el salario #" + (i + 1));
                        oEjercicio3.TurnoTarde(teclado.nextFloat());
                    }
                    System.out.println("Planillas:");
                    System.out.println(oEjercicio3.SalarioTurnos());
                break;
                case 4:
                        opcion = 6;
                    break;

                default:
                    break;
            }
            
        } while (opcion < 5);

    }
}
