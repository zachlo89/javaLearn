/**
 * 
 * @author Zachary Lo
 * CIS 36A Assignment 10.1:  Java Jive Pastries and Cafe
 *
 */

import java.util.Scanner;

public class Pastries 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// all caps for final var names
		final double PRICE_ECLAIR = 3.95;
		final double PRICE_COOKIE = 2.50;
		final double PRICE_CAKE = 5.50;
		final double PRICE_BROWNIE = 4.50;
		int eclair = 0;
		int cookie = 0;
		int cake = 0;
		int brownie = 0;
		
		
		System.out.println("Welcome to Java Jive Pastries and Cafe!");
		System.out.println("Allow me to assist you with your order. \n");
		
		
		System.out.print("We sell the following desserts:");
		
		System.out.print("\nMocha Eclairs -- $" + PRICE_ECLAIR + " each");
		
		System.out.printf("\nCocoa Cookies -- $%.2f", PRICE_COOKIE);
		System.out.print(" each");
//		int dollars = (int) PRICE_cookie;
		
		System.out.printf("\nCoffee Cake -- $%.2f", PRICE_CAKE);
		System.out.print(" per slice");
		
		System.out.printf("\nJava Jive brownie -- $%.2f", PRICE_BROWNIE);
		System.out.print(" each");
		
		
		
		System.out.print("\n\nPlease enter the number of Mocha Eclairs: ");
		eclair = input.nextInt();
		
		System.out.print("Please enter the number of Cocoa Cookies: ");
		cookie = input.nextInt();
		
		System.out.print("Please enter the number of slices of Coffee Cake: ");
		cake = input.nextInt();
		
		System.out.print("Please enter the number of Java Jive Brownies: ");
		brownie = input.nextInt();
		
		
		
		double eclairPrice = 0;
		eclairPrice = eclair * PRICE_ECLAIR;
		
		double cookiePrice = 0;
		cookiePrice = cookie * PRICE_COOKIE;
		
		double cakePrice = 0;
		cakePrice = cake * PRICE_CAKE;
		
		double browniePrice = 0;
		browniePrice = brownie * PRICE_BROWNIE;
		
		
		
		System.out.print("\nYou Ordered the Following: ");
		System.out.printf("\nMocha eclair: " + eclair + " @ $" + PRICE_ECLAIR + " each...\t\t$%.2f", eclairPrice);
		
		System.out.printf("\nCocoa cookie: " + cookie + " @ $%.2f", PRICE_COOKIE);
		System.out.printf(" each...\t$%.2f", cookiePrice);
		
		System.out.printf("\nCoffee Cake: " + cake + " @ $%.2f", PRICE_CAKE);
		System.out.printf(" each...\t\t$%.2f", cakePrice);
		
		System.out.printf("\nJava Jive brownie: " + brownie + " @ $%.2f", PRICE_BROWNIE);
		System.out.printf(" each...\t$%.2f", browniePrice);
		
		double total = eclairPrice + cookiePrice + cakePrice + browniePrice;
		
		System.out.printf("\n\nTotal: \t\t\t\t\t$%.2f", total);
		
		System.out.print("\n\nThank you for your order! Please come again!");
		
		input.close();
	}
}
