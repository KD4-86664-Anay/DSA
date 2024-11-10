package Assignment;

public class NoOfCompBinary {
public static int binarySearch(int arr[],int key)
{
	int low=0,high=arr.length-1,mid;
	int NoOfComp=0;
	while(low<=high)
	{
		NoOfComp++;
		mid=(low+high)/2;
		if(arr[mid]==key)
		{
			return NoOfComp;
		}
		else if(arr[mid]>key)
		{
			high=mid-1;
		}
		else {
			low=mid+1;
		}
	}
	return -1;
}
	public static void main(String[] args) {
	int arr[]= {11,22,33,44,55,66};
	
	System.out.println(binarySearch(arr,44));
}
}
