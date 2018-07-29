package com.saurabh.data.structures.LinkedList;

public class MainClass {
	
	

	public static void main(String[] args) {
		
		SingleLinkedList singlelinkedList = new SingleLinkedList();
		
		ListNode node = new ListNode();
		node.setData(4);
		singlelinkedList.insertAtBegin(node);
		
		for (int i = 1; i < 5; i++) {
			singlelinkedList.insert(i, i);
		}
		
		ListNode node1 = new ListNode();
		node1.setData(5);
		singlelinkedList.insertAtEnd(node1);
		
		ListNode node2 = new ListNode();
		node2.setData(6);
		singlelinkedList.insert(8, 3);
		
		System.out.println("Insert Example: "+singlelinkedList.toString());
		System.out.println("---------------------------------");
		
		ListNode removeNode = singlelinkedList.removeFromBegin();
		System.out.println("Removed Node: "+removeNode.toString());
		
		ListNode lastNode = singlelinkedList.getLast();
		System.out.println("Removed LastNode "+lastNode);
		
		
		System.out.println("Remove Example: "+singlelinkedList.toString());

	}

}
