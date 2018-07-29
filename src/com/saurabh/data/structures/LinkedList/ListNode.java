package com.saurabh.data.structures.LinkedList;

public class ListNode {
	private int data;
	public ListNode next;
	
	// Creates an empty node.
	public ListNode(){
		next = null;
		data = Integer.MIN_VALUE;
	}
	
	// Creates a node storing the specified data
	public ListNode(int data)
	{
		next = null;
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	// Sets the data stored in this node.
	public String toString (){
		return Integer.toString(data);
	}
	
	

}
