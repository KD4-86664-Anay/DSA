package Assignment;

public class A1Q7 {

	public static int less(int arr[],int key)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=key)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= { 10, 20, 15, 3, 4, 4, 1 };
		
		System.out.println(less(arr,4));
	}

}
