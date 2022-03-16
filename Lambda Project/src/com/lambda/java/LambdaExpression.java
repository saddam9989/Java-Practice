package com.lambda.java;

public class LambdaExpression{

	public static void main(String[] args) {
		
		String name ="saddam";
		
		
		Sayable s=() -> System.out.println("Say something");

		s.say();
		
		
		Sayable s1=()->{
			
			System.out.println("say something new topic");
			
		};
		
		s1.say();
		
		
		
	}

}
