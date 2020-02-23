/**
 * 
 * @author Zachary Lo
 * @author Vishnu Palaniappan
 * CIS 36A
 *
 */

import java.util.Scanner;

public class MyName 
{
	public static void main(String[] args) 
	{
		String first_name;
		String last_name;
		String full_name;
		String initials;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi! I want to learn your name!");
		
		System.out.print("Please enter your first name: ");
		first_name = input.next();
		
		System.out.print("Please enter your first name: ");
		last_name = input.next();
		
		full_name = first_name +" "+ last_name;
		
		System.out.println("Nice to meet you " + full_name + "!");
		
		
	// 	############################################################
		
		
		System.out.println("The length of your first name is " +first_name.length()+ " letters");
		System.out.println("The length of your last name is " +last_name.length()+ " letters");
		System.out.println("The length of your full name is " +(full_name.length() - 1)+ " letters");
		
		initials = " " + first_name.charAt(0) + last_name.charAt(0);
		System.out.println("Your initials are: " + initials.toUpperCase());
		
		System.out.println("Your first and last name are the same: " + first_name.equals(last_name));
		System.out.println("Your name in all capitals is: " + full_name.toUpperCase());
		System.out.println("Your name in all capitals is: " + full_name.toLowerCase());
		
		input.close();
	}
}
