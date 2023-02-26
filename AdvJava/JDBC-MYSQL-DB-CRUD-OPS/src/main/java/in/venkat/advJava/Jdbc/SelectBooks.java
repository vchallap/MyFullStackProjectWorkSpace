package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectBooks {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	private static final String SELECT_SQL = "SELECT * FROM BOOKS";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		/*
		//Forward directional resultset
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SELECT_SQL);
*/
		/*//only get one record
		 * if (rs.next()) { int bookId = rs.getInt("Book_id"); String bookName =
		 * rs.getString("Book_name"); double bookPrice = rs.getDouble("Book_price");
		 * System.out.println(bookId); System.out.println(bookName);
		 * System.out.println(bookPrice);
		 * 
		 * } else { System.out.println("No records found"); }
		 */
		
			
		//Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery(SELECT_SQL);
		
		/*
		while (rs.next()) {//will get all records
			//System.out.println(rs.getInt("Book_id") + "--" + rs.getString("Book_name") + "--" + rs.getDouble("Book_price"));
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getDouble(3));

		}
*/
			
			rs.absolute(2);
			//rs.updateDouble(3, 7000.00);
			rs.updateString(2, "AWS");
			rs.updateRow();
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getDouble(3));
			
			rs.previous();
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getDouble(3));
			
		con.close();

	}

}
