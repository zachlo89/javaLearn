/**
 * 
 * @author Zachary Lo
 * CIS 36A
 *
 */

import java.util.Scanner;

public class Str 
{
	public static void main(String[] args)
	{
		String firstWord;
		String secondWord;
		int firstWordLen;
		int secondWordLen;
		char extract1;
		char extract2;
		char extract3;
		char extract4;
		char extract5;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("*** String Manipulation ***");
		System.out.println("Enter two words separated by a space, and press the Enter key");
		System.out.print("Enter your input: ");
		firstWord = input.next();
		secondWord = input.next();
		
		
		System.out.println("\nYou entered: first = \"" +firstWord+ "\"" +" and second = \"" +secondWord);
		
		
		System.out.println("\n*** Measuring word length ***");
		firstWordLen = firstWord.length();
		System.out.println("First word length: " +firstWordLen);
		secondWordLen = secondWord.length();
		System.out.println("Second word length: " +secondWordLen);
		
		
		if (firstWordLen > secondWordLen) 
		{
			System.out.println("Longer word: " +firstWord);
		}
		else
		{
			System.out.println("Longer word: " +secondWord);
		}
		
		
		System.out.println("\n*** Merging Strings ***");
		extract1 = firstWord.charAt(0);
		extract2 = firstWord.charAt(1);
		extract3 = secondWord.charAt(3);
		extract4 = secondWord.charAt(4);
		extract5 = secondWord.charAt(secondWord.length() - 1);
		System.out.println("Extracted: " + extract1 + extract2 + extract3 + extract4 + extract5);
		
		
		System.out.println("\n*** Comparing the two words ***");
		if (firstWord.compareTo(secondWord) < 0) 
		{
			System.out.println(firstWord + " comes before " + secondWord);
		}
		else
		{
			System.out.println(secondWord + " comes before " + firstWord);
		}
		
		
		input.close();
	}
}
