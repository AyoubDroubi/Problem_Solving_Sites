/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0116;
import java.util.Scanner;
/**
 *
 * @author Yehia Ezzat
 */
public class Tram {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stops = scan.nextInt();
        int enter, out, i, rem = 0, max = 0;
        for (i = 0; i < stops; i++) {
            out = scan.nextInt();
            enter = scan.nextInt();
            if (i == 0) {
                rem = enter;
                max = rem;
            } else {
                rem += enter - out;
                max = Math.max(max, rem);
            }
        }
        System.out.println(max);
    }
}