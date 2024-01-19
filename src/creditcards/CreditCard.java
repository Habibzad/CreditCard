package creditcards;

import java.util.Random;
import java.util.UUID;

public abstract class CreditCard {
	private String cardNumber;
	private String ccHolderName;
	private String expirationDate;
	private int csv;


    public CreditCard(String[] ccDetails) {
        this.cardNumber = ccDetails[0];
        this.expirationDate = ccDetails[1];
        this.ccHolderName = ccDetails[2];
		this.csv = generateCsv();
    }

	public int getCsv() {
		return csv;
	}

	private int generateCsv() {
		Random random = new Random();
        return random.nextInt(900) + 100;
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
