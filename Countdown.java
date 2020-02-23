/**
 * 
 * @author Zachary Lo
 * @author Vishnu Palaniappan
 * CIS 36A Activity 12.1; Counting down Part3
 *
 */
public class Countdown 
{
	public static void main(String[] args) 
	{
		int countdown = 10;
		System.out.println("NASA Mission Control readying for liftoff.");
		System.out.println("Initializing countdown from 10...");

//		while (countdown > 0) 
//		{
//			System.out.println(countdown);
//			countdown--;
//		}
		
		for (int i = countdown; i >= 0; i--) 
		{
			System.out.println(i);
		}
		
		System.out.println("We have liftoff!");
	}
}
