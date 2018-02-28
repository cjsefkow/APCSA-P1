/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Jack", "Diamonds", 11);
		Card card2 = new Card("Jack", "Diamonds", 11);
		Card card3 = new Card("3", "Spades", 3);
		System.out.println("Card 1: " + card1.toString());
		System.out.println("Card 2: " + card2.toString());
		System.out.println("Card 3: " + card3.toString());
		
		System.out.println("Card 1 == Card 2? " + card1.matches(card2));
		System.out.println("Card 1 == Card 3? " + card1.matches(card3));
		
	}
}
