package com.saurabh.data.structures.LinkedListQuestions;

import java.util.HashSet;

import com.saurabh.data.structures.LinkedListQuestions.FindNRemoveLoopInLinkedList.Node;

public class DetectLoopInLinkedList {
	Node head;

	class Node {
		Node next;
		int data;

		Node(int data) {
			next = null;
			this.data = data;

		}

	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
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

	public static boolean detectLoopInLinkedList(Node h) {
		HashSet<Node> hasSet = new HashSet<>();
		while (h != null) {
			// If we have already has this node
			// in hashmap it means their is a cycle
			// (Because you we encountering the
			// node second time).
			if (hasSet.contains(h))
				return true;

			// If we are seeing the node for
			// the first time, insert it in hash
			hasSet.add(h);

			h = h.next;
		}

		return false;
	}

	// Floyd’s Cycle-Finding Algorithm:
	public int detectLoop() {
		Node slow_p = head, fast_p = head;
		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if (slow_p == fast_p) {
				System.out.println("Found loop");
				return 1;
			}
		}
		return 0;
	}
	
	public int findLengthOfLoop(Node head)
	{
		int len = 0;
		Node fastPtr = head;
		Node slowPtr = head;
		boolean loopExist = false;
		
		while(fastPtr != null && fastPtr.next!= null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr)
			{
				loopExist = true;
				break;
			}
		} 
		
		if(loopExist) {
			do {
				slowPtr = slowPtr.next;
				len++;
			} while (slowPtr != fastPtr);
		
		}
		
		return len;
	}
	
	public Node findBeginOfLoop(Node head) {
		Node fastPtr = head;
		Node slowPtr = head;
		boolean loopExist = false;
		
		while(fastPtr != null && fastPtr.next != null)
		{
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr)
			{
				loopExist = true;
				break;
			}
		}
		
		if(loopExist) {
			slowPtr = head;
			while(slowPtr != fastPtr) {
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next;
			}
			return fastPtr;
		}else {
			return null;
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
		DetectLoopInLinkedList linkList = new DetectLoopInLinkedList();

		linkList.push(20);
		linkList.push(4);
		linkList.push(15);
		linkList.push(10);
		linkList.push(18);

		linkList.printList();

		/* Create loop for testing */
		linkList.head.next.next.next.next = linkList.head;

		if (detectLoopInLinkedList(linkList.head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");

		linkList.detectLoop();
		
		int length = linkList.findLengthOfLoop(linkList.head);
		System.out.println("Length of Cyclic Loop: "+length);
		
		Node loopStartNode = linkList.findBeginOfLoop(linkList.head);
		System.out.println("Loop Start Node: "+loopStartNode.data);
		
		System.out.println("loop data: ");
		linkList.printAllLoopNodeData(linkList.head);

	}

}
