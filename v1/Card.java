package freecell.v1;

public class Card {
	private int _code;
	
	public Card(int code) {
		_code = code;
	}
	
	/**
	 * Construct a card object by specifying its suits and
	 * range. 
	 * 
	 * @param suit Value in range 1-4, using the same 
	 * 			encoding as the get Suit() method.
	 * @param rank value in the range 1-13, using the same
	 * 			encoding as the getRank() method.
	 * @param code
	 * 
	 * @see #getSuit()
	 * @see #getRank();
	 */
	public Card(int suit, int rank) {
		_code = (suit-1)*13 + rank;
	}
	
	// A good habit is to always explicitly define a default constructor 
	// even if another constructor is declared.
	// this resemble the default constructor
	public Card() {
		_code = 0;
	}
	
	
	public void setCode(int code) {
		_code = code;
	}
	/**
 * Produce a string that provides an ASCII representation
	 * of the specified card. The card is an integer in the 
	 * range 0-52. 0 represents no card, 1-13 represents 
	 * spades(S), 14-26 represents clubs (C), 27-40 represents 
	 * diamonds (D), 4152 represents hearts (H).
	 * The rank within each suit is A 2 3 4 5 6 7 8 9 T J Q K
	 * @param card
	 * @return String with format <rank> <suit>. If the card 
	 * is blank, return " ". If the card value is outside 
	 * the range 0-52, return null */
	public String getASCIIDisplay() {
		if (_code == 0) {
			return " ";
		}
		String result = "";
		
		// Figure out the suit representation
		int suit = getSuit(_code);
		switch (suit) {
		case 0:
			result = "S";
			break;
		case 1:
			result = "C";
			break;
		case 2:
			result = "D";
			break;
		case 3:
			result = "H";
			break;
		default:
			throw new RuntimeException("Invalid card(" + _code + ")");
		}
		
		int rank = getRank();
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K" };
		result = ranks[rank - 1] + result;
		return result;
	}
	
	/**
	 *  Determine the rank of the card, that is the position
	 *  of the card within its suit.
	 * @param card The card whose rank we care about
	 * @return 1 if the card is an Ace, 2 if a 2, etc,
	 * 11 if a Jack, 12 if a Queen, 13 if a King.
	 * and -1 if not in the range 1 to 52.
	 */
	private int getRank() {
		if (_code <= 0 || _code > 52) {
			return -1;
		}
		int rank = _code % 13;
		if (rank == 0) {
			return 13;
		} else {
			return rank;
		}
	}
	public int getSuit(int card) {
		return (card -1 )/  13;
	}
	
	public boolean canCover(Card card) {
		return false;
	}
	

}
