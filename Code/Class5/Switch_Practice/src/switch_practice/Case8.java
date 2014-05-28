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
public class Case8 {
    public String Case8(int day, char day2){
        int c = 0;
        String presentDay = null;
        
        switch(day2){
        
            case 'l':
            case 'L':
                c = 1;
                break;
            case 'm':
            case 'M':
                c = 2;
                break;
            case 'k':
            case 'K':
                c = 3;
                break;
            case 'j':
            case 'J':
                c = 4;
                break;
            case 'v':
            case 'V':
                c = 5;
                break;
            case 's':
            case 'S':
                c = 6;
                break;
            case 'd':
            case 'D':
                c = 7;
                break;           
        }

        //Resta del primer día contra el actual.
        day = day - c;
        //Día mod de 7.
        c = 0;
        c = day%7;
        //Buscando el número correspondiente al día.
        switch (c) {
            case 1:
                presentDay = "Lunes.";
                break;
            case 2:
                presentDay = "Martes.";
                break;
            case 3:
                presentDay = "Miércoles.";
                break;
            case 4:
                presentDay = "Jueves.";
                break;
            case 5:
                presentDay = "Viernes.";
                break;
            case 6:
                presentDay = "Sábado.";
                break;
            case 7:
                presentDay = "Domingo.";
                break;
        }

     return(presentDay);
                    
    }
}
