import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class TwentyFive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwentyFive
{
   public TwentyFive(){
       ArrayList temperatures = new ArrayList<Double>();
       temperatures.add(34.5);
       temperatures.add(39.5);
       temperatures.add(44.5);
       temperatures.add(24.5);
       temperatures.add(44.5);
       temperatures.add(38.5);
       
       fever(temperatures);
   }
    
   public void fever(ArrayList<Double>temperatures){
       int count= 0;
       double max=0;
       
       for(Double temp : temperatures){
           if(temp > 37.5){
               count++;
               
           }
       
       if(temp > max){
           max = temp;
       }
    }
       System.out.println("Number of fever cases reported: " + count);
       System.out.println("The Max Reported:" + max);
       
       // question 26 = using Collections.max
       System.out.println("Higher fever case(Collections.max):" + Collections.max(temperatures));
       // question 27 = using Collections.sort
       Collections.sort(temperatures);
       System.out.println("Higher fever case(Collections.sort):" + temperatures.getLast());
   }
    
   
       }
