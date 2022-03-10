package com.abstractclasses.java;

abstract class Mobile {

	static String name;
	final String color = "Black";
	int cost;

	//Default constructor
	   public Mobile() {
			super();
			// TODO Auto-generated constructor stub
		}


	
	//constructor
	public Mobile(int cost) {
		super();
		this.cost = cost;
	}


	// concrete method or non abstract method
	public void talk() {
		System.out.println("saddam is talking to some one");
	}
	
	
 
	abstract void watch();

}
