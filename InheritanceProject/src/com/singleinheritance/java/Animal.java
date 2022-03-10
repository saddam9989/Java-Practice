package com.singleinheritance.java;

public class Animal {
	
	protected void eat() {
		System.out.println("Animals are eating");
	}

}

 class Dog extends Animal{
	 
	 public void bark() {
		 System.out.println("Dog is barking");
		 
		 super.eat();
	 }
	 
	 public void eat() {
			System.out.println("Dogs are eating");
		}
	
}

 class TestSingleInheritance{
	
	 public static void main(String[] args) {
		
		 Dog dog=new Dog();
		 
		 dog.bark();
		 dog.eat();
	}
 }