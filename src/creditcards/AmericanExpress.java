package creditcards;

public class AmericanExpress extends CreditCard{

	public AmericanExpress(String[] ccDetails) {
		super(ccDetails);
	}
	
	@Override
	public String toString() {
		return "AmericanExpress:\n=========== \nCardNumber: " + cardNumber + "\nHolderName: " + ccHolderName + "\nexpirationDate: "
				+ expirationDate;
	}

}
