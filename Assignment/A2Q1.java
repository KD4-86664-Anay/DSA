package Assignment;

import java.util.Arrays;

public class A2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,66,22,44,55,33};
		System.out.println(Arrays.toString(arr));
		insertionSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr, int length) {
		// TODO Auto-generated method stub
		int N=arr.length;
		
		for(int i=1;i<N;i++)
		{
			int temp=arr[i];
			int j;
			for(j=i-1;j>=0&&arr[j]<temp;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}

}
