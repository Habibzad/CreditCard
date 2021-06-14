package creditcards;

public class VisaCard extends CreditCard{

	public VisaCard(String[] ccDetails) {
		super(ccDetails);
	}
	
	@Override
	public String toString() {
		return "Visa Card:\n=========== \nCardNumber: " + cardNumber + "\nHolderName: " + ccHolderName + "\nexpirationDate: "
				+ expirationDate;
	}

}
