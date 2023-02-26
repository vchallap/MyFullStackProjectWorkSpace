package in.coreJava.Methods;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1=new Car();
		c1.price=101;
		c1.name="Honda";
		System.out.println(c1.price);
		System.out.println(c1.name);
		System.out.println(c1.price+" "+c1.name);
	}

}

class Car
{
	
	int price;
	String name;
	
}
