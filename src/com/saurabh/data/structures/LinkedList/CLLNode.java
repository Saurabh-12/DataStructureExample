package com.saurabh.data.structures.LinkedList;

public class CLLNode {
	
	public CLLNode next;
	public int data;
	
	
	public CLLNode() {
		next = null;
		data = Integer.MIN_VALUE;
	}
	
	public CLLNode(int data) {
		next = null;
		this.data = data;
	}
	
	public CLLNode getNext() {
		return next;
	}

	public void setNext(CLLNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	// Sets the data stored in this node.
	public String toString (){
		return Integer.toString(data);
	}	

}