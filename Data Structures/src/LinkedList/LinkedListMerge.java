package LinkedList;

import java.util.*;

public class LinkedListMerge {
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
		new_node=null;
		return;
	}
	
	private Node MergeLL(LinkedListMerge ll1, LinkedListMerge ll2) {
		Node p=ll1.head;
		Node q=ll2.head;
		Node s = null;
		Node new_head;
		if(p==null) return q;
		if(q==null) return p;
		if(p!=null&&q!=null)
		{
			if(p.data<q.data)
			{
				s=p;
				p=p.next;
			}
			else
			{
				s=q;
				q=q.next;
			}
		}
		new_head=s;
		while(p!=null&&q!=null)
		{
			if(p.data<q.data)
			{
				s.next=p;
				s=p;
				p=p.next;
			}
			else
			{
				s.next=q;
				s=q;
				q=q.next;
			}
		}
		if(p==null)
		{
			s.next=q;
		}
		else {
			s.next=p;
		}
		
		return new_head;
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
		LinkedListMerge ll1=new LinkedListMerge();
		LinkedListMerge ll2=new LinkedListMerge();
		LinkedListMerge mergedLL=new LinkedListMerge();
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			ll1.append(sc.nextInt());
		}
		for(int i=0;i<6;i++)
		{
			ll2.append(sc.nextInt());
		}
		ll1.printLL();
		System.out.println();
		ll2.printLL();
		System.out.println();
		Node NewHead=mergedLL.MergeLL(ll1,ll2);
		while(NewHead!=null)
		{
			System.out.print(NewHead.data+" ");
			NewHead=NewHead.next;
		}
		sc.close();
		
		
		

	}
	

}
