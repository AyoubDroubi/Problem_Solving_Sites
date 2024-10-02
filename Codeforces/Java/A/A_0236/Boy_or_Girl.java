/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0236;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Boy_or_Girl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String str = sc.nextLine();
      HashSet<Character> hset = new HashSet<Character>();
      
      for(int i = 0; i < str.length(); i++) {
        hset.add(str.charAt(i));
      }
      if(hset.size() % 2 != 0) {
        System.out.println("IGNORE HIM!");
      } else {
        System.out.println("CHAT WITH HER!");
      }
    }
}


