package LinkedList;

import java.util.*;

public class LinkedListMergeUnsorted {
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public void append(int data)
	{
		Node new_node = new Node(data);
		if(head==null)
		{
			head=new_node;
			new_node.next=null;
			return;
		}
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new_node;
		new_node.next=null;
	}
	
	private Node merge(LinkedListMergeUnsorted ll1, LinkedListMergeUnsorted ll2) {
		Node p=ll1.head;
		Node q=ll2.head;
		while(p.next!=null)
		{
			p=p.next;
		}
		p.next=q;
		return ll1.head;
	}
	
	public void printLL()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public void sortlist(LinkedListMergeUnsorted ll1)
	{
	  Node curr = ll1.head;
	  Node temp = head;
	 
	  
	  while (curr.next != null) 
	  {
	    temp = curr.next;
	    while (temp != null) 
	    {
	      if (temp.data < curr.data) 
	      {
	        int t = temp.data;
	        temp.data = curr.data;
	        curr.data = t;
	      }
	      temp = temp.next;
	    }
	    curr = curr.next;
	  }
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedListMergeUnsorted ll1=new LinkedListMergeUnsorted();
		LinkedListMergeUnsorted ll2=new LinkedListMergeUnsorted();
		LinkedListMergeUnsorted sorted=new LinkedListMergeUnsorted();
		
		for(int i=0;i<5;i++)
		{
			ll1.append(sc.nextInt());
		}
		for(int i=0;i<5;i++)
		{
			ll2.append(sc.nextInt());
		}
		ll1.printLL();
		System.out.println();
		ll2.printLL();
		System.out.println();
		Node NewHead=sorted.merge(ll1,ll2);
		Node n=NewHead;
		while(NewHead!=null)
		{
			System.out.print(NewHead.data+" ");
			NewHead=NewHead.next;
		}
		ll1.sortlist(ll1);
		System.out.println();
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		sc.close();
	}

	

}
