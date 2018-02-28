/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks  = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits  = {"Spades", "Hearts", "Diamonds", "Clubs"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck test = new Deck(ranks, suits, values);
		
		System.out.println("Deck is empty: ");
		System.out.println(test.isEmpty());
		System.out.println();
		
		System.out.println("Size: ");
		System.out.println(test.size());
		System.out.println();
		
		System.out.println("Top card dealt: ");
		System.out.println(test.deal().toString());
		System.out.println();
		
		System.out.println(test.toString());
		
		test.shuffle();
		System.out.println("Shuffling...");
		System.out.println();
		
		System.out.println(test.toString());
		
	}
}

/** Lab Assessment tomorrow
 * In eclipse
 * Read prompt
 * 40 mins
 * Number manipulation - 2 parts
**/
