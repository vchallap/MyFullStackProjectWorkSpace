package in.coreJava.SuperKeyword;

public class Child extends Parent {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
	
	}

	@Override
	public void m1() {
		super.m1();
		System.out.println("Child method called....");
	}
}
