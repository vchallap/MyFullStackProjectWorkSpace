package in.core.java.Inheritence;

public class Child extends Parent {

	void m2() {
		System.out.println("Child class method m2 is called");
		
	}

	void m1() {
		System.out.println("Child class method m1 is called");
		super.m1();
	}

	public int hashCode() {
		return 101;
	}

}
