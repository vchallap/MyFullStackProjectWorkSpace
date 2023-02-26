package in.coreJava.Methods;

import java.util.Arrays;

public class Person1 {

	int personId;
	String personName;
	int personAge;

	public static void main(String[] args) {
		Person1 p = new Person1();
		Person1 p1 = new Person1();
		p1.personId = 101;
		p1.personName = "Raju";
		p1.personAge = 30;

		Person1 p2 = new Person1();
		p2.personId = 102;
		p2.personName = "Rani";
		p2.personAge = 22;

		p.m1(p1, p2);

		Person1[] m2 = p.m2();

		for (Person1 person : m2) {
			System.out.println(person.personId + " " + person.personName + " " + person.personAge);
		}

	}

	void m1(Person1 p1, Person1 p2)

	{
		System.out.println(p1.personId + " " + p1.personName + " " + p1.personAge);
		System.out.println(p2.personId + " " + p2.personName + " " + p2.personAge);
	}

	Person1[] m2() {
		Person1 p1 = new Person1();
		p1.personId = 101;
		p1.personName = "Raju";
		p1.personAge = 30;

		Person1 p2 = new Person1();
		p2.personId = 102;
		p2.personName = "Rani";
		p2.personAge = 22;

		Person1 p3 = new Person1();
		p3.personId = 103;
		p3.personName = "Venkat";
		p3.personAge = 21;

		Person1[] arr = { p1, p2, p3 };
		return arr;

	}

}
