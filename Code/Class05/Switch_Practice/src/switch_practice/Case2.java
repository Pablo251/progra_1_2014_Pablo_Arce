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
public class Case2 {
    public int Case2(int num){
        int last = 0;
        //int C = 0;
        last = num % 10;
        if((last == 2) || (last == 5) || (last == 8))
            num = num * num;
        if((last == 4) || (last == 7) || (last == 9))
            num = num * 5;
        if((last == 1) || (last == 3) || (last == 6))
            num = num;       
            return(num);
    }
    
}
