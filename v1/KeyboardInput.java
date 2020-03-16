package freecell.v1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KeyboardInput {
	
	
	public static String readFromKeyboard(String prompt){

		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(stdin);
		try {
			System.out.print("\n" +  prompt);
			String input = in.readLine();
			return input;
		} catch (IOException e){
			// If anything bad happens there isn't a lot we can 
			// do about it so do nothing. It's up to the caller
			// to make sure something was actually read.
		}
		return null; // return special value
	
}


}
