package com.string.programs;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseStringIteration {
	
	public static String reverseString(String str) {
		
		char [] ch=str.toCharArray();
		String reverse="";
		
		for(int i=ch.length-1; i>=0;i--) {
			
			reverse += ch[i];
			
		}
		
		return reverse;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter some Data");
		Scanner sc =new Scanner(System.in);
		
		String str=sc.nextLine();
		
		System.out.println(reverseString(str));
		
		
	}

}
