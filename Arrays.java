/**
 * @author Zachary Lo
 * CIS 36A; Activity 18.1; My first Array
 *
 */

import java.util.Scanner;

public class Arrays 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String[] names = new String[6];
        names[0] = "Mingwen";
        names[1] = "Ivan";
        names[2] = "Zach";
        
//      int[] scores = new int[5];
//      System.out.println("Array elements initialized to 0:");
//      
//      for (int i =0; i <scores.length; i++)
//      {
//          System.out.println("Index " + i + ": " + scores[i]);
//      }
//      
//      System.out.println("\nEnter " + scores.length + " scores:");
//      
//      for (int i =0; i <scores.length; i++)
//      {
//          scores[i] = input.nextInt();
//      }
//      System.out.println("\nYou entered:");
//      
//      for (int i =0; i <scores.length; i++)
//      {
//          System.out.println("Score " + i + ": " + scores[i]);
//      }
        
        System.out.println("The first three names: ");
        // Print the first three names in array
        for (int i = 0; i < names.length; i++)
        {
        	System.out.println(names[i]);
        }
        
        
        // User input for last three names in array
        System.out.println();
        for (int i = 3; i < names.length; i++) 
        {
        	System.out.print("Enter name " + (i + 1) + ": ");
        	names[i] = input.nextLine(); 
        }
      
        
        // last loop to display all the names in the array
        System.out.println("\nThe 6 names are: ");
        for (int i = 0; i < names.length; i++) 
        {
        	System.out.println(names[i]);
        }
        
        
        input.close();
    }
    
}