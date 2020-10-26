package LinkedList;

import java.util.*;

public class LinkedListDeleteDuplicates {
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
	
	public Node deleteduplicates()
	{
		Node p=head;
		Node q=null;
		while(p!=null&&p.next!=null)
		{
			if(p.data==p.next.data)
			{
				q=p.next;
				p.next=q.next;
				
			}
			else
			{
				p=p.next;
						
			}
		}
		return head;
	}
	
	public void printLL(Node head)
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
		LinkedListDeleteDuplicates ll1=new LinkedListDeleteDuplicates();
		for(int i=0;i<8;i++)
		{
			ll1.append(sc.nextInt());
		}
		ll1.printLL(ll1.head);
		System.out.println();
		Node new_head=ll1.deleteduplicates();
		System.out.println();
		ll1.printLL(new_head);
		sc.close();
		
		

	}

}
