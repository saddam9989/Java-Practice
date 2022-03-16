package com.lambda.java;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierInterfaceExample {
    
    static String product = "Android";
 
    public static void main(String[] args) {
        
        Supplier<Boolean> boolSupplier = () -> product.length() == 10;
        Supplier<Integer> intSupplier = () -> product.length() - 2;
        Supplier<String> supplier = () -> product.toUpperCase();
        
        
        System.out.println(boolSupplier.get());
        System.out.println(intSupplier.get());
        System.out.println(supplier.get());
        
        
        
        // without generic 
        IntSupplier intsupp =()->product.length();
        System.out.println(intsupp.getAsInt());
        
    }
}
