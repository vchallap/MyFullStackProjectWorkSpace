package in.coreJava.Exceptions;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Main method started...");

		try {
			
			System.out.println("Try started...");
			String s = null;
			
			s.length();
		System.out.println("Try ended...");
			
		} catch (Exception e) {
			
			System.out.println("Catch block...");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block ....");
		}
		System.out.println("Main method ended..");
	}


}
