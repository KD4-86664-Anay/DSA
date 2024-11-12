package Assignment;

public class SLL {
static class Node{
	private int data;
	private Node next;
	
	public Node(int data) {
		data=data;
		next=null;
	}
}

private Node head;
public SLL() {
	head=null;
}

public boolean isEmpty() {
	return head==null;
}

public void addFirst(int value) {
	Node newnode=new Node(value);
	newnode.next=head;
	head=newnode;

}
public void addLast(int value)
{
	Node newnode=new Node(value);
	Node trav=head;
	if(isEmpty()) {
		head=newnode;
	}
	else {
	while(trav.next!=null)
	{
	trav=trav.next;	
	}
	trav.next=newnode;
	}
}

public void display() {
	Node trav = head;
	System.out.print("List : ");
	while(trav != null) {
		// print current node
		System.out.print(" " + trav.data);
		// go on next node
		trav = trav.next;
	}// repeat above two step for each node
	System.out.println();
}
}
