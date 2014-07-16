/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;



/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class OrdenamientoSelección {

    public int[] OrdenS(int arreglo[], String ordenamiento) {
        int indice = 0;
        int indice2 = 0;        
        int menor = 0;
        int posición = 0;
        int temporal = 0;
        for (indice = 0; indice < arreglo.length-1; indice++) {
            menor = arreglo[indice];
            posición = indice;
            for (indice2 = indice + 1; indice2 < arreglo.length; indice2++) {
                if (arreglo[indice2]<menor) {
                    menor = arreglo[indice2];
                    posición = indice2;                            
                }
            }
        }
        if(posición != indice){
            temporal=arreglo[indice];
            arreglo[indice]=arreglo[posición];
            arreglo[posición]=temporal;
        }
        return arreglo;
    }
}
