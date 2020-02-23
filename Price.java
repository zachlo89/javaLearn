
/**
 * 
 * @author Zachary Lo
 * CIS 36A; Activity 10.2 Prices
 *
 */

import java.util.Scanner;

public class Price {
	public static void main(String[] args) {

		String name;
		double price = 0;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the product name: ");
		name = input.nextLine();

		System.out.print("Price of the " + name + ": ");
		price = input.nextDouble();

		// Insert new statements here
		
		
		final int PERCENT = 100;
		double taxRate = 0;
		System.out.print("Enter sales tax rate (%): ");
		taxRate = input.nextDouble();
		double tax = price * taxRate / PERCENT;
		price += tax;
		
//		System.out.println("Total price: $" + price);
		System.out.printf("Total price: $%.2f\n", price);
		
		int dollars = (int) price;
		System.out.println("In whole dollars: $" + dollars);
		
		
		input.close();
	}
}
