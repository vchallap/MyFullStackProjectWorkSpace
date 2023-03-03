package in.coreJava.Interface;

public class AxisBank implements RBI {

	@Override
	public void checksEligibulity() {
		// TODO Auto-generated method stub
		System.out.println("Docs checking.......");
	}

	@Override
	public void moneyTransfer() {
		// TODO Auto-generated method stub
		System.out.println("MoneyTransfer checking...");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance checking.....");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.checksEligibulity();
		ab.moneyTransfer();
		ab.checkBalance();
	}

}
