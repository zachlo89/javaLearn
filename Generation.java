/**
 * 
 * @author Zachary Lo
 * @author Vishnu Palaniappan
 * CIS 36A
 *
 */

import java.util.Scanner;

public class Generation {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What's your generation? ");
		
		System.out.print("Please enter the year of your birth: ");
		
		int year_of_birth = input.nextInt();
		
		
		
		if (year_of_birth >= 1900 && year_of_birth < 1928) 
		{
			System.out.println("You belong to the \"Greatest generation\"");
		}
		else if (year_of_birth >= 1928 && year_of_birth < 1946) 
		{
			System.out.println("You belong to the \"Silents\"");
		}
		else if (year_of_birth >= 1946 && year_of_birth < 1965) 
		{
			System.out.println("You belong to the \"Baby Boomers\"");
		}
		else if (year_of_birth >= 1965 && year_of_birth < 1980) 
		{
			System.out.println("You belong to the \"Generation X\"");
		}
		else if (year_of_birth >= 1980 && year_of_birth < 2000) 
		{
			System.out.println("You belong to the \"Millenial Generation\"");
		}
		else if (year_of_birth >= 2000 && year_of_birth < 2020) 
		{
			System.out.println("You belong to the \"Generation Z\"");
		}
		else if (year_of_birth < 1900 || year_of_birth > 2019) 
		{
			System.out.println("Invalid entry.  Please enter a birth year in the range 1900-2019");
		}
//		else
//		{
//			(year_of_birth >= 1900 && year_of_birth <= 2019)	
//		}
//			System.out.println("You belong to the \"Greatest generation\"");
//		}
		
		input.close();
	}
}
