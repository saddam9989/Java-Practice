package com.regex.java;

import java.util.regex.Pattern;

public class RegularExpression2 {

	public static void main(String[] args) {
		
		
		//Regex Character classes
		
		System.out.println(Pattern.matches("[abc]", "saddam"));
		
		System.out.println(Pattern.matches("[abc]", "a"));
		
		System.out.println(Pattern.matches("[^abc]", "h"));
		
		System.out.println(Pattern.matches("[a-z]", "hello"));
		
		System.out.println(Pattern.matches("[A-Z]", "Za"));
		
		System.out.println(Pattern.matches("[0-9]", "5"));
		
		System.out.println(Pattern.matches("[a-z A-Z]", "s"));
	}

}
