package in.coreJava.Methods;

public class Student {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Hello");

		Student s = new Student();
		s.message();

		Student.wish();

	}

	void message() {// instance method and it will be called by using object//method no return type
		System.out.println("Good morning");

	}

	static void wish()// static method and it will be called by using class

	{
		System.out.println("Good Eve..");

	}
	
	boolean m2(int a, int b)//method return type
	{
		return false;
		
	}

}
