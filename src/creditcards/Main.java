package creditcards;

public class Main {

    public static void main(String[] args) {
        String[][] creditCards = {{"51001234123412", "07/22", "John Doe", "x"}, {"601112341234123", "09/23", "Jane Doe", "x"}, {"4023129412341236", "09/23", "Lisa Shepard", "x"}, {"315612341286100", "09/23", "Mike Morisson", "x"}};
        CCFactory factory = new CCFactoryImpl();
        for (String[] creditCardDetails : creditCards) {
            System.out.println(factory.createCreditCard(creditCardDetails));
        }
    }

}
