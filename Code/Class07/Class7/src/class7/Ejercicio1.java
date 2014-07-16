/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Ejercicio1 {

    private String email;

    public Ejercicio1(String pEmail) {
        this.email = pEmail;
    }

    public String ValidarCorreo()
    {
        String mensaje = "EL correo no contiene @.";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@')
            {
                mensaje = "El correo si tiene @.";
            }
        }
        return mensaje;
    }
}
