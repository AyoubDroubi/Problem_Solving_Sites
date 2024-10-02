/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1045;


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
public class _1_1045 {

    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer tok = new StringTokenizer(br.readLine());
        
        double a = Double.parseDouble(tok.nextToken());
        double b = Double.parseDouble(tok.nextToken());
        double c = Double.parseDouble(tok.nextToken());
        
        if (a >= b+c) {
            bw.write("NAO FORMA TRIANGULO\n");
        }
        if (a*a == (b*b)+(c*c)) {
            bw.write("TRIANGULO RETANGULO\n");
        }
        if (a*a > (b*b)+(c*c)) {
            bw.write("TRIANGULO OBTUSANGULO\n");
        }
        if (a*a < (b*b)+(c*c)) {
            bw.write("TRIANGULO ACUTANGULO\n");
        }
        if (a == b && b == c && a == c) {
            bw.write("TRIANGULO EQUILATERO\n");
        }else if(a == b || b == c || a == c) {
            bw.write("TRIANGULO ISOSCELES\n");
        }
        
        bw.flush();
    }
}
