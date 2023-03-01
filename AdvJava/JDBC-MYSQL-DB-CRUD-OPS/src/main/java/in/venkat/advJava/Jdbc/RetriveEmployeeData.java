package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetriveEmployeeData {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee work location");
		String wl = sc.next();
		System.out.println("Enter employee department");
		String dept = sc.next();
		System.out.println("Enter employee gender");
		String gen = sc.next();

		StringBuilder sql = new StringBuilder("select * from employee where 1=1");

		if (wl != null && !wl.equals("null")) {
			sql.append(" AND EMP_WORKLOCATION = ? ");
		}
		if (dept != null && !dept.equals("null")) {

			sql.append(" AND EMP_DEPT = ? ");
		}
		if (gen != null && !gen.equals("null")) {
			sql.append(" AND EMP_GENDER = ?");
		}

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

		PreparedStatement pstmt = con.prepareStatement(sql.toString());

		int index = 1;

		if (wl != null && !wl.equals("null")) {
			pstmt.setString(index, wl);
			index++;
		}
		if (dept != null && !dept.equals("null")) {

			pstmt.setString(index, dept);
			index++;
		}
		
		if (gen != null && !gen.equals("null")) {
			pstmt.setString(index, gen);
		}
		else {
			System.out.println("No records found");
		}
		
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getDouble(3) + "--" + rs.getString(4)
					+ "--" + rs.getString(5) + "--" + rs.getString(6));
		}

		con.close();

	}

}
