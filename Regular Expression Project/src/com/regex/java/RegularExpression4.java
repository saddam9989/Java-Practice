package com.regex.java;

import java.util.regex.Pattern;

public class RegularExpression4 {

	public static void main(String[] args) {
		
		
		// Regex Quantifiers
		
		System.out.println(Pattern.matches("[abc]?", "a"));   //abc occures 0 or 1 time
		
		System.out.println(Pattern.matches("[abc]+", "aabbccccc"));  //abc occures 1 or more times
		
		System.out.println(Pattern.matches("[abc]*", ""));  //abc occures 0 or more times
		
		System.out.println(Pattern.matches("[a]{2}", "aa")); // a occures 2 times only
		
		System.out.println(Pattern.matches("[a]{3,}", "aaaaaa"));  // a occures 3 times or more times
		
		System.out.println(Pattern.matches("[a]{2,5}", "aaaaa"));   // a occure atleast 2 times but lessthan 5 times
	} 

}
