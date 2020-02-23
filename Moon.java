/**
 * 
 * @author Vishnu Palaniappan
 * @author Zachary Lo
 * CIS 36A
 */

import java.util.Scanner;


public class Moon {
	public static void main(String [] args){
		
		double weight;
		
		System.out.println("Welcome! Let's calculate your weight on the moon!");
		System.out.println("Please enter your weight in pounds: ");
		
		Scanner input = new Scanner(System.in);
		
		int yourWeight = input.nextInt();
		yourWeight = yourWeight / 6; 
		System.out.println("Your weight on the moon is " + yourWeight);
		
		input.close();
	}

}
