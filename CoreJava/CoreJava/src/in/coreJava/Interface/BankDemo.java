package in.coreJava.Interface;

public class BankDemo {

	public static void main(String[] args) {

		RBI rb;
		
	


	}
	
	void m1(RBI rb)
	{
		rb = new HDFCBank();
		rb.checksEligibulity();
		rb.moneyTransfer();
		rb.checkBalance();
		
		rb = new AxisBank();
		rb.checksEligibulity();
		rb.moneyTransfer();
		rb.checkBalance();
	}
	
	public RBI m2(RBI ab, RBI hb)
	{
		return hb;
		
	}

}
