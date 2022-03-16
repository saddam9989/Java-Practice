package com.lambda.java;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionUsingForEach {

	public static void main(String[] args) {
		
		
		List<String> list = new  ArrayList<String>();
		
		list.add("saddam");
		list.add("hussain");
		list.add("naveen");
		list.add("Rahul");
		list.add("Likesh");
		list.add("sai krishna");
		
		list.forEach(n -> System.out.println(n)
		
				);

	}

}
