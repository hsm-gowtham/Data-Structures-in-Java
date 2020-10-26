package LinkedList;

import java.util.*;

public class LinkedListDelete {
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
		Node new_node=new Node(data);
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
	private Node Listdelete(int pos, LinkedListDelete ll1) {
		Node p=ll1.head;
		Node temp=null;
		if(pos==1)
		{
			ll1.head=p.next;
			return ll1.head;
		}
		for(int i=0;i<pos-2;i++)
		{
			p=p.next;
		}
		temp=p.next;
		p.next=temp.next;
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


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedListDelete ll1=new LinkedListDelete();
		for(int i=0;i<6;i++)
		{
			ll1.append(sc.nextInt());	
		}
		int num=sc.nextInt();
		ll1.printLL();
		System.out.println();
		ll1.Listdelete(num,ll1);
		ll1.printLL();
		sc.close();

	}

	
}
