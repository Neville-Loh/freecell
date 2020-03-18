package freecell.v1;

public class CascadeToCascadeCommand implements Command {
	/**
	 * 
	 * @return boolean correspond to ending the game
	 * 			true = stop, false = continue
	 */
	public boolean engage() {
		String from = KeyboardInput.readFromKeyboard("From: ");
		int fromCascade = Integer.parseInt(from);
		String to = KeyboardInput.readFromKeyboard("To: ");
		int toCascade = Integer.parseInt(to);
		ASCIIBoard.moveCascadeToCascade(fromCascade, toCascade);
		return false;
	}
}
