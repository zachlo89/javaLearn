/**
 * 
 * @author Zachary Lo
 * CIS 36A
 *
 */

import java.util.Scanner; 


public class Longest 
{
	public static void main(String[] args) 
	{
		String longWord;
//		char lastLetter;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a really long word: ");
		longWord = input.next();

		System.out.println("The length of " +longWord+ " is " + longWord.length());
		System.out.println("The first letter is at index " + "0" + ", and the last letter is at index " + (longWord.length() - 1));
		System.out.println("The first letter is " + longWord.charAt(0));
		System.out.println("The last letter is " + (longWord.charAt(longWord.length() - 1)));
		
		input.close();
	}
}
