
/**
 * Write a description of class TwentyFour here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwentyFour
{
    //(A)
    String string1= "hello";
    String string2= "hello";
    String string3= "mouse";
    //(B)and(C)
    public void factCheck(){
        System.out.println(string1.equalsIgnoreCase(string2));
        if(string1 == string2){
            System.out.println("is equal");
        }else{System.out.println("not equal");
        }
    }
    

}
