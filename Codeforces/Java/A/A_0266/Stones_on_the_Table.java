/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0266;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Stones_on_the_Table {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) throws java.io.IOException
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		// Counters
		int counter = 0;
		char last = s.charAt(0);

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == last) counter++;
			else last = s.charAt(i);
		}

		// Output
		System.out.println(counter);
	}	
}