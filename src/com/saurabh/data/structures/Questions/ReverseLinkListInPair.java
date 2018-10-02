package com.saurabh.data.structures.Questions;

public class ReverseLinkListInPair {
	
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
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void printList(Node head) {
		while(head != null)
		{
			System.out.print(" "+head.data);
			head = head.next;
		}
		System.out.println("\n----------------------");
	}
	
	public void reverseLinkListInPair(Node head) {
        Node temp = head; 
        
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) { 
  
            /* Swap the data */
            int k = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = k; 
            temp = temp.next.next; 
		}
	}
	
	public Node reverseLinkListInPairRecursively(Node head)
	{
		Node temp = head;
		if(temp == null)
			return temp;
		
		//swapping first pair list data
		int k = temp.data;
		temp.data = temp.next.data;
		temp.next.data = k;
		
		//calling recusive for the rest
		temp = reverseLinkListInPairRecursively(temp.next.next);
		
		return temp;
	}
	

	public static void main(String[] args) {
		ReverseLinkListInPair list1 = new ReverseLinkListInPair();
		list1.push(8);
		list1.push(12);
		list1.push(5);
		list1.push(1);
		list1.push(14);
		list1.push(10);
		System.out.println("Original List");
		list1.printList(list1.head);
		
		//list1.reverseLinkListInPair(list1.head);
		list1.reverseLinkListInPairRecursively(list1.head);
		System.out.println("List in Pair");
		list1.printList(list1.head);
		
		
	}

}
