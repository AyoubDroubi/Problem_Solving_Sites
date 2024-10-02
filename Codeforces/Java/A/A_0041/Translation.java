/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0041;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Translation {

    public static void main(String args[])
    {
        Scanner z = new Scanner(System.in);
        String a=z.next();
        String b=z.next();
        StringBuilder sb=new StringBuilder(b);
        if(a.equals(sb.reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
