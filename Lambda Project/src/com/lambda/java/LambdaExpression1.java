package com.lambda.java;

public class LambdaExpression1 {

	public static void main(String[] args) {
		
		
		// with parenthesis
		Sayable1 s= (name)-> {
			
			return "Hello " + name;
		};
		
		System.out.println(s.say("saddam"));
		
		
		// without  parenthesis
       Sayable1 s1= name-> {
			
			return "Hello " + name;
		};
		
		System.out.println(s.say("hussain"));
		
	}

}
