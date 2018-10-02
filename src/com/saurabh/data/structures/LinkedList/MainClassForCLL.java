package com.saurabh.data.structures.LinkedList;

public class MainClassForCLL {

	public static void main(String[] args) {

		CircularLinkedList circularLL = new CircularLinkedList();

		circularLL.addToHead(1);
		circularLL.addToHead(2);
		circularLL.addToHead(3);
		
		circularLL.addToTail(6);
		circularLL.addToTail(5);
		circularLL.addToTail(7);
		
		//print list 
		circularLL.printCircularListData();
		System.out.println("List: "+circularLL.toString());
		
		System.out.println(" getPeek: "+circularLL.peek());
		System.out.println(" getTailPeek: "+circularLL.tailPeek());
		
		System.out.println("Delete From Head: "+circularLL.removeFromHead());
		//print list 
		////circularLL.printCircularListData();
		
		System.out.println("Delete From Tail: "+circularLL.removeFromTail());
		//print list 
		circularLL.printCircularListData();
		
		System.out.println("Delete matched data: "+circularLL.remove(5));
		//print list 
		circularLL.printCircularListData();
	}

}
