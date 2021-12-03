package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len = arr.length;
		int count = 0;
		System.out.println("The duplicates are:");
		for (int i = 0; i <=len-1; i++) {
			count = 0;
			for (int j = 1; j<= len; j++) {
				
				if (i==j)
				{break;}
				
				if (arr[i] == arr[j]) 
				{
					count = count+1;
					
					
				}
				if (count > 0)
				{
					System.out.println(arr[i]);
					break;
					
				}
														
				}
			
			
									
			}
			
		}

	}


