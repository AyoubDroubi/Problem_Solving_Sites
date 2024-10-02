/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd.BEGINNER._1046;



import java.util.Scanner;


/**
 *
 * @author Ayyoub
 */
public class _1_1046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end, duration = 0;
        start = sc.nextInt();
        end = sc.nextInt();
        if (start <= 24 && end <= 24 && start >= 0 && end >= 0) {
            if (end > start) {
                duration = end - start;
            } else if (end < start || end == start) {
                duration = (end - start) + 24;
            }
            System.out.println("O JOGO DUROU "+duration+" HORA(S)");
        }
    }
}