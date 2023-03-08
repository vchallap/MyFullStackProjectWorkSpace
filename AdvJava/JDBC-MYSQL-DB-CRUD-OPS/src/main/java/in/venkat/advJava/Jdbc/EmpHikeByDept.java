package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpHikeByDept {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your HR department hike percentage...");
		double hrhike = sc.nextDouble();
		System.out.println("Enter your Sales department hike percentage...");
		double saleshike = sc.nextDouble();
		System.out.println("Enter your Admin department hike percentage..");
		double aadminhike = sc.nextDouble();
		System.out.println("Enter your security department hike percentage");
		double secuhike = sc.nextDouble();

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		String UPDATE_SAL_SQL = "update employee set emp_salary=emp_salary+(emp_salary * ?)/100 where emp_dept = ?";

		PreparedStatement pstmt = con.prepareStatement(UPDATE_SAL_SQL);

		pstmt.setDouble(1, hrhike);
		pstmt.setString(2, "HR");
		pstmt.executeQuery();

		pstmt.setDouble(1, saleshike);
		pstmt.setString(2, "Sales");
		pstmt.executeQuery();

		pstmt.setDouble(1, aadminhike);
		pstmt.setString(2, "Admin");
		pstmt.executeQuery();

		pstmt.setDouble(1, secuhike);
		pstmt.setString(2, "Security");
		pstmt.executeQuery();

		System.out.println("Update completed ....");
		con.close();
	}

}
