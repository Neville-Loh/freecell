package freecell.v1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class FreeCell {



	
	public static void main(String[] args) {
		System.out.println("hello world");
		
		
		Deck.initialise();
		Deck.shuffleDeck();
		ASCIIBoard.initialise();
		ASCIIBoard.placeCardsOnBoard();
		
		
		while (true) {
			ASCIIBoard.displayBoard();
			String turn = KeyboardInput.readFromKeyboard("Cmd: ");
			if (turn == null) {
				// For now just go around the loop again
				// later perhaps add a message saying what's wrong
			} else if (turn.equals("q")) {
				break;
			} else if (turn.equals("1")) {
				String from = KeyboardInput.readFromKeyboard("From: ");
				int fromCascade = Integer.parseInt(from);
				String to = KeyboardInput.readFromKeyboard("To: ");
				int toCascade = Integer.parseInt(to);
			} else if (turn.contentEquals("2")) {}
			
		}
		
	}

}
