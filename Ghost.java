/**
 * 
 * @author Zachary Lo
 * CIS 36A; Have you seen the ghost of John?; Assignment 11.2
 *
 */

public class Ghost 
{
	public static void main(String[] args)
	{
		int num = 1;
		
		while (num <= 150)
		{
			
			if (num % 3 == 0 && num % 5 == 0) 
			{
				System.out.print("\nWouldn't it be chilly with no skin on?");
			}
			else if (num % 5 == 0)
			{
				System.out.print("\nLong white bones and the skin all gone");
			}
			else if (num % 3 == 0)
			{
				System.out.print("\nHave you seen the ghost of John?");
			}
			else
			{
				System.out.print("\n" + num);
			}
			num++;
		}
	}
}
