package creditcards;

public class MasterCard extends CreditCard{

	public MasterCard(String[] ccDetails) {
		super(ccDetails);
	}
	
	@Override
	public String toString() {
		return "MasterCard:\n=========== \nCardNumber: " + cardNumber + "\nHolderName: " + ccHolderName + "\nexpirationDate: "
				+ expirationDate;
	}

}
