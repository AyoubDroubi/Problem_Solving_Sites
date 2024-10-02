/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.beecrowd.BEGINNER._1042;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class _1_1042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c , t;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int sort[]={a,b,c};
        int temp[]={a,b,c};
        Arrays.sort(sort);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
        System.out.println();
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
    
}
