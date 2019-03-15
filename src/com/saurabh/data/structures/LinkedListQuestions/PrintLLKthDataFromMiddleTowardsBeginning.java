package com.saurabh.data.structures.LinkedListQuestions;

/*******
 * 
 * @author saurabh
 * print the value of kth node from middle towards the beginning of LL
 * middle Node = (n/2)+1
 * i/p = 1 > 2 > 3 > 4 > 5 > 6 > 7
 * k = 2
 * o/p 2
 * 
 * i/p 7 > 8 > 9 > 10 > 11 >12
 * k = 3
 * o/p = 7
 *
 */
public class PrintLLKthDataFromMiddleTowardsBeginning {
	
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
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void printList(Node head)
	{
		while(head != null) {
			System.out.print(" "+head.data);
			head = head.next;
		}
		System.out.println("\n---------------------------");
	}
	
	public void printKthDataFromMiddleTowadrsBeginning(Node head, int k)
	{
		Node temp = head;
		int len = 0;
		while(temp != null) {
			len++;
			temp = temp.next;
		}
		
		int middle = (len/2)+1;
		len = 0; 
		
		while(head != null) {
			len++;
			if(len == (middle-k)) {
				System.out.println("Kth data "+head.data);
			}

			head = head.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		PrintLLKthDataFromMiddleTowardsBeginning list = new PrintLLKthDataFromMiddleTowardsBeginning();
		//list.push(13);
		list.push(12);
		list.push(11);
		list.push(10);
		list.push(9);
		list.push(8);
		list.push(7);
		list.printList(list.head);
		
		list.printKthDataFromMiddleTowadrsBeginning(list.head, 3);
		
		
	}

}
