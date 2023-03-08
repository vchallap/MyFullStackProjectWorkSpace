package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class CallableStatementByID {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	private static final String PROCEDURE = "call getBooksByID(?)";

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your BookId...");
		int bookId = sc.nextInt();
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		java.sql.CallableStatement cstmt = con.prepareCall(PROCEDURE);
		cstmt.setInt(1, bookId);
		ResultSet rs = cstmt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getDouble(3));
		}

		con.close();

	}

}
