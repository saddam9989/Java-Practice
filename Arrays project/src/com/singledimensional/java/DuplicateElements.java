package com.singledimensional.java;

public class DuplicateElements {

	public static void main(String[] args) {
        
		int arr[] = {1,2,3,4,2,4,5,6,8,8,9};
		
		System.out.println("printing duplicate elements ");
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]== arr[j]) {
					
					System.out.println(arr[j]);
					
				}
				
			}
			
		}

	}

}
