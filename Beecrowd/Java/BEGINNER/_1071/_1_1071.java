/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1071;

import java.util.Scanner;


public class _1_1071 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, total = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
