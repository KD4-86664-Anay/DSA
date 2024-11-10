package Assignment;

import java.util.Arrays;

public class A2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp[]=new Employee[4];
		emp[0]=new Employee(1,"Raj",5000);
		emp[1]=new Employee(2,"Raj",4000);
		emp[2]=new Employee(3,"Raj",3000);
		emp[3]=new Employee(4,"Raj",2000);
		//emp[4]=new Employee(5,"Raj",1000);
		
		System.out.println(Arrays.toString(emp));
		
		for(int i=1;i<emp.length;i++)
		{
			for(int j=0;j<emp.length-1;j++)
			{
			if(emp[j+1].getSalary()<emp[j].getSalary())
			{
				Employee temp=emp[j];
				emp[j]=emp[j+1];
				emp[j+1]=temp;
			}
			}
		}
		
		System.out.println(Arrays.toString(emp));
		
		
	}

}
