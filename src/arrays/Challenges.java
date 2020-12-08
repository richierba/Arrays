package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Challenges {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//numberOne();
		//numberTwo();
		//numberThree();
		numberFour();
		
		scan.close();

	}
	
	public static void numberOne() {
		String[] songs = {"One Love", "Three little birds","At Las","Jazz","Reggae","Autobahn","Atomic Dog","Baby love","Wifey","Bad Boys"};
		
		String[] song = new String[10];
		
		song[0]= "One Love";
		song[1] = "Three little birds";
		song[2] = "At Las";
		song[3] = "Jazz";
		song[4] = "Reggae";
		song[5] = "Autobahn";
		song[6] = "Atomic Dog";
		song[7] = "Baby love";
		song[8] = "Wifey";
		song[9] = "Bad Boys";
				
		
		for(int i = 0; i < songs.length; i++) 
			System.out.println(songs[i]);
			
		System.out.println("\n\n***NEXT WAY***\n\n");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(song[i]);
			
		}
		
	}
	
	public static void numberTwo() {
		
		String[] elements = {"1","2","3","4","5","6","7","8"};
		
		System.out.println(elements[0]); //first element
		System.out.println(elements[7]); //second element

	}
	
	public static void numberThree() {
		
		
		//int size = 0;
		
		System.out.println("Enter array size: ");
		//size = scan.nextInt();
		
		String[] animals = new String[scan.nextInt()];
		//String[] animals = new String[size];
		
		for(int i = 0; i < animals.length; i++) {
			
			System.out.println("Please enter animal name #" + (i+1) + ": ");
			animals[i] =  scan.next();
			
		}
		
		System.out.println(Arrays.toString(animals));

	}
	
	public static void numberFour() {
		
		String[] movies = {"Up","Ali","Red","Spy","JFK","Zoo","The Anderson","Army of Ages","Love","Te Amor"};
		String userInput;
		
		System.out.println(Arrays.toString(movies));
		System.out.println("Please choose a movie: ");
		
		boolean movie = true;
		
		while(movie) {
			
			userInput = scan.nextLine();
			
			if (! userInput.isEmpty()) {
				
				userInput = userInput.toLowerCase();
				
				switch(userInput) {
				
				case "up": 
					System.out.println("Playing..... " + movies[0]);
					break;
				case "ali": 
					System.out.println("Playing..... " + movies[1]);
					break;
				case "red": 
					System.out.println("Playing..... " + movies[2]);
					break;
				case "spy": 
					System.out.println("Playing..... " + movies[3]);
					break;
				case "jfk": 
					System.out.println("Playing..... " + movies[4]);
					break;
				case "zoo": 
					System.out.println("Playing..... " + movies[5]);
					break;
				case "the anderson": 
					System.out.println("Playing..... " + movies[6]);
					break;
				case "army of ages": 
					System.out.println("Playing..... " + movies[7]);
					break;
				case "love": 
					System.out.println("Playing..... " + movies[8]);
					break;
				case "te amor": 
					System.out.println("Playing..... " + movies[9]);
					break;
				default:
					System.out.println("Sorry, the movie you have chosen does not exist\n\n");
					System.out.println("Note: Have 10 movies in your list");
					System.out.println("Please choose a movie: ");
					continue;
					//break;

				}
				
				
				
			}
			else 
			{
				System.out.println("You did not enter a movie");
				System.out.println("Please choose a movie: ");
				continue;
			}
			movie = false;
		}

	}
	

}
/*
 * 
 * 1. Create a String array and name it 'songs' and put 10 song items inside (use 2 methods of creating arrays)
 *    Using a for loop iterate that 'song' array
 * 2. Create a String array with 8 elements.
 *    Print out the first item and the last item from the array using System.out.println()
 *    
 * 3. Create 'animals' array and let the scanner decide the size of this array. Then using a for loop fill in each
 * item from the array with different animal names from the scanner.
 * 
 * 
 * 4. Create 'movies' array and put 10 movie items in that array. Then using the scanner object, ask the user which 
 * movie they wish to see. If the movie they choose exists in the array, print out 'Playing ABC movie'. If not, print out
 * movie you have chosen does not exist.
 * 
 * e.g
 * [Matrix, John Wick, I am Legend, Jason Bourne]
 * Please choose a movie
 * Matrix
 * Playing Matrix....
 * 
 * [Matrix, John Wick, I am Legend, Jason Bourne]
 * Please choose a movie
 * Monsters
 * Sorry, the movie you have chosen does not exist
 * 
 * Note: Have 10 movies in your list
 * 
 * 
 * /
 */