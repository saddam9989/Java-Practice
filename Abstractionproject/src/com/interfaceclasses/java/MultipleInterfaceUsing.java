package com.interfaceclasses.java;

public class MultipleInterfaceUsing implements Printable, Showable {

	@Override
	public void show() {

		System.out.println("Showing the printable papers");

	}

	@Override
	public void print() {

		System.out.println("printing the papers");

	}

	public static void main(String[] args) {

		Showable print = new MultipleInterfaceUsing();

		print.show();

		Printable print1 = new MultipleInterfaceUsing();

		print1.print();
	}

}
