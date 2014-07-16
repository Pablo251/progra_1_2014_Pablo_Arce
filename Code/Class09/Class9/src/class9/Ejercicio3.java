/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Ejercicio3 {

    private float turnosM[] = new float[4];
    private float turnosT[] = new float[4];

    public void TurnoMañana(float turnoM) {
        //Mañana.
        for (int i = 0; i < turnosM.length; i++) {
            if (turnosM[i] == 0) {
                turnosM[i] = turnoM;
                break;
            }
        }
    }

    public void TurnoTarde(float turnoT) {
        //Tarde.
        for (int i = 0; i < turnosT.length; i++) {
            if (turnosT[i] == 0) {
                turnosT[i] = turnoT;
                break;
            }
        }
    }

    public String SalarioTurnos() {
        String retorno = "";
        String M = "";
        String T = "";
        //Mañana.
        for (int i = 0; i < turnosM.length; i++) {
            M += "El salario del trabajador # " + (i + 1) + " es de " + turnosM[i] + "\n";
        }
        //Tarde.
        for (int i = 0; i < turnosT.length; i++) {
            T += "El salario del trabajador # " + (i + 1) + " es de " + turnosT[i] + "\n";
        }
        retorno = ("Turno de la mañana:" + "\n") + M + "\n"
                + ("Turno de la Tarde:" + "\n") + T + "\n";
        return retorno;
    }
}
