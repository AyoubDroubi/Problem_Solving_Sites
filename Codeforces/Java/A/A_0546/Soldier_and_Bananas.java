/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0546;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Soldier_and_Bananas {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cost = scan.nextInt();
        int initialMoney = scan.nextInt();
        int noBananas = scan.nextInt();
 
        int sum=cost;
        for(int i=2;i<=noBananas;i++){
            sum+=i*cost;
        }
        if(sum<=initialMoney){
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(sum-initialMoney);
    } 
}