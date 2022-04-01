package com.list.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestArrayList {

	public static void main(String[] args) {
		
		         // list can stores the duplicate values also

	 List<String> list = new ArrayList<>();
	
	// List<String> list = new LinkedList<>();
	 
	// List<String> list = new Vector<>();
	 
	 list.add("saddam");
	 list.add("Sai krishna");
	 list.add("vamshi");
	 list.add("Arun");
	 list.add("Rahul");
	 list.add("Naveen");
	 list.add("Likesh");
	 list.add(null);
	 list.add(null);
	 
	 System.out.println("List of the size is : " + list.size());
	 System.out.println();
	 
	
	 for(String str : list) {
		 System.out.println(str);
	 }
	 
	 System.out.println("==================================================");
	 
	 list.add("Hussain");
	 list.add("saddam");
	 
	 
	 
	 System.out.println("List of the size after added some data : " + list.size());
	 System.out.println();
	 
	 
	 Iterator<String> itr =list.iterator();
	 
	 while (itr.hasNext()) {
		
		 System.out.println(itr.next());
	}
	 
	}

}
