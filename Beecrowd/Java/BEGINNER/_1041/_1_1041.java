/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.beecrowd.BEGINNER._1041;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Ayyoub
 */
public class _1_1041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer tok = new StringTokenizer(br.readLine());
        
        double X = Double.parseDouble(tok.nextToken());
        double Y = Double.parseDouble(tok.nextToken());
  
  
  
  if (X == 0.0 && Y == 0.0) {
   bw.write("Origem\n");
  }else if (X == 0.0 && Y != 0.0) {
   bw.write("Eixo Y\n");
  }else if (Y == 0.0 && X != 0.0) {
   bw.write("Eixo X\n");
  }else if (X > 0.0 && Y > 0.0) {
   bw.write("Q1\n");
  }else if (X < 0.0 && Y < 0.0) {
   bw.write("Q3\n");
  }else if (X < 0.0 && Y > 0.0) {
   bw.write("Q2\n");
  }else  {
   bw.write("Q4\n");
  }
  
  bw.newLine();
  bw.flush();
    }
    
}
