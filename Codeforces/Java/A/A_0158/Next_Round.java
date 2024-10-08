/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0158;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Next_Round {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] data = new int[n + 1];
		int minScore = 0;
		for (int i = 1; i <= n; i++) {
			int score = sc.nextInt();
			data[i] = score;
			if (i == k)
				minScore = score;
		}

		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (data[i] >= minScore && data[i] > 0)
				cnt++;
		}

		System.out.println(cnt);
	}
}