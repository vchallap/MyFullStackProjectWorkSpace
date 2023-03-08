package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchLocationByInClause {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	private static final String SELECT_SQL = "SELECT * FROM EMPLOYEE where EMP_WORKLOCATION IN ('Hyd' , 'Delhi') ";

	public static void main(String[] args) throws Exception {

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SELECT_SQL);

		while (rs.next()) {
			System.out.println(rs.getInt(1) + ", " + rs.getString(2) + " ," + rs.getDouble(3) + " ," + rs.getString(4)
					+ " ," + rs.getString(5) + " ," + rs.getString(6));
		}

		con.close();

	}

}
