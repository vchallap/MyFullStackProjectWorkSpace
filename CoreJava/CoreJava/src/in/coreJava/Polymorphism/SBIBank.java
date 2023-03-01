package in.coreJava.Polymorphism;

public class SBIBank extends RBI {

	public static void main(String[] args) {

		SBIBank sb = new SBIBank();
		String applyHomeLoan = sb.applyHomeLoan();
		String applyPersonalLoan = sb.applyPersonalLoan();
		System.out.println(applyHomeLoan);
		System.out.println(applyPersonalLoan);
	}

	@Override
	double homeLoanROI() {
		return 12.85;
	}

	@Override
	double personalLoanROI() {
		return 13.00;
	}

	public String applyHomeLoan() {

		boolean status = checkEligibility();
		if (status) {
			double homeLoanROI = homeLoanROI();
			String msg = "Your Home loan is approved with ROI as :: " + homeLoanROI;
			return msg;
		} else {
			return "You are not eligible for Home Loan";
		}

	}

	public String applyPersonalLoan() {

		boolean status = checkEligibility();
		if (status) {
			double personalLoanROI = personalLoanROI();
			String msg = "Your Personal loan is approved with ROI as :: " + personalLoanROI;
			return msg;
		} else {
			return "You are not eligible for personal Loan";
		}

	}

}
