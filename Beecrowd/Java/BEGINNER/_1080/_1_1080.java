/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1080;

import com.mycompany.beecrowd.*;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class _1_1080 {

    public static void main(String[] args) 
    {
       
       Scanner sc = new Scanner(System.in);
        int values[] = new int[100];
        int value = 0, index = 0;
        for (int i = 0; i < 100; i++) {
            values[i] = sc.nextInt();
            if (values[i] > value) {
                value = values[i];
                index = i;
            }
        }
        System.out.println(value);
        System.out.println((index + 1)); 
        
    }
}
