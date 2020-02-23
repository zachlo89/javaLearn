/**
 * 
 * @author Zachary Lo
 * CIS 36A; Activity 18.2; Two Numbers
 *
 */

import java.util.Scanner;
import java.io.*;

public class TwoNumbers 
{
	public static void main(String[] args)  throws IOException
	{
		File inFile = new File("infile.txt");
		Scanner input = new Scanner(inFile);
		
		int first = input.nextInt();
		int second = input.nextInt();
//		int third = input.nextInt();

		System.out.println("first = " + first);
		System.out.println("second = " + second);
//		System.out.println("third = " + third);
		
		
		input.close();
	}
}
