package in.coreJava.Polymorphism;

//Method overidding -run time polymorphism
public class Child extends Parent {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
	}

	void m1() {

		System.out.println("Child M1 method is called");
	}

}
