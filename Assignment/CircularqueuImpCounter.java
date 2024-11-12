package Assignment;

public class CircularqueuImpCounter {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	private int counter;
	public CircularqueuImpCounter(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}
	
	public void push(int value) {
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
		counter++;
	}
	
	public int pop() {
		int temp = arr[(front + 1) % SIZE];
		front = (front + 1) % SIZE;
		counter--;
		if(front == rear)
			front = rear = -1;
		return temp;
	}
	
	public int peek() {
		
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isEmpty() {
		return counter==0;
	}
	
	public boolean isFull() {
		return counter==SIZE-1;
	}
}
