package com.saurabh.data.structures.LinkedListQuestions;

public class MiddleOfLinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void findMiddleOfLinkedList(Node list)
	{
		Node slowPtr = list;
		Node fastPtr = list;
		
		if(list != null)
		{
			while(fastPtr != null && fastPtr.next != null)
			{
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
			}
			System.out.println("The middle element is "+slowPtr.data);
		}
		
	}
	
	public void printList() {
		Node temp = head;

		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		MiddleOfLinkedList linkList = new MiddleOfLinkedList();
		linkList.push(17);
		linkList.push(21);
		linkList.push(27);
		linkList.push(10);
		linkList.push(7);
		linkList.push(3);
		linkList.printList();
		
		linkList.findMiddleOfLinkedList(linkList.head);
		
		
	}

}
