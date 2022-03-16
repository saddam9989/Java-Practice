package com.lambda.java;

import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class ConsumerInterfaceExample {
	
  
	static void printValue(int val){  
        System.out.println(val);  
    } 

	
	public static void main(String[] args) {

		Consumer<String> consumer = x -> System.out.println(x);
		
		consumer.accept("java");
		
		
	    Consumer<Integer> consumer1 = x -> System.out.println(x);  // Normal
        consumer1.accept(12);  
        
        Consumer<Integer> consumer2 = System.out :: println;  // Using Method Reference
        consumer2.accept(40);  
        
        Consumer<Integer> consumer3 = x -> ConsumerInterfaceExample.printValue(x);  // Normal
        consumer3.accept(190);  
        
        Consumer<Integer> consumer4 = ConsumerInterfaceExample::printValue;  // Using Method Reference
        consumer4.accept(1900);  
        
        
        BiConsumer<String,String> biConsumer=(firstname,lastname) -> System.out.println(firstname + " "  + lastname);
        biConsumer.accept("Saddam", "Hussain");

	}

}
