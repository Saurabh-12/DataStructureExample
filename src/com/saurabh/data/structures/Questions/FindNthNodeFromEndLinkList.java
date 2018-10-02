package com.saurabh.data.structures.Questions;

import java.util.Hashtable;
import java.util.Map;

public class FindNthNodeFromEndLinkList {

	   Node head; // head of the list 
	   
	    /* Linked List node */
	    class Node 
	    { 
	        int data; 
	        Node next; 
	        Node(int d) 
	        { 
	            data = d; 
	            next = null; 
	        } 
	    } 
	  
	    /* Function to get the nth node from the last of a 
	       linked list */
	    void printNthFromLast(int n) 
	    { 
	        int len = 0; 
	        Node temp = head; 
	  
	        // 1) count the number of nodes in Linked List 
	        while (temp != null) 
	        { 
	            temp = temp.next; 
	            len++; 
	        } 
	  
	        // check if value of n is not more than length of 
	        // the linked list 
	        if (len < n) 
	            return; 
	  
	        temp = head; 
	  
	        // 2) get the (len-n+1)th node from the begining 
	        for (int i = 1; i < len-n+1; i++) 
	            temp = temp.next; 
	  
	        System.out.println(n+"th Node from End: "+temp.data); 
	    } 
	    
	    /* Function to get the nth node from end of list */
	    public void printNthFromLastUsingTwoPointer(int n) 
	    { 
	        Node main_ptr = head; 
	        Node ref_ptr = head; 
	  
	        int count = 0; 
	        if (head != null) 
	        { 
	            while (count < n) 
	            { 
	                if (ref_ptr == null) 
	                { 
	                    System.out.println(n+" is greater than the no "+ 
	                                      " of nodes in the list"); 
	                    return; 
	                } 
	                ref_ptr = ref_ptr.next; 
	                count++; 
	            } 
	            while (ref_ptr != null) 
	            { 
	                main_ptr = main_ptr.next; 
	                ref_ptr = ref_ptr.next; 
	            } 
	            System.out.println(n+"th from last: "+ 
	                               main_ptr.data); 
	        } 
	    }
	  
	    //Using Recursion 
	    int count = 0;
	    public void printNthNodeFromEndUsingRecursion(Node head, int n)
	    {	
	    	if(head != null) {
	    		printNthNodeFromEndUsingRecursion(head.next, n);
	    		count++;
	    	}
	    	
	    	if(count == n) {
	    		System.out.println(n+"th Node from End: "+head.data);
	    	}
	    }
	    
	    //Using Hashtable
	    public void getNthNodeFromEndUsingHashTable(int n) {
	    	Hashtable<Integer, Integer>hashTable = new Hashtable<>();
	    	int len = 1;
	    	  while (head != null) 
		        { 
	    		  hashTable.put(len, head.data);
		            head = head.next; 
		            len++; 
		        } 
 
	    	  int size = hashTable.size();
	    	  if(size<n) {
	    		  System.out.println("Fewer No of Node");
	    	  }else {
	    		  System.out.println(n+"th Node from End: "+hashTable.get(size-n+1));
	    	  }
	    }
	    
	    /* Inserts a new Node at front of the list. */
	    public void push(int new_data) 
	    { 
	        /* 1 & 2: Allocate the Node & 
	                  Put in the data*/
	        Node new_node = new Node(new_data); 
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head; 
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node; 
	    } 
	  
	    /*Drier program to test above methods */
	    public static void main(String [] args) 
	    { 
	    	FindNthNodeFromEndLinkList llist = new FindNthNodeFromEndLinkList(); 
	        llist.push(12); 
	        llist.push(18); 
	        llist.push(5); 
	        llist.push(15); 
	  
	        llist.printNthFromLast(2); 
	        llist.printNthFromLastUsingTwoPointer(4);
	        llist.printNthNodeFromEndUsingRecursion(llist.head, 4);
	        llist.getNthNodeFromEndUsingHashTable(2);
	    } 
	}