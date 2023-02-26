package in.coreJava.AccessSpecifiers;

public class Student {
	private int id;
	private String name;
	public int age;
	

	public Student() {
		System.out.println("Student Constructor");
	}

	public void m1() {
		System.out.println("I'm in Student m1 method");
		m2();
	}

	private void m2()
	{
		System.out.println("I'm in Student m2 method");
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.m1();
		s.m2();
	}
}
