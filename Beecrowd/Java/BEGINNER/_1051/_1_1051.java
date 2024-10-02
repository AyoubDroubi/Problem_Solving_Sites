/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1051;


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
public class _1_1051 {

    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        double salary = Double.parseDouble(br.readLine());
        
        
        if (salary < 2000 && salary >= 0) {
            bw.write("Isento");
        }
        else if (salary < 3000 && salary >= 2000) {
            bw.write((salary*(8/100.0))+" 1");
        }
        else if (salary < 4500 && salary >= 3000) {
            bw.write((salary*(18/100.0))+" 2");
        }
        else if (salary >= 4500) {
            bw.write((salary*(28/100.0))+" 3");
        }
        bw.newLine();
        bw.flush();
    }
}
