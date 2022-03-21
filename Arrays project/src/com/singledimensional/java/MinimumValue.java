package com.singledimensional.java;

public class MinimumValue {

	public static void main(String[] args) {

      int arr[] = {11,12,13,14,3,5};  // declaration,instantiation & initialization
      
      int min = arr[0];
      
      for(int i=1;i<arr.length;i++) {
    	  
    	  if(min > arr[i]) {
    		  
    		  min=arr[i];
    	  }
      }
      
      System.out.println("Minimum value is : " + min);

	}

}
