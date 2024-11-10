package Assignment;

public class LinearQueue {
private int arr[];
private int front,rear;
private final int SIZE;

public LinearQueue(int size)
{
	SIZE=size;
	front=rear=0;
	arr=new int[SIZE];
}
public boolean isEmpty()
{
	return front==rear;
}

public boolean isFull()
{
	return rear==SIZE-1;
}
public void push(int value)
{
arr[rear++]=value;	
}
public int pop()
{
	int temp=arr[front];
	front++;
	return temp;
}
public int peek()
{
	return arr[front];
}
}
