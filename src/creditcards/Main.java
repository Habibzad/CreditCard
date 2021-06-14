package creditcards;

public class Main {

	public static void main(String[] args) {
		
		String[] text1 = {"51001234123412", "07/22", "John Doe", "x"};
        String[] text2 = {"601112341234123", "09/23", "Jane Doe", "x"};
        String[] text3 = {"4023129412341236", "09/23", "Lisa Shepard", "x"};
        String[] text4 = {"315612341286100", "09/23", "Mike Morisson", "x"};
        
        CCFactory factory = new CCFactoryImpl();

        CreditCard card1 = factory.createCreditCard(text1);
        CreditCard card2 = factory.createCreditCard(text2);
        CreditCard card3 = factory.createCreditCard(text3);
        CreditCard card4 = factory.createCreditCard(text4);
        
        System.out.println(card1);
        System.out.println("\n====================");
        System.out.println(card2);
        System.out.println("\n====================");
        System.out.println(card3);
        System.out.println("\n====================");
        System.out.println(card4);
	}

}
