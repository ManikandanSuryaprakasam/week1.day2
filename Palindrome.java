package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String text = "Madam";
		String Rev = "";
		for (int i = text.length()-1; i >= 0; i--) {
		Rev = Rev + text.charAt(i);
		}
		
		if (text.equalsIgnoreCase(Rev) )
			
		{
			System.out.println("The string "  +text+ " is a palindrome");
		}
		else
			
		{
			
			System.out.println("The string " +text+ " is not a palindrome");
		}
		
		
		}

	}


