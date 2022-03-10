package com.basicprograms.java;

public class Alphabet {

	public static void main(String[] args) {
		
		char c='f';
		
		if((c>='a' && c<='z') || (c>='A' && c <='Z')) {
			
			System.out.println(c + " is a alphabet");
		}
		else
		{
			System.out.println(c + " is not a alphabet");
		}
	}

}
