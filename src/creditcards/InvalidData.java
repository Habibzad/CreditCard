package creditcards;

public class InvalidData extends CreditCard{

	public InvalidData(String[] ccDetails) {
		super(ccDetails);
	}

	@Override
	public String toString() {
		return "InvalidData";
	}

}
