package in.coreJava.Methods;

public class Driver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver3 d3 = new Driver3();
		Product p = new Product();
		p.productId = 111;
		p.productName = "Laptop";
		p.productPrice = 45000.00;
		d3.printProductData(p);
	}

	void printProductData(Product p) {
		System.out.println(p.productId + "," + p.productName + "," + p.productPrice);
	}

}
