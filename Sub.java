/**
 * 
 * @author Zach Lo
 * @author VishnuP
 * CIS 36A; 16.1; Writing a Method
 *
 */
import java.util.Scanner;

public class Sub 
{
	public static int sub(int num1, int num2) 
	{
		int sum = num1 - num2;
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two numbers to subtract: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int diff = sub(num1, num2);
		System.out.print("Difference = " + diff);
		
		input.close();
	}

}
