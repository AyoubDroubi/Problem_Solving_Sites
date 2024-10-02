/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.beecrowd.BEGINNER._1040;

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
public class _1_1040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer tok = new StringTokenizer(br.readLine());
        
        double N1 = Double.parseDouble(tok.nextToken());
        double N2 = Double.parseDouble(tok.nextToken());
        double N3 = Double.parseDouble(tok.nextToken());
        double N4 = Double.parseDouble(tok.nextToken());
            
        double Media = (N1+N2+N3+N4);
        bw.write("Media: "+(+Media/4));
        bw.newLine();
        String next = br.readLine();
        
        if (next != null || next != "") {
            bw.write("Aluno reprovado.");
            bw.newLine();
            bw.write("Nota do exame:"+next);
            bw.newLine();
            bw.write("Aluno aprovado.");
            bw.newLine();
            bw.write("Nota do exame:"+next);
            bw.newLine();
            Media = Media + Double.parseDouble(next);
            bw.write("Media final: "+(((double)((int)((+Media/5)*100)))/100));
            
        }
        else{
            bw.write("Aluno em exame..\n");
        }
        bw.flush();
    }
    
}
