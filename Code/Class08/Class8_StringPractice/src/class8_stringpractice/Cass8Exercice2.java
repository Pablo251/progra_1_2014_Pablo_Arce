/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_stringpractice;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Cass8Exercice2 {

    private int apertura;
    private int terminal;
    private int entero;
    private String cadena;

    public int getApertura() {
        return apertura;
    }

    public void setApertura(int apertura) {
        this.apertura = apertura;
    }

    public int getTerminal() {
        return terminal;
    }

    public void setTerminal(int terminal) {
        this.terminal = terminal;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String Substring() {
        if (getApertura() < 0 || getTerminal() > getCadena().length() - 1) {
            return null;
        }
        String retorno = "";
        for (int i = getApertura(); i <= getTerminal(); i++) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String ToUpperCase() {
        String retorno = "";
        for (int i = 0; i < getCadena().length(); i++) {
            char aux = getCadena().charAt(i);
            if ('a' <= aux && aux <= 'z') {
                retorno += (char) (aux + 'A' - 'a');
            } else {
                retorno += aux;
            }
        }
        return retorno;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public String valueOf() {
        int entero = getEntero();
        if (entero == 0) {
            return "0";
        }
        boolean negative = false;
        if (entero < 0) {
            negative = true;
            entero = -entero;
        }
        String retorno = "";
        while (entero > 0) {
            retorno = " " + (char) (entero % 10 + '0') + retorno;
            entero /= 10;
        }
        if (negative) {
            retorno = " -" + retorno;
        }
        return retorno;
    }

    
    public int indexOf() {
        for (int i = getApertura(); i < getCadena().length(); i++) {
            for (int j = 0; (i + j < getCadena().length())
                    && getCadena().charAt(i + j) == getCadena().charAt(j); j++) {
                if (j == getCadena().length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

}
