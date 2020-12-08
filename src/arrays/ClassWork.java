package arrays;

import java.util.Arrays;

public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myIntArray = {45,10, 50, 3, 100, 87, 76,90,76,5,7};
		int sum = 0;
		
		
		for(int i = 0; i < myIntArray.length; i++) {
			
			if((myIntArray[i]%2) == 0)
				myIntArray[i] *= 5;
			else
				sum += myIntArray[i];
			
		}
		
		System.out.println(Arrays.toString(myIntArray));
		System.out.println("\nThe sum of odd numbers in this array is: " + sum);

	}

}
