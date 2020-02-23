/**
 * 
 * @author Zachary Lo
 * CIS 36A
 *
 */

import java.util.Scanner;

public class Credit1 
{
	public static void main(String[] args)
	{
		String creditCardNum;
		int creditCardNumLen;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the Credit Card Number Decoder!");
		
		System.out.print("Please enter a credit card number: ");
		creditCardNum = in.next();
		
		creditCardNumLen = creditCardNum.length();
		System.out.println("The card number length is " + creditCardNumLen + ".");
		
		 /**
		  * if the card length is 15 and starts with 3 then it's AMEX
		  * else if card length is  16 and starts with 4 then it's Visa
		  * else card type is not recognized
		  */
		if (creditCardNumLen == 15 && creditCardNum.charAt(0) == '3')
		{
			System.out.println("The card type is American Express.");
		}
		else if (creditCardNumLen == 16 && creditCardNum.charAt(0) == '4') 
		{
			System.out.println("The card type is Visa.");
		}
		else
		{
			System.out.println("The card type is not recognized.");
		}
		
		
		in.close();
	}
}
