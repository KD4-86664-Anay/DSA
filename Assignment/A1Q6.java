package Assignment;

public class A1Q6 {

	public static int findNonDuplicate(int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
					
				}	
			}
			if(flag==false)
			{
				return arr[i];	
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } ;
		
		System.out.println(findNonDuplicate(arr));
	}

}
