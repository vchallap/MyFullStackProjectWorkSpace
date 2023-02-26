package in.venkat.spring;

public class Car {

	private DieselEngine dieselEng;

	public void setDieselEng(DieselEngine dieselEng) {
		this.dieselEng = dieselEng;
	}

	public Car() {

		System.out.println("Car constructor..");
	}

	public void drive() {

		int start = dieselEng.start();
		if (start >= 1) {
			System.out.println("Journey started....");
		} else {
			System.out.println("Engine failed to start.....");
		}
	}

}
