package in.venkat.advJava.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementByINandOUT {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	private static final String PROCEDURE = "call getBooknameByPrice(?, ?)";

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your PRICE:: ");
		double bprice = sc.nextDouble();

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		java.sql.CallableStatement cstmt = con.prepareCall(PROCEDURE);

		cstmt.setDouble(1, bprice);
		cstmt.registerOutParameter(2, Types.VARCHAR);

		ResultSet rs = cstmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString(1));
		}

		con.close();

	}

}
