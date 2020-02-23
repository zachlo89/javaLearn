/**
 * 
 * @author Zachary Lo
 * CIS 36A; Assignment 14.1; Java Jive Part 2
 *
 */

import java.util.Scanner;

public class Cafe 
{
	public static void main(String[] args)
	{
		String repeat = "y";
		String order = "";
		
		String ca = "cafe americano";
		String cal = "chai latte";
		String cap = "capuccino";
		String dc = "drip coffee";
		String des = "double espresso";
		String ml = "matcha latte";
		String ses = "single espresso";
		String tea = "tea";
		String tl = "turmeric latte";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Welcome to the Java Jive Bakery and Cafe!");
		
		
		do
		{
			System.out.print("\n\nEnter the drink order code: ");
			order = input.next();
			

				if (order.substring(0, 3).equalsIgnoreCase("CAL"))
				{
					System.out.print(order.substring(3) + " oz " + cal + " coming right up!");
				}
				
				else if (order.substring(0, 3).equalsIgnoreCase("CAP"))
				{
					System.out.print(order.substring(3) + " oz " + cap + " coming right up!");
				}
				
				else if (order.substring(0, 2).equalsIgnoreCase("CA"))
				{
					System.out.print(order.substring(2) + " oz " + ca + " coming right up!");
				}
				
				else if (order.substring(0, 2).equalsIgnoreCase("DC"))
				{
					System.out.print(order.substring(2) + " oz " + dc + " coming right up!");
				}
				
				else if (order.substring(0, 3).equalsIgnoreCase("DES"))
				{
					System.out.print(order.substring(3) + " oz " + des + " coming right up!");
				}
				
				else if (order.substring(0, 2).equalsIgnoreCase("ML"))
				{
					System.out.print(order.substring(2) + " oz " + ml + " coming right up!");
				}
				
				else if (order.substring(0, 3).equalsIgnoreCase("SES"))
				{
					System.out.print(order.substring(3) + " oz " + ses + " coming right up!");
				}
				
				else if (order.substring(0, 3).equalsIgnoreCase("TEA"))
				{
					System.out.print(order.substring(3) + " oz " + tea + " coming right up!");
				}
				
				else if (order.substring(0, 2).equalsIgnoreCase("TL"))
				{
					System.out.print(order.substring(2) + " oz " + tl + " coming right up!");
				}
				
				else
				{
					System.out.print("Sorry! We don't serve that drink.");
				}
			
			System.out.print("\n\nAnother item? (y/n) ");
			repeat = input.next();
			
		}
		while (repeat.equalsIgnoreCase("y"));
		
		System.out.print("\nThank you for your order!");
		input.close();
	}
}
