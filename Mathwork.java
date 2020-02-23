/**
 * 
 * @author Zachary Lo
 * CIS 36A
 *
 */

import java.util.Scanner;

public class Mathwork 
{
	public static void main(String[] args)
	{
		System.out.println("***Math Worksheet***");
		System.out.println("Enter three numbers, and press the Enter key.");

		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the first number here: ");
		double num1 = input.nextDouble();

		System.out.print("Enter the second number here: ");
		double num2 = input.nextDouble();
		
		System.out.print("Enter the third number here: ");
		double num3 = input.nextDouble();
		
//		#####################################################################
		
//		int a = input.nextInt();
//		int b = input.nextInt();
//		int c = input.nextInt();
//		double a = input.nextdouble();
//		double b = input.nextdouble();
//		double c = input.nextdouble();
		double a = num1;
		double b = num2;
		double c = num3;
		
		double x = a + b - c;
		System.out.println("x = " + x);
		
//		#####################################################################
		
		double fuel = b / c;
		System.out.println("fuel = " + fuel);
		
//		#####################################################################
		
		double mean = (a + b + c) / 3;
		System.out.println("mean = " + mean);
		
//		#####################################################################
		
		double aInt = Math.floor(a);
		System.out.println("aInt = " + aInt);
		
//		#####################################################################
		
		double geo = ((1 - Math.pow(b, c)) / ((1 - b)) * a); 
		System.out.println("geo = " + geo);
		
		input.close();
	}
}
