package com.saurabh.data.structures.LinkedListQuestions;

public class LinkedListLengthEvenOdd {
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public int IsLinkedListLengthEven(Node head)
	{
		while(head != null && head.next != null) {
			head = head.next.next;
			if(head == null)
				return 0;
		}
		return 1;
	}
	
	public void printList(Node node)
	{
		while(node != null)
		{
			System.out.print(" "+node.data);
			node = node.next;
		}
		System.out.println("\n-------------------");
	}
	
	public static void main(String[] args) {
		LinkedListLengthEvenOdd list = new LinkedListLengthEvenOdd();
		
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		list.printList(list.head);
		
		if(list.IsLinkedListLengthEven(list.head) == 0)
			System.out.println("Given Linked List Length is even");
		else
			System.out.println("Given Linked List Length is odd");
	}

}
