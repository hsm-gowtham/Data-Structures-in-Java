package LinkedList;

public class LinkedListDetectCycle {
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
	
	private boolean detectloop() {
		Node p=head;
		Node q=head;
		while(p!=null&&q!=null&&q.next!=null) {
			p=p.next;
			q=q.next.next;
			if(p==q)
			{
				return true;
			}
		}
		return false;

	}
	
	public static void main(String[] args) {
		LinkedListDetectCycle ll1=new LinkedListDetectCycle();
		ll1.append(1);
		ll1.append(2);
		ll1.append(3);
		ll1.append(4);
		ll1.head.next.next.next.next = ll1.head;
		System.out.println(ll1.detectloop());
		

	}

	

}
