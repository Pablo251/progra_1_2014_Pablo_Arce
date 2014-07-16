/*
 *Name: Switch_Practice. "Homework"
 
 *Information: Switch practice... Task for 28/05/2014. 
 
 *Date: 27/5/2014.
 
 *Copyright.
  
 */
package switch_practice;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Switch_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int month = 0, num = 0, year = 0, day = 0;
        boolean validar = true;
        char continuar, note, day2;
        int opción = 0;

        Scanner teclado = new Scanner(System.in);
        //Ciclito.
        do {
            System.out.println("Ejercicios Switch,Tarea.");
            System.out.println("1. Número del mes.");
            System.out.println("2. Reportar casos de números.");
            System.out.println("3. Calificaciones de A a E.");
            System.out.println("4. Días del mes anual.");
            System.out.println("5. Números romanos. X");
            System.out.println("6. Fecha del día anterior");
            System.out.println("7. Día de la semana al que pertence una fecha");
            System.out.println("8. Primero del mes y día actual.");

            opción = Integer.parseInt(teclado.nextLine());
            switch (opción) {
                case 1:
                    System.out.println("Ingrese el Número del mes que desea obtener.");
                    month = Integer.parseInt(teclado.nextLine());
                    Case1 aCase1 = new Case1();
                    System.out.println(aCase1.Case1(month));
                    break;

                case 2:
                    System.out.println("Ingrese un número entero");
                    num = Integer.parseInt(teclado.nextLine());
                    Case2 aCase2 = new Case2();
                    System.out.println("El resultado es " + aCase2.Case2(num));
                    break;
                case 3:
                    System.out.println("Ingrese la calificación.");
                    note = (teclado.nextLine()).charAt(0);
                    Case3 aCase3 = new Case3();
                    System.out.println(aCase3.Case3(note));
                    break;
                case 4:
                    month = 0;
                    System.out.println("Ingrese el mes.");
                    month = Integer.parseInt(teclado.nextLine());
                    System.out.println("Ingrese el año.");
                    year = Integer.parseInt(teclado.nextLine());
                    Case4 aCase4 = new Case4();
                    System.out.println(aCase4.Case4(month, year));

                    //  System.out.println(aCase3.Case3(note));                                  
                    break;

                case 5:
                    System.out.println("No funciona... D:");
                    break;

                case 6:
                    day = 0;
                    month = 0;
                    year = 0;
                    System.out.println("Ingrese una fecha y se imprimirá el día anterior.");
                    System.out.println("Ingrese el dia.");
                    day = Integer.parseInt(teclado.nextLine());

                    System.out.println("Ingrese el mes.");
                    month = Integer.parseInt(teclado.nextLine());

                    System.out.println("Ingresee el año.");
                    year = Integer.parseInt(teclado.nextLine());
                    Case6 aCase6 = new Case6();
                    System.out.println("El día anterior a la fecha que se digitó es: ");
                    System.out.println(aCase6.Case6(day, month, year));
                case 7:
                    day = 0;
                    System.out.println("Digite un día del mes.");
                    day = Integer.parseInt(teclado.nextLine());
                    Case7 aCase7 = new Case7();
                    System.out.print("Este número corresponde al día: ");
                    aCase7.Case7(day);
                case 8:
                    day = 0;
                    System.out.println("Ingrese el primer día del mes:"
                            + "\n" + "L: Lunes." + "\n" + "M: Martes."
                            + "\n" + "K: Miercoles." + "\n" + "J: Jueves."
                            + "\n" + "V: Viernes." + "\n" + "S: Sábado."
                            + "\n" + "D: Domingo." + "Ingrese la letra inicial que "
                            + "corresponde al día.");
                    day2 = (teclado.nextLine()).charAt(0);
                    System.out.println("Digite la fecha actual.");
                    day = Integer.parseInt(teclado.nextLine());
                    Case8 aCase8 = new Case8();
                    System.out.println("El día de hoy es " + aCase8.Case8(day, day2));
                default:
                    break;
            }

            System.out.println("¿Desea continuar? ¿S/N?");

            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }
        } while (validar);
    }

}
