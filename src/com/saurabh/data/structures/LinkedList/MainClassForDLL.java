package com.saurabh.data.structures.LinkedList;

public class MainClassForDLL {
	

	public static void main(String[] args) {
		
		DoublyLinkedList doublyLL = new DoublyLinkedList();
		
		//Add a new element to the front
		doublyLL.insert(1);
		doublyLL.insert(2);
		doublyLL.insert(3);
		
		//Iterate DLL 
		doublyLL.iterateForward();
		System.out.println(" ");
		

		//Add element at the last
		doublyLL.insertTail(4);
		doublyLL.insertTail(5);
		
		//Iterate DLL 
		doublyLL.iterateForward();
		System.out.println(" ");
		
		//Add element at given position
		doublyLL.insert(8, 1);
		doublyLL.insert(11, 2);
		
		//Iterate DLL 
		doublyLL.iterateForward();
		System.out.println(" ");
		
	
		//Remove from DLL Head
		System.out.println(" ");
		int data = doublyLL.removeHead();
		System.out.println("Removed Head Data: "+data);
		doublyLL.iterateForward();
		System.out.println(" ");
		
	
		//Remove from DLL Tail
		System.out.println(" ");
		System.out.println("Removed Tail Data: "+doublyLL.removeTail());
		doublyLL.iterateForward();
		System.out.println(" ");
		
		
		//Remove element at given position
		System.out.println(" ");
		System.out.println("Removed Data at given position: 1 ");
		doublyLL.remove(1);
		doublyLL.iterateForward();
		System.out.println(" ");
		
/*		System.out.println(" ");
		System.out.println("Removed next data after DLL matched Data: 11");
		DLLNode node = new DLLNode(11);
		doublyLL.removeAfterMatched(node);
		doublyLL.iterateForward();
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("Removed prev data after DLL matched Data: 4");
		DLLNode node1 = new DLLNode(4);
		doublyLL.removeBeforeMatched(node1);
		doublyLL.iterateForward();
		System.out.println(" ");
		System.out.println("Lengthy: "+doublyLL.length());*/
		
		System.out.println(" ");
		System.out.println("Removed DLL matched Data: 2");
		DLLNode node2 = new DLLNode(2);
		doublyLL.removeMatched(node2);
		doublyLL.iterateForward();
		System.out.println(" ");
		System.out.println("Lengthy: "+doublyLL.length());
		

	}

}
