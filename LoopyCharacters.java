/**
 * 
 * @author Zachary Lo
 * CIS 36A; Assignment 13.2: Loopy Characters
 *
 */

import java.util.Scanner;


public class LoopyCharacters 
{
    public static void main(String[] args) 
    {
        int n; // the integer number
        String ch; // the single character
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("**Loopy Characters!**\n");
        System.out.print("Enter an integer between 1 and 20: ");
        n = input.nextInt();

        System.out.print("\nEnter a single character: ");
        ch = input.next();
        System.out.println();

        // Repeating the char n times with a for-loop.
        System.out.println("#1. Printing " + ch + " " + n + " times:");
        
        for (int i = 1; i <= n ; i++) 
        {
	        System.out.print(ch);
        }

        
        // Repeating the char n times with stars on odd indexes.
        System.out.println("\n\n#2. Printing " + ch + " character " + n + " times substituting '*' on odd indexes:");

        for (int i = 1; i <= n; i++) 
        {
//        	if (i % 2 == 0)
//        	{
//        		System.out.print("*");
//        	}
//        	else
//        	{        		
//        		System.out.print(ch);
//        	}
        	if (i % 2 == 1)
        	{
        		System.out.print(ch);
        	}
        	else
        	{        		
        		System.out.print("*");
        	}
        	
        }

        
        // Repeating the character n times with tick marks (+) every 5 chars
        System.out.println("\n\n#3. Printing " + ch + " character " + n + " times substituting (+) every fifth character:");
        // Put your code here
        for (int i = 1; i <= n; i++)
        {
        	if (i % 5 == 0) 
        	{        		
        		System.out.print("+");
        	}
        	else
        	{
        		System.out.print(ch);
        	}
        }
        
        
        System.out.println("\n\n#4. Printing " + n + " lines of the previous loop:");
        // Hint: put your for-loop from the previous challenge inside another
        // for-loop that has a different counting variable.
        // Put your code here
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
            	if (j % 5 == 0) 
            	{        		
            		System.out.print("+");
            	}
            	else
            	{
            		System.out.print(ch);
            	}
            }
            
            System.out.print("\n");
        }

       input.close();
    }
}