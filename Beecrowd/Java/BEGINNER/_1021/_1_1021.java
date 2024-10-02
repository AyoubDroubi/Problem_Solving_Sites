/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.beecrowd.BEGINNER._1021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Ayyoub
 */
public class _1_1021 {

    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        double point = Double.parseDouble(br.readLine());
        
        int count = 0;
        bw.write("NOTAS:");
        bw.newLine();
        if (point/100.0 >= 1.0) {
            count = (int)(point/100.0);
            point = point%100;   
        }
        bw.write(count+" nota(s) de R$ 100.00");
        bw.newLine();
        count = 0;
        
        if (point/50.0 >= 1.0) {
            count =(int)(point/50.0);
            point = point%50;
        }
        bw.write(count+" nota(s) de R$ 50.00");
        bw.newLine();
        count = 0;
        
        
        if (point/20.0 >= 1.0) {
            count = (int)(point/20.0);
            point = point%20;
        }
        bw.write(count+" nota(s) de R$ 20.00");
        bw.newLine();
        count = 0;
        
        
        if (point/10.0 >= 1.0) {
            count = (int)(point/10.0);
            point = point%10;
        }
        bw.write(count+" nota(s) de R$ 10.00");
        bw.newLine();
        count = 0;
        
        
        if (point/5.0 >= 1.0) {
            count = (int)(point/5.0);
            point = point%5;
        }
        bw.write(count+" nota(s) de R$ 5.00");
        bw.newLine();
        count = 0;
        
        
        if (point/2.0 >= 1.0) {
            count = (int)(point/2.0);
            point = point%2;
        }
        bw.write(count+" nota(s) de R$ 2.00");
        bw.newLine();
        count = 0;
        
        
        // ===========================
        
        bw.write("MOEDAS:");
        bw.newLine();
        
        
        if (point/1.0 >= 1.0) {
            count = (int)(point/1.0);
            point = point%1;
        }
        bw.write(count+" moeda(s) de R$ 1.00");
        bw.newLine();
        count = 0;        
        
        if (point/0.50 >= 1.0) {
            count = (int)(point/0.50);
            point = point%0.50;
        }
        bw.write(count+" moeda(s) de R$ 0.50");
        bw.newLine();
        count = 0;
        
        if (point/0.25 >= 1.0) {
            count = (int)(point/0.25);
            point = point%0.25;
        }
        bw.write(count+" moeda(s) de R$ 0.25");
        bw.newLine();
        count = 0;
        
        if (point/0.10 >= 1.0) {
            count = (int)(point/0.10);
            point = point%0.10;
        }
        bw.write(count+" moeda(s) de R$ 0.10");
        bw.newLine();
        count = 0;
        
        if (point/0.05 >= 1.0) {
            count = (int)(point/0.05);
            point = point%0.05;
            
        }
        
        bw.write(count+" moeda(s) de R$ 0.05");
        bw.newLine();
        count = 0;
        
        //bw.write(point+"++++++++++++");
        
        point = ((int)(point*1000))/10.0;
      
        
        point = Math.ceil(point);
       
        bw.write(((int)point)+" moeda(s) de R$ 0.01");
        bw.newLine();
        count = 0;
        
        
        
        
        
        bw.flush();
    }
    
}
