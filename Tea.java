/**
 * 
 * @author Zachary Lo
 * CIS 36A; Tea for True; Assignment 11.1
 *
 */
import java.util.Scanner;

public class Tea 
{
	public static void main(String[] args) 
	{
		String tea = "";
		String milk = "";
		int sugarCount = 0;
		boolean answer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("We have two types of tea, Black and Green.");
		System.out.print("\nWould you like Black tea? ");
		answer = input.nextBoolean();
		
		if (answer == true) 
		{
			tea = "Black tea";
		}
		else 
		{
			tea = "Green tea";
		}
			
	
		System.out.print("Would you like milk in your tea? ");	
		input.nextBoolean();
		
		if (answer == true) 
		{
			milk = " with milk";
		}
		else 
		{
			milk = "no milk";
		}
				
		
		System.out.print("Would you like sugar? ");
		answer = input.nextBoolean();
		
		if (answer == true) 
		{
			sugarCount++;
			System.out.print("Would you like more sugar?");
			answer = input.nextBoolean();
			if (answer == true)
			{
				sugarCount++;
			}
		}
		
		System.out.print(tea + ", " + milk + ", " );
		if (sugarCount == 0) 
		{
			System.out.print("Unsweetened");
		}
		else if (sugarCount == 1) 
		{
			System.out.print("and one teaspoon of sugar.");
		}
		else if (sugarCount == 2) 
		{
			System.out.print("and two teaspoons of sugar.");
		}
			
		input.close();
	}
}


