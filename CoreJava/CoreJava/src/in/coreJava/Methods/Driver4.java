package in.coreJava.Methods;

public class Driver4 {

	void printDoctorData(Doctor dc) {
		System.out.println(dc.doctorName + "," + dc.doctorAge + "," + dc.doctorSpecialization);
	}

	public static void main(String[] args) {

		Driver4 d4 = new Driver4();
		Doctor dc = new Doctor();
		dc.doctorName = "Venkatesh";
		dc.doctorAge = 30;
		dc.doctorSpecialization = "Physician";

		d4.printDoctorData(dc);//passing parameters to method by object as a parameter

	}

}
