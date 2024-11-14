package com.sunbeam.BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
static class Node{
	private int data;
	private Node left,right;
	
	public Node(int value) {
		data=value;
		left=right=null;
	}
}
private Node root;
public BST() {
	root=null;
}
public boolean isEmpty() {
	return root==null;
	
}
public void addNode(int value)
{
	if(root==null)
		root=new Node(value);
	else
		addNode(value,root);
}
private void addNode(int value,Node trav) {
	if(value<trav.data)
	{
		if(trav.left==null)
		{
			trav.left=new Node(value);
			return;
		}else {
			addNode(value,trav.left);
		}
	}else {
		if(trav.right==null)
		{
			trav.right=new Node(value);
			return;
		}else {
			addNode(value,trav.right);
		}	
	}
}

//public void addnode(int value)
//{
//	Node nn=new Node(value);
//	if(root==null)
//		root=nn;
//	else {
//		Node trav=root;
//		while(true) {
//			if(value<trav.data) {
//				if(trav.left==null)
//				{
//					trav.left=nn;
//					break;
//				}else {
//					trav=trav.left;
//				}
//			}else {
//				if(trav.right==null)
//				{
//					trav.right=nn;
//					break;
//				}else {
//					trav=trav.right;
//				}
//			}
//		}
//	}
//		
//}
private void preOrder(Node trav)
{
	if(trav==null)
		return ;
	System.out.println(trav.data);
	preOrder(trav.left);
	preOrder(trav.right);	
}


public void preOrder() {
	System.out.println("PreOrder:");
	preOrder(root);
	System.out.println();
	
}
private void inOrder(Node trav) {
	if(trav==null)
		return ;
	inOrder(trav.left);
	System.out.println(trav.data);
	inOrder(trav.right);
}

public void inOrder()
{
	System.out.println("Inorder:");
	inOrder(root);
	System.out.println();
}
private void postOrder(Node trav)
{
	if(trav==null)
		return ;
postOrder(trav.left);
postOrder(trav.right);
System.out.println(trav.data);
}
public void postOrder()
{
	System.out.println("PostPrder");
	postOrder(root);
	System.out.println();
}

public void DFS() {
	Stack<Node> st=new Stack<BST.Node>();
	st.push(root);
	while(!st.empty()) {
		Node trav=st.pop();
		System.out.println(trav.data);
		if(trav.left!=null)
			st.push(trav.left);
		if(trav.right!=null)
			st.push(trav.right);
	}
	System.out.println();
}

public void BFS() {
	Queue<Node> q=new LinkedList<Node>();
	q.offer(root);
	while(!q.isEmpty()) {
		Node trav=q.poll();
		System.out.println(trav.data);
		if(trav.left!=null)
		{
			q.offer(trav.left);
		}
		if(trav.right!=null)
		{
			q.offer(trav.right);
		}
	}
	System.out.println();
}
public Node[] binarySearchWithParent(int key) {
	// TODO Auto-generated method stub
	Node trav=root;
	Node parent=null;
	while(trav!=null) {
	
		if(trav.data==key)
			break;
		parent=trav;
		
		if(key <trav.data) {
			trav=trav.left;
		}
		else
			trav=trav.right;
		
		
	}
	if(trav==null)
		parent=null;
	return new Node[] {trav,parent};
}

public void deleteNode(int key) {
	
	Node arr[]=binarySearchWithParent(key);
	Node temp=arr[0],parent=arr[1];
	
	if(temp==null)
		return;
	if(temp.left!=null&&temp.right!=null)
	{
		Node pred=temp.left;
		pred=temp;
		while(pred.right!=null)
		{
			parent=pred;
			pred=pred.right;
		}
		
		temp.data=pred.data;
		temp=pred;
	}
	
	
	//4. if node has single child (right child)
	if(temp.left==null) {
		if(temp==root)
			root=temp.right;
		if(temp==parent.left)
			parent.left=temp.right;
		if(temp==parent.right)
			parent.right=temp.right;
	}else {
		
		if(temp==root)
			root=temp.left;
		if(temp==parent.left)
			parent.left=temp.left;
		if(temp==parent.right)
			parent.right=temp.left;
	}
	
	
	
	
	
}
private Node BinarySearch(int key,Node trav)
{
	if(trav==null)
		return null;
	if(key==trav.data)
		return trav;
	if(key<trav.data)
		return BinarySearch(key, trav.left);
	else
		return BinarySearch(key, trav.right);	
}
public Node BinarySearch(int key) {
	
	return BinarySearch(key,root);
}

private int height(Node trav)
{
	if(trav==null)
		return -1;
	int hl=height(trav.left);
	int hr=height(trav.right);
	int max=hl<hr?hr:hl;
	
	return max+1;
}

public int height()
{
	return height(root);
}

//public Node BinarySearch(int key)
//{
//	Node trav=root;
//	while(trav!=null)
//	{
//	if(trav.data==key)
//		return trav;
//	else if(key<trav.data)
//	{
//		trav=trav.left;
//	}else {
//		trav=trav.right;
//	}
//	
//	}
//	return null;
//}
}
