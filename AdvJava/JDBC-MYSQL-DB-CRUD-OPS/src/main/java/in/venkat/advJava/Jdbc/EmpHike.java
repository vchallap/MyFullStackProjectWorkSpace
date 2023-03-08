package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmpHike {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	
	

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your hike percentage...");
		double hike = sc.nextDouble();
		

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		String UPDATE_SAL_SQL="update employee set emp_salary=emp_salary+(emp_salary * ?)/100";
	
		PreparedStatement pstmt = con.prepareStatement(UPDATE_SAL_SQL);
		pstmt.setDouble(1, hike);
		pstmt.executeUpdate();

		System.out.println("Update completed....");
		con.close();
		}
	

	}


