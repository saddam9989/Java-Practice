package com.singledimensional.java;

public class MaximumValue {

	public static void main(String[] args) {
		
		int arr[] = {10,1,12,6,15,20};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(max < arr[i]) {
				
				max=arr[i];
			}
		}
		
		System.out.println("Maximum value is : " + max);

	}

}
