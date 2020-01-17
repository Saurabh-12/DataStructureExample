package com.saurabh.java.collections.example;

import java.util.Stack;

public class StackExample {
	
public static void main(String[] args) {

	Stack<Integer>stack  =  new Stack<Integer>();
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	
	System.out.println("Content of Stack : "+stack);	
	System.out.println("Size of Stack : "+stack.size());	
	System.out.println(" Stack Pop : "+stack.pop());
	System.out.println("Stack Top : "+stack.peek());
	System.out.println("Content of Stack : "+stack);	
	System.out.println("Is Stack Empty : "+stack.isEmpty());
}

}
