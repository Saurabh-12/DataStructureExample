package com.saurabh.java.collections.example;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(12);
		arrayList.add(34)	;
		arrayList.add(8);
		arrayList.add(67);
		
		System.out.println(arrayList);
		System.out.println("Size of ArrayList: "+arrayList.size());
		System.out.println("Is ArrayList is Empty: "+arrayList.isEmpty());
		arrayList.remove(arrayList.size()-1) ;// removing one element from last
		System.out.println(arrayList);
		arrayList.removeAll(arrayList);		
		System.out.println("Is ArrayList is Empty: "+arrayList.isEmpty());
	}
	
}
