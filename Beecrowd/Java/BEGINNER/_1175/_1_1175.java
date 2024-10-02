
package com.mycompany.beecrowd.BEGINNER._1175;

import com.mycompany.beecrowd.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class _1_1175 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<Integer>();
        while (!sc.hasNextLine()) {            
            list.add(sc.nextInt());
        }
        
        for(int x : list){
            int count = 0;
            System.out.println("N["+count   +"] = "+x);
            count++;
        }
    }
}