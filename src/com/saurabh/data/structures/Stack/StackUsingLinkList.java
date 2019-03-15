package com.saurabh.data.structures.Stack;

public class StackUsingLinkList {
	
	private Node head;
	
	class Node{
		int data;
		Node next;
	}
	
	public StackUsingLinkList() {
		head = null;
	}
	
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public int pop() throws LinkedListEmptyException
	{
		if (head == null) {
			throw new LinkedListEmptyException("Empty Stack");
		}
		int value = head.data;
		head = head.next;
		return value;
	}
	
	public void push(int data) {
		Node oldHead = head;
		head = new Node();
		head.data = data;
		head.next = oldHead;
	}
	
	class LinkedListEmptyException extends RuntimeException{
		private static final long serialVersionUID = 1L;
		 
		public LinkedListEmptyException() {
			super();
		}
	 
		public LinkedListEmptyException(String message) {
			super(message);
		}
	}

	
	public static void main(String[] args) {
		StackUsingLinkList  lls = new StackUsingLinkList();
		
		//Empty Stack
		try {
			lls.pop();
		} catch (LinkedListEmptyException e) {
			e.printStackTrace();
		}
		
		lls.push(20);
		lls.push(50);
		lls.push(80);
		lls.push(40);
		lls.push(60);
		lls.push(75);
		lls.printList(lls.head);
		
		System.out.println("Element removed from Stack: "+lls.pop());
		System.out.println("Element removed from Stack: "+lls.pop());
		
		//Adding New element
		lls.push(10);
		
		System.out.println("Element removed from LinkedList: "+lls.pop());
		
		//print data
		lls.printList(lls.head);
	}
	
}
