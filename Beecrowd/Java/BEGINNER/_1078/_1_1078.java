/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1078;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class _1_1078 {

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 1 && n < 1000) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }
        
        
    }
}
