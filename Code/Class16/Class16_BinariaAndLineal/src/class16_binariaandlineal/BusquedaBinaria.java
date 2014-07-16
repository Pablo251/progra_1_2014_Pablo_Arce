/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_binariaandlineal;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class BusquedaBinaria {

    public int BuscarNombre(String[] nombres, String busqueda) {
        int inicial = 0;
        int elemtoFinal = nombres.length - 1;

        while (inicial < elemtoFinal) {
            int central = (inicial + elemtoFinal);
            if (busqueda.compareTo(nombres[central]) > 0) {
                inicial = central + 1;
            } else {
                if (busqueda.compareTo(nombres[central]) < 0) {
                    elemtoFinal = central - 1;
                } else {
                    return central;
                }
            }
        }
        return -1;
       
    }
}
