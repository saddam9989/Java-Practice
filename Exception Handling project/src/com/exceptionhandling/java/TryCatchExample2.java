package com.exceptionhandling.java;

public class TryCatchExample2 {

	public static void main(String[] args) {
	
		try {
			
			int a=50/0;
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
		System.out.println("Rest of the code executed");

	}

}
