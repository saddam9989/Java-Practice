package com.interfaceclasses.java;

public class Print implements Printable {

	@Override
	public void print() {

		System.out.println("Printing the papers");
	}

	public static void main(String[] args) {
		
		Printable print=new Print();
		
		print.print();

	}

}
