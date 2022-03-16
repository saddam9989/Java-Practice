package com.stream.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;

public class ProductUsingStream {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1, "Hp Laptop", 45000f));
		productList.add(new Product(2,"Dell Laptop",30000f));  
        productList.add(new Product(3,"Lenevo Laptop",28000f));  
        productList.add(new Product(4,"Sony Laptop",28000f));  
        productList.add(new Product(5,"Apple Laptop",90000f)); 
        
        
        
        //Filtering Collection by using Stream
        List<Float> newList =   productList.stream()
                                                 .filter(p->p.price>30000f)
                                                 .map(p->p.price)
                                                 .collect(Collectors.toList());
                     System.out.println(newList);
        
       
        //Filtering and Iterating Collection        
        productList.stream()
        .filter(product->product.price == 30000)
        .forEach(product-> System.out.println(product.name));
        
        
       
        // reduce() Method in Collection
        Float totalPrice =  productList.stream()
                                     .map(product->product.price)
                                    .reduce(0.0f,(sum,price)->sum+price);
                                System.out.println(totalPrice);
        
        
        // Sum by using Collectors Methods
      double total=  productList.stream()
                                     .collect(Collectors.summingDouble(product->product.price));
                                      System.out.println(total); 
       
       
       // max() method to get min Product price                                  
       Product pA = productList.stream()
    		                       .max((product1, product2)->product1.price > product2.price ? 1:-1).get();    
       System.out.println(pA.price);   
       
       
       // min() method to get min Product price    
       Product pB = productList.stream()
    		                          .min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
       System.out.println(pB.price);  
       
       
       
       //count() Method in Collection
       
      Long count= productList.stream()
                        .filter(product->product.price>30000)
                        .count();
      
      System.out.println(count);
      
      
   // Converting product List into Set  
      Set<Float> productPriceList =   productList.stream()  
                         
    		               .filter(product->product.price < 40000)   // filter product on the base of price  
                            .map(product->product.price)  
                            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
      System.out.println(productPriceList);  
      
      
   // Converting Product List into a Map  
      Map<Integer,String> productPriceMap =    productList.stream()  
                      
    		                 .collect(Collectors.toMap(p->p.id, p->p.name));  
            
      System.out.println(productPriceMap);  

	}

}
