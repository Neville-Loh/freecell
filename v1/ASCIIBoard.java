package freecell.v1;

public class ASCIIBoard {
	
	private static int[][] _board;
	private static int[] _foundations; // Stores the top cards
	private static int[] _cells;
	
	public static void initialise() {
		_board = new int[52][8];
		_foundations = new int[4];
		_cells = new int[4];
	}
	
	public static void placeCardsOnBoard() {
		int[] cards = Deck.getCardArray();
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
		while (_board[row][cascade] != 0) {
			Card.setCode(_board[row][cascade]);
			System.out.print(" " + Card.getASCIIDisplay());
			cascade++;
			if (cascade == 8) {
				cascade = 0;
				row ++;
				System.out.print("|\n|");
			}
		}
	}
		
	
}
