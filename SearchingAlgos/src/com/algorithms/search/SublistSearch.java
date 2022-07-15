package com.algorithms.search;

public class SublistSearch {
	
	static class Node{
		int data;
		Node next;
	}
	
	static Node newNode(int key) {
		Node temp=new Node();
		temp.data=key;
		temp.next=null;
		return temp;
	}
	
	static void printList(Node node) {
		while(node!=null) {
			System.out.println(node.data+" ");
			node=node.next;
		}
	}

	public static void main(String[] args) {
		// a: 1->2->3->4
        //b: 1->2->1->2->3->4
		Node a=newNode(1);
		a.next=newNode(2);
		a.next.next=newNode(3);
		a.next.next.next=newNode(4);
		
		Node b=newNode(1);
		b.next=newNode(2);
		b.next.next=newNode(1);
		b.next.next.next=newNode(2);
		b.next.next.next.next=newNode(3);
		b.next.next.next.next.next=newNode(4);
		
		if(findSubList(a,b)==true)
			System.out.println("sublist found");
		else
			System.out.println("list not found");

	}

	private static boolean findSubList(Node first, Node second) {
		Node ptr1=first,ptr2=second;
		if(first==null && second==null)//both of the list empty
			return true;
		if(first==null || (first!=null && second==null))// one of the list is empty
			return false;
		while(second!=null) { //till second is not empty
			ptr2=second;
			while(ptr1!=null) { //looping thru first list
				if(ptr2==null) //if second list becomes empty
					return false;
				else if(ptr1.data==ptr2.data) {//checking for data equality
					ptr1=ptr1.next;
					ptr2=ptr2.next;
				}
				else break;//conditions mismatch
			}
			if(ptr1==null) //checking outside loop if it was normal exit
				return true;
			ptr1=first; // updating pointers
			second=second.next;
		}
		return false;
	}

}

//o(m*n)