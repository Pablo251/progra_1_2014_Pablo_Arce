/*
 *Name: Class2, Practice1
 
 *Information: This is the first practice. 
 
 *Date: 9/5/2014.
 
 *Copyright.
  
 */
package Class2_Practice1;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Class2_Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//1. First part. N,A,C//////////////////////////////////////////////////////////        
        // Variable declaration.
        int N = 0, sum = 0, rest = 0;
        double A = 0;
        char C;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ejercicio #1: Suma, resta y captar una letra.");
        System.out.print("\n" + "Ingrese un número." + "\n");
        N = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese un segundo número." + "\n");
        A = Integer.parseInt(teclado.nextLine());
        System.out.print("Dijite una letra." + "\n");
        C = (teclado.nextLine()).charAt(0);  
        
        //Math.
        sum = (int) (N + A);
        rest = (int) (N - A);
        
        //Answers.        
        System.out.print("Resultados:" + "\n" + "El resultado de: " + N 
        + " + " + A + " = " + sum + "\n" + "El resulatado de: " + N + " - " 
        + A + " = " + rest + "\n" + "La letra introducida fue " + C + "." + "\n");        
        //Next part.
        System.out.print("\n");
//Second part. X & Y, N1 & M.///////////////////////////////////////////////////
        // Variable declaration.        
        int X = 0, Y = 0, sum1 = 0, mult = 0, div = 0, rest1;
        double N1 = 0, M = 0, sum2 = 0, mult1 = 0, div1 = 0, rest2 = 0;
        
        System.out.print("Ejercicio 2: Serie de operaciones entre X y Y y N y M."
                        + "\n");
        System.out.print("Digite el valor para X." + "\n");
        X = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite el valor para Y." + "\n");
        Y = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite el valor para N." + "\n");
        N1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite el valor para M." + "\n");
        M = Integer.parseInt(teclado.nextLine());        
        
        // Math (X & Y).
        sum1 = (int) (X+Y);
        rest1 = (int) (X-Y);
        mult = X*Y;
        div = X/Y;
        // Math (N & M).
        sum2 = (double) (N1+M);
        rest2 = (double) (N1-M);
        mult1 = N1*M;
        div1 = N1/M;        
        
        //Answers.
        System.out.print("Resultados #2" + "\n");
        System.out.print("El resultado de las operaciones entre (X y Y) "
                        + "y (N y M) es:" 
                        + "\n" + "X + Y = " + sum1 + "\n" + "X - Y = " + rest1 
                        + "\n" + "X * Y = " + mult + "\n" + "X / Y = " + div
                        + "\n" + "N + M = " + sum2 + "\n" + "N - M = " + rest2
                        + "\n" + "N * M = " + mult1 + "\n" + "N / M = " + div1
                        + "\n");        
        //Next part.
        System.out.print("\n");
//Third part: N2.///////////////////////////////////////////////////////////////
        // Variable declaration. 
        int N2 = 0, inc = 0, dec = 0, duplic = 0;
     
        System.out.print("Ejercicio #3: Incrementar, decrementar y duplicar"
                + " un número." + "\n");
        System.out.print("Ingrese un valor númerico." + "\n");
        N2 = Integer.parseInt(teclado.nextLine());
     
        //Math
        inc = N2 + 77;
        dec = N2 - 3;
        duplic = N2 * 2;
     
        //Answers.     
        System.out.print("Resultados:"
         + "\n" + "El resultado de incrementar " + N2 + " a 77 es " + inc + "."
         + "\n" + "El resultado de decrementar " + N2 + " en 3 es " + dec + "."
         + "\n" + "El resultado de duplicar " + N2 + " es de " + duplic + "."
         + "\n");        
        //Next part.
        System.out.print("\n");
//Fourth part: A1, B, C1, D y change////////////////////////////////////////////
        // Variable declaration.         
        int A1=0, B=0, C1=0, D=0, change=0, change2=0, change3=0, change4=0;

        System.out.print("Ejercicio #4: Cambio de valores entre números." + "\n");
        System.out.print("Ingrese un valor para el primer número A." + "\n");
        A1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese un valor para el segundo número. B" + "\n");
        B = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese un valor para el tercer número. C" + "\n");
        C1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese un valor para el cuarto número. D" + "\n");
        D = Integer.parseInt(teclado.nextLine());
        
        //Math
        change = B;
        change2 = C1;
        change3 = A1;
        change4 = D;

        //Answers.
        System.out.print("Resultados:" + "\n");
        System.out.print("Cambio 1: B = C." + "\n"
                        + B + " es igual a " + change2 + "."
                        + "\n");
        System.out.print("Cambio 2: C = A." + "\n"
                        + C1 + " es igual a " + change3 + "." 
                        + "\n");
        System.out.print("Cambio 3: A = D." + "\n"
                        + A1 + " es igual a " + change4 + "." 
                        + "\n");
        System.out.print("Cambio 4: D = B." + "\n"
                        + D + " es igual a " + change + "." 
                        + "\n");        
        //Next Part.
        System.out.print("\n");
//Fifth part: A2////////////////////////////////////////////////////////////////
        // Variable declaration. .         
        int A2 = 0;
              
        System.out.print("Ejercicio #5: Consulta si un número es par o impar."
                        + "\n");
        System.out.print("Ingrese el número a consutar." + "\n");
        A2 = Integer.parseInt(teclado.nextLine());
        
        //Math logic.
        if(A2 % 2 == 0){
            System.out.print("El número digitado es par." + "\n");
        }else{
            System.out.print("El número digitado es impar." + "\n");
        }        
        //Next Part.
        System.out.print("\n");
//Six part: B1//////////////////////////////////////////////////////////////////        
        // Variable declaration.  
        int B1 = 0, test = 0;

        System.out.print("Ejercicio #6: Consulta si un número es positivo o"
                + " negativo." + "\n");
        System.out.print("Digite el valor del número que se desea consultar." 
                        + "\n");
        B1 = Integer.parseInt(teclado.nextLine());
                
        //Math logic.      
        if(B1 >= 0){
        System.out.print("El número " + B1 + " es positivo." + "\n");
        }else{
        System.out.print("El número " + B1 + " es negativo." + "\n");
        }               
        //Next part.
        System.out.print("\n");
//Seven part: C2//////////////////////////////////////////////////////////////// 
        // Variable declaration.         
        int C2 = 0;

        System.out.print("Ejercicio 7:" + "\n"
                    + "1. Consulta si el número es positivo o negativo." + "\n"
                    + "2. Consulta si el número es par o impar." + "\n"
                    + "3. Consulta si el número es múltiplo de 5." + "\n"
                    + "4. Consulta si el número es múltiplo de 10." + "\n"
                    + "5. Consulta su el número es mayor o menos que 100." + "\n");        
        System.out.print("Ingrese un número entero." + "\n");
        C2 = Integer.parseInt(teclado.nextLine());
        
        //Math logic.
        //1.
        if(C2 >= 0){
            System.out.print("1. El número " + C2 + " es positivo." + "\n");
        }else{
            System.out.print("1. El número " + C2 + " es negativo." + "\n");
        }
        //2.
        if(C2 % 2 == 0){
            System.out.print("2. El número " + C2 + " es par." + "\n");
        }else{
            System.out.print("2. El número " + C2 + " es impar." + "\n");
        }
        //3. 
        if(C2 % 5 == 0){
            System.out.print("3. El número " + C2 + " es múltiplo de 5."
            + "\n");
        }else{
            System.out.print("3. El número " + C2 + " no es múltiplo de 5."
            +"\n");
        }
        //4. 
        if(C2 % 10 == 0){
            System.out.print("4. El número " + C2 + " es múltiplo de 10."
            + "\n");
        }else{
            System.out.print("4. El número " + C2 + " no es múltiplo de 10."
            + "\n");
        }
        //5.
        if(C2 > 100){
           System.out.print("5. El número " + C2 + " es mayor que 100." + "\n");
        }else{
        if(C2 < 100){
           System.out.print("5. El número " + C2 + " es menor que 100." + "\n");
        }else{
           System.out.print("5. EL número " + C2 + " es igual a 100." + "\n");
        }
        }
        System.out.print("\n" + "Fin de los ejercicios." + "\n");     
    }
}
