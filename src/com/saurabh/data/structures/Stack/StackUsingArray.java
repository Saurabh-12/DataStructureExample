package com.saurabh.data.structures.Stack;

public class StackUsingArray {
	
	class Stack{
		public static final int MAX_SIZE = 10;
		int top;
		int arr [] = new int[MAX_SIZE];
		
		public boolean isEmpty()
		{
			return (top<0);
		}
		
		Stack()
		{
			top = -1;
		}
		
		public boolean push(int x)
		{
			if(top>=(MAX_SIZE-1)) {
				System.out.println("Stack OverFlow\n");
				return false;
			}else {
				arr[++top] = x;
				System.out.println(x+" pushed into Stack\n");
				return true;
			}
		}
		
		public int pop() {
			if(top<0)
			{
				System.out.println("Stack Underflow\n");
				return 0;
			}else {
				int x = arr[top--];
				return x;
			}
		}
		
	}

	public static void main(String[] args) {
		
		Stack stack = new StackUsingArray().new Stack();
		
		//Stack is Empty so throgh error
		stack.pop();
		
		//Adding elements in stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		
		//stack is now full, now adding new element throw error;
		stack.push(11);
		
		// now remove last element from stack 
		System.out.println(stack.pop() + " Popped from stack");  

	}

}
