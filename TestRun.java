
import java.util.Scanner;

public class TestRun 
{
	public static void main( String[] args)
	{
		Scanner read = new Scanner(System.in);
		String entry = read.nextLine();
		Transformer check = new Transformer(entry);
		check.findMatches();
		read.close();
	}
	
}
