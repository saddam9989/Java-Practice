package com.string.java;

public class StringBufferConcept {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello");
		
		System.out.println(sb.append(" saddam "));
		System.out.println(sb.insert(0,"Welcome "));
		System.out.println(sb.replace(0, 7, "Hi"));
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.reverse());
	}

}
