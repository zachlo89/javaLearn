/**
 * 
 * @author Zachary Lo
 * CIS 36A; Assignment 10.2: Weight in Space
 *
 */

import java.util.Scanner;

public class Planet 
{
	public static void main(String[] args)
	{

		final double MERCURY_MULT = 0.38;
		final double VENUS_MULT = 0.91;
		final double MARS_MULT = 0.38;
		final double JUPITER_MULT = 2.54;
		final double SATURN_MULT = 1.08;
		final double URANUS_MULT = 0.91;
		final double NEPTUNE_MULT = 1.19;
		final double PLUTO_MULT = 0.06;
		
		
		Scanner input = new Scanner(System.in);
		
		
		double weight = 0;
		String planet = "";
		
		System.out.print("Welcome!");
		System.out.print("\nWhat do you weigh on other planets?");
		System.out.print("\nEnter your weight in pounds: ");
		weight = input.nextDouble();
		
		System.out.println("Now, select from one of the following planets: ");
		System.out.print("Mercury\n" + "Venus\n" + "Mars\n" + "Jupiter\n" + "Saturn\n" + "Uranus\n" + "Neptune\n" + "Pluto\n");
		System.out.print("Please enter the planet: ");
		planet = input.next();
		
//		if ((planet.equals("Mercury") && (planet.equals("Venus") && (planet.equals("Mars") && (planet.equals("Jupiter") && (planet.equals("Saturn") && (planet.equals("Uranus") && (planet.equals("Neptune") && (planet.equals("Pluto")) 
//		{
//			System.out.print("You entered an invalid planet name. \nPlease rerun the program to try again.\n");
//		}
		
		boolean isValid = true;
		
		// boolean valid will be true..unless false
		switch (planet)
		{
			case "Mercury":
				weight *= MERCURY_MULT;
				break;
			case "Venus":
				weight *= VENUS_MULT;
				break;
			case "Mars":
				weight *= MARS_MULT; 
				break;
			case "Jupiter":
				weight *= JUPITER_MULT;
				break;
			case "Saturn":
				weight *= SATURN_MULT;
				break;
			case "Uranus":
				weight *= URANUS_MULT;
				break;
			case "Neptune":
				weight *= NEPTUNE_MULT;
				break;
			case "Pluto":
				weight *= PLUTO_MULT;
				break;
			default:
				System.out.print("You entered an invalid planet name. \nPlease rerun the program to try again.");
				isValid = false;
		}
		
		if (isValid == true) 
		{
			System.out.printf("You weigh %.1f lbs on " + planet, weight);
			//System.out.print(" lbs on " + planet);
		}
		
		
		
		input.close();
	}
}
