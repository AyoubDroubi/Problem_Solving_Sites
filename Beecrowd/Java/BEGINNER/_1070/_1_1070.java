/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1070;

import java.util.Scanner;


 

public class _1_1070 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        if (x > 0) {
            while (count < 6) {
                if (x % 2 != 0) {
                    count++;
                    System.out.println(x);
                }
                x++;
            }
        }
    }
}
