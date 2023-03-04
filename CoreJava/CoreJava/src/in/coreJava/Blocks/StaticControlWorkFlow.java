package in.coreJava.Blocks;

public class StaticControlWorkFlow {
	// static data (variables,blocks and methods) are loaded to JVM as soon as class
	// is loaded
	// JVM allocated memory as per the following flow---variables,methods and blocks
	// But execution flow will starts from blocks,methods and variables
	static int i = 10;// static variable

	static {
		System.out.println("This is static block...");
	}

	public static void main(String[] args) {
		System.out.println("This is static main method...");
		m1();
	}

	public static void m1() {
		System.out.println("This is static method...");
	}
}
