package com.saurabh.data.structures.Questions;

public class CheckLinkListPalindrome {
	
	Node head;
	Node left;
	
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
	
	public void printList(Node head) {
		while(head != null) {
			System.out.print(" "+head.data);
		head = head.next;
		}
		System.out.println("\n------------------------");
	}
	
	// Initial parameters to this function are &head and head 
    boolean isPalindromeUtil(Node right)  
    { 
        left = head; 
          
        /* stop recursion when right becomes NULL */
        if (right == null) 
            return true; 
  
        /* If sub-list is not palindrome then no need to 
           check for current left and right, return false */
        boolean isp = isPalindromeUtil(right.next); 
        if (isp == false) 
            return false; 
  
        /* Check values at current left and right */
        boolean isp1 = (right.data == (left).data); 
  
        /* Move left to next node */
        left = left.next; 
  
        return isp1; 
    } 
  
	
  /*  // A wrapper over isPalindromeUtil() 
    boolean isPalindrome(Node head)  
    { 
        boolean result = isPalindromeUtil(head); 
        return result; 
    }*/
    
    public boolean isPalindrome(Node head) {
    	 
        if(head == null || head.next==null)
            return true;
     
        //find list center
        Node fast = head;
        Node slow = head;
     
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
     
        Node secondHead = slow.next;
        slow.next = null;
     
        //reverse second part of the list
        Node p1 = secondHead;
        Node p2 = p1.next;
     
        while(p1!=null && p2!=null){
            Node temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
     
        secondHead.next = null;
     
        //compare two sublists now
        Node p = (p2==null?p1:p2);
        Node q = head;
        while(p!=null){
            if(p.data != q.data)
                return false;
     
            p = p.next;
            q = q.next;
     
        }
     
        return true;
    }
	
	public static void main(String[] args) {
		CheckLinkListPalindrome list = new CheckLinkListPalindrome();
		list.push(1);
		list.push(2);
		list.push(1);
		list.push(1);
		list.push(2);
		list.push(1);
		
		list.printList(list.head);
		if(list.isPalindromeUtil(list.head)) {
			System.out.println("List is Palindrome");
		}else {
			System.out.println("List is Not Palindrome");
		}
	}

}
