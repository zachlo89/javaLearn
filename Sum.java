/**
 * 
 *
 * @author Zachary Lo
 * @author Vishnu Palaniappan
 * CIS 36A Activity 12.3; Summing and Averaging
 *
 */

import java.util.Scanner;

public class Sum 
{
	public static void main(String[] args) 
	{
		int quantity = 0;
		double number = 0.0;
		double sum = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Give me a list of numbers and I will compute their sum and average!");
		
		System.out.print("\nEnter the quantity of numbers: ");
		quantity = input.nextInt();
		
		for (int i = 1; i <= quantity; i++) 
		{
			System.out.print("Enter value #" + i + ": ");
			number = input.nextDouble();
			sum += number; //add number to our running total for the sum
		} 
		
		System.out.printf("The sum of the numbers is: %.2f\n", sum);
		System.out.printf("The average of the numbers is: %.2f\n", (sum / quantity));
	}

}
