/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_binariaandlineal;

/**
 *
 * @author Jose Pablo Arce Cascante 27/06/2014.
 */
public class Class16_BinariaAndLineal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arreglo = {"Mario", "Efren", "Susana","Campbell", "Agustin", "Elias"};

        BusquedaLineal bl = new BusquedaLineal();
        System.out.print("La busqueda lineal es: " + bl.BuscarNombre(arreglo, "Efren"));
        System.out.println();

        String[] arreglo2 = {"Mario","Efren","Susana","Campbell","Agustin","Elias"};

        BusquedaBinaria bb = new BusquedaBinaria();

        System.out.print("La busqueda binaria es: " + bb.BuscarNombre(arreglo2, "Cambell"));
        System.out.println();
    }
}
