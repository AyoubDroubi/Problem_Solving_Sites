/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0977;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Wrong_Subtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, a = 0, r, i;
        n = scanner.nextInt();
        a = scanner.nextInt();
        for (i = 1; i <= a; i++) {
            r = n % 10;
            if (r == 0) {
                n /= 10;
            } else {
                n -= 1;
            }
        }
        System.out.println(n);
    }
}