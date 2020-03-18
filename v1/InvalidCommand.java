package freecell.v1;

public class InvalidCommand implements Command {

	public InvalidCommand(String turn) {
		System.out.println("%% Message: invalid command (" + turn + ")");
	}
	
	public boolean engage() {
		return false;
	}
}
