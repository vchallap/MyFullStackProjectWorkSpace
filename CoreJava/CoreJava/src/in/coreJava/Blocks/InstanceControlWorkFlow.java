package in.coreJava.Blocks;

public class InstanceControlWorkFlow {

	public InstanceControlWorkFlow() {

		System.out.println("this is instance contructor...");
	}

	// Instance data (variables,blocks and methods) are loaded to JVM as soon as
	// Object is created
	// JVM allocated memory as per the following flow---variables,methods and blocks
	// But execution flow will starts from blocks,constructor,methods and variables
	int i = 10;// instance variables

	{
		System.out.println("this is instace block method....");
	}

	public void m1() {// instance method
		System.out.println("this is instance method....");
	}

	public static void main(String[] args) {
		InstanceControlWorkFlow icw = new InstanceControlWorkFlow();
		icw.m1();
	}

}
