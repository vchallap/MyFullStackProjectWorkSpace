package in.coreJava.Methods;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver1 d = new Driver1();

		Student1 s1 = new Student1();
		s1.id = 101;
		s1.name = "Venkatesh";
		d.printStudentData(s1);

	}

	void printStudentData(Student1 s1) {
		// TODO Auto-generated method stub
		System.out.println(s1.id + "," + s1.name);
	}

}

class Student1 {
	int id;
	String name;

}
