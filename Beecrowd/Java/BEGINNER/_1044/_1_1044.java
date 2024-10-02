/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1044;


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
public class _1_1044 {

    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer tok = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(tok.nextToken());
        int B = Integer.parseInt(tok.nextToken());
        
//        int A = 6;
//        int B = 24;
        
        
        if (B%A == 0 || A%B == 0) {
            bw.write("Sao Multiplos\n");
        }else{
            bw.write("Nao sao Multiplos\n");
        }
        
        bw.flush();
    }
}
