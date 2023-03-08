package in.coreJava.ToStringMethod;

public class Student {

	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {

		Student s = new Student(101,"VENKAT");
		Student s1=new Student(101,"VENKAT");
		/*
		s.id = 101;
		s.name = "Venkatesh Challapalli";
		// System.out.println(s.toString());
		System.out.println(s);
		System.out.println(s.hashCode());
*/
		
		System.out.println(s.equals(s1));
		
	}

	@Override
	public String toString() {
		return id + " " + name;
	}
	
	@Override
	public int hashCode() {
		return 123456;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

}
