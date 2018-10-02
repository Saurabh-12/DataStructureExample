package com.saurabh.data.structures.LinkedList;

public class CircularLinkedList {

	protected CLLNode tail;
	protected int length = 0;


	public CircularLinkedList()
	{
		tail = null;
		length = 0;
	}

	// Adds element to head of list
	public void addToHead(int data){
		CLLNode temp = new CLLNode(data);
		if (tail == null) { // first data added
			tail = temp;
			tail.setNext(tail);
		} else { // element exists in list
			temp.setNext(tail.getNext());
			tail.setNext(temp);
		}
		length++;
	}

	// Adds element to tail of list
	public void addToTail(int data){
		// new entry:
		addToHead(data);
		tail = tail.getNext();
	}

	// Returns data at head of list
	public int peek(){
		return tail.getNext().getData();
	}

	// Returns data at tail of list
	public int tailPeek(){
		return tail.getData();
	}

	// Returns and removes data from head of list
	public int removeFromHead(){
		CLLNode temp = tail.getNext(); // ie. the head of the list
		if (tail == tail.getNext()) {
			tail = null;
		} else {
			tail.setNext(temp.getNext());
			temp.setNext(null); // helps clean things up; temp is free
		}
		length--;
		return temp.getData();
	}

	// Returns and removes data from tail of list
	public int removeFromTail(){
		if (isEmpty()){
			return Integer.MIN_VALUE;
		}
		CLLNode finger = tail;
		while (finger.getNext() != tail) {
			finger = finger.getNext();
		}
		// finger now points to second-to-last data
		CLLNode temp = tail;
		if (finger == tail)	{
			tail = null;
		} else {
			finger.setNext(tail.getNext());
			tail = finger;
		}
		length--;
		return temp.getData();
	}

	// Returns true if no elements in list
	public boolean isEmpty(){
		return tail == null;
	}

	// Returns true if list contains data, else false
	public boolean contains(int data){
		if (tail == null) return false;
		CLLNode finger;
		finger = tail.getNext();
		while (finger != tail && (!(finger.getData() == data))){
			finger = finger.getNext();
		}
		return finger.getData() == data;
	}

	// Removes and returns element equal to data, or null
	public int remove(int data){
		if (tail == null) return Integer.MIN_VALUE;
		CLLNode finger = tail.getNext();
		CLLNode previous = tail;
		int compares;
		for (compares = 0; compares < length && (!(finger.getData() == data)); compares++) {
			previous = finger;
			finger = finger.getNext();
		}
		if (finger.getData() == data) {
			// an example of the pigeon-hole principle
			if (tail == tail.getNext()) { 
				tail = null; }
			else {
				if (finger == tail) 
					tail = previous;
				previous.setNext(previous.getNext().getNext());
			}
			// finger data free
			finger.setNext(null); 	// to keep things disconnected
			length--;            	// fewer elements
			return finger.getData();
		}
		else return Integer.MIN_VALUE;
	}

	public void printCircularListData()
	{

		if(length<=0){
			System.out.print("List is empty");
		}else{
			CLLNode cllNode = tail;
			System.out.print("[ ");
			do {
				System.out.print(cllNode.getData()+" ");
				cllNode = cllNode.getNext();
			}
			while(cllNode != tail);
		}
		System.out.print("] ");
		System.out.println("");
		System.out.println("---------------------------------");
	}

	public int circularLinkListLength()
	{
		int length = 0;
		CLLNode currentNode = tail.getNext();
		while (currentNode != tail) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

	// Return a string representation of this collection, in the form: ["str1","str2",...].    
	public String toString(){
		String result = "[";
		if (tail == null) {
			return result+"]";
		}
		result = result + tail.getData();
		CLLNode temp = tail.getNext();
		while (temp != tail) {
			result = result + "," + temp.getData();
			temp = temp.getNext();
		}
		return result + "]";
	}
}
