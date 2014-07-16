/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatriz2;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Ejercicio2 {

    private int[][] matriz;
    private Scanner teclado;

    //El Usuario carga la matriz a su escogencia.*/
    public void CargarMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[3][3];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el número correspondiente.");
                matriz[f][c] = teclado.nextInt();
            }
        }

    }
    /*Se aplicará un mod a los números y se sabrá quien es impar, luego se
     imprimirá*/

    public void MayorImpares() {
        int cont = 0, mayor = 0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[f][c] % 2 == 1) {
                    if (matriz[f][c] > cont) {
                        mayor = matriz[f][c];
                        cont = mayor;
                    }
                }
            }
        }
        System.out.println(mayor + " es el mayor de los números impares.");
    }
}
