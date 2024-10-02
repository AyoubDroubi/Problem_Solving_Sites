/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.beecrowd.BEGINNER._1050;

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
public class _1_1050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

       
        
        int a = Integer.parseInt(br.readLine());
        
        if (a == 61) {
            bw.write("Brasilia");
        }
        else if (a == 71) {
            bw.write("Salvador");
        }
        else if (a == 11) {
            bw.write("Sao Paulo");
        }
        else if (a == 21) {
            bw.write("Rio de Janeiro");
        }
        else if (a == 32) {
            bw.write("Juiz de Fora");
        }
        else if (a == 19) {
            bw.write("Campinas");
        }
        else if (a == 27) {
            bw.write("Vitoria");
        }
        else if (a == 31) {
            bw.write("Belo Horizonte");
        }
        else 
            bw.write("DDD nao cadastrado");
        bw.newLine();
        bw.flush();
    }
    
}
