package in.coreJava.Interface;

public class HDFCBank implements RBI,WorldBank {

	@Override
	public void checksEligibulity() {
		System.out.println("Checking Eligibulity....");
	}

	@Override
	public void moneyTransfer() {
		System.out.println("Money Tranfering....");
	}

	@Override
	public void checkBalance() {
		System.out.println("Checking Balance...");
	}

	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.checksEligibulity();
		hb.moneyTransfer();
		hb.checkBalance();
		hb.forigenExchange();
	}

	@Override
	public void forigenExchange() {
		System.out.println("forigenExchange rates applied.......");
	}
}
