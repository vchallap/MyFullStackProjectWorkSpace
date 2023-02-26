package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBook {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	//private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES (102,'AWS',10000)";
	//private static final String INSERT_SQL = "UPDATE BOOKS SET BOOK_NAME='AZURE' WHERE BOOK_ID=102";
	//private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES (103,'PYTHON',2000)";
	private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES (102,'PYTHON',2000)";
	public static void main(String[] args) throws Exception {

		// step 1:load the Driver

		Class.forName("com.mysql.jdbc.Driver");

		// Step 2: Get DB connection

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		System.out.println(con);

		// step 3: create statement

		Statement stmt = con.createStatement();

		// step 4: Execute querys

		int rowsEffected = stmt.executeUpdate(INSERT_SQL);

		// step 5: process the result

		System.out.println("Records inserted count : " + rowsEffected);

		// step 6: close the connection

		con.close();

	}

}
