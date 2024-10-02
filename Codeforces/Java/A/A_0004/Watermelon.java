/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ayyoub
 */
public class Watermelon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        int weight =Integer.parseInt(br.readLine());
       
        
        if (weight  % 2 ==  0 && weight != 2) {
            System.out.println("YES");  
        }else{
            System.out.println("NO");
        }
        
       
    }
    
}
