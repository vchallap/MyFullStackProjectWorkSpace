package in.coreJava.Constructors;

public class Student {

	public Student() {// default constructor

		System.out.println("Hello");
	}

	public Student(int i) {// Parameterized constructor with one parameter
		System.out.println(i);
	}

	public Student(String s1, String s2) {// parameterized constructor with two parameters.
		System.out.println(s1 + " " + s2);
	}

	public static void main(String[] args) {

		Student s = new Student();
		Student s1 = new Student(10);
		Student s2 = new Student("Hello", "Venkat");
		Student s3=new Student("Hello","Raju");

	}

}
