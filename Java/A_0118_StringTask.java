import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class String_Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
  
        
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in)    );  
       
        String x=br.readLine();
        String y="";
        x=x.toLowerCase();
        char c=' ';
        for(int i=0;i<x.length();i++)
        {
            c=x.charAt(i);
            if(c=='y' ||c=='o' ||c=='u' ||c=='i' ||c=='e' ||c=='a') 
            {
                continue;
            }
            else 
                if(c=='Y' ||c=='O' ||c=='U' ||c=='I' ||c=='E' ||c=='A')
                {
                    continue;
                }
            else
            {
                y+="."+c;
             }
            
        }
        System.out.println(y);
    
}
    }
