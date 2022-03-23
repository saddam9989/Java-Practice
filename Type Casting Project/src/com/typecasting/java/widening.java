package com.typecasting.java;

public class widening {

	public static void main(String[] args) {
		
		byte b=10;
		short s=30;
		int i=50;
		String str ="100";
		
		int a=s;
		
		double d=i;
		
		int i1=Integer.parseInt(str);
		String st =String.valueOf(i1);
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(i1);
		System.out.println(st);

	}

}
