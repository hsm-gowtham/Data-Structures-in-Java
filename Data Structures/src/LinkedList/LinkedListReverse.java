package LinkedList;

public class LinkedListReverse {
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
	public void push(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public void reverseLL()
	{
		Node current=head;
		Node prev=null;
		Node forward;
		while(current!=null)
		{
			forward=current.next;
			current.next=prev;
			prev=current;
			current=forward;
		}
		head=prev;
		return;
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
		LinkedListReverse ll = new LinkedListReverse();
		ll.push(1);
		ll.push(3);
		ll.push(5);
		ll.push(7);
		ll.printLL();
		ll.reverseLL();
		System.out.println();
		ll.printLL();

	}

}
