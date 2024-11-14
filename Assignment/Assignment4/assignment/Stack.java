package com.assignment;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpUsingLL st=new StackImpUsingLL();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.display());
		st.pop();
		System.out.println(st.display());

	}

}
