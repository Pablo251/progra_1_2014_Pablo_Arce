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
        return getCadena().charAt(getCadena().length() - 1) + "";
    }

    public String Alrevez() {
        String retorno = "";

        for (int i = getCadena().length() - 1; i >= 1; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String Guion() {
        String retorno = "";

        for (int i = 0; i < getCadena().length(); i++) {
            if (getCadena().length() - 1 == i) {
                retorno += getCadena().charAt(i);
            } else {
                retorno += getCadena().charAt(i) + "-";
            }
        }
        return retorno;
    }

    public int Vocales() {
        int cantidadVocales = 0;
        for (int i = 0; i < getCadena().length(); i++) {
            if ((getCadena().charAt(i) == 'a')
                    || (getCadena().charAt(i) == 'A')
                    || (getCadena().charAt(i) == 'e')
                    || (getCadena().charAt(i) == 'E')
                    || (getCadena().charAt(i) == 'i')
                    || (getCadena().charAt(i) == 'I')
                    || (getCadena().charAt(i) == 'o')
                    || (getCadena().charAt(i) == 'O')
                    || (getCadena().charAt(i) == 'u')
                    || (getCadena().charAt(i) == 'U')) {
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }

    public boolean Palindromo() {
        String palabraAlrevez = "";

        for (int i = getCadena().length() - 1; i >= 0; i--) {
            palabraAlrevez += getCadena().charAt(i);
        }
        if (getCadena().equals(palabraAlrevez)) {
            return true;
        } else {
            return false;
        }
    }
}
