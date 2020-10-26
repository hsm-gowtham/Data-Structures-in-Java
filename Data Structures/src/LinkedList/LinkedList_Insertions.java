package LinkedList;

public class LinkedList_Insertions {
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
	
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public void insertAtPos(int pos,int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
			new_node.next=null;
			return;
		}
		Node n=head;
		for(int i=0;i<pos-2;i++)
		{
			n=n.next;
			
		}
		new_node.next=n.next;
		n.next=new_node;
		return;
		
	}
	
	public void append(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
			return;
		}
		new_node.next=null;
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new_node;
		return;
	}
	
	public void insertAfterGivenNode(Node prev_node,int data)
	{
		if(prev_node==null)
			System.out.println("The Given Previous Node Cannot be Null");
		Node new_node=new Node(data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
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
		LinkedList_Insertions ll=new LinkedList_Insertions();
		ll.append(6); 
        // Insert 7 at the beginning. So linked list becomes 
        // 7->6->NUllist 
        ll.push(7); 
        // Insert 1 at the beginning. So linked list becomes 
        // 1->7->6->NUllist 
        ll.push(1);  
        // Insert 4 at the end. So linked list becomes 
        // 1->7->6->4->NUllist 
        ll.append(4); 
        // Insert 8, after 7. So linked list becomes 
        // 1->7->8->6->4->NUllist 
        ll.insertAfterGivenNode(ll.head.next, 8);
        ll.insertAtPos(4, 44);
        ll.printLL();
		
	}

}
