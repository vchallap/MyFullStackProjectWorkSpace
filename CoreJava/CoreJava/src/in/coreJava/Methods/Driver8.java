package in.coreJava.Methods;

import java.util.Scanner;

public class Driver8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number");
		int id = sc.nextInt();

		Driver8 d8 = new Driver8();
		Player getplayerData = d8.getplayerData(id);
		System.out.println(getplayerData.id + " " + getplayerData.name + " " + getplayerData.age);

	}

	Player getplayerData(int id) {

		Player p = new Player();

		switch (id) {

		case 7:
			p.id = 7;
			p.name = "Dhoni";
			p.age = 40;
			break;

		case 18:
			p.id = 18;
			p.name = "Kohli";
			p.age = 32;
			break;
		case 45:
			p.id = 45;
			p.name = "Rohit";
			p.age = 39;
			break;

		}
		return p;

	}

}
