package freecell.v1;

public class FreeCell {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		
		Deck.initialise();
		//Deck deck = new Deck();
		//deck.shuffleDeck();
		Deck.shuffleDeck();
		ASCIIBoard.initialise();
		ASCIIBoard.placeCardsOnBoard();
		
		
		while (true) {
			ASCIIBoard.displayBoard();
			
			Command cmd = CommandFactory.getUserCommand();

			if (cmd.engage()) {
				break;
			}
		}
		
	}

}
