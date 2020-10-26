package LinkedList;

import java.util.*;

public class LinkedListnthNodeFromEnd {
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
		return;
	}
	

	private static int nthnode(int num,LinkedListnthNodeFromEnd ll1) {
		int count =1;
		Node p=ll1.head;
		Node q=ll1.head;
		while(count<=num-1)
		{
			q=q.next;
			count++;
		}
		while(q.next!=null)
		{
			p=p.next;
			q=q.next;
		}
		return p.data;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedListnthNodeFromEnd ll1=new LinkedListnthNodeFromEnd();
		for(int i=0;i<8;i++)
		{
			ll1.append(sc.nextInt());
		}
		int num=sc.nextInt();
		int ans=nthnode(num,ll1);
		System.out.println(ans);
		sc.close();
		

	}


}
