package in.coreJava.Methods;

import java.util.Scanner;

public class Driver7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your id");
		int id = sc.nextInt();
		Driver7 d7 = new Driver7();

		DoublePersons personData = d7.getPersonData(id);
		System.out.println(personData.personId + " " + personData.personName + " " + personData.personAge);

	}

	DoublePersons getPersonData(int id) {
		/*// this created wastage of objectscreation
		 * 
		 * DoublePersons dp1 = new DoublePersons(); dp1.personId = 101; dp1.personName =
		 * "Raju"; dp1.personAge = 30; DoublePersons dp2 = new DoublePersons();
		 * dp2.personId = 102; dp2.personName = "Rani"; dp2.personAge = 32;
		 * 
		 * if (id == 101) { return dp1; } else if(id==102){ return dp2; } return null;
		 * 
		 */

		DoublePersons dp = new DoublePersons();

		if (id == 101) {
			dp.personId = 101;
			dp.personName = "Raju";
			dp.personAge = 30;
		} else if (id == 102) {
			dp.personId = 102;
			dp.personName = "Rani";
			dp.personAge = 32;
		}
		return dp;
	}

}
