package com.basic.java;

public class ObjectCreation {
	
	String name;
	
	
	// default constructor
	public ObjectCreation() {
		super();
		System.out.println("default constructor");
	}
	
	
    // custome constructor
	public ObjectCreation(String name) {
	    this.name=name;
		System.out.println("custom  constructor is defined by " + name);
	}


	public static void main(String[] args) {
		
		ObjectCreation object =  new ObjectCreation(); 
		ObjectCreation object1 = new ObjectCreation("saddam hussain");
		
		System.out.println(object.equals(object1));
		System.out.println(object.hashCode());
		System.out.println(object.toString());
		System.out.println(object.getClass());
	}

}
