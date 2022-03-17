package com.regex.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your email");
		
		String str = sc.nextLine();
		
		Pattern p = Pattern.compile("[a-zA-Z0-9]+@[a-z]{5}.[a-z]{3}");
		
		Matcher m=p.matcher(str);
		
		boolean b=m.matches();
		
		if(b) {
			System.out.println("You are followed correct validation Thank you ");
		}else {
			System.out.println("You are not following correct validation");
		}
		

	}

}
