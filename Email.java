
/**
 * 
 * @author Zachary Lo
 * CIS 36A; Valid Email; Assignment 13.3
 *
 */

import java.util.Scanner;

public class Email {
	public static void main(String[] args) 
	{
		String email = "";

		Scanner input = new Scanner(System.in);

		// Welcome and prompt user here
		System.out.println("Welcome!  Enter an email and I will tell you if it is valid.");
//		System.out.print("\nPlease enter an email or q to quit: ");
//		email = input.next();
		
		while (!email.equalsIgnoreCase("q")) 
		{
			System.out.print("\nPlease enter an email or q to quit: ");
			email = input.next();
			
			boolean isValid = false;
			
			// add your for loop here
			for (int i = 0; i < email.length(); i++)
			{
				// if there is an @ in string then assign isValid to be true
				if (email.charAt(i) == '@')
				{
					isValid = true;
				}
			}
			
			if (isValid) 
			{
				System.out.println("The email address is valid.");
			} 
			else 
			{
				System.out.println("The email address is invalid.");
			}
		}
		
		System.out.println("\nGoodbye!");
		input.close();
	}
}
