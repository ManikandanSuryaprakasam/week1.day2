package week1.day2;

public class ConvertNegativeNumber {

	public static void main(String[] args) {
		int input = -35;
		if (input > 0)
			System.out.println("This is a positive number");
		else if(input<0)
		{
			System.out.println("This is a Negative number");
		    input = input * -1;
		    System.out.println("The converted positve number is "+input);
		} 
		else 
			System.out.println("The number is neither positve nor Negative");

	}

}
//https://github.com/ManikandanSuryaprakasam/week1.day2
//https://github.com/ManikandanSuryaprakasam/week1.day1