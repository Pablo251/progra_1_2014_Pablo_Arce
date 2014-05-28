/*
 *Name: Switch.
 
 *Information: This is the four class. 
 
 *Date: 21/5/2014.
 
 *Copyright.
  
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Switch {

    /**kky
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean validar = true;
        double valor1 = 0, valor2 = 0, resultado = 0;
        char continuar;
        int opción = 0;

        Scanner teclado = new Scanner(System.in);
        Operaciones oOperaciones = new Operaciones();
        

        //Ciclito.
        do {
            System.out.println("Digite la operación a evaluar.");
            System.out.println("1. Suma.");
            System.out.println("2. Resta.");
            System.out.println("3. División.");
            System.out.println("4. Multiplicación.");
            System.out.println("5. Raiz.");
            System.out.println("6. Potencia.");
            
            opción=Integer.parseInt(teclado.nextLine());
            switch(opción){
            
            case 1:
            System.out.println("Digite el valor del primer dígito.");
            valor1= Double.parseDouble(teclado.nextLine());
            System.out.println("Digite el valor del segundo dígito.");
            valor2= Double.parseDouble(teclado.nextLine());
            resultado= oOperaciones.Suma(valor1, valor2);
            System.out.println(resultado);
            break;
            
            case 2:
            System.out.println("Digite el valor del primer dígito.");
            valor1= Double.parseDouble(teclado.nextLine());
            System.out.println("Digite el valor del segundo dígito.");
            valor2= Double.parseDouble(teclado.nextLine());
            resultado= oOperaciones.Resta(valor1, valor2);
            System.out.println(resultado);
            break;            
            
            case 3:
            System.out.println("Digite el valor del primer dígito.");
            valor1= Double.parseDouble(teclado.nextLine());
            System.out.println("Digite el valor del segundo dígito.");
            valor2= Double.parseDouble(teclado.nextLine());
            resultado= oOperaciones.División(valor1, valor2);
            System.out.println(resultado);
            break;
            
            case 4:
            System.out.println("Digite el valor del primer dígito.");
            valor1= Double.parseDouble(teclado.nextLine());
            System.out.println("Digite el valor del segundo dígito.");
            valor2= Double.parseDouble(teclado.nextLine());
            resultado= oOperaciones.Multiplicación(valor1, valor2);
            System.out.println(resultado);
            break;
            
            case 5:
            System.out.println("Digite el valor del primer dígito.");
            valor1= Double.parseDouble(teclado.nextLine());
            System.out.println("Digite el valor del segundo dígito.");
            valor2= Double.parseDouble(teclado.nextLine());
            resultado= oOperaciones.Raiz(valor1, valor2);
            System.out.println(resultado);
            break;
            
            case 6:
            System.out.println("Digite el valor del primer dígito.");
            valor1= Double.parseDouble(teclado.nextLine());
            System.out.println("Digite el valor del segundo dígito.");
            valor2= Double.parseDouble(teclado.nextLine());
            resultado= oOperaciones.Potencia(valor1, valor2);
            System.out.println(resultado);
            break;
                
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
