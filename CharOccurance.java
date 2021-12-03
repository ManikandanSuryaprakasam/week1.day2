package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome to chennai";
		int count = 0;
		char[] temp = str.toCharArray();
		
		char find = 'e';
		for (int i = 0; i < temp.length; i++) {
			
			if (find == temp[i])
			{count =count +1;
			}

		
	}
		 System.out.println("The number of occurences of "+find+ " is "+count);

	}
	}
