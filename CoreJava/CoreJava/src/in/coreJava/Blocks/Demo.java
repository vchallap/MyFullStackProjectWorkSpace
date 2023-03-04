package in.coreJava.Blocks;

public class Demo {

	int i = 10;
static int j=10;
	public Demo() {// constructor...

		System.out.println("I'm from Demo constructor....");
	}

	// Instance block//instance block will execute first before constructor
	{
		System.out.println("I'm from Instance block....");
		m2();
		m1();
	}

	static// static block//Stactic block will execute first before main
	{
		Demo d = new Demo();
		System.out.println(d.i);
		System.out.println("I'm from static block.....");
		m1();
		d.m2();
		System.out.println(j);
	}

	public static void main(String[] args) {
		System.out.println("I'm from main method..");

		Demo d = new Demo();
	}

	public static void m1() {

	}

	public void m2() {

	}

}
