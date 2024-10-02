/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1060;

import com.mycompany.beecrowd.*;
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
public class _1060 {

    public static void main(String[] args)  {
       
       
        Scanner sc = new Scanner(System.in);
        double values[] = new double[6];
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextDouble();
            if(values[i]>0){
                count++;
            }
        }
        System.out.println(count+" valores positivos");
    }
}
