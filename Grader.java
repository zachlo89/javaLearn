/**
 * 
 * @author Zachary Lo
 * @author Vishnu Palaniappan
 * CIS 36A Activity 8.2 Grader Assignment
 *
 */

import java.util.Scanner;

public class Grader 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a score: ");
		
		double score = in.nextDouble();
		
		String grade="";
		if (score >= 90)
		{
		    grade = "A";
		}
		else if (score >= 80)
		{
		    grade = "B";
		}
		else if (score >= 70)
		{
		    grade = "C";
		}
		else if (score >= 60)
		{
		    grade = "D";
		}
		else if (score < 60)
		{
		    grade = "F";
		}
		System.out.println(grade);
		
		in.close();
	}
	
}
