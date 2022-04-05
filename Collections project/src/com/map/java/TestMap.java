package com.map.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class TestMap {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map=new HashMap<>();         // unordered list
		
		//Map<Integer, String> map= new LinkedHashMap<>();    //  ordered list
		
		//Map<Integer, String> map= new TreeMap<>(); 
		
		map.put(600, "Saddam");
		map.put(200, "Hussain");
		map.put(300, "Naveen");
		map.put(400, "Rahul");
		map.put(500, "Sai");
		map.put(100, "Likesh");
		map.put(null, null);
		map.put(700, null);
		
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			
			System.out.println(m);
		
			
		}

	}

}
