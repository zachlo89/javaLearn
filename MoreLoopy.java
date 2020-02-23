/**
 * 
 * @author Vishnu Palaniappan, Zachary Lo
 * Altering a For Loop
 */
import java.util.Scanner;
public class MoreLoopy {

	public static void main(String[] args) {
		int max = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("This program uses a loop to count!\n");
        System.out.print("Enter the maximum number: ");
        max = input.nextInt();
       
        System.out.println();

//        for (int i = 0; i <= max; i++)
//        {
//            System.out.println(i);
//        }
//    
//        for (int i = 0; i < max; i++)
//        {
//        	System.out.println(i);
//        }
//        for (int i = 0; i <= max; i+=2)
//        {
//        	System.out.println(i); 
//        }
          for (int i = max; i >= 0; i--)
          {
        	  System.out.println(i); 
          }
	}

}
