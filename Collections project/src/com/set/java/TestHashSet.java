package com.set.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSet {

	public static void main(String[] args) {
		
		// Set cannot store duplicate values 
		
		
		//Set<Integer> set=new HashSet<>();        // unordered list
		
		Set<Integer> set= new LinkedHashSet<>();  // ordered list
		
	    //Set<Integer> set= new TreeSet<>();   // Tree set cannot store null data 
		
		set.add(6);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(7);
		set.add(1);
		set.add(1);
		
		
	for(Integer i : set) {
		System.out.println(i);
	}
		
	set.add(null);
	set.add(8);
	
	System.out.println("=================================================");
	
	Iterator<Integer> itr = set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	}

}
