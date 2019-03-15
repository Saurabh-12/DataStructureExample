package com.saurabh.data.structures.LinkedListQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateDataInLinkedList {
	
	Node head;
	
	class Node{
		Node next;
		int data;
		
		Node(int data)
		{
			next = null;
			this.data = data;
		}
	}
	
	public void push(int new_data)
	{
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
	}
	
	private void printList(Node node) {
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
	}
	
	public void countDuplicate(int duplicateData) {
		int count = 0;
		
		while(head != null) {
			if(head.data == duplicateData)
				count++;
			head = head.next;
		}
		if(count ==1)
			System.out.println("No duplicate data");
		else
			System.out.println(duplicateData+" have "+count+" duplicate");
	}
	
	private void removeDuplicateUsingHashSet(Node head) {
		HashSet<Integer>hs = new HashSet<>();
		
		Node current = head;
		Node prev = null;
		
		while (current != null)
		{
			int currentData = current.data;
			if(hs.contains(currentData)) {
				prev.next = current.next;
			}else {
				hs.add(currentData);
				prev = current;
			}
			current = current.next;
			
		}
	}
	
	private void removeDuplicateUsingHashMap(Node head) {
		
		Map<Integer, Boolean>hashMap = new HashMap<Integer, Boolean>();
		Node current = head;
		Node next = null;
		while (current != null) {
			int currentData = current.data;
			if(hashMap.get(currentData) != null) {
				//already seen, So duplicate
				next.next = current.next;
			}else {
				hashMap.put(currentData, true);
				next = current;
			}
			current = current.next;
		}
	}
	
	public void removeDuplicateInSortedLinkList(Node head) {
		Node current = head;
		Node next_next = null;
		
		//if list is empty do nothing
		if(head == null)
		{
			return;
		}
		
		while(current.next != null && current.next != null) {
			//compare
			if(current.data == current.next.data) {
				next_next = current.next.next;
				current.next = null;
				current.next = next_next;
			}else {
				//advance the list
				current = current.next;
			}
		}
	}
	
	public Node removeDuplicateInSortedLinkListbyRecursion(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node first = head;
		Node rest = head.next;
		
		rest = removeDuplicateInSortedLinkListbyRecursion(rest);
		
		if(first.data == rest.data) {
			first.next = rest.next;
			rest = first.next;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		DuplicateDataInLinkedList llist = new DuplicateDataInLinkedList(); 
		DuplicateDataInLinkedList sortedLinkList = new DuplicateDataInLinkedList(); 
	       
	        /* Use push() to construct below list 
	          1->2->1->3->1  */
	        llist.push(1); 
	        llist.push(2); 
	        llist.push(1); 
	        llist.push(3); 
	        llist.push(1); 
	        llist.printList(llist.head);
	        System.out.println(" ");
	        
	        
	        //llist.countDuplicate(1);
	        //llist.removeDuplicateUsingHashSet(llist.head);
	        llist.removeDuplicateUsingHashMap(llist.head);
	        System.out.println(" --------------------------------");
	        llist.printList(llist.head);
	        
	        sortedLinkList.push(11);
	        sortedLinkList.push(11);
	        sortedLinkList.push(11);
	        sortedLinkList.push(21);
	        sortedLinkList.push(43);
	        sortedLinkList.push(43);
	        sortedLinkList.push(60);
	        System.out.println("\n--------------------------------");
	        sortedLinkList.printList(sortedLinkList.head);
	        System.out.println(" ");
	        
	        //sortedLinkList.removeDuplicateInSortedLinkList(sortedLinkList.head);
	        sortedLinkList.removeDuplicateInSortedLinkListbyRecursion(sortedLinkList.head);
	        System.out.println(" --------------------------------");
	        sortedLinkList.printList(sortedLinkList.head);
	        

	}

}
