package com.basicprograms.java;

public class AlphabetUsingTernary {

	public static void main(String[] args) {
		
		char c= '#';
		
		String output = 
		
			((c>='a' && c<='z') || (c>='A' && c<='Z')) ? c + " is a alphabet " : c + " is not a alphabet";
	
	System.out.println(output);
	}

}
