package com.saurabh.data.structures.Questions;

import java.util.HashSet;
import java.util.Set;

public class DetectLinkListIntersect {
	
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
	
	public void printList() {
		Node temp = head;

		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void findIntersectingNode(Node list1, Node list2)
	{
		int L1 = 0;
		int L2 = 0;
		int diff = 0;
		
		Node head1 = list1;
		Node head2 = list2;
		
		while(head1 != null)
		{
			L1++;
			head1 = head1.next;
		}
		
		while(head2 != null)
		{
			L2++;
			head2 = head2.next;
		}
		
		if(L1<L2) {
			head1 = list2;
			head2 = list1;
			diff = L2-L1;
		}else {
			head1 = list1;
			head2 = list2;
			diff = L1-L2;
		}
		
		for (int i = 0; i < diff; i++) {
			while(head1 != null && head2 != null) {
				if(head1.data == head2.data)
				{
					System.out.println("Intersecting Node: "+head1.data);
				}
				head1 = head1.next;
				head2 = head2.next;
			}
		}
	}
	
	//O(m+n) using Hashing
	public void getIntersectingNode(Node list1, Node list2)
	{
		Set set = new HashSet<>();
		
		Node head1 = list1;
		Node head2 = list2;
		
		while(head1 != null)
		{
			set.add(head1.data);
			head1 = head1.next;
		}
		
		while(head2 != null)
		{
			if(set.contains(head2.data))
			{
				System.out.println("HashSet Intersecting Node: "+head2.data);
			}
			head2 = head2.next;
		}		
	}
	
	public void findIntersectingNodes(Node list1, Node list2)
	{
		Node t1 = list1; 

		// Traverse list1 and search each element of it in list2. 
		// If the element is present in list 2, then insert the 
		// element to result 
		while (t1 != null) 
		{ 
			if (isPresent(list2, t1.data)) 
				push(t1.data); 
			t1 = t1.next; 
		} 
	}
	
	/* A utilty function that returns true if data is present 
	in linked list else return false */
	boolean isPresent (Node head, int data) 
	{ 
		Node t = head; 
		while (t != null) 
		{ 
			if (t.data == data) 
				return true; 
			t = t.next; 
		} 
		return false; 
	}
	
	public static void main(String[] args) {
		
		DetectLinkListIntersect linkList = new DetectLinkListIntersect();
		DetectLinkListIntersect list = new DetectLinkListIntersect();
		DetectLinkListIntersect intersect = new DetectLinkListIntersect();
		DetectLinkListIntersect intersect2 = new DetectLinkListIntersect();
		
        // creating first linked list 
		linkList.push(3); 
		linkList.push(6); 
		linkList.push(15); 
		linkList.push(15); 
		linkList.push(30); 
  
        // creating second linked list 
        list.push(10); 
        list.push(15); 
        list.push(30);
        
		//printing
		linkList.printList();
		list.printList();
		
		//Checking intersecting Node
		intersect.findIntersectingNode(linkList.head, list.head);
		
		//Using HashTable
		intersect.getIntersectingNode(linkList.head, list.head);
		
		//Using Normal Section
		intersect2.findIntersectingNodes(linkList.head, list.head);
		intersect2.printList();
		
		
	}

}
