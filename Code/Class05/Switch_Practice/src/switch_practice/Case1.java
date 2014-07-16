/*
 *Name: Switch_Practice.
 
 *Information: Switch practice
 
 *Date: 21/5/2014.
 
 *Copyright.
  
 */
package switch_practice;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Case1 {
    public String Case1(int month){
        String nameMonth = null;
        if(month == 1)
            nameMonth = "Enero.";
        if(month == 2)
            nameMonth = "Febrero."; 
        if(month == 3)
            nameMonth = "Marzo.";
        if(month == 4)
            nameMonth = "Abril.";
        if(month == 5)
            nameMonth = "Mayo.";
        if(month == 6)
            nameMonth = "Junio.";
        if(month == 7)
            nameMonth = "Julio.";
        if(month == 8)
            nameMonth = "Agosto.";
        if(month == 9)
            nameMonth = "Setiembre.";
        if(month == 10)
            nameMonth = "Octubre.";
        if(month == 11)
            nameMonth = "Noviembre.";     
        if(month == 12)
            nameMonth = "Diciembre.";        
       return(nameMonth); 
    }
}
