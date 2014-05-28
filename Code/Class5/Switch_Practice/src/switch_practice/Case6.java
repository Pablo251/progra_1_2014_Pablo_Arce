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
public class Case6 {

    public String Case6(int day, int month, int year) {
        String ayer = "";

        if (day == 1) {
            switch (month) {
                case 1:
                    month = 12;
                    day = 31;
                    year--;
                    break;
                case 2:
                    day = 31;
                    month = 1;
                    break;
                case 3:
                    if (year % 4 == 0) {
                        day = 30;
                    } else {
                        day = 28;
                    }
                    month = 2;
                    break;
                case 4:
                    day = 31;
                    month = 3;
                    break;
                case 5:
                    day = 30;
                    month = 4;
                    break;
                case 6:
                    day = 31;
                    month = 5;
                    break;
                case 7:
                    day = 30;
                    month = 6;
                    break;
                case 8:
                    day = 31;
                    month = 7;
                    break;
                case 9:
                    day = 31;
                    month = 8;
                    break;
                case 10:
                    day = 31;
                    month = 9;
                    break;
                case 11:
                    day = 31;
                    month = 10;
                    break;
                case 12:
                    day = 30;
                    month = 11;
                    break;
            }
        } else {
            day--;
        }
        ayer = ayer + day + " / " + month + " / " + year;
        return ayer;

    }

}
