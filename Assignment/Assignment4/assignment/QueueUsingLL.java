package com.assignment;

public class QueueUsingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
QueueImpLL queue=new QueueImpLL();

queue.pushFront(20);
queue.pushFront(30);
queue.pushFront(40);
System.out.println(queue.peek());
queue.popRear();
System.out.println(queue.peek());
queue.popRear();
System.out.println(queue.peek());
	}

}
