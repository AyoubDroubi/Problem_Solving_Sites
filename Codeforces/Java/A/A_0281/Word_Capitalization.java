/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0281;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Word_Capitalization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Scanner in = new Scanner(System.in);
        String first1 = in.next();
       
        first1 = first1.replace("+", "");
        char []arr = first1.toCharArray();
        //System.out.println(first1);
       
        Arrays.sort(arr);
        //System.out.println(arr);
       
        //String sorted = new String(arr);
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i == arr.length-1)
                continue;
            System.out.print("+");           
        }
        System.out.println();
    }
}