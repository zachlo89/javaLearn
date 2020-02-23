/**
 * 
 * @author Zachary Lo
 * CIS 36A; Assignment 18.2; How Many Numbers?
 *
 */

import java.io.*;
import java.util.Scanner;

public class Numerical 
{
	public static void main(String[] args) throws IOException
	{
		File fourNums = new File("input1.txt");
		Scanner input1 = new Scanner(fourNums);
		
		File eightNums = new File("input2.txt");
		Scanner input2 = new Scanner(eightNums);
		
		
		System.out.print("Enter the name of the file: ");
		Scanner input3 = new Scanner(System.in);
		String fileName = input3.next();
	
		
		double num;
		double sum = 0;
		double product = 1;
		int numArray1 = input1.nextInt();
		int numArray2 = input2.nextInt();
		
		double[] numArr1 = new double[numArray1];
		double[] numArr2 = new double[numArray2];
		
		if (fileName.equalsIgnoreCase("input1.txt"))
		{
			System.out.println("Array length = " + numArray1);	
			for (int i = 0; i < numArray1; i++) 
			{
				num = input1.nextDouble();
				numArr1[i] = num;
				System.out.print("\nNumber " + (i + 1) + ": "+ numArr1[i]);
				sum += numArr1[i];
				product *= numArr1[i];
			}
		}
		else
		{
			System.out.println("Array length = " + numArray2);
			for (int i = 0; i < numArray2; i++) 
			{
				num = input2.nextDouble();
				numArr2[i] = num;
				System.out.print("\nNumber " + (i + 1) + ": " + numArr2[i]);
				sum += numArr2[i];
				product *= numArr2[i];
			}
		}
		
		System.out.printf("\n\nThe sum of the numbers is: %.1f" , sum);
		System.out.printf("\nAnd the product is: %.1f" , product);
			
		
		
		input1.close();
		input2.close();
		input3.close();
		
	}

}
