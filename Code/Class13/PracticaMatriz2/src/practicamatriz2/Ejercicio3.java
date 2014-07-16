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
public class Ejercicio3 {

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

    public void PromedioPares() {
        int cont = 0, mayor = 0, suma = 0;
        float promedio = 0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[f][c] % 2 == 0) {
                    suma += matriz[f][c];
                    cont++;
                }
            }
        }
        promedio = suma / cont;
        System.out.println("EL promedio de los números mayores es de " + promedio);
    }
}
