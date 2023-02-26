package in.coreJava.Methods;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver2 d2 = new Driver2();
		Employee emp = new Employee();
		emp.empId = 1001;
		emp.empSalaray = 2000.00;
		emp.empName = "Venkatesh Challapalli";
		emp.empAge = 30;

		d2.printEmployeeData(emp);
	}

	void printEmployeeData(Employee emp) {
		System.out.println(emp.empId + "," + emp.empSalaray + "," + emp.empName + "," + emp.empAge);

	}

}
