package com.assignment;

public class StackLinkedList {
static class Node{
	private int data;
	private Node next,prev;
	
	public Node(int value)
	{
		data=value;
		next=prev=null;
	}
	
	
}
private Node head,tail;
private int size;
public StackLinkedList() {
	head=tail=null;
	size=0;
}

public boolean isEmpty() {
	return head==null&&tail==null;
}

public int getHeadData() {
	return head.data;
}

public void addFirst(int value)
{
	Node nn=new Node(value);
	if(isEmpty())
	{
		head=tail=nn;
	}else {
		nn.next=head;
		head.prev=nn;
		head=nn;
	}
size++;	
}

public void deleteFirst() {
	if(isEmpty())
	{
		return;
	}
	else if(size==1)
	{
		head=tail=null;
	}else {
		head.next.prev=null;
		head=head.next;
	}
	size--;
}
}
