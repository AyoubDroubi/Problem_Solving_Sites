/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1098;

import com.mycompany.beecrowd.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class _1_1098 {

    public static void main(String[] args) 
    {
       for (double i = 0; i <= 2; i += 0.2) {
            System.out.println("I=" + go(toDouble(i)) + " J=" + go(toDouble(i + 1)));
            System.out.println("I=" + go(toDouble(i)) + " J=" + go(toDouble(i + 2)));
            System.out.println("I=" + go(toDouble(i)) + " J=" + go(toDouble(i + 3)));
        }
    }
    private static String go(double d) {
        if (d == (int) d) {
            return "" + (int) d;
        } else {
            return "" + d;
        }
    }
    private static double toDouble(double x) {
        DecimalFormat format = new DecimalFormat("#0.0");
        return Double.valueOf(format.format(x));
        
        
    }
}
