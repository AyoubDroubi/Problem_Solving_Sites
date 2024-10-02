/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0263;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Beautiful_Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int j = 1;
		for (i = 1; i <= 5; i++) {
			if (sc.nextInt() == 1) {
				break;
			}

			// Increment;
			if (i == 5) {
				j++;
				i = 0;
			}
		}

		System.out.println(Math.abs(i-3)+Math.abs(j-3));
	}	
}