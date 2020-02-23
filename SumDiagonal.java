/**
 * 
 * @author Zachary Lo
 * CIS 36A
 *
 */

import java.util.Scanner;

public class SumDiagonal 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
//		int hundreds;
//		int tens;
//		int ones;
		int num1Hundreds;
		int num1Tens;
		int num1Ones;
		
		int num2Hundreds;
		int num2Tens;
		int num2Ones;
		
		int num3Hundreds;
		int num3Tens;
		int num3Ones;
		
		
		System.out.print("Enter first number:  ");
		int num1 = input.nextInt();
		
		num1Hundreds = (num1 / 100);
//		System.out.println("Hundreds place digit: " + num1Hundreds);
		
		num1Tens = (num1 / 10);
//		System.out.println("Tens place digit: " + num1Tens);
		
		num1Ones = num1;
//		System.out.println("Ones place digit: " + num1Ones);
		
		
//		########################################
		
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		num2Hundreds = (num2 / 100) % 10;
//		System.out.println("Hundreds place digit: " + num2Hundreds);
		
		num2Tens = (num2 / 10) % 10;
//		System.out.println("Tens place digit: " + num2Tens);
		
		num2Ones = num2 % 10;
//		System.out.println("Ones place digit: " + num2Ones);
		
		
//		########################################
		
		
		System.out.print("Enter third number:  ");
		int num3 = input.nextInt();
		
		num3Hundreds = (num3 / 100) % 10;
//		System.out.println("Hundreds place digit: " + num3Hundreds);
		
		num3Tens = (num3 / 10) % 10;
//		System.out.println("Tens place digit: " + num3Tens);
		
		num3Ones = num3 % 10;
//		System.out.println("Ones place digit: " + num3Ones);
		
		
//		########################################
		
		
		int sumDiagonal = num1Hundreds + num2Tens + num3Ones;
		System.out.print("Sum of diagonal digits is " + sumDiagonal);
		
		input.close();
	}
}
