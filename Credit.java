/**
 * 
 * @author Zachary Lo
 * CIS 36A; More Credit Card Decoding; Assigment 11.3
 *
 */

import java.util.Scanner;

public class Credit 
{
	public static void main(String[] args)
	{
		String creditCardNum;
		int creditCardNumLen;
		String repeat = "y";
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the Credit Card Number Decoder!\n");
			

		while (repeat.equalsIgnoreCase("y")) 
		{			
			System.out.print("\nPlease enter a credit card number: ");
			creditCardNum = in.next();
			
			creditCardNumLen = creditCardNum.length();
			System.out.println("The card number length is " + creditCardNumLen + ".");
			
			if ((creditCardNumLen == 15 && creditCardNum.charAt(0) == '3') && (creditCardNum.charAt(1) == '4' || creditCardNum.charAt(1) == '7'))
			{
				System.out.println("The card type is American Express.");
			}
			else if ((creditCardNumLen == 16 || creditCardNumLen == 13) && creditCardNum.charAt(0) == '4') 
			{
				System.out.println("The card type is Visa.");
			}
			else if (creditCardNumLen == 14 && (creditCardNum.charAt(0) == '3') && (creditCardNum.charAt(1) == '6' || creditCardNum.charAt(1) == '8' || creditCardNum.charAt(1) == '0' && (creditCardNum.charAt(2) == '0' || creditCardNum.charAt(2) == '1'|| creditCardNum.charAt(2) == '2' || creditCardNum.charAt(2) == '3' || creditCardNum.charAt(2) == '4' || creditCardNum.charAt(2) == '5')))
			{
				System.out.println("The card type is Diners Club.");
			}
			else if (creditCardNumLen == 16  && (creditCardNum.charAt(0) == '6' && creditCardNum.charAt(1) == '0' && creditCardNum.charAt(2) == '1' && creditCardNum.charAt(3) == '1'))
			{
				System.out.println("The card type is Discover.");
			}
			else if (creditCardNumLen == 16  && creditCardNum.charAt(0) == '5' && (creditCardNum.charAt(1) == '1' || creditCardNum.charAt(1) == '2' || creditCardNum.charAt(1) == '3' || creditCardNum.charAt(1) == '4' || creditCardNum.charAt(1) == '5')) 
			{
				System.out.println("The card type is MasterCard.");
			}
			else
			{
				System.out.println("The card type is not recognized.");
			}
			
			System.out.print("Decode another card? (y/n) ");
			repeat = in.next();
		}
		
		System.out.println("Goodbye.");
		in.close();
	}
}
