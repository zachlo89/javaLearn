/**
 * 
 * @author Zachary Lo
 * What's Your Rock Star Name
 * CIS 36A
 *
 */

import java.util.Scanner;

public class RockStar 
{
	public static void main(String[] args)
	{
		String firstName;
		String lastName;
		
		System.out.println("Welcome! Let's find your Rock Star Name! \n\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		firstName = input.nextLine();
		
		System.out.print("Enter your last name: ");
		lastName = input.nextLine();
		
		System.out.print("Rock on, " +firstName+ "! \n");
		
		
		int firstLen = firstName.length();
		int lastLen = lastName.length();
		
		
		if (firstLen > 5) 
		{
			firstLen -= 5;
		}
		if (lastLen > 6)
		{
			lastLen -= 6;
		}
		
		// Zachary 7 = 2 Fearless
		// Lo 2  Drums
		
		System.out.print("Your rock star name is ");
		
		
		if (firstLen == 1)
		{
			System.out.print("\"Fierce\"");
		}
		if (firstLen == 2)
		{
			System.out.print("\"Fearless\"");
		}
		if (firstLen == 3)
		{
			System.out.print("\"Brutal\"");
		}
		if (firstLen == 4)
		{
			System.out.print("\"Savage\"");
		}
		if (firstLen == 5)
		{
			System.out.print("\"Rough\"");
		}
		
	
		
		String firstInitial = "" + firstName.charAt(0);
		String capitalFirstInitial = firstInitial.toUpperCase();
		
		String lastChar = "" + (lastName.charAt(lastName.length() - 1));
		String capitalLastChar = lastChar.toUpperCase();

		System.out.print(" " + capitalFirstInitial+capitalLastChar + " ");
		
		
		if (lastLen == 1)
		{
			System.out.print("Guitar");
		}
		if (lastLen == 2)
		{
			System.out.print("Drums");
		}
		if (lastLen == 3)
		{
			System.out.print("Bass");
		}
		if (lastLen == 4)
		{
			System.out.print("Banjo");
		}
		if (lastLen == 5)
		{
			System.out.print("Violin");
		}
		if (lastLen == 6)
		{
			System.out.print("Cello");
		}
		
		input.close();
	}
}
