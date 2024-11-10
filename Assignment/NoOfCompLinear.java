package Assignment;

public class NoOfCompLinear {
public static int binarysearch(int arr[],int key) {
	int NoOfComp=0;
	for(int i=0;i<arr.length;i++)
	{
		NoOfComp++;
		if(arr[i]==key)
		{
		return NoOfComp;	
		}
	}
	
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,55,44,22,33,100};
		
		System.out.println(binarysearch(arr,22));
	}

}
