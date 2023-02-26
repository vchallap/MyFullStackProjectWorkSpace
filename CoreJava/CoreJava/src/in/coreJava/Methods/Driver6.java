package in.coreJava.Methods;

public class Driver6 {

	public static void main(String[] args) {

		Driver6 d6 = new Driver6();
		College collegeData = d6.getCollegeData();
		System.out.println(collegeData.collegeId + " " + collegeData.collegeName + " " + collegeData.collegeAdd);
	}

	College getCollegeData() {
		College c = new College();
		c.collegeId = 999;
		c.collegeName = "RKCE";
		c.collegeAdd = "Vijayawada,KCL";
		return c;
	}
}
