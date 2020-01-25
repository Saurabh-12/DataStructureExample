package com.saurabh.java.collections.example;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, Integer>tm = new TreeMap<String, Integer>();
		tm.put("Madhav", 55);
		tm.put("Jagdesh", 38);
		tm.put("Wankhade", 27);
		tm.put("Emaali", 23);
		tm.put("Aunshul", 29);
		System.out.println("TreeMap count: "+tm.size());
		
		for (String key : tm.keySet()) {
			System.out.println(key+" have age:  "+tm.get(key));
		}
		
	}
}
