package Assignment;

public class indexOfLastOccurance {

	public static int linearSearch(int arr[],int key) {
		int lastOccur=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				lastOccur=i;
			}
			
		}
		if(lastOccur>0)
		{
			return lastOccur;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {55,11,22,55,44,55,66,44};
		
		System.out.println(linearSearch(arr,55));
	}

}
