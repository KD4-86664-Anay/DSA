package Assignment;

public class A3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,22,33,44,55};
		ReverseStack rs=new ReverseStack(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			rs.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=rs.pop();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
