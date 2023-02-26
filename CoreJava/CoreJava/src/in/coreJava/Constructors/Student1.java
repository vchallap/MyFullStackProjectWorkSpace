package in.coreJava.Constructors;

public class Student1 {

	int studentId;
	String studentName;
	int studentAge;
	String studentGender;

	public Student1(int studentId, String studentName, int studentAge, String studentGender) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentGender = studentGender;

		System.out.println(this.studentId + " " + this.studentName + " " + this.studentAge + " " + this.studentGender);

	}

	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "Venkatesh", 30, "Male");
		Student1 s2 = new Student1(102, "Rabi", 27, "Female");
	}

}
