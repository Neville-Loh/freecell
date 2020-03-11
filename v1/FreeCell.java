package freecell.v1;


public class FreeCell {
	
	
	private static void shuffleDeck(int[] cards) {
		for (int i = 0; i < 100; i++) {
			int pos = (int)(Math.random() * cards.length);
			// Swap card at random position with first card
			int tmp = cards[pos];
			cards[pos] = cards[0];
			cards[0] = tmp;
		}
	}
	
	private static int[] createDeck() {
		// Create sorted card deck
		int[] cards = new int[52];
		
		// Arrays are indexed from 0 to length-1,
		for (int i = 0; i < cards.length; i++) {
			int card = i + 1;
			cards[i] = card;
		}
		return cards;
	}

	public static void main(String[] args) {
		System.out.println("hello world");
		
		
		Deck.initialise();
		Deck.shuffleDeck();
		int[] d = createDeck();
		ASCIIBoard.initialise();
		ASCIIBoard.placeCardsOnBoard();
		ASCIIBoard.displayBoard();
		
		// 2D array 
//		int [][] board = new int[52][8];
//		
//		placeCardsOnBoard(board, cards);
//		displayBoard(board,cards,cards);
		
		
		
	}

}
