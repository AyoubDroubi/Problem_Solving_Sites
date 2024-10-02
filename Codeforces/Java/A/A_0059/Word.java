/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A.A_0059;

import java.util.Scanner;

/**
 *
 * @author Ayyoub
 */
public class Word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
	{
		Scanner z=new Scanner(System.in);
		String s=z.next();
		String sl=s.toLowerCase();
		String su=s.toUpperCase();
		int l=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.toCharArray()[i]==sl.toCharArray()[i])
				l++;
		}
		int u=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.toCharArray()[i]==su.toCharArray()[i])
				u++;
		}
		if(l>u || l==u)
			System.out.println(s.toLowerCase());
		else
			System.out.println(s.toUpperCase());
	}
}