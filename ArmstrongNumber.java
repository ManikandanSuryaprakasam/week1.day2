package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 153;
		int sum = 0;
		int remainder = 0;

		while(input> 0){

			remainder = input %10;
			sum = sum + (remainder*remainder*remainder);
			input = input/10;

		}

		if (sum == input) 
			System.out.println("Number is the armstrong number");

		else
			System.out.println("Number is not the armstrong number");


		System.out.println(sum);

	}

}
