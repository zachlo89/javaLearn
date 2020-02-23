/**
 * 
 * @author Zachary
 * CIS 36A
 *
 */

import java.util.Scanner;

public class PhoneBot 
{
	public static void main(String[] args) 
	{
		double bill = 0;
		double basicPkg = 24.95; // 2GB; additional data $7.00/GB
		double goldPkg = 39.95; // 5GB; additional data $5.00/GB
		double unltdPkg = 59.95; // unlimited data
		
		System.out.println("Welcome to RobuCast.");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = input.next();
		
		System.out.println("Thanks for calling RobuCast " + name + "!");
		
		System.out.print("What is your phone number? ");
		String phoneNum = input.next();
		
		System.out.println("Looking up phone number " + phoneNum + "...");
		
		System.out.print("What is your phone plan? (basic/gold/unlimited) ");
		String phonePlan = input.next();
		
		if (phonePlan.equals("basic"))
		{
			System.out.println("Ah, the Basic Instinct package.");
		}
		else if (phonePlan.equals("gold")) 
		{
			System.out.println("Nice, the Gold Finger plan.");
		}
		else 
		{
			System.out.println("You animal! You went for the gusto with the Unlimited plan.");
		}
		
		System.out.print("How many GB of data this month? ");
		double gigsUsed = input.nextDouble();
		System.out.println("Wow, " +gigsUsed+ " GB is a lot of data!  Maybe you should upgrade.");
		
		
		if (phonePlan.equals("basic") && gigsUsed > 2) 
		{
			bill = basicPkg + ((gigsUsed - 2) * 7);
		}
		else if (phonePlan.equals("gold")) 
		{
			bill = goldPkg + ((gigsUsed - 5) * 5);
		}
		else 
		{
			bill = unltdPkg;
		}
		System.out.println("Your total bill is: $" + bill + ".");
		
		
		System.out.print("Thanks for calling RobuCast, please sign up for the most expensive plan " + name + " we need the money!");
		
		input.close();
	}
}
