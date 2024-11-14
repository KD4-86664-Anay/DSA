package com.assignment;

public class StackImpUsingLL {

	private StackLinkedList list;
	public StackImpUsingLL()
	{
		list=new StackLinkedList();
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public void push(int value)
	{
		list.addFirst(value);
	}
	
	public void pop()
	{
		list.deleteFirst();
	}
	public int display()
	{
		return list.getHeadData();
	}

}
