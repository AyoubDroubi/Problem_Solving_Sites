/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1075;


import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class _1_1075 {

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10000) {
            for (int i = 1; i <= 10000; i++) {
                if (i % n == 2) {
                    System.out.println(i);
                }
            }
        } 
        
        
    }
}
