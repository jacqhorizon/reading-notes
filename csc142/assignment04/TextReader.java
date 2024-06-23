package assignment04_kirkman_jacq;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * The class is a driver to read the WarAndPeace.txt file in the same directory 
 * with TextReader.java file. The class uses two parallel arrays: one to hold
 * the words and one to hold the frequencies of the words. The word and its frequency
 * should have the same indexes in two parallel arrays
 *
 
 * @author Jacq Kirkman 
 * @version 1
 */

public class TextReader
{
	public static final int MAX_LENGTH = 1000000;
	public static final int NOT_FOUND = -1;
	
	public static void main(String[] args)
	{
		// TODO declare an array of string that has capacity 1000000 to store words
		String[] words = new String[MAX_LENGTH];
		// TODO declare an array of integers that has capacity 1000000 to store frequencies of earch word
		int[] frequencies = new int[MAX_LENGTH];
		// TODO declare a variable to store the number of unique words reading from the WarAndPeace.txt file
	int unique = readWordFromFile("WarAndPeace.txt", words, frequencies);
//		int unique = readWordFromFile("/Users/jacqkirkman/Downloads/WarAndPeace.txt", words, frequencies);
		
		// declare a scanner
		Scanner scanner = new Scanner(System.in);
		
		// TODO display a menu
		displayMenu();
		
		// TODO ask user to enter an option from 0 to 3
		System.out.print("Please enter option [0-3]: ");
		
		// get option (value) from the scanner
		int option = scanner.nextInt();
		while (option > 0)
		{
			// TODO execute the function based on the option selected 
			if (option == 1) {
				System.out.print("Enter the word to find its frequency: ");
				String word = scanner.next();
				int wordIndex = getWordIndexFromArray(word, words, unique);
				if (wordIndex >= 0) {
					System.out.println("The frequency of the word \""+word+"\" is: "+frequencies[wordIndex]);
				}
			} else if (option == 2) {
				System.out.print("Enter the least frequency to list all words: ");
				int minFrequency = scanner.nextInt();
				System.out.print("The list of words that have frequency greater than "+minFrequency+":");
				for (int i = 0; i<unique; i++) {
					if(frequencies[i] > minFrequency) {
						System.out.print(" "+words[i]);
					}
				}
				System.out.println();
			} else {
				System.out.println("Sorry, I could not find the function for option "+ option);
			}
			// re-select option
			option = 0;
			// TODO display a menu
			displayMenu();
			// TODO ask user to enter an option from 0 to 3
			System.out.print("Please enter option [0-3]: ");
			option = scanner.nextInt();
		}
		System.out.println("Thank you for using the program");
		scanner.close();
	}
	
	/**
	 * The method displays the menu to the console
	 */
	public static void displayMenu()
	{
		System.out.println("======================================");
		System.out.println("Please select option below to operate:");
		System.out.println("  0. Quit the program");
		System.out.println("  1. Print out the frequency of an entered word");
		System.out.println("  2. Print out all words that have a frequency that is greater than an entered value");
		System.out.println("  3. Reserved for extra credit");
	}
	
	/**
	 * The method read the words from the input file into array of string
	 * @param filename the file name
	 * @param words the array of words (strings)
	 * @param frequencies the array of frequencies (integers)
	 * @return the number of unique words in the text file
	 */
	public static int readWordFromFile(String filename, String[] words, int[] frequencies)
	{
		int unique = 0;
		try {
			Scanner input = new Scanner(new File(filename));
			while (input.hasNext()) {
				String word = input.next();
				word = removePunctuations(word).toLowerCase();
				int i = 0;
				boolean found = false;
				while(words[i] != null) {
					if (words[i].equals(word)) {
						frequencies[i]++;
						found = true;
					}
					i++;
				}
				if (!found) {
					words[i] = word;
					frequencies[i]++;
					unique++;
				}
			}

		} catch (FileNotFoundException ex) {
			System.out.print(ex);
		}
		return unique;
	}
	
	/**
	 * The method remove all punctuations from a word
	 * @param word the given word
	 * @return the word that is removed all punctuations
	 */
	public static String removePunctuations(String word)
	{
		String noPunc = "";
		for (int i = 0; i<word.length(); i++) {
			if (Character.isLetter(word.charAt(i))) {
				noPunc += word.charAt(i);
			}
		}
		return noPunc;
	}
	
	/**
	 * The method return the index of the given word in the array of words
	 * @param word the given word that need to check its index in the array
	 * @param words the array of words
	 * @param size the size of unique words
	 * @return the index of the word (-1 if the word is not in the array)
	 */
	public static int getWordIndexFromArray(String word, String[] words, int size)
	{
		int found = -1;
		for (int i = 0; i<size; i++) {
			if (words[i].equals(word)) {
				found = i;
			}
		}
		return found;
	}
	
}