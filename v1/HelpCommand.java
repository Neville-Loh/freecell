package freecell.v1;

public class HelpCommand implements Command {

	public boolean engage() {
		System.out.println("q - quit the game");
		System.out.println("1 - move from cascade to cascade");
		System.out.println("2 - move from cascade to cell");
		System.out.println("3 - move from cascade to foundation");
		System.out.println("4 - move from cell to cascade");
		System.out.println("5 - move from cell to foundation");
		return false;
	}
}
