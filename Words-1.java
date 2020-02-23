/**
 * 
 * @author Vishnu Palaniappan and Zachary Lo 
 * Activity 14.1: Sentence Continued
 */
import java.util.Scanner;
public class Words {

	public static void main(String[] args) {
		String sentence;
		int numWords = 1;
		int numLetters = 0;
		int start_index = 0;
		int guess;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Think of a sentence in your mind.");
		System.out.println("Later I will tell you how many words and letters are in your sentence.");
		System.out.println("Enter a guess for the number of letters in your sentence (don't count!): "); 
		guess = input.nextInt();
		
		System.out.print("\nPlease enter your sentence.");
		input.nextLine();
		sentence = input.nextLine();
		
		System.out.println("The words in your sentence are: " );
		
		for (int i = 0; i < sentence.length(); i++)
		{
			if (sentence.charAt(i) == ' ')
			{
				numWords++;
				System.out.println(sentence.substring(start_index, i));
				start_index = i+1;			
			}
			else {
			numLetters++;
			}
		}
		System.out.println(sentence.substring(start_index, sentence.length()));

		System.out.println("There are " + numWords + " words in \"" + sentence + "\"");
		System.out.println("And, " + numLetters + " letters.");

		if (guess == numLetters) {
		    System.out.println("You guessed right!");
		} else {
		    System.out.println("You guessed wrong!");
		}
	}

}
