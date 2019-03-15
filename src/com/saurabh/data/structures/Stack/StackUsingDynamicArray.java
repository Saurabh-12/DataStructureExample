package com.saurabh.data.structures.Stack;

public class StackUsingDynamicArray {

	//Default array capacity
	protected int capacity = 16; //Power of 2
	//Array 
	protected int arr [];
	//top element of Stack
	protected int top;

	public StackUsingDynamicArray(int cap) {
		capacity= cap;
		arr = new int[capacity];
		this.top = -1;
	}

	public void push(int data)
	{
		if(isStackFull()){
			System.out.println(("Stack is full. Increasing the capacity."));
			increaseStackCapacity();
		}
		System.out.println("Adding: "+data);
		arr[++top] = data;

	}

	public int pop() throws Exception {
		if(isStackEmpty()){
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = arr[top--];
		System.out.println("Removed entry: "+entry);
		return entry;
	}

	/**
	 * This method returns true if the stack is 
	 * empty
	 * @return
	 */
	public boolean isStackEmpty() {
		return (top == -1);
	}

	/**
	 * This method returns true if the stack is full
	 * @return
	 */
	public boolean isStackFull() {
		return (top == capacity - 1);
	}

	private void increaseStackCapacity(){

		int[] newStack = new int[capacity*2];
		for(int i=0;i<capacity;i++){
			newStack[i] = arr[i];
		}
		arr = newStack;
		capacity = capacity*2;
	}

	public static void main(String[] args) {
		StackUsingDynamicArray dynStack = new StackUsingDynamicArray(2);

		dynStack.push(1);
		dynStack.push(2);

		dynStack.push(3);
		dynStack.push(4);

		dynStack.push(5);
		dynStack.push(6);

		//Poping out
		try {
			dynStack.pop();
			dynStack.pop();
			dynStack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dynStack.push(4);
		dynStack.push(5);
		dynStack.push(6);
	}

}
