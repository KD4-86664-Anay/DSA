package Assignment;

public class A1Q5 {
	public static int linearSearch(int arr[],int key,int occ ) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key&&i==occ)
			{
				return i;	
			}
		}
		return -1;
	}
public static void main(String [] args)
{
	int arr[]= {55,11,22,55,44,55,66,44};
	
	System.out.println(linearSearch(arr,55,6));
}
}
