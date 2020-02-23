/**
 * 
 * @author Vishnu Palaniappan and Zachary Lo 
 * Activity 13.2: How many words in your sentence?
 */
import java.util.Scanner;
public class Word 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int start_index = 0;
		String sentence;
		System.out.println("Give me a sentence, and I will count the number of words.");
		System.out.print("\nPlease enter your sentence.");
		sentence = input.nextLine();
		
		int numWords = 1;
		System.out.println("The words in your sentence are: " );
		
		for (int i = 0; i < sentence.length(); i++)
		{
			if (sentence.charAt(i) == ' ')
			{
				numWords++;
				System.out.println(sentence.substring(start_index, i));
				start_index = i+1;			
			}
		}
		
		System.out.println(sentence.substring(start_index, sentence.length()));
		System.out.println("There are " + numWords + " words in \"" + sentence + "\"");

	}

}
