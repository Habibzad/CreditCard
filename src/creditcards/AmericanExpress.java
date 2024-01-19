package creditcards;

public class AmericanExpress extends CreditCard{

	public AmericanExpress(String[] ccDetails) {
		super(ccDetails);
	}
	
	@Override
	public String toString() {
		return "AmericanExpress:\n=========== \nCardNumber: " + getCardNumber() + "\nHolderName: " + getCcHolderName() + "\nexpirationDate: "
				+ getExpirationDate()+"\ncsv: "+ getCsv();
	}

}
