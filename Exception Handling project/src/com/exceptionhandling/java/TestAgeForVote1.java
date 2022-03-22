package com.exceptionhandling.java;

public class TestAgeForVote1 {
	
	public static void validate(int age){
		if(age > 18) {
			System.out.println("you are eligible for vote");
		}
		else {
			throw new InvalidAgeException1("your age is below 18");
		}
	}

	
	public static void main(String[] args)  {
		
		TestAgeForVote1 t1=new TestAgeForVote1();
		
		validate(10);
		System.out.println("rest of the code");
		
	}
}
