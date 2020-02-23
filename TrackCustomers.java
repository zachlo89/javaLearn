/**
 * 
 * @author Zach Lo
 * CIS 36A; Assignment 19.2; Tracking Customers
 *
 */

import java.util.Scanner;
import java.io.*;


public class TrackCustomers 
{
	/**
	 * Write the javadoc comment for extractInitial here
	 * 
	 * @param String; customer name
	 * @return char; first letter - the initial method takes in a string aka
	 *         customer name and returns a char the first letter.
	 */
	public static char extractInitial(String customer) 
	{
		return customer.charAt(0);
	}

	
	/**
	 * Write the javadoc comment for printArray here
	 * 
	 * @param String array
	 * @param file   name; .txt returns nothing prits out the array to the file
	 *               using a for loop
	 */
	public static void printArray(String[] customers, String outFile) throws IOException // update signature of method
	{
		File out = new File(outFile);
		PrintWriter output = new PrintWriter(out);
		
		for (int i = 0; i < customers.length; i++) 
		{
			output.println(customers[i]);
		}
		output.close();
		System.out.println("Thank you! The customer information has been written to " + outFile + "!\n"
				+ "Please open the file to see the information.\n");
	}

	
	public static void main(String[] args) throws IOException 
	{

		String firstName;
		String lastName;
		int i = 0;
		String gender;
		final int ARRAY_SIZE;
		final String INPUT_FILE;
		final String OUTPUT_FILE;
		String[] customersArr;
		char firstInitial;

		
		// declare your customers array here
		System.out.println("Welcome to Customer Tracker!\n");

		System.out.println("Enter the name of the input file:");
		Scanner userInput = new Scanner(System.in);
		INPUT_FILE = userInput.nextLine();

			File infile = new File(INPUT_FILE);
			Scanner input = new Scanner(infile);

			ARRAY_SIZE = input.nextInt();
			customersArr = new String[ARRAY_SIZE];
			
			while (input.hasNextLine())
			{
				firstName = input.next();
				lastName = input.next();
				gender = input.next();

				// map gender to title
				if (gender.equalsIgnoreCase("m")) 
				{
					gender = "Mr.";
				} 
				else if (gender.equalsIgnoreCase("f")) 
				{
					gender = "Ms.";
				} 
				else 
				{
					gender = "Mx.";
				}
				firstInitial = extractInitial(firstName);
				
				// gender, initial, lname combine into str on same line
				// Mr. P. Li
				customersArr[i] = gender + " " + firstInitial + " " + lastName;
				i++;
			}

		System.out.println("Enter the name of the output file: ");
		OUTPUT_FILE = userInput.next();
		printArray(customersArr, OUTPUT_FILE);

		input.close();
		userInput.close();

	}
}
