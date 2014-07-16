/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliclos_class4;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Cliclos_Class4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Ciclo for.
         */
                
        int cantidad = 0;
        int suma = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite el número de impresiones que desea ver." 
                + "\n");
        
        cantidad = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Ciclo For" + "\n");
        
            for (int i = 0; i < cantidad; i++) {
            System.out.println(i);
        }
            
        System.out.println("\n" + "Inverso." + "\n");
        
        for (int i = cantidad; i >= 0; i--) {
            System.out.println(i);
            
        }
        
        /**
         * Ciclo while.
         */
        System.out.println("Ciclo While" + "\n");
        
        while(suma <= cantidad){
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma + 1;
        }
        
        System.out.print("\n" + "Inverso." + "\n");
        suma = cantidad;
        
        while(suma >= 0){
            System.out.print(suma);
            System.out.print(" - ");
            suma--;
        }
        
        /**
         * Ciclo Do While.
         */        
        System.out.print("\n" + "Ciclo Do While." + "\n");
        
        suma = 0;
        do{
            System.out.print(suma);
            System.out.print(" _ ");
            suma = suma + 1;
        }while(suma <= cantidad);
        
        System.out.print("\n" + "Inverso" + "\n");
        
        suma = cantidad;
        do{
            System.out.print(suma);
            System.out.print(" _ ");
            suma++;
        }while(suma >= 0);        
    }
}
