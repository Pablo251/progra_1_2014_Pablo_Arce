/*
 *Name: Switch_Practice.
 
 *Information: Switch practice
 
 *Date: 23/5/2014.
 
 *Copyright.
  
 */
package switch_practice;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Case3 {
    public String Case3(char note){
        String enunced = null;
        if(note == 'a' || note == 'A')
            enunced = "Excelente.";
        if(note == 'b' || note == 'B')
            enunced = "Bueno.";
        if(note == 'c' || note == 'C')
            enunced = "Regular.";
        if(note == 'd' || note == 'D')
            enunced = "Malo.";
        if(note == 'e' || note == 'E')
            enunced = "Pésimo.";
     return(enunced);   
    }    
}
