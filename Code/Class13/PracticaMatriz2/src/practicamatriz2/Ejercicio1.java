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
public class Ejercicio1 {

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
    /*Se recorre la matriz y realiza las operaciones aritméticas para encontrar
     el promedio*/

    public void ImprimirPromedio() {
        int suma = 0;
        float promedio = 0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                suma += matriz[f][c];
            }

        }
        promedio = suma / 9;
        System.out.println(promedio);
    }
}
