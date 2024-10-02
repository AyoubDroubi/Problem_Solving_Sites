/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0050;

/**
 *
 * @author Ayyoub
 */
public class Domino_piling {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        double a=ip.nextInt();
        double b=ip.nextInt();
        double c=a*b;
        System.out.println((int)Math.floor(c/2));
    }
}