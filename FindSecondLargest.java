package week1.day2;

import java.util.Arrays;


//To find the second largest value
public class FindSecondLargest {
	
	//length - > to find the length of array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//All the data are saved as index based
		//Index starts with 0
		int[] data = {3,2,11,4,6,7};
		
		//Sort array in ascending and store it in the same array	
		Arrays.sort(data);
		
		//to find the number of data in array
		System.out.println("Second largest number in Array:"+data[data.length-2]);
		
		
			
		}

	}


