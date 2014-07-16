/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_binariaandlineal;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class BusquedaLineal {
    public int BuscarNombre(String[] nombres, String busqueda) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres.equals(busqueda)) {
                return i;
            }
        }
        return -1;
    }
    
}
