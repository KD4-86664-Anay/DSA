package com.assignment;

public class QueueImpLL {
private LLQueue queue;

public QueueImpLL()
{
	queue=new LLQueue();
}

public boolean isEmpty()
{
	return queue.isEmpty();
}
public void pushFront(int value)
{
	queue.addFirst(value);
}

public void popRear()
{
	queue.deleteLast();
}

public int peek()
{
	return queue.getTailData();
}
}
