/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0791;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Bear_and_Big_Brother_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int limak=sc.nextInt();
        int bob=sc.nextInt();
        int year=0;
        while(limak<=bob){
            limak=limak*3;
            bob=bob*2;
            year++;
        }
        System.out.println(year);
        
	}
}