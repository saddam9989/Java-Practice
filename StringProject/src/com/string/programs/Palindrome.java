package com.string.programs;

import java.util.Scanner;

public class Palindrome {
	
	public static void isPalindrome(String str) {
		
//		char [] ch =str.toCharArray();
//		String rev="";
//		for(int i=ch.length-1; i>=0;i--) {
//			rev +=ch[i];
//		}

		
		StringBuilder sb=new StringBuilder(str);
		
        sb.reverse();
        
        String rev=sb.toString();
		
        if(str.equals(rev)) {
     	   System.out.println("Your String data is palindrome");
        }
        else {
        	  System.out.println("Your String data is not palindrome");
        }
	}

	public static void main(String[] args) {
	
		System.out.println("enter string data");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		isPalindrome(str);
	}

}
