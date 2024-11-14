package com.assignment;

public class CircularList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLL cl=new CircularLL();
		cl.addFirst(10);
		cl.addLast(50);
		cl.addPositon(30, 2);
		cl.addFirst(20);
		cl.deletFirst();
		cl.deleteLast();
		cl.display();
	}

}
