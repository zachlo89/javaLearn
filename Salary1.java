
/**
 * 
 * @author Zach Lo
 * @author VishnuP
 *
 */

import java.util.Scanner;

public class Salary1 {

//Write your methods here

	public static double weeklySalary(int hours, double hourlyWage)
	{
//		return hours * hourlyWage;
		double weekly = hours * hourlyWage;
		return weekly;
	}
	
	public static double monthlySalary(int hours, double hourlyWage)
	{
//		return (hours * hourlyWage) * 4;
		double monthly = (hours * hourlyWage) * 4;
		return monthly;
	}
	
	public static double yearlySalary(int hours, double hourlyWage)
	{
//		return (hours * hourlyWage) * 50;
		double yearly = (hours * hourlyWage) * 50;
		return yearly;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int hours;
		double hourly_wage;
		double weekly_salary = 0;
		double monthly_salary = 0;
		double yearly_salary = 0;
		
		System.out.println("This pr"
				+ "ogram will calculate your weekly, monthly " + "and yearly salary!");
		System.out.print("Please enter your hourly wage: ");
		hourly_wage = input.nextDouble();
		
		System.out.print("Please enter the number of hours you work each week: ");
		hours = input.nextInt();

//call methods below
		weekly_salary = weeklySalary(hours, hourly_wage);
		monthly_salary = monthlySalary(hours, hourly_wage);
		yearly_salary = yearlySalary(hours, hourly_wage);

		System.out.printf("You make $%.2f per week\n", weekly_salary);
		System.out.printf("You make $%.2f per month\n", monthly_salary);
		System.out.printf("You make $%.2f per year\n", yearly_salary);
		input.close();
	}

}
