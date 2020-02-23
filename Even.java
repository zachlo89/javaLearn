
/**
 * 
 * @author Vishnu Palaniappan
 * @author Zachary Lo
 * CIS 36A, Activity 7.1
 */

import java.util.Scanner;

public class Even 
{
	public static void main(String[] args) 
	{
		int testNum;
		int remainder;

		Scanner in = new Scanner(System.in);

		System.out.println("Welcome!\n\nEnter a number and " + "I'll report back if it's \"even\" or \"odd\"!\n");

		System.out.print("Please enter a whole number ");

		testNum = in.nextInt();

		remainder = testNum % 2;

		if (remainder == 0) {
			System.out.println(testNum + " is even.");
		} else {
			System.out.println(testNum + " is odd.");
		}
		
		in.close();

	}
}
		
		
	

