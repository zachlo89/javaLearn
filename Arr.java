/**
 * 
 * @author Zachary Lo
 * @author VishnuP
 * Activity 19.1; Exploring Arrays
 *
 */

public class Arr 
{
	public static void print(int values[]) 
	{
	    for (int i = 0; i < values.length; i++) 
	    {
	        System.out.print(values[i] + " ");
	    }
	    System.out.println();
	}
	
	
	public static void addExtraCredit(int values[]) 
	{
	    //Write the body of the method here
	    //Note: Do not print anything in this method
	    //No System.out.print statement(s) go here
		for (int i = 0; i < values.length; i++)
			{
				values[i] += 5;
			}
	}
	
	
	public static void print(double values[]) 
	{
		for (int i = 0; i < values.length; i++) 
		{
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void print(char values[]) 
	{
		for (int i = 0; i < values.length; i++) 
		{
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	
	// params if two doubles or two ints cannot be the same
	// both receive two chars and one return int or str
	
	
	public static void main(String[] args) 
	{
		int[] scores = {90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println("integer exam scores: ");
		print(scores);
		addExtraCredit(scores);
		
		
		System.out.println("After adding extra credit: ");
		print(scores);
		
		
//		double rainFall[] = new double[4];
		double[] rainFall = {23.4, 16.4, 18.9, 52.7};
		System.out.println("Double rainfall in inches");
		print(rainFall);
		
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		System.out.println("Char vowels");
		print(vowels);
		
	}

}
