package com.saurabh.data.structures.LinkedList;

public class DoublyLinkedList {

	private DLLNode head;
	private DLLNode tail;
	private int length;

	public DoublyLinkedList() {
		head = null;
		tail = null;
		length = 0;
	}

	// Get the value at a given position.
	public int get(int position) {
		return Integer.MIN_VALUE;
	}

	// Find the position of the head value that is equal to a given value.
	// The equals method us used to determine equality.
	public int getPosition(int data) {
		// go looking for the data
		DLLNode temp = head;
		int pos = 0;
		while (temp != null) {
			if (temp.getData() == data) {
				// return the position if found
				return pos;
			}
			pos += 1;
			temp = temp.getNext();
		}
		// else return -1
		return Integer.MIN_VALUE;
	}

	// Return the current length of the DLL.
	public int length() {
		return length;
	}

	// Add a new value to the front of the list.
	public void insert(int newValue) {

		DLLNode newNode = new DLLNode(newValue);        
		if(head == null)
		{
			head = newNode;
			tail = head;
		}
		else
		{
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
		}
		length +=1;
	}

	// Add a new value to the rear of the list.
	public void insertTail(int newValue) {		
		DLLNode newNode = new DLLNode(newValue);        
		if(head == null)
		{
			head = newNode;
			tail = head;
		}
		else
		{
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}

		length +=1;
	}

	// Add a new value to the list at a given position.
	// All values at that position to the end move over to make room.
	public void insert(int data, int position) {
		// fix the position
		if (position < 0) {
			position = 0;
		}
		if (position > length) {
			position = length;
		}

		// if the list is empty, make it be the only element
		if (head == null) {
			head = new DLLNode(data);
			tail = head;
		}
		// if adding at the front of the list...
		else if (position == 0) {
			DLLNode temp = new DLLNode(data);
			temp.next = head;
			head = temp;
		}
		// else find the correct position and insert
		else {
			DLLNode temp = head;
			for (int i=1; i<position; i+=1) {
				temp = temp.getNext();
			}
			DLLNode newNode = new DLLNode(data);
			newNode.next = temp.next;
			newNode.prev = temp;
			newNode.next.prev = newNode;
			temp.next = newNode;
		}
		// the list is now one value longer
		length += 1;
	} 


	// Return a string representation of this collection, in the form: ["str1","str2",...].
	public String toString() {
		String result = "[]";
		if (length == 0)
			return result;
		result = "[" + head.getNext().getData();
		DLLNode temp = head.getNext().getNext();
		while (temp != tail) {
			result += "," + temp.getData();
			temp =  temp.getNext();
		}
		return result + "]";
	}	

	// Remove everything from the DLL.
	public void clearList(){
		head = null;
		tail = null;
		length = 0;
	}

	//Remove the head value from the list.If list is empty, do nothing
	public int removeHead() {
		if(length==0) {
			return Integer.MIN_VALUE;
		} else {
			int headData = head.getData();
			head = head.getNext();
			//save.getNext().setPrev(head);
			length--;
			return headData;
		}
	}

	// Remove the tail value from the list. If the list is empty, do nothing.
	public int removeTail() {
		if(length==0){
			System.out.println("\nList is Empty");
			return Integer.MIN_VALUE;
		}else if(length==1){
			return removeHead();
		}else{
			//store the 2nd last node
			int tailData = tail.getData();
			DLLNode prevTail = tail.getPrev();

			//detach the last node
			tail = prevTail;
			tail.next=null;
			length--;
			return tailData;
		}

	}

	// Remove the value at a given position.
	// If the position is less than 0, remove the value at position 0.
	// If the position is greater than 0, remove the value at the last position.
	public void remove(int position) {
		if (position == 1) 
		{
			if (length == 1)
			{
				head = null;
				tail = null;
				length = 0;
				return; 
			}
			head = head.getNext();
			head.setPrev(null);
			length--; 
			return ;
		}
		if (position == length)
		{
			tail = tail.getPrev();
			tail.setNext(null);
			length-- ;
		}
		DLLNode ptr = head.getNext();
		for (int i = 2; i <= length; i++)
		{
			if (i == position)
			{
				DLLNode p = ptr.getPrev();
				DLLNode n = ptr.getNext();

				p.setNext(n);
				n.setPrev(p);
				length-- ;
				return;
			}
			ptr = ptr.getNext();
		}  
	}

	// Remove a node matching the specified node from the list.  
	// Use equals() instead of == to test for a matched node.
	public synchronized void removeAfterMatched(DLLNode after) {
		DLLNode temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
		{
			if(temp.next.next ==null) {
				removeTail();
			}else {
				//temp.next.next.prev = temp;	
				temp.next = temp.getNext().getNext();
				length--;
			}
		}
	}
	
	// Remove a node matching the specified node from the list.  
	// Use equals() instead of == to test for a matched node.
	public synchronized void removeBeforeMatched(DLLNode before) {
		DLLNode temp = head;
		while (temp.next != null && temp.data != before.data) {
			temp = temp.next;
		}
		if (temp.prev != null)
		{
			if(temp.prev.prev ==null) {
				removeHead();
			}else {
				temp.getPrev().getPrev().next = temp;	
				//temp.getPrev().next = temp;	
				length--;
			}
		}
	}
	
	public synchronized void removeMatched(DLLNode node) {
		DLLNode temp = head;
		while (temp.next != null && temp.data != node.data) {
			temp = temp.next;
		}
		if(temp.prev != null && temp.next != null) {
			temp.getPrev().next = temp.getNext();
			length--;
		}else if(temp.next == null) {
			removeTail();
		}else if (temp.prev == null) {
			removeHead();
		}
	}


	/**
	 * this method walks forward through the linked list
	 */
	public void iterateForward(){

		System.out.println("iterating forward..");
		System.out.print("[");
		DLLNode tmp = head;
		while(tmp != null){
			System.out.print(" "+tmp.getData());
			tmp = tmp.next;
		}
		System.out.print(" ]");
	}

	/**
	 * this method walks backward through the linked list
	 */
	public void iterateBackward(){

		System.out.println("iterating backword..");
		DLLNode tmp = tail;
		while(tmp != null){
			System.out.println(tmp.getData());
			tmp = tmp.prev;
		}
	}

}
