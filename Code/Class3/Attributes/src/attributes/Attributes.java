/*
<<<<<<< HEAD
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

/**
 *
 * @author Estudiante
=======
 *Name: Attributes.
 
 *Information: Second exercise, creating a class. 
 
 *Date: 14/5/2014.
 
 *Copyright.
  
 */
package attributes;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
>>>>>>> fb9a1b75e1dec9100b318553a85ba5f9871ee42c
 */
public class Attributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        // TODO code application logic here
=======
        // Variable declaring.
        boolean validar = true;
        int option;
        double monto;
        char continuar;
        Scanner teclado = new Scanner(System.in);       
        //Instance.
        Account oAccount  = new Account();
        //Menu.
        while(validar)
        {
            System.out.print("Digite 1 si desea realizar un depósito y 2 si quiere realizar un retiro." + "\n");
            option = Integer.parseInt(teclado.nextLine());
            if(option == 1)
            {
                System.out.println("Ingrese el monto a depositar.");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.DepositoMaximo(monto);
            }
            if(option == 2)
            {
                System.out.println("Ingrese el monto a retirar.");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Retiro(monto);
                if(oAccount.isHayError())
                {
                    System.out.println("\n" + "¡Fondos Insuficientes!" + "\n"
                    + "¡El monto solicitado no puede ser retirado!" + "\n");
                }
            }
            System.out.println("El saldo final es de ₡" + oAccount.getSaldoInicial() + ".");
            System.out.println("¿Desea realizar otra transacción S/N?");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) 
                validar = true;
            if ((continuar == 'N') || (continuar == 'n'))
                validar = false;
        }
                
>>>>>>> fb9a1b75e1dec9100b318553a85ba5f9871ee42c
    }
}
