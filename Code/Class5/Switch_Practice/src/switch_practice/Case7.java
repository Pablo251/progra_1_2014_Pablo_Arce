/*
 *Name: Switch_Practice.
 
 *Information: Switch practice... Task
 
 *Date: 27/5/2014.
 
 *Copyright.
  
 */
package switch_practice;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Case7 {

    public void Case7(int day) {

        if (day > 7) {
            day = day % 7;
        }

        switch (day) {
            case 1:
                System.out.println("Lunes.");
                break;
            case 2:
                System.out.println("Martes.");
                break;
            case 3:
                System.out.println("Miércoles.");
                break;
            case 4:
                System.out.println("Jueves.");
                break;
            case 5:
                System.out.println("Viernes.");
                break;
            case 6:
                System.out.println("Sábado.");
                break;
            case 7:
                System.out.println("Domingo.");
                break;
        }

    }

}
