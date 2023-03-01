package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RetriveDataFromKeyboard {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES (?,?,?)";// ??? ARE POSTIONAL PARAMETERS

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your BookId");
		int id = sc.nextInt();
		System.out.println("Enter your BookName");
		String name = sc.next();
		System.out.println("Enter your BookPrice");
		double price = sc.nextDouble();

		// Class.forName("com.mysql.cj.jdbc.Driver"); Optional this, as we already
		// loaded the jar file to build path

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		

		PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setDouble(3, price);

		int rowsEffected = pstmt.executeUpdate();
		System.out.println("Number of rows effected :: " + rowsEffected);
		con.close();

	}

}
