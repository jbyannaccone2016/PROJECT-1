
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Transformer  {
	
	 private static final String regex = "(?i)and(?-i)";
	 private static String line;
	
	public Transformer(String entry) {
		
		line = entry;
	}
	
	public void findMatches() {
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(line);	
		
		if(m.find())	{
			line = line.replaceAll(regex, "&");
			System.out.println(line);
		}
		else {
			System.out.println(line);
		}
		
	}
	
}
