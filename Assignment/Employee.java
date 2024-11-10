package Assignment;

import java.util.Objects;

public class Employee {
private int id;
private String name;
private int salary;

public Employee(int id,String name,int salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}

@Override
public int hashCode() {
	return Objects.hash(salary);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return salary == other.salary;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
