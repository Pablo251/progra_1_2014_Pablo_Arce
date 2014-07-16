/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_stringpractice;

/**
 *
 * @author estudiante
 */
public class Class8Exercice1 {

    private String palabra;
    private String hilera;
    private String busqPalabra;
    private String hilera2;
    private String busqPalabra2;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String Rotar() {
        String retorno = "";

        for (int i = getPalabra().length() - 1; i >= 0; i--) {
            retorno += getPalabra().charAt(i);
        }
        return retorno;
    }

    public String RotarPalindromo() {
        String ret = "";
        for (int i = getPalabra().length() - 2; i >= 0; i--) {
            ret += getPalabra().charAt(i);
        }
        return palabra + ret;
    }

    public String getBusqPalabra() {
        return busqPalabra;
    }

    public void setBusqPalabra(String busqPalabra) {
        this.busqPalabra = busqPalabra;
    }

    public String getHilera() {
        return hilera;
    }

    public void setHilera(String hilera) {
        this.hilera = hilera;
    }

    public String Espacio() {
        String retorno = "";
        String a = "";
        int busq = 0;
        busq = getBusqPalabra().length();

        for (int i = 0; i < (getHilera().length() - busq); i++) {
            a += getHilera().charAt(i);
        }

        retorno = a + " " + getBusqPalabra();

        return retorno;
    }

    public String getHilera2() {
        return hilera2;
    }

    public void setHilera2(String hilera2) {
        this.hilera2 = hilera2;
    }

    public String getBusqPalabra2() {
        return busqPalabra2;
    }

    public void setBusqPalabra2(String busqPalabra2) {
        this.busqPalabra2 = busqPalabra2;
    }

    public int Buscador() {
        int find = 0;
        for (int i = 0; i < getHilera2().length(); i++) {
            if ((getHilera2().charAt(i)) == getBusqPalabra2().indexOf(hilera)) {
                find++;
            }
        }
        return find;
    }

}
