
package com.mycompany.beecrowd.BEGINNER._1175;


import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */

/* sssssssssssssss********* */
/*   // */

public class _2_11751 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int[] list = new int[20];
        for (int i = 0; i < 20; i++) {
            list[i] = sc.nextInt();
        }
       
        for (int i = 19; i <= 0; i--) {
            System.out.println("N["+i   +"] = "+list[i]);
           
        }

    }
}


