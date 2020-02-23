/**
 * 
 * @author Zachary Lo
 * CIS 36A; Assignment 18.1; Fun with Fruit
 *
 */

import java.io.*;
import java.util.Scanner;

public class Fruit 
{
	public static void main(String[] args) throws IOException
	{
		File fruits = new File("fruits.txt");
		Scanner input1 = new Scanner(fruits);
		
		File numbers = new File("numbers.txt");
		Scanner input2 = new Scanner(numbers);
		
		File out = new File("out.txt");
		Scanner input3 = new Scanner(out);
		
		
		String[] fruity = new String[5];
		int[] number_fruits = new int[5];
		
		
		
		for (int i = 0; i < fruity.length; i++)
		{
			fruity[i] = input1.next();
			
		}
		
		for (int i = 0; i < number_fruits.length; i++)
		{
			number_fruits[i] = input2.nextInt();
			
		}
		
	
		
		System.out.println("Fun with Fruit:");
		for (int i = 0; i < number_fruits.length; i++) 
		{
			System.out.println(number_fruits[i] +" "+ fruity[i]);
		
		}
		
		input1.close();
		input2.close();
		input3.close();
	}
}
