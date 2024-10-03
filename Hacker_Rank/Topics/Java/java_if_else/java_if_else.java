package Hacker_Rank.Topics.Java.java_if_else;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class java_if_else {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
        scanner.close();
        
        if (N%2 == 0) {
            if (N<= 5 && N>=2) {
                 System.out.print("Not Weird");
            }
            else if (N<= 20 && N>=6) {
                 System.out.print("Weird");
            }
            else if (N> 20) {
                 System.out.print("Not Weird");
            }
        }
        else{
            
            System.out.print("Weird");
        }
    }
}
