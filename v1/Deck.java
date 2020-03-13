package freecell.v1;

public class Deck {
	private static Card[] _deck;
	
	public static void initialise() {
		
		// Create sorted card deck
		 _deck = new Card[52];
		
		// Arrays are indexed from 0 to length-1,
		for (int i = 0; i < _deck.length; i++) {
			Card card = new Card(i + 1);
			_deck[i] = card;
		}
		
		System.out.println("Deck created.");
	}
	
	
	public static void shuffleDeck() {
		for (int i = 0; i < 100; i++) {
			int pos = (int)(Math.random() * _deck.length);
			// Swap card at random position with first card
			Card tmp = _deck[pos];
			_deck[pos] = _deck[0];
			_deck[0] = tmp;
		}
	}
	
	public static Card[] getCardArray() {
		return _deck;
	}
}
