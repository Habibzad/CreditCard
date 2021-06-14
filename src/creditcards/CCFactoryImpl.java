package creditcards;

/**
 * 
 * @author Ahmad
 *
 */

public class CCFactoryImpl implements CCFactory{

	@Override
	public CreditCard createCreditCard(String[] ccDetails) {
		/*
	     * MasterCard Check: First digit is a 5 or 2, Only valid length of number is 16 digits.
	     * Visa Check: First digit is a 4. Length is either 13 or 16 digits.
	     * AmericanExpress Check: First digit is a 3 and second digit a 4 or 7. The length is 15 digits.
	     * Discover Check: First four digits are 6011. The length is 16 digits.
	     * 
	     */
		
		String cardNumber = ccDetails[0];
		if(cardNumber.equals("")) return null;
		if(cardNumber.length() <= 16) {
            if(cardNumber.length() == 15 && cardNumber.startsWith("3")) { return new AmericanExpress(ccDetails); }
            if(cardNumber.startsWith("6")) { return new Discover(ccDetails); }
            if((cardNumber.length() == 13 || cardNumber.length() == 16) && cardNumber.startsWith("4")) { return new VisaCard(ccDetails); }
            if(cardNumber.length() == 16 && (cardNumber.startsWith("5") || cardNumber.startsWith("2"))) { return new MasterCard(ccDetails); }
        }
        return new InvalidData(ccDetails);
	}

}
