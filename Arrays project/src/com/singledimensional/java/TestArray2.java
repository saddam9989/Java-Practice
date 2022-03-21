package com.singledimensional.java;

import java.util.Scanner;

public class TestArray2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");

		int n=sc.nextInt();
		
		int arr1[]=new int[n];
		
		System.out.println("Enter the numbers");
		
		//store the numbers
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		
		//print the numbers
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.print(arr1[i] + " ");
		}
		
	}

}
