import java.util.Scanner;

public class Test {
	public static void main(String[] args) 
	{
//		int guess;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("I'm thinking of a number between 1 and 10" + "\nCan you guess it?\n");
//		System.out.print("Enter your guess: ");
//		
//		guess = input.nextInt();
//
//		if (7 == guess) {
//			System.out.println("*** Correct! ***");
//		}
		
//		Scanner input = new Scanner(System.in);
//		String repeat = "y";
//		while (repeat.equalsIgnoreCase("y"))
//		{
//			System.out.println("Playing an exciting game!\n");
//			repeat = input.next();
//			System.out.print("Want to play again? (y/n): ");
//		}
		
		Scanner input = new Scanner(System.in);
//
//		System.out.print("Enter your age: ");
//
//		int age = input.nextInt();
//
//		System.out.print("Enter your full name: ");
//		// can't read the input.nextLine till u clear nextInt
//		input.nextLine(); 
//		String name = input.nextLine();
		
		
		
		System.out.print("Please enter precise degrees Celsius: ");
		while (!input.hasNextDouble())
		{
			// clear previous entry to enter sthg again; testing the wrong case
			// 27\n is what's actually input here
			input.nextLine(); 
			System.out.println("Please enter numbers not text.");
			
			System.out.print("Please enter degrees Celsius: ");
		}
		double degrees = input.nextDouble();
		
		input.close();
	}
}