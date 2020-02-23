/**
 * 
 * @author Zachary Lo
 * CIS 36A; A and B; Assignment 12.1
 *
 */

public class AB 
{
	public static void main(String[] args) 
	{
		System.out.println("A\tB");
		
		for (double i = -5.0; i <= 5.0; i += 0.5)
		{
			System.out.printf("%.1f\t", i);
			System.out.printf("%.1f\n", Math.pow(i,5));
		}
	}
}
