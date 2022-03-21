package com.singledimensional.java;

public class PrintOddPositionValues {

	public static void main(String[] args) {
	
		int arr[]= {10,20,30,40,50,60,70,80,90};
		
		
		//printing odd position values
		for (int i = 0; i < arr.length; i=i+2) {
			
			System.out.print(arr[i] + " ");
			
		}

	}

}
