package com.saurabh.data.structures.LinkedListQuestions;

public class PrintLinkListFromEnd {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node (int data)
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
	
public void printList(Node node)
{
    while (node != null) { 
        System.out.print(node.data + " "); 
        node = node.next; 
    }
    
	System.out.println("\n----------");
	
}

public void printListfromEnd(Node head) {
	if(head == null)
		return;
	printListfromEnd(head.next);
	System.out.print(" "+head.data);
}
	
	public static void main(String[] args) {
		
		PrintLinkListFromEnd list = new PrintLinkListFromEnd();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		
		list.printList(list.head);
		list.printListfromEnd(list.head);
	}

}
