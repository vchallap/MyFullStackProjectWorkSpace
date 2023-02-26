package in.coreJava.Methods;

public class Driver5 {

	public static void main(String[] args) {

		Driver5 d5 = new Driver5();

		Person personData = d5.getPersonData();// getting parameters from method by returning object from method

		System.out.println(personData.name + " " + personData.age + " " + personData.gender);

	}

	Person getPersonData() {

		Person p = new Person();
		p.age = 30;
		p.name = "Venkat";
		p.gender = 'M';

		return p;

	}

}
