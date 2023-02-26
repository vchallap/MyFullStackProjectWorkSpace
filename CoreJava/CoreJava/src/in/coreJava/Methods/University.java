package in.coreJava.Methods;

import java.util.Scanner;

public class University {
	int universityId;
	String universityName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id");
		int universityId = sc.nextInt();

		University u = getUniversityData(universityId);

		System.out.println(u.universityId + "," + u.universityName);

		String s = u.message();
		System.out.println(s);

	}

	String message() {
		String str = "Welcome";
		return str;
	}

	static University getUniversityData(int universityId) {

		University u = new University();
		if (universityId == 101) {
			u.universityId = 101;
			u.universityName = "Oxford";
		} else if (universityId == 102) {
			u.universityId = 102;
			u.universityName = "Standford";
		}

		return u;

	}

}
