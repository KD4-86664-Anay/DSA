package Assignment;

public class bsSortedInDesc {

	public static int binarySearch(int arr[],int key) {
		int low=0,high=arr.length-1,mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]>key)
			{
			low=mid+1;	
			}else {
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {66,55,44,33,22,11};
		
		System.out.println(binarySearch(arr,22));
		
	}

}
