/**
 * 
 * @author Vishnu Palaniappan
 * @author Zachary Lo 
 * CIS 36A, Activity 8.1: Let's Alphabetize 
 */
import java.util.Scanner;
public class Alphabetize {
	public static void main (String [] args){
		String word1;
		String word2;
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome! Give me two words...\nand I will return them to you in alphabetical order!\n");
		System.out.print("Please enter the first word: ");
		word1 = input.next();
		System.out.print("Please enter the second word: ");
		word2 = input.next();
		if (word1.compareTo(word2) < 0) {
			System.out.println("The alphabetical order is: " + word1 + " " + word2);
		} else {
			System.out.println("The alphabetical order is: " + word2 + " " + word1);
		}
		
		input.close();
	}
}
