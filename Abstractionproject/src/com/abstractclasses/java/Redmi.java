package com.abstractclasses.java;

public class Redmi extends Mobile {

	@Override
	void watch() {

		System.out.println("some one watching movies in redmi mobile");
	}

	public static void main(String[] args) {

		
		Mobile redmi=new Redmi();
		redmi.watch();
		redmi.talk();
		
	}

}
