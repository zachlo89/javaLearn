
/**
 * 
 * @author Zachary Lo
 * CIS 36A; Assignment 16.2; Vowels and Digits
 *
 */

import java.util.Scanner;

public class Digivowels 
{
	// vowel counter
	public static int vowelCounter(String word1) {
		
		int numVowels = 0;

		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) == 'a' || (word1.charAt(i) == 'e') || (word1.charAt(i) == 'i') 
					|| (word1.charAt(i) == 'o') || (word1.charAt(i) == 'u') || (word1.charAt(i) == 'A') 
					|| (word1.charAt(i) == 'E') || (word1.charAt(i) == 'I') || (word1.charAt(i) == 'O') 
					|| (word1.charAt(i) == 'U'))
			{
				numVowels++;
			}
		}

		return numVowels;
	}

	
	// contains a digit
	public static boolean containsDigit(String word2) 
	{
		for (int i = 0; i < word2.length(); i++) 
		{
			if (word2.charAt(i) >= '0' && word2.charAt(i) <= '9')
			{
				return true;
			} 
		}
		return false;
	}

	// Main method
	public static void main(String[] args) 
	{
		String sentence = "";
		int vowelsInSentence = 0;
		boolean isThereDigit = true;

		Scanner input = new Scanner(System.in);

		System.out.print("Welcome!");

		do 
		{
			System.out.print("\n\nEnter a sentence or " + "\"q\"" + " to quit: ");
			sentence = input.nextLine();

			if (!sentence.equalsIgnoreCase("q")) 
			{
				
				vowelsInSentence = vowelCounter(sentence);
				isThereDigit = containsDigit(sentence);
					
				System.out.println("There are " + vowelsInSentence + " vowels in the sentence.");
				
				
				if (isThereDigit == true) 
				{
					System.out.println("The sentence does contain digits.");
				}
				else
				{
					System.out.println("The sentence does not contain digits.");
				}
			}
			

		} 
		while (!sentence.equalsIgnoreCase("q"));

		System.out.print("\nGoodbye!");
		input.close();
	}
}
