package com.saurabh.data.structures.LinkedListQuestions;

public class UnionOfLinkedList {

	Node head;

	class Node{
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

	/* A utilty function that returns true if data is present 
    in linked list  else return false */
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

	/* Utility function to print list */
	void printList() 
	{ 
		Node temp = head; 
		while(temp != null) 
		{ 
			System.out.print(temp.data+" "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 

	/* Function to get Union of 2 Linked Lists */
	public void getUnion(Node list1, Node list2) 
	{ 
		Node head1 = list1, head2 = list2; 

		//insert all elements of list1 in the result 
		while (head1 != null) 
		{ 
			push(head1.data); 
			head1 = head1.next; 
		} 

		// insert those elements of list2 that are not present 
		while (head2 != null) 
		{ 
			if (!isPresent(head, head2.data)) 
				push(head2.data); 
			head2 = head2.next; 
		} 
	} 


	public static void main(String[] args) {
		
		UnionOfLinkedList linkedList1 = new UnionOfLinkedList();
		UnionOfLinkedList linkedList2 = new UnionOfLinkedList();
		UnionOfLinkedList unionList = new UnionOfLinkedList();
		

        /*create a linked lits 10->15->5->20 */
		linkedList1.push(20); 
		linkedList1.push(4); 
		linkedList1.push(15); 
		linkedList1.push(10); 
  
        /*create a linked lits 8->4->2->10 */
		linkedList2.push(10); 
		linkedList2.push(2); 
		linkedList2.push(4); 
		linkedList2.push(8); 
		
        unionList.getUnion(linkedList1.head, linkedList2.head); 
  
        System.out.println("First List is"); 
        linkedList1.printList(); 
  
        System.out.println("\nSecond List is"); 
        linkedList2.printList();  
  
        System.out.println("\nUnion List is"); 
        unionList.printList();
		

	}

}
