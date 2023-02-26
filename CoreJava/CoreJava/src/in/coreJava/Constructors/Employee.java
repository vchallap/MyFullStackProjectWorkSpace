package in.coreJava.Constructors;

public class Employee {
	// instance variables
	int empId;
	String empName;

	public Employee(int empId, String empName)// local variables
	{
		// storing local variables data into instance variables
		this.empId = empId;
		this.empName = empName;
		// this keyword is used to represent current class variables.

		System.out.println(this.empId + " " + this.empName);
	}

	public static void main(String[] args) {

		Employee emp = new Employee(101, "venkatesh");
		Employee emp1=new Employee(102,"challapalli");
	}

}
