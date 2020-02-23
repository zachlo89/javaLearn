/**
 * 
 * @author Zachary Lo
 * @author Vishnu Palaniappan
 * CIS 36A; Activity 10.1 Letter grades
 *
 */

import java.util.Scanner;

public class LetterGrade 
{
	public static void main(String[] args)
	{
		String grade;
		double gPA = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		grade = input.next();
		grade = grade.toUpperCase();
		
		switch (grade) 
		{
			case "A":
				gPA = 4.00;
				break;
			case "B":
				gPA = 3.00;
				break;
			case "C":
				gPA = 2.00;
				break;
			case "D":
				gPA = 1.00;
				break;
			case "F":
				gPA = 0.00;
				break;
		}
		System.out.print("The numeric value is " + gPA);

		input.close();
	}

}
