/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Attributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar = true;
        int option;
        double monto;
        char continuar;
        //Account oAccount;
         Account oAccount  = new Account();
        Scanner teclado = new Scanner(System.in);
        while(validar)
        {
            System.out.print("Digite 1 si desea realizar un deposito y 2 si quiere realizar un retiro." + "\n");
            option = Integer.parseInt(teclado.nextLine());
            if(option == 1)
            {
                System.out.println("Digite el monto a depositar");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.DepositoMaximo(monto);
            }
            if(option == 2)
            {
                System.out.println("Digite el monto a retirar" + "\n");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Retiro(monto);
                if(oAccount.isHayError())
                {
                    System.out.println("El monto que usted va a retirar no puede ser retirado" + "\n");
                }
            }
            System.out.println("El saldo final es de " + oAccount.getSaldoInicial());
            System.out.println("Desea realizar otra transacción S/N " + "\n");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) 
                validar = true;
            if ((continuar == 'N') || (continuar == 'n'))
                validar = false;
        }
        //oAccount.
                
    }
}
