package in.venkat.advJava.Jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertImageIntoDB {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/venkat_advjavadb";
	private static final String DB_UNAME = "vchallap";
	private static final String DB_PWD = "vchallap";
	private static final String INSERT_SQL = "INSERT INTO PERSON VALUES (?,?)";// ??? ARE POSTIONAL PARAMETERS

	public static void main(String[] args) throws Exception {

		File fr=new File("D:\\Challapalli\\Chiken.jpg");
		
		FileInputStream fis=new FileInputStream(fr);
		
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

		java.sql.PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
		pstmt.setInt(1, 101);
		pstmt.setBinaryStream(2, fis);
		int executeUpdate = pstmt.executeUpdate();
		System.out.println("No of Rows executed is "+executeUpdate);
		con.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	

