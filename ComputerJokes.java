/**
 * 
 * @author Zachary Lo
 * CIS 36A
 *
 */

import java.util.Scanner;

public class ComputerJokes 
{
	public static void main(String[] args)
	{
		String reply;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Want to hear a bad joke (yes/no)? ");
		reply = input.next();
		
		if (reply.equals("yes")) 
		{
			System.out.print("\"Q: Why was the computer tried when she got home? \n A: Because she had a hard drive.\"");
		}
		else
		{
			System.out.print("\"Q: Did you hear about the monkeys who shared an Amazon account? \n A: They were Prime mates.\"");
		}
		
		
		input.close();
	}
}
