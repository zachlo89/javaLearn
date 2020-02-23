/**
 *
 * @author Vishnu Palaniappan and Zachary Lo
 * 
 */
import java.util.Scanner;
public class DateTime {

	public static void formatDateAmerican (int year, int month, int day){
		System.out.println(month + "/" + day + "/" + year);
		return;
	}
	public static void formatDateEuropean (int year, int month, int day){
		System.out.println(day + "." + month + "." + year);
		return;
	}
	public static void formatTimeAmerican (int hour, int minutes, String timeOfDay){
		if (timeOfDay.equalsIgnoreCase("Evening")) {
			System.out.println(hour + ":" + minutes + "pm");
		}
		else {
			System.out.println(hour + ":" + minutes + "am");
		}
	}
	public static void formatTimeEuropean (int hour, int minutes, String timeOfDay){
		if (timeOfDay.equalsIgnoreCase("Evening")) {
			hour += 12;
			System.out.println(hour + ":" + minutes);
		}
		else {
			System.out.println(hour + ":" + minutes);
		}
	}

    public static void main(String[] args) {
        int year;
        int day;
        int month;
        int hour;
        int minutes;
        String dayEve;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome! This program will print dates and times "
            + "in both the American and European styles!\n");

        System.out.println("First, let's print a formatted date.\n");
  
        System.out.print("Please enter the current year: ");
        year = input.nextInt();
        System.out.print("Please enter the current month: ");
        month = input.nextInt();
        System.out.print("Please enter the current day: ");
        day = input.nextInt();
        System.out.println();
 
        
        //call to the formatDateAmerican method here
        System.out.print("Today's date in the US: ");
        formatDateAmerican (year, month, day);
        //call to the formatDateEuropean method here
        System.out.print("Today's date in Europe: ");
        formatDateEuropean (year, month, day);
  
        System.out.println("\nNow, let's print a formatted time.\n");
  
        System.out.print("Please enter the current hour: ");
        hour = input.nextInt();
        System.out.print("Please enter the current minutes: ");
        minutes = input.nextInt();
        System.out.print("Please enter whether it is \"morning\" or \"evening\": ");
        dayEve = input.next();
        System.out.println();

  
        //call to the formatTimeAmerican method here
        System.out.print("The current time written in American Style: ");
        formatTimeAmerican (hour, minutes, dayEve);
        //call to the formatTimeEuropean method here
        System.out.print("The current time according to the 24-hour clock: ");
        formatTimeEuropean (hour, minutes, dayEve);

        System.out.println("\nHave a good day!");
    }
   
}