package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetriveDataTask1 {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your book price details");
		double price = sc.nextDouble();

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

		StringBuilder sql = new StringBuilder("select * from books");

		if (price > 0) {
			sql.append(" WHERE BOOK_PRICE <= ?");
		}

		PreparedStatement pstmt = con.prepareStatement(sql.toString());

		if (price > 0) {
			pstmt.setDouble(1, price);
		}

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
		}

		con.close();

	}

}
