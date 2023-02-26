package in.coreJava.Methods;

public class Calculator {

	void add(int i, int j) {
		System.out.println("Sum : " + (i + j));
	}

	void add(int i, int j, int k) {// method overloading...
		System.out.println("Sum : " + (i + j + k));
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10, 20);
		c.add(10, 20, 30);
	}

}
