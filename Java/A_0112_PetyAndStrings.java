import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Petya_and_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Scanner in = new Scanner(System.in);
        String first1 = in.next();
        String second1 = in.next();
       
        String first = first1.toLowerCase();
        String second = second1.toLowerCase();
       
        //System.out.println(first.compareTo(second));
       
        if(first.compareTo(second) ==0){
            System.out.println("0");
        }
        if(first.compareTo(second) > 0){
            System.out.println("1");
        }
        if(first.compareTo(second) < 0){
            System.out.println("-1");           
        }
    }
}
