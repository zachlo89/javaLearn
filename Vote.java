
/**
 * 
 * @author Zachary Lo
 * CIS 36A; Tallying Votes; Assignment 12.2
 *
 */

import java.util.Scanner;

public class Vote 
{
	public static void main(String[] args) 
	{
		String candA = "Jeff Bezos";
		String candB = "Mark Zuckerberg";
		String candC = "Larry Page";
		String choice = "A"; // declare only if not using X case; declare just one letter A or B or C doesn't matter which one
		int voteCountA = 0;
		int voteCountB = 0;
		int voteCountC = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("***Voting Machine!***");
		System.out.print("\n\n\nCandidate A: " + candA + "\nCandidate B: " + candB + "\nCandidate C: " + candC);
		
		
		/*
		 * System.out.print("\n\nEnter you choice (A-C); or X to exit: ");
		choice = input.next();
		
		
		if (!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B") && !choice.equalsIgnoreCase("C")) 
		{
			System.out.print("Invalid input. Please enter A-C or X");
		}
		*/
		
		// while ! = X option; then no need to reassign choice = A to jump back into loop 
		// could make just one !choice.equalsIgnoreCase("X")
		while (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B") || choice.equalsIgnoreCase("C")) 
		{
			System.out.print("\n\n\nEnter you choice (A-C); or X to exit: ");
			choice = input.next();
			
//			if (!choice.equalsIgnoreCase("A") || !choice.equalsIgnoreCase("B") || !choice.equalsIgnoreCase("C")) 
//			{
//				System.out.print("Invalid input. Please enter A-C or X");
//			}
			
			if (choice.equalsIgnoreCase("A"))
			{
				System.out.print("\nYou chose candidate " + candA + "\n");		
				System.out.print("\n\n\nCandidate A: " + candA + "\nCandidate B: " + candB + "\nCandidate C: " + candC);
				voteCountA++;
			}
			else if (choice.equalsIgnoreCase("B")) 
			{
				System.out.print("\nYou chose candidate " + candB + "\n");
				System.out.print("\n\n\nCandidate A: " + candA + "\nCandidate B: " + candB + "\nCandidate C: " + candC);
				voteCountB++;
			}
			else if (choice.equalsIgnoreCase("C")) 
			{
				System.out.print("\nYou chose candidate " + candC + "\n");
				System.out.print("\n\n\nCandidate A: " + candA + "\nCandidate B: " + candB + "\nCandidate C: " + candC);
				voteCountC++;
			}
			else if (choice.equalsIgnoreCase("X"))
			{
				System.out.println("\n\n***Election Results!*** \n" +candA+ ": " +voteCountA
						+ "\n" +candB+ ": " +voteCountB
						+ "\n" +candC+ ": " +voteCountC);
			}
			else 
			{
				System.out.print("Invalid input. Please enter A-C or X");
				System.out.print("\n\n\nCandidate A: " + candA + "\nCandidate B: " + candB + "\nCandidate C: " + candC);
				choice = "A"; // need this line to continue with while loop
			}
		}
		
		choice = input.next();
		// game over ...
		input.close();
	}
}
