package com.sunbeam.BST;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BST bst=new BST();
bst.addNode(10);
bst.addNode(20);
bst.addNode(5);
bst.addNode(1);
bst.addNode(50);
bst.addNode(10);
bst.addNode(40);
//bst.preOrder();
//bst.inOrder();
//bst.postOrder();
//bst.DFS();
//System.out.println("BFS");
//bst.deleteNode(10);
//bst.BFS();

BST.Node ret=bst.BinarySearch(40);
if(ret==null)
{
	System.out.println("Not Found");
}else {
	System.out.println("Found");
}

System.out.println(bst.height());


	}
}

