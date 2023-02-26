package in.core.java.Encapsulation;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount BA = new BankAccount();
		BA.setAccNo(123456);
		BA.setAccName("Venkat");
		BA.setAccBalance(10000.00);
		long accNo = BA.getAccNo();
		String accName = BA.getAccName();
		double accBalance = BA.getAccBalance();

		System.out.println(accNo + " " + accName + " " + accBalance);

	}

}
