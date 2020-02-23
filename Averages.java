/**
 * 
 * @author ZachL
 * @author VishnuP
 * Activity 19.2; Averages
 *
 */
import java.util.Scanner;
import java.io.*;

public class Averages 
{

	public static void main(String[] args) throws IOException
	{
		double num;
		
		File infile = new File("nums.txt");
		File outfile = new File("average.txt");
		
		Scanner input = new Scanner(infile);	
		
		double sum = 0.0;
		int count = 0;
		
		while (input.hasNextDouble()) 
		{
		    num = input.nextDouble();
		    System.out.println("Processing the number: " + num);
		    sum += num; //adding the number to our running total for the sum
		    count++; //counting how many numbers are in the file
		}
		System.out.println("The average is: " + sum/count);
	
		
		PrintWriter output = new PrintWriter(outfile);
		output.println("The average is: " + sum/count);
		
		
		input.close();
		output.close();
	}

}
