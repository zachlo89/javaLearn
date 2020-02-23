
/**
 * 
 * @author Zachary Lo
 * CIS 36A; Activity 14.2; Scores
 *
 */

import java.util.Scanner;

public class Scores 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double sumScores = 0.0;
		double nextScore = 0.0;
		int count = 0;
		
		do
		{
			count++;
			
			System.out.print("Enter score #" + count + ": ");
			
			if (!input.hasNextDouble())
			{
				System.out.println("Error! Please enter a number, not text.");
				input.nextLine();
			}
			else
			{
				nextScore = input.nextDouble();
				if (nextScore >= 0) 
				{
					sumScores += nextScore;					
				}
			}
		}
		while (nextScore >= 0.0);
		System.out.println("\nSum of scores: " + sumScores);
		input.close();
	}
}
