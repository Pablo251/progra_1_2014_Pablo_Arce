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
public class Ejercicio4 {

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

    public void PorcentageImparesXFila() {
        int cont1 = 0, cont2 = 0;
        float porcentaje = 0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                cont2++;
                if (matriz[f][c] % 2 == 1) {
                    cont1++;
                }
                if (cont2 == 3) {
                    porcentaje = cont1 * 100 / 3;
                    cont2 = 0;
                    cont1 = 0;
                    System.out.println(porcentaje + "");
                }
            }
        }

    }
}
