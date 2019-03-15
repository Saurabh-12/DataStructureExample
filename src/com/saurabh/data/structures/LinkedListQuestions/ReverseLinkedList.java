package com.saurabh.data.structures.LinkedListQuestions;

public class ReverseLinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			next = null;
			this.data = data;
		}
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void printList(Node node) {
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
	}
	
	private Node reverseLinkList(Node head2) {
		Node prev = null;
		Node curr = head2;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
	
    // A simple and tail recursive function to reverse 
    // a linked list.  prev is passed as NULL initially.
	private Node recursiveReverse(Node head) {
		Node newHead;
		
		if(head.next ==null)
			return head;
		newHead = recursiveReverse(head.next);
		
		//revrse the link
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	
	public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList(); 
        list.head = list.new Node(85); 
        list.head.next = list.new Node(15); 
        list.head.next.next = list.new Node(4); 
        list.head.next.next.next = list.new Node(20); 
          
        System.out.println("Given Linked list"); 
        list.printList(list.head); 
        
        //Node reverseHead = list.reverseLinkList(list.head);
        Node reverseHead = list.recursiveReverse(list.head);
        System.out.println(""); 
        System.out.println("Reversed linked list ");
        list.printList(reverseHead);
		
	}

}
