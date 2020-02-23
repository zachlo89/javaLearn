/**
 * 
 * @author Zachary Lo
 * CIS 36A; Guessing Game The Final Round; Acitivity 11.2
 *
 */

import java.util.Scanner;

public class Loopy 
{
	public static void main(String[] args) 
	{
		int guess = 0;
		String repeat = "y";
		
		Scanner input = new Scanner(System.in);
		
		while (repeat.equalsIgnoreCase("y"))
		{
			System.out.print("I'm thinking of a number between" 
					+ " 1 and 10.\nCan you guess it?\n\n" 
					+ "Enter your guess: ");
			guess = input.nextInt();

			if (7 == guess) 
			{
				System.out.println("*** Correct! ***\n");
			} 
			else 
			{
				System.out.println("Sorry, that is not correct.");
				System.out.println("Try again.");
			}
			System.out.print("\nDo you want to play again? (y/n): ");
			repeat = input.next();
		}
		
		System.out.println("Game over");
		input.close();
	}
}