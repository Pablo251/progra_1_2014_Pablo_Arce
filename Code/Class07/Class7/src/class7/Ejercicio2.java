/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

/**
 *
 * @author Jose Pablo Arce Castante.
 */
public class Ejercicio2 {

    private String cadena;

    public String MediaCadena() {
        String retorno = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {
            retorno += getCadena().charAt(i);
        }

        return retorno;
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String UltimoValor() {
        return getCadena().charAt(getCadena().length()-1) + ".";
    }
    
    public String Alrevez(){
        String retorno = "";
        
        for (int i = getCadena().length()-1; i >= 0; i--) {
            retorno+=getCadena().charAt(i);
        }
        return retorno;
    }
}
