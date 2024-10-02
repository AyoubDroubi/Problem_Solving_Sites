/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1072;

import java.util.Scanner;


/**
 *
 * @author Ayyoub
 */
public class _1_1072 {

    public static void main(String[] args)  {
       
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0, out = 0;
        if (n < 10000) {
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                if (value > -10000000 && value < 10000000) {
                    if (value >= 10 && value <= 20) {
                        in++;
                    } else {
                        out++;
                    }
                }
            }
            System.out.println(in+" in");
            System.out.println(out+" out");
        }
    }
}
