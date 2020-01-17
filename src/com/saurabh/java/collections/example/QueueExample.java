package com.saurabh.java.collections.example;

import java.util.ArrayDeque;

public class QueueExample {

	public static void main(String[] args) {
		
		ArrayDeque<Integer>que = new ArrayDeque<Integer>();
		que.add(1);		
		que.add(2);
		que.add(3);
		que.add(4);
		
		System.out.println("Contet of Queue: "+que);	
		System.out.println("Queue Size : "+que.size());
		System.out.println("Queue Peek : "+que.peek());
		System.out.println("Contet of Queue: "+que);
		System.out.println("Queue Remove : "+que.remove());	
		System.out.println("Queue IsEmpty: "+que.isEmpty());
		System.out.println("Queue PeekLast : "+que.peekLast());
		
	}
	
}
