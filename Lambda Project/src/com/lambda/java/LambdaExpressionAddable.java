package com.lambda.java;

public class LambdaExpressionAddable {

	public static void main(String[] args) {
		
		Addable add = (a,b) -> {
			
			return (a + b);
		};
		
		System.out.println(add.add(10, 20));

		
		Addable add1=(int a,int b) -> (a+ b);
		
		System.out.println(add1.add(100, 200));
		
		
	}

}
