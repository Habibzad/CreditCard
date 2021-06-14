package creditcards;

public abstract class CreditCard {
	protected String cardNumber;
	protected String ccHolderName;
	protected String expirationDate;

    public CreditCard(String[] ccDetails) {
        this.cardNumber = ccDetails[0];
        this.expirationDate = ccDetails[1];
        this.ccHolderName = ccDetails[2];
    }

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCcHolderName() {
		return ccHolderName;
	}

	public void setCcHolderName(String ccHolderName) {
		this.ccHolderName = ccHolderName;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

}
