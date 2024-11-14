package com.assignment;


public class CircularLL {
	static class Node{
		private int data;
		private Node next;

	public Node(int value) {
		data=value;
		next=null;
	}
	}
	private Node tail;
	private int size;
	public CircularLL() {
		tail=null;
		size=0;
	}
	public boolean isEmpty() {
		return tail==null;
	}
	public int size() {
		return size;
	}
	public void addFirst(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			tail=newnode;
			tail.next=tail;
		}else {
			newnode.next=tail.next;
			tail.next=newnode;
			
		}
		size++;
	}
	public void addLast(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			tail=newnode;
			tail.next=tail.next;
		}else {
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
		size++;
	}

	public void addPositon(int value,int pos) {
		
		if(pos<1||pos>size+1) {
			return;
		}
		Node newnode=new Node(value);
		if(size==0){
			tail=newnode;
			tail.next=tail.next;
		}else if(pos==1){
			addFirst(value);
			return;
		}else if(pos == size + 1) {
			addLast(value);
			return;
		}else {
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}
			newnode.next=trav.next;
			trav.next=newnode;
		}
		size++;
	}

	public void deletFirst() {
		if(size==0)
			return;
		else if(size==1)
			tail=null;
		else
			tail.next=tail.next.next;
			
			
	size--;
	}
	public void deletePosition(int pos) {
		if(pos<1||pos>size) {
			return;
		}

		if(pos==1) {
			deletFirst();
			return;
		}
		else if(pos==size) {
			deleteLast();
			return;
		}
		else {
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++) {
				trav=trav.next;
			}
			trav.next=trav.next.next;
		}
		size--;
	}

	public void deleteLast() {
		if(size==0)
			return;
		else if(size==1)
			tail=null;
		else {
			Node trav=tail.next;
			while(trav.next!=tail) {
				trav=trav.next;
			}
			trav.next=tail.next;
			tail=trav;
			
		}
		size--;
	}

	public void display() {
		if(isEmpty()) {
			return ;
		}else {
			Node trav=tail.next;
			do {
				System.out.print("->"+trav.data);
				trav=trav.next;
			}while(trav!=tail.next);
			//System.out.println(tail.data);
		}
	}
}
