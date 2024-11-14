package com.assignment;

public class LLQueue {
static class Node{
	private int data;
	private Node prev,next;
	
	public Node(int value)
	{
		data=value;
		prev=next=null;
	}
}

private int size;
private Node head,tail;

public LLQueue()
{
	head=tail=null;
	size=0;
}

public boolean isEmpty()
{
	return head==null&&tail==null;
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

public void deleteLast()
{
	if(isEmpty())
	{
		return;
	}
	else if(size==1)
	{
		head=tail=null;
		
	}
	else {
		tail.prev.next=null;
		tail=tail.prev;
		
	}
}
public int getTailData() {
	return tail.data;
}
}
