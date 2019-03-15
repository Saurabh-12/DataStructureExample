package com.saurabh.data.structures.LinkedListQuestions;

import java.util.Hashtable;

public class FindNRemoveLoopInLinkedList {
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		newNode = head;
	}
	
	public void detectNRemoveLoop(Node node)
	{
		Node slow = node, fast = node; 
		while (slow != null && fast != null && fast.next != null) { 
			slow = slow.next; 
			fast = fast.next.next; 

			// If slow and fast meet at same point then loop is present 
			if (slow == fast) 
				removeLoop(slow, node); 
		} 
	}
	
	
	
	private void removeLoop(Node loop, Node curr) {
		Node ptr1 = loop; 
        Node ptr2 = loop; 
  
        // Count the number of nodes in loop 
        int k = 1, i; 
        while (ptr1.next != ptr2) { 
            ptr1 = ptr1.next; 
            k++; 
        } 
  
        // Fix one pointer to head 
        ptr1 = head; 
  
        // And the other pointer to k nodes after head 
        ptr2 = head; 
        for (i = 0; i < k; i++) { 
            ptr2 = ptr2.next; 
        } 
  
        /*  Move both pointers at the same pace, 
         they will meet at loop starting node */
        while (ptr2 != ptr1) { 
            ptr1 = ptr1.next; 
            ptr2 = ptr2.next; 
        } 
  
        // Get pointer to the last node 
        ptr2 = ptr2.next; 
        while (ptr2.next != ptr1) { 
            ptr2 = ptr2.next; 
        } 
  
        /* Set the next node of the loop ending node 
         to fix the loop */
        ptr2.next = null; 
	}
	
	private void printList(Node node) {
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
	}
	
	private void printAllLoopNodeData(Node head)
	{
		Node slowPtr = head;
		Node fastPtr = head;
		boolean loopExist = false;
		
		while(fastPtr != null && fastPtr.next != null)
		{
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr) {
				loopExist = true;
				break;
			}
		}
		
		if(loopExist) {
			do {
	            System.out.print(slowPtr.data + " "); 
				slowPtr = slowPtr.next;
			} while (slowPtr != fastPtr);
		}
		
	}
	
	private void detectNRemoveLoopUsingHashTable(Node head) {
		if(head == null || head.next== null)
			return;
		Hashtable<Node, Integer>hashTable = new Hashtable<>();
		Node list = head;
		   while(list != null && list.next!=null) {
			      if (hashTable.containsKey(list.next)) {
			         list.next = null;
			      } else {
			    	  hashTable.put(list.next,list.data);
			      }
			      list = list.next;
			    }
	}

	public static void main(String[] args) {
		
		FindNRemoveLoopInLinkedList list = new FindNRemoveLoopInLinkedList(); 
        list.head = list.new Node(50); 
        list.head.next = list.new Node(20); 
        list.head.next.next = list.new Node(15); 
        list.head.next.next.next = list.new Node(4); 
        list.head.next.next.next.next = list.new Node(10); 
        
        // Creating a loop for testing  
        list.head.next.next.next.next.next = list.head.next.next; 
       

        System.out.println("Linked List having loop : "); 
        list.printAllLoopNodeData(list.head);
        
        //list.detectNRemoveLoop(list.head); 
        list.detectNRemoveLoopUsingHashTable(list.head);
        
        
        System.out.println("\nLinked List after removing loop : "); 
        list.printList(list.head); 
	}

}
