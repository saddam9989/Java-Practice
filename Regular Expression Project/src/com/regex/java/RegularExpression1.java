package com.regex.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {

	public static void main(String[] args) {
		
		// 1st way
		Pattern p= Pattern.compile(".");
		
		Matcher m = p.matcher("as");
		
		boolean b=m.matches();
		
		System.out.println(b);
		
		
		
		// 2nd way
		boolean b1 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b1);

		
		//3rd way
		boolean b2 =Pattern.matches(".s", "cs");
		
		System.out.println(b2);
	}

}
