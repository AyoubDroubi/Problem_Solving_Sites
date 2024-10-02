/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0110;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Nearly_Lucky_Number {

    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String n = reader.next();
		int count=0;
		for(int i=0; i<n.length(); i++)
    		if(n.charAt(i)=='4' || n.charAt(i)=='7')
    		    ++count;
		if(count == 7 || count == 4)
		    System.out.println("YES");
		else
		    System.out.println("NO");
	}
}