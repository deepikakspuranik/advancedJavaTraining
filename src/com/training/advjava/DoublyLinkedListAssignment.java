package com.training.advjava;

import java.util.LinkedList;
import java.util.List;

public class DoublyLinkedListAssignment {

	
		public Node head;
		
		/*Insert new node */
		public DoublyLinkedListAssignment insert(DoublyLinkedListAssignment list,int data) {
			Node newNode = new Node(data);
			
			if(list.head==null) {
				list.head=newNode;
			}else {
				Node last = list.head;
				while(last.next!=null) {
					last = last.next;
				}
				last.next=newNode;
			}
			return list;
			
		}
		
		 public static void printList(DoublyLinkedListAssignment list) 
		    { 
		        Node currNode = list.head; 
		   
		        System.out.print("LinkedList: "); 
		   
		        // Traverse through the LinkedList 
		        while (currNode != null) { 
		            // Print the data at current node 
		            System.out.print(currNode.data + " "); 
		   
		            // Go to next node 
		            currNode = currNode.next; 
		        } 
		    } 
		
		public static void main(String as[]) {
			DoublyLinkedListAssignment list = new DoublyLinkedListAssignment();
			list.insert(list, 1);
			list.insert(list, 2);
			list.insert(list, 3);
			list.insert(list, 4);
			list.insert(list, 5);
			printList(list);
		}
		
}
