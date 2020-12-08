package arrays;

import java.util.*;

public class ChallengesNext {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//numberOne();
		//numberTwo();
		//numberThree();
		//numberFour();
		//numberFive();
		//numberSix();
		//numberSeven();
		//numberEight();
		numberNine();
		
		//classExercise();
		
		scan.close();

	}
	
	public static void numberOne() {
		
		int size = 0;
		String sizeString;
		String upperCase ;
		//String first ;
		boolean empty = true;
		//boolean isDigit;
		
		System.out.println("Please enter the size of your array: ");
		
		while(empty) {
			
			sizeString = scan.nextLine();
			if (sizeString.isEmpty())
			{
				System.out.println("Please enter a valid integer: ");
				continue;
				
			}
			
			size = Integer.parseInt(sizeString);
			
			String[] userArray = new String[size];
			
			System.out.println("Please enter " + size + " strings for your array: ");
			
			for(int i = 1; i <= size;i++) {
				
				System.out.println("Please enter lowercase string #" + i + ": ");
				userArray[i-1] = scan.next();
				
				
			}
			
			for(int i = 0; i < userArray.length; i++) {
				
				upperCase = userArray[i].toUpperCase();
				
				userArray[i] = upperCase.substring(0,1) + userArray[i].substring(1) ;
				
			}
			
			System.out.println(Arrays.toString(userArray));
			empty = false;
		}
	}
	
	public static void numberTwo() {
		
		
		
	}
	
	public static void numberThree() {
		
		String[] myArray = {"We","Love","Java","Training","In","Our","SDET","24","Weeks","Training"};
		
		String myConcat="";
		
		for(int i = 0; i<myArray.length; i++) {
			
			myConcat += myArray[i] + " ";
		}
		
		System.out.println(myConcat);
		
	}
	
	public static void numberFour() {
		
		String userInput = "";
		
		System.out.println("Please enter a string: ");
		userInput = scan.next();
		
		char[] userArray = new char[userInput.length()];
		
		for(int i = 0; i<userInput.length();i++) {
			
			userArray[i] = userInput.charAt(i);
			
		}
		
		System.out.println(userInput);
		System.out.println(Arrays.toString(userArray));
		
		
	}
	
	public static void numberFive() {
		
		String[] arr1 = {"We","Love","Java","And","SDET"};
		String[] arr2 = new String[arr1.length-2];
		
		for(int i = 1; i < (arr1.length-1); i++) {
			
			arr2[i-1] = arr1[i];
			
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		
	}
	
	/**
	 * Author: Richard
	 * 
	 * this method does number six
	 * 
	 */
	public static void numberSix() {
		
		int[] arr1 = new int[100];
		
		for(int i = 0; i < arr1.length;i++)
		{
			
			arr1[i] = i+1;
		}
		System.out.println(Arrays.toString(arr1));
		
		//Arrays.fill(arr1, 3,15,10);
		//System.out.println(Arrays.toString(arr1));
		
	}
	
	public static void numberSeven() {
		
		int size = 0;
		
		System.out.println("Please enter the size of your array: ");
		size = scan.nextInt();
		
		int[] userArray = new int[size];
		
		for(int i = 0; i < userArray.length;i++) {
			
			System.out.println("Please enter an integer #" + (i + 1) + ":");
			userArray[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i < userArray.length;i++) {
			for(int j = 0; j <= userArray[i];j++) {
				
				System.out.print(j + " ");
				
			}
			
			System.out.println();
			
			
		}
		
		
	}
	
	public static void numberEight() {
		
		int size=0;
		int j = 0;
		
		System.out.println("Please enter the size of your array: ");
		size = scan.nextInt();
		
		String[] userArray = new String[size];
		String[] revArray = new String[size];
		
		for(int i = 0; i < userArray.length;i++) {
			
			System.out.println("Please enter a string #" + (i + 1) + ":");
			userArray[i] = scan.next();

		}
		
		for (int i = (userArray.length-1) ; i >= 0; i--) {
			
				revArray[j] = userArray[i];
				j++;
			
		}
		
		System.out.println(Arrays.toString(revArray));
		
		
	}
	
	public static void numberNine() {
		
		String arrSize="";
		String userInput = "";
		String firstChar;
		String lastChar;
		
		int size = 0;
		
		System.out.println("Please enter the size of your array: ");
		arrSize = scan.nextLine();
		size = Integer.parseInt(arrSize);

		String[] names = new String[size];
		
		for (int i = 0; i < names.length; i++) {
			
			System.out.println("Please enter name #1: ");
			userInput = scan.nextLine();
			
			//lenght = userInput.length();
			firstChar = userInput.substring(0, 1).toUpperCase();
			lastChar = userInput.substring(( userInput.length()-1) ).toUpperCase()   ;
			
			names[i] = firstChar + lastChar;
			
			
			
		}
		
		System.out.println(Arrays.toString(names));
		
	}
	
	public static void numberTen() {
		
		String arrSize;
		int size=0;
		int j = 0;
		//String name= "";
		
		System.out.println("Please enter the size of your array: ");
		arrSize = scan.nextLine();
		size = Integer.parseInt(arrSize);
		
		String[] initials = new String[size];
		
		for (int i = 0; i < initials.length; i++) {
			
			System.out.println("Please enter a string #" + (i + 1) + ": ");
			
			String name = scan.nextLine();
			
			String split[] = name.split(" ");
			String twoLetters = "";
			
			for (int k = 0; k < split.length; k++) 
				twoLetters += split[j].substring(0, 1);
				
			
			initials[i] = twoLetters;
			
			
		}
		
		System.out.println(Arrays.toString(initials));
		
	}
	
	

	
	public static void classExercise() {
		
		//Create another int array and using a for loop, copy the 2 arrays into the new array
		
		int[] arr1 = { 2, 3, 7, 8, 0, 7, 7, 1, 5, 6 };
		int[] arr2 = { 0, 0, 2, 10, 10, 2, 0, 0, 10, 5 };
		int[] newArray = new int[arr1.length + arr2.length];
		int j = 0;
		
		
		for(int i = 0; i < newArray.length; i ++) {
			if(i < arr1.length ) 
				newArray[i] = arr1[i];
			else {
				//newArray[i] = arr2[i-arr1.length];
				newArray[i] = arr2[j];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(newArray));
		
		
	}
	
	
	/*for(int i = 0; i < sizeString.length(); i++) {
		
		char currentChar = sizeString.charAt(i);
		isDigit = Character.isDigit(currentChar);
		
		System.out.println(currentChar + ""+ isDigit);
		
		if (!isDigit)
		{
			System.out.println("Please enter a valid integer: ");
			i = sizeString.length();
			
			
		}
		
	}
	*/

}
