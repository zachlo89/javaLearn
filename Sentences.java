
/**
 * 
 * @author Zachary Lo
 * CIS 36A; Assignment 14.2; More Sentences
 *
 */

import java.util.Scanner;

public class Sentences 
{
	public static void main(String[] args) 
	{
		String sentence = "";
		int firstNumLoc = 0;
		int secondNumLoc = 0;
		char letterOne = ' ';
		char letterTwo = ' ';

		Scanner input = new Scanner(System.in);

		System.out.print("Welcome!" + "\nThis program compares two letters in a sentence.");

		do 
		{
			System.out.print("\n\nEnter a sentence or X to exit: ");
			sentence = input.nextLine();
			
			if(!sentence.equalsIgnoreCase("x")) 
			{

				System.out.print("\nEnter the numeric location of the first letter: ");
	
				// first letter
				while (!input.hasNextInt()) 
				{
					System.out.print("Error! Enter a number, not text!");
					// clear out incorrect string input
					input.nextLine();
	
					// prompt user for new input first letter
					System.out.print("\nEnter the numeric location of the first letter: ");
					
				}
				
				// only now is it safe to read the user input into the int var
				firstNumLoc = input.nextInt();
				input.nextLine();
	
				
				System.out.print("\nEnter the numeric location of the second letter: ");
				
				// second letter
				while (!input.hasNextInt()) 
				{
					System.out.print("Error! Enter a number, not text!");
					input.nextLine();
	
					// prompt user for new input second letter
					System.out.print("\nEnter the numeric location of the second letter: ");
				}
				// only now is it safe to read the user input into the int var
				secondNumLoc = input.nextInt();
	
				letterOne = sentence.charAt(firstNumLoc);
				letterTwo = sentence.charAt(secondNumLoc);
	
				if (letterOne != letterTwo) {
					System.out.println("\n" + letterOne + " and " + letterTwo + " are unique characters.");
				} else {
					System.out.println(letterOne + " and " + letterTwo + " are identical.");
				}
				input.nextLine();
			}

		}
//		while (!input.nextLine().equalsIgnoreCase("X"));
		while (!sentence.equalsIgnoreCase("X"));

		System.out.print("\nGoodbye!");
		input.close();
	}
}
