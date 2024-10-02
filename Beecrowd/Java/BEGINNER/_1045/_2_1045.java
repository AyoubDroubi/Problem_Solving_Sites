/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1045;



import java.util.Scanner;


/**
 *
 * @author Ayyoub
 */
public class _2_1045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a > 0 && b > 0 && c > 0) {
            double abc[] = sortDecreasing(new double[]{a, b, c});
            a = abc[0];
            b = abc[1];
            c = abc[2];
            //if A ≥ B + C, write the message: NAO FORMA TRIANGULO
            if (a >= (b + c)) {
                System.out.println("NAO FORMA TRIANGULO");
            }
            //if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
            else if ((a * a) == ((b * b) + (c * c))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            //if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
            else if ((a * a) > ((b * b) + (c * c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            //if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
            else if ((a * a) < ((b * b) + (c * c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            
            //if the three sides are the same size, write the message: TRIANGULO EQUILATERO
            if (a == b && b == c  && c==a) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            //if only two sides are the same and the third one is different, write the message: TRIANGULO ISOSCELES
            else if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
    private static double[] sortDecreasing(double[] par) {
        for (int i = 0; i < par.length; i++) {
            for (int j = 0; j < par.length - 1; j++) {
                if (par[j] < par[j + 1]) {
                    double temp = par[j];
                    par[j] = par[j + 1];
                    par[j + 1] = temp;
                }
            }
        }
        return par;
    }
}