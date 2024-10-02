/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1097;

import com.mycompany.beecrowd.*;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class _1_1097 {

    public static void main(String[] args) 
    {
    int p = 7;
        for (int i = 1; i < 10; i += 2) {
            for (int j = p; j >= p-2; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
            p+=2;
        }   
        
        
    }
}
