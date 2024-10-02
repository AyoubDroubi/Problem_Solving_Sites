/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1052;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Ayyoub
 */
public class _1_1052 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String months[] = {"January","February","March","April","May","June",
            "July","August","September","October","November","December"};
        int month = sc.nextInt();
        if(month>=1 && month<=12){
            System.out.println(months[month-1]); 
        }
    }
}
