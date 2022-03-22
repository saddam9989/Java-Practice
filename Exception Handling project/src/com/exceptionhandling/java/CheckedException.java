package com.exceptionhandling.java;

public class CheckedException {  
     
    public static void checkNum(int num) {  
    	
        if (num < 1) {  
            
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");   //Compiler will check the exception
            
        }  
        
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  
   
    
    public static void main(String[] args) {  
    	
            CheckedException obj = new CheckedException();  
           
            obj.checkNum(-3);  
            
            System.out.println("Rest of the code..");  
    }  
}  