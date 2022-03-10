package com.polymorphism.java;

public class Mobile {
	
	int price;
	String mobileName;
	long mobileNumber;
	
	
	// default constructor
	public Mobile() {
		super();
	}

    // custome constructor
	public Mobile(int price, String mobileName, long mobileNumber) {
		super();
		this.price = price;
		this.mobileName = mobileName;
		this.mobileNumber = mobileNumber;
	}
	
	
	public void calling(String whatsappVideoCalling) {
		
		System.out.println("By talking " + whatsappVideoCalling);
		
	}
	
	public void calling(String instragramVideoCalling, String facebookVideoCalling) {
		System.out.println("By talking " + instragramVideoCalling + " and " + facebookVideoCalling);
	}
	
	
	public static void main(String[] args) {
	  Mobile mobile =new Mobile();
	  
	  mobile.calling("whatsapp video call");
	  mobile.calling("Instragram video call", "facebook video call");
    }
}
