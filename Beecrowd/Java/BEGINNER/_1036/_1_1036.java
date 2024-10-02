/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1036;

import com.mycompany.beecrowd.*;

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
public class _1_1036 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer tok = new StringTokenizer(br.readLine());
        
        double a = Double.parseDouble(tok.nextToken());
        double b = Double.parseDouble(tok.nextToken());
        double c = Double.parseDouble(tok.nextToken());
        
          double  r1, r2;

  r1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
  r2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
  if ((int)a == 0 || b < c)
  {
    bw.write("impossible to calculate\n");
  }
  else
  {
        bw.write((((double)((int)(r1*100000)))/100000)+"" );
        bw.newLine();
        bw.write(((((double)(int)(r2*100000)))/100000)+"");
//        System.out.printf("R1 = %0.5lf\n", r1);
//        System.out.printf("R2 = %0.5lf\n", r2);
  }
  
  bw.flush();
    }
}
