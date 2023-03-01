package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class PreparedStatement {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES (?,?,?)";// ??? ARE POSTIONAL PARAMETERS

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

		java.sql.PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
		pstmt.setInt(1, 105);
		pstmt.setString(2, "ORACLE");
		pstmt.setDouble(3, 3000.00);
		int executeUpdate = pstmt.executeUpdate();
		System.out.println("No of Rows executed is "+executeUpdate);
		con.close();
	}
}
