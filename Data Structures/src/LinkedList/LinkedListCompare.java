package LinkedList;

public class LinkedListCompare {
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
			new_node.next = null;
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
	
	boolean areIdentical(LinkedListCompare ll2,LinkedListCompare ll1) 
    { 
        Node a = ll1.head, b = ll2.head; 
        while (a != null && b != null) 
        { 
            if (a.data != b.data) 
                return false; 
  
           
            a = a.next; 
            b = b.next; 
        } 

        return (a == null && b == null); 
    } 
	
	public void printLL()
	{
		Node n= head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		LinkedListCompare ll1=new LinkedListCompare();
		LinkedListCompare ll2=new LinkedListCompare();
		ll1.append(3);
		ll1.append(4);
		ll1.append(5);
		ll2.append(3);
		ll2.append(4);
		ll2.append(5);
		
		ll1.printLL();
		ll2.printLL();
		 if (ll1.areIdentical(ll2,ll1) == true) 
	            System.out.println("Identical "); 
	        else
	            System.out.println("Not identical "); 
		

	}

}
