/*
 *Name: Switch_Practice.
 
 *Information: Switch practice
 
 *Date: 24/5/2014.
 
 *Copyright.
  
 */
package switch_practice;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Case4 {
    public String Case4(int month, int year){
        String days = null;
        if(month == 1)
            days = "Enero tiene 31 días.";
        if(month == 2){
        }if (year % 4 == 0) {
            days = "Febrero tiene 30 días, en año bisiesto.";
         } else {
            days = "Febrero tiene 28 días.";
         }
        if(month == 3)
            days = "Marzo tiene 30 días.";
        if(month == 4)
            days = "Abril tiene 30 días.";
        if(month == 5)
            days = "Mayo tiene 31 días.";
        if(month == 6)
            days = "Junio tiene 30 días.";
        if(month == 7)
            days = "Julio tiene 31 días.";
        if(month == 8)
            days = "Agosto tiene 31 días.";        
        if(month == 9)
            days = "Setiembre tiene 31 días";
        if(month == 10)
            days = "Octubre tiene 31 días.";      
        if(month == 11)
            days = "Noviembre tiene 30 días.";
        if(month == 12)
            days = "Diciembre tiene 31 días.";          
        return(days);
    }
    
}
