package com.polymorphism.java;

public class Cow extends Animals {
	
	
	
	public void eat() {
		
		System.out.println("cow is eating different way like chew & swallow ");
		super.eat();
	}

	
	public static void main(String[] args) {
		
		Animals animal = new Cow();
		
		animal.eat();
		
	}
}
