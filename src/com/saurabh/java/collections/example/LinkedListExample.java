package com.saurabh.java.collections.example;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<Integer>linkedList = new LinkedList<Integer>();
		linkedList.addFirst(2);		
		linkedList.addLast(10);
		linkedList.addFirst(22);
		linkedList.addLast(5);
		
		System.out.println("LinkedList Content: "+linkedList);
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("LinkedList Content: "+linkedList);		
		System.out.println("LinkedList IsEmpty: "+linkedList.isEmpty());
		System.out.println("---------Removing All element-------");
		linkedList.removeAll(linkedList);	
		System.out.println("LinkedList IsEmpty: "+linkedList.isEmpty());
		
	}

}
