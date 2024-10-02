/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0734;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Anton_and_Danik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = scan.nextInt();
        scan.nextLine();
        String input = scan.nextLine();
        int a=0,d=0;
        for( char x : input.toCharArray()){
            if(x=='D')
                d++;
            else
                a++;
        }
        if(a>d)
            System.out.println("Anton");
        else if(d>a)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    } 
}