package freecell.v1;

public class ASCIIBoard {
	
	private static Card[][] _board;
	private static int[] _foundations; // Stores the top cards
	private static int[] _cells;
	
	public static void initialise() {
		_board = new Card[52][8];
		_foundations = new int[4];
		_cells = new int[4];
	}
	
	public static void placeCardsOnBoard() {
		Card[] cards = Deck.getCardArray();
		//Place card on board
		int row = 0;
		int cascade = 0;
		
		for(int card = 0; card < cards.length; card++) {
			if (cascade == _board[row].length) {
				cascade = 0;
				row++;
			}
			_board[row][cascade] = cards[card];
			cascade++;
		}
	}
	
	
	public static void displayBoard() {
		
		// Printing 
		int row = 0;
		int cascade = 0;
		System.out.println("+===================+");
		System.out.println("| X X X X | S C D H |");
		System.out.println("+---------+---------+");
		System.out.print("|");
		while (_board[row][cascade] != null) {
			Card card = _board[row][cascade];
			System.out.print(" " + card.getASCIIDisplay());
			cascade++;
			if (cascade == 8) {
				cascade = 0;
				row ++;
				System.out.print("|\n|");
			}
		}
	}
	
	public static void moveCascadeToCascade(int fromCascade, int toCascade) {
		int fromRow = getUncoveredRow(fromCascade);
		if (fromRow < 0) {
			System.out.println("Nothing in " + fromCascade);
			return;
		}
		Card toMove = _board[fromRow][fromCascade-1];
		int toRow = getUncoveredRow(toCascade);
		Card uncovered = null;
		if (toRow < 0) {
			uncovered = new Card();
		} else {
			uncovered = _board[toRow][toCascade-1];
		}
		
		if (toMove.canCover(uncovered)) {
			_board[fromRow][fromCascade-1] = new Card();
			_board[toRow+1][toCascade-1] = toMove;
		} else { // illegal move
			System.out.println("%%Message - " + toMove.getASCIIDisplay() + "");
		}
		
	}
	
	private static int getUncoveredRow(int n) {
		// given the cascade number, return the last card that is not covered by another card
		return 0;
	}
	
	
}
