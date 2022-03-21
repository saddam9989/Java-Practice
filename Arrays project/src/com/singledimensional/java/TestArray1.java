package com.singledimensional.java;

public class TestArray1 {

	public static void main(String[] args) {
		
		int arr[]=new int[5];    // declaration & instantiation
		
		arr[0]=10;               // initialization
		arr[1]=20;
		arr[3]=30;
		arr[4]=40;
		
		System.out.println("Forward Iteration");	
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}

		
	System.out.println("=========================================================================");
	System.out.println("Reverse Iteration");
	
	for(int i=arr.length-1;i>=0;i--) {
		
		System.out.println(arr[i]);
	}
	
	System.out.println("=========================================================================");
	System.out.println("Using for each loop");
	System.out.println("For each loop is only Forward iteration");
	
	for(int a:arr) {
		System.out.println(a);
	}
	
	}

}
