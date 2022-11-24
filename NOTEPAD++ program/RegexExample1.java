import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

class RegexExample1
{
	public static void main(String args[])
	{
		System.out.println(Pattern.matches(".t", "bt"));//true (2nd char is t) 
		System.out.println(Pattern.matches(".t","pk"));//false (2nd char is not t) 
		System.out.println(Pattern.matches(".t", "lot"));//false (has upwards of 2char)
		System.out.println(Pattern.matches(".t", "boat"));//false (has upwards of 2 char)
		System.out.println(Pattern.matches("..t", "rat"));//true (3rd char is t)
		System.out.println(Pattern.matches("..n","minal"));
		System.out.println(Pattern.matches("a-z","pqr"));
		/*st emails = new ArrayList();
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("user1@domain.com");
		emails.add("user.name@domain.com");
		emails.add("user#@domain.co.in");
		emails.add("user@domaincom");
		emails.add("user#domain.com");
		emails.add("@gmail.com");
		String regex = "^(.+)@(.+)$ ";
		Pattern pattern = Pattern.compile(regex);
		for(String email : emails)
		{
		Matcher matcher = pattern.matcher(email);
		System.out.println(email +" : "+ matcher.matches());
		} 	*/
	}
}