/**
 * 
 * @author Zachary Lo
 * CIS 36A
 *
 */

import java.util.Scanner;


public class CarCost
{
	public static void main(String[] args)
	{
		double carMpg;
		double costGasGallon;
		double gas100milesCost = 0;
		
		double carMpgE;
		double costElecKwh = 0;
		double costGasGallonEv = 33.7;
		double ev100milesCost = 0;
		
		
		System.out.println("Gas vs. Electric Car Travel Comparison \n\n");
//		System.out.println("Test");
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the fuel efficiency of the car in MPG: ");
		carMpg = input.nextDouble();
		
		System.out.print("Enter the cost of one gallon of gas: ");
		costGasGallon = input.nextDouble();
		
		gas100milesCost = (costGasGallon / carMpg) * 100;
		System.out.print("Cost of traveling 100 miles in a gas car is " + "$" + gas100milesCost + "\n\n");	
		
		
		
		System.out.print("Enter the energy efficiency of electric car in MPGe: ");
		carMpgE = input.nextDouble();
		
		System.out.print("Enter the cost of one KWH of electricity: ");
		costElecKwh = input.nextDouble();
		
//		ev100milesCost = ((costGasGallonEv / carMpgE) * costElecKwh) * 100; // no good 
		ev100milesCost = (((costGasGallonEv * costElecKwh) / carMpgE) * 100);
		System.out.print("Cost of traveling 100 miles in a gas car is " + "$" + ev100milesCost);
		
		
		input.close();
	}
}
