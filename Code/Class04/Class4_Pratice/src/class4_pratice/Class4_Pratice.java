/*
 *Name: Class4_Practice
 
 *Information: Practice of class four. 
 
 *Date: 16/5/2014.
 
 *Copyright.
  
 */
package class4_pratice;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class4_Pratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * Exercise one.
         */
        //Variable declaring.
        int asterisco = 0, cont = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Práctica 2." + "\n");
        System.out.println("Ejercicio 1: Sucesión de asteriscos." + "\n");
        System.out.print("Digite la cantidad de asteriscos que desea que"
                + " aparezcan" + "\n");
        asterisco = Integer.parseInt(teclado.nextLine());
        //For.
        while(cont != asterisco){
            System.out.print("*");
            cont++;
        }
        //Out
        System.out.println("\n");
        /*
         * Exercise two.
         */
        //Variable declaring.
        int n = 0, y = 0, multiplo;
        
        System.out.println("Ejercicio 2: Sucesión de números mostrando los"
                + " múltiplos de un número que el usuario elija." + "\n");
        System.out.print("Ingrese el número hasta el cual desea que "
                + "llegue la sucesión" + "\n");
        n = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el múltiplo por el cual desea que se"
                + " dividan los números y estos se muestren en la sucesión.");
        y = Integer.parseInt(teclado.nextLine());
        
        System.out.println("\n");
        cont = 1;
        while(cont <= n){
        if(n % cont == 0){
            System.out.print(" * ");
        }else{
            System.out.print(" " + cont + " ");
        }
        cont++;
        }
        
        //Out.
        System.out.println("\n");
        /*
        * Exercise three.
        */
        //Variable declaring.
        double start = 0, finish = 0, increment = 0;

        
        System.out.println("Ejercicio 3: Incremento de un número es una "
                + "sucesión numérica." + "\n");
        System.out.println("Igrese el número en el cual desea iniciar la"
                + " sucesión.");
        start = Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese el número final para la sucesión.");
        finish = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite el incremento que desea en la sucesión.");
        increment = Double.parseDouble(teclado.nextLine());
        
        for (double i = start; i <= finish; i = i + increment) {
            System.out.print(i + ", ");
        }
        //Out.
        System.out.println("\n");
        /*
        *Exercise 4.
        */
        //Variable declaring.
        
        System.out.print("Ejercicio 4: Serie Padovan ¡No se hace!, siguiente.");
        
        //Out.
        System.out.println("\n");
        /*
        *Exercice 5.
        */
        //Varibale declaring.
        int num = 0, pot = 0, acum = 0;
        
        System.out.println("Ejercicio 5: Ingresar un número y elevarlo a otro, "
                + "que tamnbién debe ser digitado.");
        System.out.println("Digite el número.");
        num = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese la potencia.");
        pot = Integer.parseInt(teclado.nextLine());
        
        cont = 1;
        acum = num;
        while(cont != pot){
             acum = acum * num;             
             cont++;
        }
        System.out.print(acum);
        
        //Out.
        System.out.println("\n");
        /*
        *Exercice 6. Está raro o.O
        */
        // Variable declaring.
        
        //Out.
        System.out.println("\n");
        /*
        *Exercice 7. tampoco lo entiendo! 
        */
        //Variable declaring.
        System.out.println("\n");
        /*
        * Exercice 8.
        */
        //Variable declaring.
        int num2 = 0;
        
        System.out.println("Ejercicio 8: Tablas de un número." + "\n"
                            + "A. For" + "\n" + "B. While" + "\n" + "C. Do-While");
        System.out.println("Ingrese el número deseado.");
        num2 = Integer.parseInt(teclado.nextLine());
        
        
        System.out.println("1. Ciclo For:");
        acum = 0;
        for (int i = 0; i <= 10; i++) {
            acum = num2 * i;
            System.out.println(num2 + "X" + i + " = " + acum + ".");
        }
        System.out.println("2. Ciclo While:");
        acum = 0;
        cont = 0;
        while(cont <= 10){
        acum = num2 * cont;
            System.out.println(num2 + "X" + cont + " = " + acum + ".");
            cont++;
        }
        System.out.println("3. Ciclo Do-while");
        acum = 0;
        cont = 0;
        do{
            acum = num2 * cont;
            System.out.println(num2 + "X" + cont + " = " + acum + ".");
            cont++;
        }while(cont <= 10);
        
        //Out.
        System.out.println("\n");
        /*
        * Exercice 9.
        */
        //Variable declaring.
        int n2 = 0, prom = 0;
        
        System.out.print("Ejercicio 9: Promedio de 10 números." + "\n");
        acum = 0;
        cont = 1;
        while(cont <= 10){
            System.out.println("Ingrese un número.");
            n2 = Integer.parseInt(teclado.nextLine());
            acum = acum + n2;
            cont++;
        }
        prom = acum * cont;
        System.out.print("El promedio de los números digitados es de " + prom
                + "." + "\n");
        //Out.
        System.out.println("\n");
        /*
        * Exercice 10.
        */
        //Variable declaring.
        int n3 = 0;
        
        cont = -1;
        acum = 0;
        prom = 0;
        System.out.print("Ejercicio 10: Calcular promedios." + "\n");
        do{
            System.out.println("Ingrese un número. Si desea dejar de "
                    + "continuar igrese el número 0.");
            n3 = Integer.parseInt(teclado.nextLine());
            acum = acum + n3;
            cont++;
          }while(n3 != 0);
          prom = acum / cont;
          System.out.print("El promedio final es de " + prom + ".");
        //Out.
          System.out.println("\n");
         /*
          *Exercice 11:
          */  
          //Variables declaring.
          double dolar = 0;
          System.out.print("Ejercicio 11: Canverción de $10 a Colones" + "\n");
          System.out.println("Tipo de cambio 560.");
          for (int i = 1; i < 11; i++) {
              acum = i * 506;
              dolar++;
              System.out.println("Cambio:$" + dolar + " - " + "₡" + acum + ".");
        }
        //Out.
          System.out.println("\n");
        /*
        *Exercice 12:  
        */
        //Variable declaring.
          System.out.println("Ejercicio 12: Inversión en un banco a un año.");
          double acum1 = 0, acum2 = 0, ingreso = 1000;
          cont = 0;
          for (int i = 0; i < 12; i++) {
              acum2 = ingreso * 0.02;
              acum1 = ingreso + acum2;
              cont++;
              System.out.println("Mes "+cont+": "+"Ingreso de "+ingreso+"."
                      +" Inversión total: " + acum1);
              ingreso = ingreso + 1000;
              
        }
       //Out.
          System.out.println("\n");
        /*
          *Exercice 13:
          */  
         //Variable declaring.
          System.out.println("Ejercicio 13: Reloj digital.");
       //Out. No sé.
         System.out.println("\n");
         /*
         *Exercice 14:
         */
        //Variable declaring.
         System.out.println("Ejercicio 14: Inversión y gastos.");
         //Out. No sé.
         /*
         * Exercice 15: No sé.
         */
         //Variable declaring.
         
    }       
}
