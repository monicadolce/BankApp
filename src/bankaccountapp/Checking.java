package bankaccountapp;

public class Checking extends Info {
//List properties specific to a Checking account
	
	private int debitCardNumber;
	private int debitCardPin;
	
	
//	Constructor to initialize Checking account properties
	public Checking(String name, String sSn, double initDeposit) {
		super(name, sSn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
//		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
//		System.out.println("NEW CHECKING ACCOUNT");
//		System.out.println("NAME: " + name);
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
//		System.out.println("Implement rate for Checking");
	}
	
//	List any methods specific to the Checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
//		System.out.println("CARD: " + this.debitCardNumber);
//		System.out.println("PIN: " + this.debitCardPin);
	}
	
	
	public void showInfo() {
		super.showInfo();
//		System.out.println("ACCOUNT TYPE: Checking");
		System.out.println(
				" Your Checking Account Features" +
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card Pin: " +  debitCardPin
				);
		
	}

}
