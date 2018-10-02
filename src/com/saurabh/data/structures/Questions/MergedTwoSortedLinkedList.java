package com.saurabh.data.structures.Questions;

public class MergedTwoSortedLinkedList {
	
	
	Node head;
	
	class Node {
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
	
	public void printList(Node head)
	{
		while(head != null)
		{
			System.out.print(" "+head.data);
			head = head.next;
		}
		System.out.println("\n------------------");
	}
	
	public Node mergedTwoSortedListUsingRecursion(Node head1, Node head2)
	{
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
		Node head = new Node(0);
		
		if(head1.data <= head2.data) {
			head = head1;
			head.next = mergedTwoSortedListUsingRecursion(head1.next, head2);
		}else {
			head = head2;
			head.next = mergedTwoSortedListUsingRecursion(head2.next, head1);
		}
		return head;
	}
	
	public Node mergeTwoSortedList(Node head1, Node head2)
	{
		Node head = new Node(0);
		Node curr = head;
		
		while(head1 != null && head2 != null) {
			if(head1.data <= head2.data) {
				curr.next = head1;
				head1 = head1.next;
			}else {
				curr.next = head2;
				head2 = head.next;
			}
		}
		
		if(head1 != null)
		{
			curr.next = head1;
		}else if(head2 != null) {
			curr.next = head2;
		}
		return head.next;
	}
	public static void main(String[] args) {
		MergedTwoSortedLinkedList list1 = new MergedTwoSortedLinkedList();
		MergedTwoSortedLinkedList list2 = new MergedTwoSortedLinkedList();
		
		list1.push(9);
		list1.push(7);
		list1.push(5);
		list1.push(3);
		list1.push(1);
		System.out.println("Printing first sorted LL");
		list1.printList(list1.head);
		
		list2.push(10);
		list2.push(8);
		list2.push(6);
		list2.push(4);
		list2.push(2);
		System.out.println("Printing 2nd sorted LL");
		list1.printList(list2.head);
		
		MergedTwoSortedLinkedList list3 = new MergedTwoSortedLinkedList();
		Node mergedList = list3.mergedTwoSortedListUsingRecursion(list1.head, list2.head);
		//Node mergedList = list3.mergeTwoSortedList(list1.head, list2.head);
		System.out.println("Printing  Merged sorted LL");
		list1.printList(mergedList);
		
	}

}
