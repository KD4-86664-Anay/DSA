package Assignment;

public class ReverseStack {
private int arr[];
private int top;
private int SIZE;
public ReverseStack(int value) {
	SIZE=value;
	arr=new int[SIZE];
	top=-1;
}
public void push(int value) {
	arr[++top]=value;
}
public int pop() {
	int temp=arr[top];
	top--;
	return temp;
}
public boolean isEmpty() {
	return top==-1;
}

public boolean isFull() {
	return top==SIZE-1;
}

}
