package in.coreJava.isAhasARelation;

public class Car {

	void drive() {

		Engine e = new Engine();
		e.start();
		System.out.println("Journey started.......");

	}

	public static void main(String[] args) {

		Car c = new Car();
		c.drive();

	}

}
