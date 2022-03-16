package com.lambda.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LambdaExpressionUsingComparator {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(10, "Laptop", 37000f));
		list.add(new Product(20, "Key Board", 300f));
		list.add(new Product(30, "Mouse", 150f));
		
		System.out.println("Sorting on the names");
		
		Collections.sort(list,(p1,p2)-> 
		{
			return p1.productName.compareTo(p2.productName);
		});
		
		for(Product p : list) {
			
			System.out.println(p.id + " " + p.productName + " " + p.price);
			
		}

	}

}
