package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertStudent {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UN = "vchallap";
	private static final String DB_PW = "vchallap";
	//private static final String INSERT_SQL = "insert into student values(101,'venkat',5000)";
	private static final String INSERT_SQL = "insert into student values(102,'veneela',7000)";
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(DB_URL, DB_UN, DB_PW);

		Statement stmt = con.createStatement();
		int rowsEffected = stmt.executeUpdate(INSERT_SQL);
		System.out.println("Records Insterted: " + rowsEffected);
		con.close();

	}

}
