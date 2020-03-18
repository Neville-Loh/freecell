package freecell.v1;

public class CommandFactory {
	private static final String QUIT = "q";
	private static final String HELP = "h";
	private static final String CASCADE_TO_CASCADE = "1";
	private static final String CASCADE_TO_CELL = "2";
	private static final String CASCADE_TO_FOUNDATION = "3";
	private static final String CELL_TO_CASCADE = "4";
	private static final String CELL_TO_FOUNDATION = "5";

	String turn = KeyboardInput.readFromKeyboard("Cmd: ");


	public static Command getUserCommand() {
		String turn = KeyboardInput.readFromKeyboard("Cmd: ");
		if (turn.equals(QUIT)) {
			return new QuitCommand();
		} else if (turn.equals(HELP)) {
			return new HelpCommand();
		} else if (turn.equals(CASCADE_TO_CASCADE)) {
			return new CascadeToCascadeCommand();
		} else if (turn.equals(CASCADE_TO_CELL)) {
			return new CascadeToCascadeCommand();
		} else if (turn.equals(CASCADE_TO_FOUNDATION)) {
			return new CascadeToCascadeCommand();
		} else if (turn.equals(CELL_TO_CASCADE)) {
			return new CascadeToCascadeCommand();
		} else if (turn.equals(CELL_TO_FOUNDATION)) {
			return new CascadeToCascadeCommand();
		} else {
			return new InvalidCommand(turn);
		}
	}
}
