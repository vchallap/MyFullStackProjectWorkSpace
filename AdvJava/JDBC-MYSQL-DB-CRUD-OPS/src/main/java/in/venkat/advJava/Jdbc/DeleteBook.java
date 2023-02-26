package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteBook {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	private static final String DELETE_SQL = "DELETE FROM BOOKS WHERE BOOK_ID=102";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		Statement statement = con.createStatement();
		int rowsEffected = statement.executeUpdate(DELETE_SQL);
		System.out.println("Rows Effected: "+rowsEffected);
		con.close();

	}

}
