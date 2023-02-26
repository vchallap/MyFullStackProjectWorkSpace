package in.core.java.Inheritence;

public class Test {

	public static void main(String[] args) {

		Child c = new Child();
		c.m1();
		c.m2();
		int hashCode = c.hashCode();
		System.out.println(hashCode);
	}

}
