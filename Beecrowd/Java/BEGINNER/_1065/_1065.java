/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1065;


import java.util.Scanner;


/**
 *
 * @author Ayyoub
 */
public class _1065 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int values[] = new int[5];
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
            if(values[i]%2==0){
                count++;
            }
        }
        System.out.println(count+" valores pares");
    }
}
