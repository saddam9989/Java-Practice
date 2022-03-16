package com.lambda.java;

import java.util.function.Function;

public class FunctionInterfaceExample {

	static String show(String message) {
		return "Hello " + message;
	}

	public static void main(String[] args) {

		Function<String, String> fun = (x) -> FunctionInterfaceExample.show(x); // normal

		System.out.println(fun.apply("saddam"));
		

		Function<String, String> fun1 = FunctionInterfaceExample::show;  // method reference

		System.out.println(fun.apply("saddam"));

		Function<String, String> fun2 = (x) -> x.toUpperCase();

		System.out.println(fun2.apply("saddam"));
	}
}
